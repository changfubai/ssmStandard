import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.util.JSON;
import com.xiaobai.ssm.util.PasswordUtil;
import com.xiaobai.ssm.util.Tools;
import com.xiaobai.ssm.util.mongodb.MongoDBUtil;
import org.bson.Document;
import org.junit.Test;

import java.util.Set;

public class JavaTest {
    @Test
    public void testCode() throws Exception{
        String p1 = PasswordUtil.generate("xiaobai");
        String p2 = PasswordUtil.generate("xiaobai");
        System.out.println(p1.length());
        System.out.println(p2);
        boolean b1 = PasswordUtil.verify("xiaobai", p1);
        boolean b2 = PasswordUtil.verify("xiaobai", p2);
        System.out.println(b1);
        System.out.println(b2);

        String p3 = Tools.getMD5("xiaobai");
        String p4 = Tools.getMD5("xiaobai");
        System.out.println("5349b4ddd2781d08c09890f3".length());
        System.out.println(p4.length());

    }

    @Test
    public void testMongo(){
        // 连接到 mongodb 服务
        //Mongo mongo = new Mongo(new MongoClientURI("mongodb://${mongo.user}:${mongo.pwd}@${mongo.host}:${mongo.port}/${mongo.defaultDbName}"));
        //MongoClientURI mongoURI = new MongoClientURI("mongodb://test:test@127.0.0.1:27017/test");
        //Mongo mongo = new Mongo(mongoURI);

        //根据mongodb数据库的名称获取mongodb对象 ,\
        //DB db = mongo.getDB( "test" );
        //Set<String> collectionNames = db.getCollectionNames();
        //// 打印出test中的集合
        //for (String name : collectionNames) {
        //    System.out.println("collectionName==="+name);
        //}
        String json = "{'database' : 'mkyongDB','table' : 'hosting'," +
                "'detail' : {'records' : 99, 'index' : 'vps_index1', 'active' : 'true'}}";
        //String json = "{'database' : 'mkyongDB'}";

        String collName = "col";
        String dbName = "test";
        //MongoClient client = new MongoClient("127.0.0.1", 27017);
        //MongoDatabase database = client.getDatabase(dbName);
        //MongoCollection<DBObject> collection = database.getCollection(collName, DBObject.class);
        //DBObject dbObject = (DBObject) JSON.parse(json);
        ////collection.insertOne(dbObject);
        ////collection.updateOne(dbObject);
        //FindIterable<DBObject> objects = collection.find();
        //for (DBObject object : objects) {
        //    System.out.println(object.toString());
        //}
        MongoCollection<Document> coll = MongoDBUtil.instance.getCollection(dbName, collName);
        //String json = "{'database' : 'mkyongDB','table' : 'hosting'," +
        //        "'detail' : {'records' : 99, 'index' : 'vps_index1', 'active' : 'true'}}";
        //
        Document document = Document.parse(json);
        //
        coll.insertOne(document);

        //// 插入多条
        // for (int i = 1; i <= 4; i++) {
        // Document doc = new Document();
        // doc.put("name", "zhoulf");
        // doc.put("school", "NEFU" + i);
        // Document interests = new Document();
        // interests.put("game", "game" + i);
        // interests.put("ball", "ball" + i);
        // doc.put("interests", interests);
        // coll.insertOne(doc);
        // }

         // 根据ID查询
         //String id = "5a5df69a3b416323a0505926";
         //Document doc = MongoDBUtil.instance.findById(coll, id);
         //System.out.println(doc);

         ////查询多个
         MongoCursor<Document> cursor1 = coll.find(Filters.eq("database", "mkyongDB")).iterator();
         while (cursor1.hasNext()) {
         org.bson.Document _doc = (Document) cursor1.next();
         System.out.println(_doc.toString());
         }
         cursor1.close();

        // 查询多个
        // MongoCursor<Person> cursor2 = coll.find(Person.class).iterator();

        // 删除数据库
        // MongoDBUtil2.instance.dropDB("testdb");

        // 删除表
        // MongoDBUtil2.instance.dropCollection(dbName, collName);

        // 修改数据
        // String id = "556949504711371c60601b5a";
        // Document newdoc = new Document();
        // newdoc.put("name", "时候");
        // MongoDBUtil.instance.updateById(coll, id, newdoc);

        // 统计表
        // System.out.println(MongoDBUtil.instance.getCount(coll));

        // 查询所有
        //Bson filter = Filters.eq("count", 0);
        //MongoDBUtil.instance.find(coll, filter);
    }
}
