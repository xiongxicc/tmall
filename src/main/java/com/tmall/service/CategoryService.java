package com.tmall.service;

import com.tmall.mapper.CategoryMapper;
import com.tmall.pojo.Category;
import com.tmall.utill.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by 格瑞 on 2019/11/14.
 */
public class CategoryService implements CategoryMapper{
    private CategoryMapper categoryMapper;




   //查询分类
   public List<Category> selectAll () {

            SqlSession sqlSession =MybatisUtils.getSqlSession();
           categoryMapper = sqlSession.getMapper(CategoryMapper.class);

           List<Category> categories = categoryMapper.selectAll();

           sqlSession.close();
            return categories;

   }

    //查询分类
    public Category selectCategoryById (int id) {

        //categoryMapper = (CategoryMapper) mybatis.init(categoryMapper);
             Category categories;

            SqlSession sqlSession = MybatisUtils.getSqlSession();
            categoryMapper = sqlSession.getMapper(CategoryMapper.class);
            categories = categoryMapper.selectCategoryById(id);
            sqlSession.close();
        return categories;

    }

    //根据产品号查询分类
    public Category selectCategoryByPid (int id) {

        Category categories;
            SqlSession sqlSession = MybatisUtils.getSqlSession();
            categoryMapper = sqlSession.getMapper(CategoryMapper.class);
            categories = categoryMapper.selectCategoryByPid(id);

            sqlSession.close();
            return categories;

    }
   //新增分类
   public void insertCategory(Category category) {

           SqlSession sqlSession = MybatisUtils.getSqlSession();
           categoryMapper = sqlSession.getMapper(CategoryMapper.class);
           categoryMapper.insertCategory(category);
           sqlSession.close();

   }


   //修改分类
   public void updateCategory(Category category) {

            SqlSession sqlSession = MybatisUtils.getSqlSession();
           categoryMapper = sqlSession.getMapper(CategoryMapper.class);
           categoryMapper.updateCategory(category);
           sqlSession.close();

   }

    //删除分类
    public void deleteCategory(int id) {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
            categoryMapper = sqlSession.getMapper(CategoryMapper.class);
            categoryMapper.deleteCategory(id);
            sqlSession.close();

    }
}
