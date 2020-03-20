package com.tmall.service;

import com.tmall.mapper.ProductMapper;
import com.tmall.pojo.Product;
import com.tmall.utill.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by 格瑞 on 2019/11/23.
 */
public class ProductService {
    private ProductMapper productMaper;



    //查询所有产品
    public List<Product> selectAll(){
        List<Product> products = null;
        SqlSession sqlSession = MybatisUtils.getSqlSession();
            productMaper = sqlSession.getMapper(ProductMapper.class);
            products = this.productMaper.selectAll();

            sqlSession.close();

        return products;
    }

    //根据id查询产品
    public Product selectById(int id){
        Product product = null;
        SqlSession sqlSession = MybatisUtils.getSqlSession();
            productMaper = sqlSession.getMapper(ProductMapper.class);
            product = this.productMaper.selectById(id);

            sqlSession.close();

        return product;
    }

    //模糊查询产品
    public List<Product> selectByName(String name) {
        List<Product> products = null;
        SqlSession sqlSession = MybatisUtils.getSqlSession();
            productMaper = sqlSession.getMapper(ProductMapper.class);
            products = this.productMaper.selectByName(name);

            sqlSession.close();

        return products;
    }

    //修改产品
    public void updateProduct(Product product){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
            productMaper = sqlSession.getMapper(ProductMapper.class);
           this.productMaper.updateProduct(product);

            sqlSession.close();

    }

    //新增产品
    public void insertProduct(Product product){

        SqlSession sqlSession = MybatisUtils.getSqlSession();
            productMaper = sqlSession.getMapper(ProductMapper.class);
            this.productMaper.insertProduct(product);

            sqlSession.close();

    }

    //下架产品
    public void deleteProduct(int id){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
            productMaper = sqlSession.getMapper(ProductMapper.class);
            this.productMaper.deleteProduct(id);

            sqlSession.close();

    }

}
