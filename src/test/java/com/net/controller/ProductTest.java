package com.net.controller;

import com.tmall.pojo.Product;
import com.tmall.service.ProductService;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by 格瑞 on 2019/11/23.
 */
public class ProductTest {
    @Test
    public void productTest() throws IOException {
        ProductService productService = new ProductService();
        Product product = new Product();
        product.setName("搓衣板");
        product.setCid(12);
        //product.setCreateDate(new Date());
        product.setOrignalPrice(123);
        product.setPromotePrice(5);
        product.setStock(2300);
        product.setSubTitle("居家必备");
        product.setId(3);

        //System.out.println(productService.selectAll());
        //System.out.println(productService.selectById(1));
        //productService.insertProduct(product);
       // productService.updataProduct(product);
        productService.deleteProduct(3);
        System.out.println(productService.selectAll());
    }
}
