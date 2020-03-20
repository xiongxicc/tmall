package com.tmall.pojo;

import java.util.Date;

/**
 * Created by 格瑞 on 2019/11/14.
 */
public class Order_ {
    private int id; //自增主键
    private String orderCode;//订单号
    private String address;//收货地址
    private String post ;// 邮编
    private String receiver;// 收货人信息
    private String mobile ;// 收货人电话号码
    private String userMessage ;// 用户备注信息
    private Date  createDate ;// 订单创建时间
    private Date payDate ;// 订单支付时间
    private Date deliveryDate ;// 发货日期
    private Date  confirmDate ;//确认收货日期
    private int  uid ;// 外键指向用户表user的id
    private String status ;// 订单状态

    public void setId(int id) {
        this.id = id;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setUserMessage(String userMessage) {
        this.userMessage = userMessage;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public void setConfirmDate(Date confirmDate) {
        this.confirmDate = confirmDate;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getId() {

        return id;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public String getAddress() {
        return address;
    }

    public String getPost() {
        return post;
    }

    public String getReceiver() {
        return receiver;
    }

    public String getMobile() {
        return mobile;
    }

    public String getUserMessage() {
        return userMessage;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public Date getPayDate() {
        return payDate;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public Date getConfirmDate() {
        return confirmDate;
    }

    public int getUid() {
        return uid;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Order_{" +
                "id=" + id +
                ", orderCode='" + orderCode + '\'' +
                ", address='" + address + '\'' +
                ", post='" + post + '\'' +
                ", receiver='" + receiver + '\'' +
                ", mobile='" + mobile + '\'' +
                ", userMessage='" + userMessage + '\'' +
                ", createDate=" + createDate +
                ", payDate=" + payDate +
                ", deliveryDate=" + deliveryDate +
                ", confirmDate=" + confirmDate +
                ", uid=" + uid +
                ", status='" + status + '\'' +
                '}';
    }

    public Order_(String orderCode, String address, String post, String receiver, String mobile, String userMessage, Date createDate, Date payDate, Date deliveryDate, Date confirmDate, int uid, String status) {
        this.orderCode = orderCode;
        this.address = address;
        this.post = post;
        this.receiver = receiver;
        this.mobile = mobile;
        this.userMessage = userMessage;
        this.createDate = createDate;
        this.payDate = payDate;
        this.deliveryDate = deliveryDate;
        this.confirmDate = confirmDate;
        this.uid = uid;
        this.status = status;
    }

    public Order_( ){}
}
