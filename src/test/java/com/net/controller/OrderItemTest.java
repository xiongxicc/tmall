package com.net.controller;

import com.tmall.service.OrderItemService;
import org.junit.Test;

/**
 * Created by 格瑞 on 2019/11/23.
 */
public class OrderItemTest {
    OrderItemService orderItemService = new OrderItemService();
    @Test
    public void OrderItemTest(){
       // OrderItem orderItem = new OrderItem();
//        orderItem.setOid(1);
//        orderItem.setPid(1);
//        orderItem.setUid(1);
       // orderItem.setId(1);
        //orderItem.setNumber(39);
//        orderItemService.insertOrderItem(orderItem);
       // System.out.println(orderItemService.selectOrderItemById(1));
        //System.out.println(orderItemService.selectOrderItemByPid(1));
        //System.out.println(orderItemService.selectOrderItemByUid(1));
        //System.out.println(orderItemService.selectOrderItemByOid(1));
       // orderItemService.updateOrderItem(orderItem);
        orderItemService.deleteOrderItem(1);
        System.out.println(orderItemService.selectAll());
    }
}
