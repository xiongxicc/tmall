package com.tmall.pojo;

/**
 * Created by 格瑞 on 2019/11/14.
 */
public class PropertyValue {
    private int id;
    private String value;
    private Property property;
    private Product product;


    @Override
    public String toString() {
        return "PropertyValue{" +
                "id='" + id + '\'' +
                ", property='" + property + '\'' +
                ", product='" + product + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
