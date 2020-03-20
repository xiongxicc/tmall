package com.net.controller;

import com.tmall.service.ProductImageService;
import org.junit.Test;

/**
 * Created by 格瑞 on 2019/11/24.
 */
public class ProductImageTest {

    @Test
    public void productImage(){
        ProductImageService productImageService = new ProductImageService();

        //ProductImage productImage = new ProductImage();
        //productImage.setPid(1);
       // productImage.setId(1);
        //productImage.setType("用于产品详情");
       // productImageService.insertProductImage(productImage);
       //System.out.println( productImageService.selectProductImageByPid(1));
        //System.out.println(productImageService.selectProductImageId(1));
        //productImageService.updateProductImage(productImage);
        //productImageService.deleteProductImage(1);
        System.out.println(productImageService.selectAll());
    }
}
