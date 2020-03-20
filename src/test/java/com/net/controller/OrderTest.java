package com.net.controller;

import com.tmall.pojo.Order_;
import com.tmall.service.OrderService;
import org.junit.Test;

import java.util.Date;

/**
 * Created by 格瑞 on 2019/11/23.
 */
public class OrderTest {
    @Test
    public void orderTest(){
        OrderService orderService = new OrderService();
        Order_ order = new Order_( "123", "sichuan", "646521", "chans", "1548752222", "snias", new Date(), new Date(), new Date(), new Date(),1, "待收货");
//
        Order_ order1 = new Order_();
        order1.setAddress("test");
        order1.setId(3);
       // System.out.println(order);
        //orderService.insertOrder(order);
        //orderService.updateOrder(order1);
        orderService.deleteOrder(3);
        System.out.println(orderService.selectAll());
        //System.out.println(orderService.selectOrderById(1));
        //System.out.println(orderService.selectOrderByUid(1));

    }
}
