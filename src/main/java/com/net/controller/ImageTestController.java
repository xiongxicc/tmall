package com.net.controller;

import com.tmall.service.ProductImageService;
import com.tmall.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 格瑞 on 2020/3/20.
 */
@RestController
public class ImageTestController {

    @RequestMapping("/getProductImage")
    public Map<String, String> getProductImage(){
        Map<String, String > map  = new HashMap<>();
        ProductImageService productImageService =  new ProductImageService();
        map.put("image",productImageService.selectProductImageId(1).toString());
        return map;
    }

    @RequestMapping("/getUser")
    public Map<String, String> getUser(){
        Map<String, String > map  = new HashMap<>();
        UserService userService =  new UserService();
        map.put("image",userService.selectUserById(1).toString());
        return map;
    }
}
