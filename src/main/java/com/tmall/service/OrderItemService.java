package com.tmall.service;

import com.tmall.mapper.OrderItemMapper;
import com.tmall.pojo.OrderItem;
import com.tmall.utill.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by 格瑞 on 2019/11/23.
 */
public class OrderItemService {
    private OrderItemMapper orderItemMapper;
    private SqlSession sqlSession;



    //查询所有订单项
    public List<OrderItem> selectAll(){
        List<OrderItem> orderItems;
            sqlSession = MybatisUtils.getSqlSession();
            orderItemMapper = sqlSession.getMapper(OrderItemMapper.class);
            orderItems = this.orderItemMapper.selectAll();
            sqlSession.close();
        return orderItems;
    }

    //根据id查询订单项
    public OrderItem selectOrderItemById(int id){
        OrderItem orderItems = null;
        sqlSession = MybatisUtils.getSqlSession();
            orderItemMapper = sqlSession.getMapper(OrderItemMapper.class);
            orderItems = this.orderItemMapper.selectOrderItemById(id);

            sqlSession.close();
        return orderItems;
    }

    //修改订单项
    public void updateOrderItem(OrderItem orderItems){
        sqlSession = MybatisUtils.getSqlSession();
            orderItemMapper = sqlSession.getMapper(OrderItemMapper.class);
            this.orderItemMapper.updateOrderItem(orderItems);
            sqlSession.close();

    }

    //新增订单项
    public void insertOrderItem(OrderItem orderItem){
        sqlSession = MybatisUtils.getSqlSession();
            orderItemMapper = sqlSession.getMapper(OrderItemMapper.class);
            this.orderItemMapper.insertOrderItem(orderItem);
            sqlSession.close();

    }

    //删除订单项
    public void deleteOrderItem(int id){
        sqlSession = MybatisUtils.getSqlSession();
            orderItemMapper = sqlSession.getMapper(OrderItemMapper.class);
            this.orderItemMapper.deleteOrderItem(id);

            sqlSession.close();

    }

    //查询某用户的所有订单项
    public List<OrderItem> selectOrderItemByUid(int uid){
        List<OrderItem> orderItems = null;
        sqlSession = MybatisUtils.getSqlSession();
            orderItemMapper = sqlSession.getMapper(OrderItemMapper.class);
            orderItems = this.orderItemMapper.selectOrderItemByUid(uid);

            sqlSession.close();
        return orderItems;
    }

    //查询某产品的订单项
    public List<OrderItem> selectOrderItemByPid(int pid){
        List<OrderItem> orderItems = null;
        sqlSession = MybatisUtils.getSqlSession();
            orderItemMapper = sqlSession.getMapper(OrderItemMapper.class);
            orderItems = this.orderItemMapper.selectOrderItemByPid(pid);
        sqlSession.close();
        return orderItems;
    }

    //查询某订单的订单项
    public List<OrderItem> selectOrderItemByOid(int oid){
        List<OrderItem> orderItems = null;
        sqlSession = MybatisUtils.getSqlSession();
            orderItemMapper = sqlSession.getMapper(OrderItemMapper.class);
            orderItems = this.orderItemMapper.selectOrderItemByOid(oid);

            sqlSession.close();
        return orderItems;
    }
}
