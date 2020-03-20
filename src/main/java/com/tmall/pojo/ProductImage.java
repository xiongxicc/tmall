package com.tmall.pojo;

/**
 * Created by 格瑞 on 2019/11/14.
 */
public class ProductImage {
    private int id;
    private int pid;
    private String type;

    public void setId(int id) {
        this.id = id;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {

        return id;
    }

    public int getPid() {
        return pid;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "ProductImage{" +
                "id=" + id +
                ", pid=" + pid +
                ", type='" + type + '\'' +
                '}';
    }
}
