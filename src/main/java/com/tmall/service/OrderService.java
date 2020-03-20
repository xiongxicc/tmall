package com.tmall.service;

import com.tmall.mapper.OrderMapper;
import com.tmall.pojo.Order_;
import com.tmall.utill.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by 格瑞 on 2019/11/23.
 */
public class OrderService {
    private OrderMapper orderMapper;
    private SqlSession sqlSession;


    //查询所有订单
    public List<Order_> selectAll(){
        List<Order_> orders;
            sqlSession = MybatisUtils.getSqlSession();
            orderMapper = sqlSession.getMapper(OrderMapper.class);
            orders = this.orderMapper.selectAll();

            sqlSession.close();
        return orders;
    }

    //根据id查询订单
    public Order_ selectOrderById(int id){
        Order_ order = null;
        sqlSession = MybatisUtils.getSqlSession();
            orderMapper = sqlSession.getMapper(OrderMapper.class);
            order = this.orderMapper.selectOrderById(id);

            sqlSession.close();
        return order;
    }

    //修改订单
    public void updateOrder(Order_ order){
        sqlSession = MybatisUtils.getSqlSession();
            orderMapper = sqlSession.getMapper(OrderMapper.class);
            this.orderMapper.updateOrder(order);

            sqlSession.close();

    }

    //新增订单
    public void insertOrder(Order_ oder){

            orderMapper = sqlSession.getMapper(OrderMapper.class);
            this.orderMapper.insertOrder(oder);
            sqlSession.close();
    }

    //删除订单
    public void deleteOrder(int id){
        sqlSession = MybatisUtils.getSqlSession();
            orderMapper = sqlSession.getMapper(OrderMapper.class);
            this.orderMapper.deleteOrder(id);

            sqlSession.close();

    }

    //查询某用户的所有订单
    public List<Order_> selectOrderByUid(int uid){
        List<Order_> orders ;
        sqlSession = MybatisUtils.getSqlSession();
            orderMapper = sqlSession.getMapper(OrderMapper.class);
            orders = this.orderMapper.selectOrderByUid(uid);

            sqlSession.close();
        return orders;
    }
}
