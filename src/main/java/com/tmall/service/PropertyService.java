package com.tmall.service;

import com.tmall.mapper.PropertyMapper;
import com.tmall.pojo.Property;
import com.tmall.utill.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by 格瑞 on 2019/11/24.
 */
public class PropertyService {
    private PropertyMapper propertyMapper;



    //查询所有属性
    public List<Property> selectAll(){
        List<Property> propertys = null;

            SqlSession sqlSession = MybatisUtils.getSqlSession();
            propertyMapper = sqlSession.getMapper(PropertyMapper.class);
            propertys = this.propertyMapper.selectAll();

           sqlSession.close();

        return propertys;
    }

    //根据id查询属性
    public Property selectPropertyById(int id){
        Property property = null;
        SqlSession sqlSession = MybatisUtils.getSqlSession();
            propertyMapper = sqlSession.getMapper(PropertyMapper.class);
            property = this.propertyMapper.selectPropertyById(id);

            sqlSession.close();

        return property;
    }

    //查询分类属性
    public List<Property> selectPropertyByCid(int cid){
       List<Property> propertys = null;
        SqlSession sqlSession = MybatisUtils.getSqlSession();
            propertyMapper = sqlSession.getMapper(PropertyMapper.class);
            propertys = this.propertyMapper.selectPropertyByCid(cid);

            sqlSession.close();

        return propertys;
    }
    //修改属性
    public void updateProperty(Property property){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
            propertyMapper = sqlSession.getMapper(PropertyMapper.class);
            this.propertyMapper.updateProperty(property);

            sqlSession.close();

    }

    //新增属性
    public void insertProperty(Property property){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
            propertyMapper = sqlSession.getMapper(PropertyMapper.class);
            this.propertyMapper.insertProperty(property);

            sqlSession.close();

    }

    //删除属性
    public void deleteProperty(int id){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
            propertyMapper = sqlSession.getMapper(PropertyMapper.class);
            this.propertyMapper.deleteProperty(id);

            sqlSession.close();

    }
}
