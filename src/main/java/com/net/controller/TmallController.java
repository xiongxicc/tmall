package com.net.controller;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.tmall.pojo.Category;
import com.tmall.pojo.PropertyValue;
import com.tmall.service.CategoryService;
import com.tmall.service.ProductImageService;
import com.tmall.service.PropertyValueService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 格瑞 on 2019/11/13.
 */

@Controller
public class TmallController {

    private CategoryService categoryService = new CategoryService();
    private PropertyValueService propertyValueService = new PropertyValueService();
    @RequestMapping("/tmall")
    public String tmall(Model model ) throws Exception {


        List<Category> categorys = categoryService.selectAll();
        List<List<PropertyValue>> propertyValueList = propertyValueService.selectAll();
        List<List<PropertyValue>> propertyValueTmp = new ArrayList<>();
        List proValByCate = new ArrayList();
       for (int i = 0; i<categorys.size(); i++){
            for (int j=0; j<propertyValueList.size();j++){
                if(propertyValueList.get(j).get(0).getProperty().getCategory().getId() == categorys.get(i).getId()){
                    propertyValueTmp.add(propertyValueList.get(j));
                }
            }
           proValByCate.add(propertyValueTmp);
           propertyValueTmp=new ArrayList();
       }

        JSONArray jsonProValByCate = JSONArray.parseArray(JSONObject.toJSONString(proValByCate));
        JSONArray jsonCategorys = JSONArray.parseArray(JSONObject.toJSONString(categorys));

        model.addAttribute("size", categorys.size());
        model.addAttribute("jsonProValByCate", jsonProValByCate);
        model.addAttribute("jsonCategorys", jsonCategorys);
        return "tmall";
    }



}
