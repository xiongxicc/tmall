package com.tmall.pojo;

/**
 * Created by 格瑞 on 2019/11/14.
 */
public class Property {
    private int id;
    private Category category;
    private String name;



    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {

        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Property{" +
                "id=" + id +
                ", cid=" + category +
                ", name='" + name + '\'' +
                '}';
    }
}
