package com.xiaobai.ssm.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

public class Orders implements Serializable {
    @Id
    private Integer id;

    /**
     * 下单用户id
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 订单号
     */
    private String number;

    /**
     * 创建订单时间
     */
    private Date createtime;

    /**
     * 备注
     */
    private String note;

    private static final long serialVersionUID = 1L;

    public Orders(Integer id, Integer userId, String number, Date createtime, String note) {
        this.id = id;
        this.userId = userId;
        this.number = number;
        this.createtime = createtime;
        this.note = note;
    }

    public Orders() {
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
     * 获取下单用户id
     *
     * @return user_id - 下单用户id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置下单用户id
     *
     * @param userId 下单用户id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取订单号
     *
     * @return number - 订单号
     */
    public String getNumber() {
        return number;
    }

    /**
     * 设置订单号
     *
     * @param number 订单号
     */
    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    /**
     * 获取创建订单时间
     *
     * @return createtime - 创建订单时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 设置创建订单时间
     *
     * @param createtime 创建订单时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * 获取备注
     *
     * @return note - 备注
     */
    public String getNote() {
        return note;
    }

    /**
     * 设置备注
     *
     * @param note 备注
     */
    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", number=").append(number);
        sb.append(", createtime=").append(createtime);
        sb.append(", note=").append(note);
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
        Orders other = (Orders) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getNumber() == null ? other.getNumber() == null : this.getNumber().equals(other.getNumber()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getNote() == null ? other.getNote() == null : this.getNote().equals(other.getNote()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getNumber() == null) ? 0 : getNumber().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getNote() == null) ? 0 : getNote().hashCode());
        return result;
    }
}