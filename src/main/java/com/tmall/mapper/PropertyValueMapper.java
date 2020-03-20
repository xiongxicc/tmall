package com.tmall.mapper;

import com.tmall.pojo.PropertyValue;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by 格瑞 on 2019/11/19.
 */
public interface PropertyValueMapper {

    //查询所有属性值
    public List<PropertyValue> selectAll ();

    //根据id查询属性值
    public PropertyValue selectPropertyValueById(@Param("id") int id);

    //根据产品查询属性值
    public List<PropertyValue> selectPropertyValueByPid(@Param("pid") int pid);

    public List<PropertyValue> selectPropertyValueByCid(@Param("cid") int cid);

    //根据属性查询属性值
    public List<PropertyValue> selectPropertyValueByPtid(@Param("ptid") int ptid);

    //新增属性值
    public void insertPropertyValue( PropertyValue propertyValue);

    //修改属性值
    public void  updatePropertyValue( PropertyValue propertyValue);

    //删除属性值
    public void deletePropertyValue(@Param("id") int id);
}
