package com.net.controller;

import com.tmall.service.PropertyService;
import org.junit.Test;

/**
 * Created by 格瑞 on 2019/11/24.
 */
public class PropertyTest {

    @Test
    public void propertyTest(){
        PropertyService propertyService = new PropertyService();
//             Property property = new Property();
//        property.setCid(12);
//           property.setName("屏幕");
//           property.setId(4);

        //System.out.println(propertyService.selectPropertyByCid(12));
        //System.out.println(propertyService.selectPropertyById(1));
      //  propertyService.insertProperty(property);
       // propertyService.updataProperty(property);
       // propertyService.deleteProperty(4);
        System.out.println(propertyService.selectAll());
    }
}
