package com.tmall.utill;

/**
 * Created by 格瑞 on 2019/11/18.
 */
public class Page {
    private int size;
    private  int start;
    private int total;

    @Override
    public String toString() {
        return "Page{" +
                "size=" + size +
                ", start=" + start +
                ", total=" + total +
                '}';
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotal() {

        return total;
    }

    public Page(){}
    public Page(int pageNum, int count){
        this.start=pageNum;
        this.size=count;
    }

    public void setSize(int count) {

        this.size = count;
    }

    public void setStart(int pageNum) {


        this.start = pageNum;
    }

    public int getSize() {

        return size;
    }

    public int getStart() {
        return start;
    }
}
