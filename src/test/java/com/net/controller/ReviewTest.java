package com.net.controller;

import com.tmall.pojo.Review;
import com.tmall.service.ReviewService;
import org.junit.Test;

/**
 * Created by 格瑞 on 2019/11/24.
 */
public class ReviewTest {

    @Test
    public void reviewTest(){

        ReviewService reviewService = new ReviewService();

        Review review = new Review();
        //review.setPid(1);
       // review.setUid(1);
        review.setContent("东西不好用");
       // review.setCreateDate( new Date());
        review.setId(2);

       // reviewService.insertReview(review);

        //System.out.println(reviewService.selectReviewById(1));
        //System.out.println(reviewService.selectReviewByPid(1));
       // System.out.println(reviewService.selectReviewByUid(1));
        //reviewService.updataReview(review);
        reviewService.deleteReview(2);
        System.out.println(reviewService.selectAll());
    }
}
