package com.tmall.service;

import com.tmall.mapper.PropertyValueMapper;
import com.tmall.pojo.PropertyValue;
import com.tmall.utill.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 格瑞 on 2019/11/19.
 */
public class PropertyValueService {

    private PropertyValueMapper propertyValueMapper;


    //查询所有评论
    public List<List<PropertyValue>> selectAll(){
        List<PropertyValue> propertyValues ;
        List<PropertyValue> proVals = new ArrayList<>();
        List< List<PropertyValue> > propertyValuesByPro = new ArrayList<>();
        List<Integer> pids = new ArrayList<>();

        SqlSession sqlSession = MybatisUtils.getSqlSession();
            propertyValueMapper = sqlSession.getMapper(PropertyValueMapper.class);
            propertyValues = this.propertyValueMapper.selectAll();
            if(propertyValues !=null){
                for (int j =0; j<propertyValues.size(); j++){
                    if(!pids.contains(propertyValues.get(j).getProperty().getId())){
                        pids.add(propertyValues.get(j).getProperty().getId());
                    }
                }
                for(int pid : pids) {
                    for (int i = 0; i < propertyValues.size(); i++) {
                        if (propertyValues.get(i).getProperty().getId() == pid) {
                            proVals.add(propertyValues.get(i));
                        }
                    }
                    propertyValuesByPro.add(proVals);
                    proVals=new ArrayList<>();
                }
            }


            sqlSession.close();

        return propertyValuesByPro;
    }

    //根据id查询评论
    public PropertyValue selectPropertyValueById(int id){
        PropertyValue propertyValue = null;
        SqlSession sqlSession = MybatisUtils.getSqlSession();
            propertyValueMapper = sqlSession.getMapper(PropertyValueMapper.class);
            propertyValue = this.propertyValueMapper.selectPropertyValueById(id);

            sqlSession.close();

        return propertyValue;
    }

    //查询产品评论
    public List<PropertyValue> selectPropertyValueByPid(int pid){
        List<PropertyValue> propertyValues = null;
        SqlSession sqlSession = MybatisUtils.getSqlSession();
            propertyValueMapper = sqlSession.getMapper(PropertyValueMapper.class);
            propertyValues = this.propertyValueMapper.selectPropertyValueByPid(pid);

            sqlSession.close();

        return propertyValues;
    }

    public List<List<PropertyValue>> selectPropertyValueByCid(int cid){
        List<PropertyValue> propertyValues ;
        List<PropertyValue> propertyValuesTmp = new ArrayList<>();
        List<List<PropertyValue>> propertyValueList=new ArrayList<>();
        List< List<List<PropertyValue>>> categoryProperty = new ArrayList<>();
        int ptid ;
        SqlSession sqlSession = MybatisUtils.getSqlSession();
            propertyValueMapper = sqlSession.getMapper(PropertyValueMapper.class);
            propertyValues = this.propertyValueMapper.selectPropertyValueByCid(cid);
            if(propertyValues != null) {
                ptid = propertyValues.get(0).getProperty().getId();
                for (int i = 0; i < propertyValues.size(); i++) {
                    if ((ptid != propertyValues.get(i).getProperty().getId() || i == propertyValues.size() - 1) && propertyValuesTmp!=null) {
                        propertyValueList.add(propertyValuesTmp);
                        ptid = propertyValues.get(i).getProperty().getId();
                        propertyValuesTmp = new ArrayList<>();
                    }
                    propertyValuesTmp.add(propertyValues.get(i));
                }
            }

            sqlSession.close();

        return propertyValueList;
    }

    //查询用户的评论
    public List<PropertyValue> selectPropertyValueByPtid(int ptid){
        List<PropertyValue> propertyValues = null;
        SqlSession sqlSession = MybatisUtils.getSqlSession();
            propertyValueMapper = sqlSession.getMapper(PropertyValueMapper.class);
            propertyValues = this.propertyValueMapper.selectPropertyValueByPtid(ptid);

            sqlSession.close();

        return propertyValues;
    }

    //修改评论
    public void updatePropertyValue(PropertyValue propertyValue){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
            propertyValueMapper = sqlSession.getMapper(PropertyValueMapper.class);
            this.propertyValueMapper.updatePropertyValue(propertyValue);

            sqlSession.close();

    }

    //新增评论
    public void insertPropertyValue(PropertyValue propertyValue){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
            propertyValueMapper = sqlSession.getMapper(PropertyValueMapper.class);
            this.propertyValueMapper.insertPropertyValue(propertyValue);

            sqlSession.close();

    }

    //删除评论
    public void deletePropertyValue(int id){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
            propertyValueMapper = sqlSession.getMapper(PropertyValueMapper.class);
            this.propertyValueMapper.deletePropertyValue(id);

            sqlSession.close();

    }
}
