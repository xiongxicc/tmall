package com.tmall.pojo;

/**
 * Created by 格瑞 on 2019/11/14.
 */
public class OrderItem {
    private int id;
    private int pid;
    private int oid;
    private int uid;
    private int number;

    @Override
    public String toString() {
        return "OrderItem{" +
                "id=" + id +
                ", pid=" + pid +
                ", oid=" + oid +
                ", uid=" + uid +
                ", number=" + number +
                '}';
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getId() {

        return id;
    }

    public int getPid() {
        return pid;
    }

    public int getOid() {
        return oid;
    }

    public int getUid() {
        return uid;
    }
}
