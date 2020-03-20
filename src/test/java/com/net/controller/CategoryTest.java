package com.net.controller;

import com.tmall.pojo.Category;
import com.tmall.service.CategoryService;
import org.junit.Test;


/**
 * Created by 格瑞 on 2019/11/14.
 */
public class CategoryTest {


    @Test
    public void getCategory(){
        CategoryService categoryService = new CategoryService();

        Category category;
//        category.setName("扑克");
//        category.setId(13);
//        categoryJdbc.deleteCategory(13);
        //category = categoryService.selectCategoryByPid(4);
        //categoryJdbc.updateCategory(category);
       // categoryJdbc.insertCategory(category);
        //System.out.println(categoryJdbc.selectCategoryById(1));
        //System.out.println(categoryJdbc.selectAll());
        categoryService.selectAll();
        category =categoryService.selectCategoryById(1);
        System.out.println(category);
    }
}
