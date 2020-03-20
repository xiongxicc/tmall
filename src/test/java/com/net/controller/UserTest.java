package com.net.controller;

import com.tmall.pojo.User;
import com.tmall.service.UserService;
import org.junit.Test;

import java.io.IOException;


public class UserTest {

    @Test
    public  void userTest() throws IOException, ClassNotFoundException {
        UserService userService = new UserService();

        User user = new User();
        //user.setName("cc");
        user.setPassword("157814");
        user.setId(13);

       // userService.deleteUser(13);
        //userService.selectAll();
        //userService.updateUser(user);
        //System.out.println(userService.selectUserByNmAndPw("xx", "123456"));
       // System.out.println(userService.selectUserById(12));
        //userService.insertUser(user);
        System.out.println(userService.selectAll());
    }
}
