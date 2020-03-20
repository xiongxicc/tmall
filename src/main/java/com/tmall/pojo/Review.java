package com.tmall.pojo;

import java.util.Date;

/**
 * Created by 格瑞 on 2019/11/14.
 */
public class Review {
    private int id;
    private String content;
    private int uid;
    private int pid;
    private Date createDate;

    public void setId(int id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public int getId() {

        return id;
    }

    public String getContent() {
        return content;
    }

    public int getUid() {
        return uid;
    }

    public int getPid() {
        return pid;
    }

    public Date getCreateDate() {
        return createDate;
    }

    @Override
    public String toString() {
        return "Review{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", uid=" + uid +
                ", pid=" + pid +
                ", createDate=" + createDate +
                '}';
    }
}
