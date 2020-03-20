package com.tmall.mapper;

import com.tmall.pojo.Order_;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by 格瑞 on 2019/11/23.
 */
public interface OrderMapper {

    //查询所有订单
    public List<Order_> selectAll ();

    //根据订单号查询订单
    public Order_ selectOrderById(@Param("id") int id);

    //新增订单
    public void insertOrder( Order_ order);

    //或修改订单
    public void  updateOrder( Order_ order);
    //删除订单
    public void deleteOrder(@Param("id") int id);
    //查询某用户的所有订单
    public List<Order_> selectOrderByUid(@Param("uid") int uid);
}
