package com.tmall.mapper;

import com.tmall.pojo.ProductImage;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by 格瑞 on 2019/11/24.
 */
public interface ProductImageMapper {

    //查询所有产品图片
    public List<ProductImage> selectAll ();

    //根据产品图片号查询产品图片
    public ProductImage selectProductImageById(@Param("id") int id);

    //根据产品查询产品图片
    public List<ProductImage> selectProductImageByPid(@Param("pid") int pid);

    //新增产品图片
    public void insertProductImage( ProductImage productImage);

    //修改产品图片
    public void  updateProductImage( ProductImage productImage);

    //删除产品图片
    public void deleteProductImage(@Param("id") int id);
}
