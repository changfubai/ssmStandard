package com.xiaobai.ssm.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

public class Items implements Serializable {
    @Id
    private Integer id;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 商品定价
     */
    private Float price;

    /**
     * 商品图片
     */
    private String pic;

    /**
     * 生产日期
     */
    private Date createtime;

    /**
     * 商品描述
     */
    private String detail;

    private static final long serialVersionUID = 1L;

    public Items(Integer id, String name, Float price, String pic, Date createtime, String detail) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.pic = pic;
        this.createtime = createtime;
        this.detail = detail;
    }

    public Items() {
        super();
    }

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取商品名称
     *
     * @return name - 商品名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置商品名称
     *
     * @param name 商品名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取商品定价
     *
     * @return price - 商品定价
     */
    public Float getPrice() {
        return price;
    }

    /**
     * 设置商品定价
     *
     * @param price 商品定价
     */
    public void setPrice(Float price) {
        this.price = price;
    }

    /**
     * 获取商品图片
     *
     * @return pic - 商品图片
     */
    public String getPic() {
        return pic;
    }

    /**
     * 设置商品图片
     *
     * @param pic 商品图片
     */
    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    /**
     * 获取生产日期
     *
     * @return createtime - 生产日期
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 设置生产日期
     *
     * @param createtime 生产日期
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * 获取商品描述
     *
     * @return detail - 商品描述
     */
    public String getDetail() {
        return detail;
    }

    /**
     * 设置商品描述
     *
     * @param detail 商品描述
     */
    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", price=").append(price);
        sb.append(", pic=").append(pic);
        sb.append(", createtime=").append(createtime);
        sb.append(", detail=").append(detail);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Items other = (Items) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getPic() == null ? other.getPic() == null : this.getPic().equals(other.getPic()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getDetail() == null ? other.getDetail() == null : this.getDetail().equals(other.getDetail()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getPic() == null) ? 0 : getPic().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getDetail() == null) ? 0 : getDetail().hashCode());
        return result;
    }
}