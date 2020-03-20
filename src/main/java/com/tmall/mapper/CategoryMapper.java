package com.tmall.mapper;

import com.tmall.pojo.Category;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by 格瑞 on 2019/11/14.
 */

@Repository
public interface CategoryMapper {

    //查询分类
   public List<Category> selectAll();

   //根据id查询分类
   public Category selectCategoryById(@Param("id") int id);

   //根据pid查询分类
   public  Category selectCategoryByPid(@Param("pid") int pid);

   //新增分类
   public void insertCategory(Category category);

   //修改分类
   public void updateCategory( Category category);

   //删除分类
   public void deleteCategory( @Param("id") int id);

}
