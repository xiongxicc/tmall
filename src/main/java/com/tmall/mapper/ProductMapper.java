package com.tmall.mapper;

import com.tmall.pojo.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by 格瑞 on 2019/11/23.
 */
public interface ProductMapper {

    //查询所有产品
    public List<Product> selectAll ();

    //根据产品号查询产品
    public Product selectById(@Param("id") int id);

    //新增产品
    public void insertProduct( Product product);

    //或修改产品
    public void  updateProduct( Product product);
    //下架产品
    public void deleteProduct(@Param("id") int id);

    //模糊查询产品
    List<Product> selectByName(String name);
}
