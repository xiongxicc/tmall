package com.tmall.pojo;

import java.util.Date;

/**
 * Created by 格瑞 on 2019/11/14.
 */
public class Product {
    private int id;// 产品id
    private String name;//产品名字
    private String subTitle ;//产品小标题
    private double orignalPrice;//原始价格
    private double promotePrice;// 优惠价格
    private int stock;//库存
    private int cid;//外键指向分类表category的id
    private Date createDate;//创建时间

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public void setOrignalPrice(double orignalPrice) {
        this.orignalPrice = orignalPrice;
    }

    public void setPromotePrice(double promotePrice) {
        this.promotePrice = promotePrice;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public int getId() {

        return id;
    }

    public String getName() {
        return name;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public double getOrignalPrice() {
        return orignalPrice;
    }

    public double getPromotePrice() {
        return promotePrice;
    }

    public int getStock() {
        return stock;
    }

    public int getCid() {
        return cid;
    }

    public Date getCreateDate() {
        return createDate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", subTitle='" + subTitle + '\'' +
                ", orignalPrice='" + orignalPrice + '\'' +
                ", promotePrice='" + promotePrice + '\'' +
                ", stock=" + stock +
                ", cid='" + cid + '\'' +
                ", createDate=" + createDate +
                '}';
    }
}
