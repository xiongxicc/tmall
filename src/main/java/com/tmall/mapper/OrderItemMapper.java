package com.tmall.mapper;

import com.tmall.pojo.OrderItem;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by 格瑞 on 2019/11/23.
 */
public interface OrderItemMapper {
    //查询所有订单项
    public List<OrderItem> selectAll ();

    //根据订单项号查询订单项
    public OrderItem selectOrderItemById(@Param("id") int id);

    //新增订单项
    public void insertOrderItem( OrderItem orderItem);

    //修改订单项
    public void  updateOrderItem( OrderItem orderItem);
    //删除订单项
    public void deleteOrderItem(@Param("id") int id);
    //查询某用户的所有订单项
    public List<OrderItem> selectOrderItemByUid(@Param("uid") int uid);

    //查询产品的所有订单项
    public List<OrderItem> selectOrderItemByPid(@Param("pid") int pid);

    //查询订单的订单项
    public List<OrderItem> selectOrderItemByOid(@Param("oid") int oid);
}
