package com.net.controller;

import com.tmall.pojo.Category;
import com.tmall.pojo.Product;
import com.tmall.pojo.Review;
import com.tmall.pojo.User;
import com.tmall.service.CategoryService;
import com.tmall.service.ProductService;
import com.tmall.service.ReviewService;
import com.tmall.service.UserService;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by 格瑞 on 2019/11/24.
 */

@Controller
@RequestMapping("/tmall")
public class EnterController {
    UserService userService = new UserService();
    @RequestMapping("/loading")
    public String enter(@Param("userName") String userName, @Param("password") String password, Model model){
        User user = null;
        boolean isEmpty = false;
        if(userName!=null && password !=null)
        user = userService.selectUserByNmAndPw(userName,password);
        model.addAttribute("userName" ,userName);
        model.addAttribute("password", password);

        if(user != null){
           return "redirect:/tmall";

        }else {
            return "loading";
        }
    }

    @RequestMapping("/register")
    public String register(@Param("userName") String userName, @Param("password") String password, Model model){
        User user = new User();
        boolean exist = false;
        if(userName!=null && password !=null) {
            user.setName(userName);
            user.setPassword(password);
            if(userService.selectUserByName(userName) == null){
                userService.insertUser(user);
                exist= true;
            }

        }
        model.addAttribute("exist", exist);
        return "register";
    }
        @RequestMapping("product")
        public String product( @Param("pid") int pid ,Model model){
            Category category;
            List<Review> reviews;

            ReviewService reviewService = new ReviewService();

            //获取产品评论
            reviews = reviewService.selectReviewByPid(pid);
            CategoryService categoryService = new CategoryService();
            category = categoryService.selectCategoryByPid(pid);
            model.addAttribute("category", category);
            model.addAttribute("reviews", reviews);

            return "product";
        }

        //搜索栏
    @RequestMapping("select")
        public String select(@Param("productName") String productName, Model model){
        ProductService productService = new ProductService();
        List<Product> products;
        products =  productService.selectByName(productName);

        model.addAttribute("products", products);

        return "productList";
    }

}
