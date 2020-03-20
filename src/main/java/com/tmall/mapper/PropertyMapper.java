package com.tmall.mapper;

import com.tmall.pojo.Property;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by 格瑞 on 2019/11/24.
 */
public interface PropertyMapper {
    //查询所有属性
    public List<Property> selectAll ();

    //根据属性号查询属性
    public Property selectPropertyById(@Param("id") int id);

    //根据分类查询属性
    public List<Property> selectPropertyByCid(@Param("cid") int cid);

    //新增属性
    public void insertProperty( Property property);

    //修改属性
    public void  updateProperty( Property property);

    //删除属性
    public void deleteProperty(@Param("id") int id);
}
