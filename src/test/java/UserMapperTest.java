import com.xiaobai.ssm.common.baseMapper.BaseMapper;
import com.xiaobai.ssm.pojo.User;
import com.xiaobai.ssm.service.BaseService;
import com.xiaobai.ssm.service.user.UserService;
import com.xiaobai.ssm.util.logger.LogUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

public class UserMapperTest extends BaseTest {

    @Autowired
    private BaseService<User> user;

    @Test
    public void testQueryById(){
        User user = this.user.selectByPrimaryKey(1);
        LogUtil.info(user.toString());
    }

}
