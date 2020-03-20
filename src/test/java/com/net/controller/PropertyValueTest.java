package com.net.controller;

import com.tmall.service.PropertyValueService;
import org.junit.Test;

/**
 * Created by 格瑞 on 2019/11/24.
 */
public class PropertyValueTest {

    @Test
    public void propertyValueTest(){

        PropertyValueService propertyValueService = new PropertyValueService();

        //PropertyValue propertyValue = new PropertyValue();

       // propertyValue.setPid(1);
        //propertyValue.setPtid(1);
        //propertyValue.setValue("不测试了，谢谢");
       // propertyValue.setId(13);

        //propertyValueService.deletePropertyValue(13);
        //System.out.println(propertyValueService.selectPropertyValueByPtid(1));
        //System.out.println(propertyValueService.selectPropertyValueByPid(1));
        //System.out.println(propertyValueService.selectPropertyValueById(13));
       // propertyValueService.updatePropertyValue(propertyValue);
       // propertyValueService.insertPropertyValue(propertyValue);
        System.out.println(propertyValueService.selectAll());
    }
}
