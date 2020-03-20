package com.tmall.service;

import com.tmall.mapper.ProductImageMapper;
import com.tmall.pojo.ProductImage;
import com.tmall.utill.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by 格瑞 on 2019/11/24.
 */
public class ProductImageService {
    private ProductImageMapper productImageMapper;



    //查询所有属性
    public List<ProductImage> selectAll(){
        List<ProductImage> propertys = null;
        SqlSession sqlSession = MybatisUtils.getSqlSession();
            productImageMapper = sqlSession.getMapper(ProductImageMapper.class);
            propertys = this.productImageMapper.selectAll();

            sqlSession.close();

        return propertys;
    }

    //根据id查询属性
    public ProductImage selectProductImageId(int id){
        ProductImage productImage = null;
        SqlSession sqlSession = MybatisUtils.getSqlSession();
            productImageMapper = sqlSession.getMapper(ProductImageMapper.class);
            productImage = this.productImageMapper.selectProductImageById(id);

            sqlSession.close();

        return productImage;
    }

    //查询分类属性
    public List<ProductImage> selectProductImageByPid(int pid){
        List<ProductImage> productImages = null;
        SqlSession sqlSession = MybatisUtils.getSqlSession();
            productImageMapper = sqlSession.getMapper(ProductImageMapper.class);
            productImages = this.productImageMapper.selectProductImageByPid(pid);

            sqlSession.close();

        return productImages;
    }
    //修改属性
    public void updateProductImage(ProductImage productImage){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
            productImageMapper = sqlSession.getMapper(ProductImageMapper.class);
            this.productImageMapper.updateProductImage(productImage);

            sqlSession.close();

    }

    //新增属性
    public void insertProductImage(ProductImage productImage){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
            productImageMapper = sqlSession.getMapper(ProductImageMapper.class);
            this.productImageMapper.insertProductImage(productImage);

            sqlSession.close();

    }

    //删除属性
    public void deleteProductImage(int id){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
            productImageMapper = sqlSession.getMapper(ProductImageMapper.class);
            this.productImageMapper.deleteProductImage(id);

            sqlSession.close();

    }
}
