package com.tmall.service;

import com.tmall.mapper.ReviewMapper;
import com.tmall.pojo.Review;
import com.tmall.utill.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by 格瑞 on 2019/11/24.
 */
public class ReviewService {
    private ReviewMapper reviewMapper;
    private SqlSession sqlSession;


    //查询所有评论
    public List<Review> selectAll() {
        List<Review> reviews;
        sqlSession = MybatisUtils.getSqlSession();
        reviewMapper = sqlSession.getMapper(ReviewMapper.class);
        reviews = this.reviewMapper.selectAll();

        sqlSession.close();

        return reviews;
    }

    //根据id查询评论
    public Review selectReviewById(int id){
        Review review = null;
        sqlSession = MybatisUtils.getSqlSession();
            reviewMapper = sqlSession.getMapper(ReviewMapper.class);
            review = this.reviewMapper.selectReviewById(id);

            sqlSession.close();

        return review;
    }

    //查询产品评论
    public List<Review> selectReviewByPid(int pid){
        List<Review> reviews;
        sqlSession = MybatisUtils.getSqlSession();
            reviewMapper = sqlSession.getMapper(ReviewMapper.class);
            reviews = this.reviewMapper.selectReviewByPid(pid);

            sqlSession.close();

        return reviews;
    }

    //查询用户的评论
    public List<Review> selectReviewByUid(int uid){
        List<Review> reviews = null;
        sqlSession = MybatisUtils.getSqlSession();
            reviewMapper = sqlSession.getMapper(ReviewMapper.class);
            reviews = this.reviewMapper.selectReviewByUid(uid);

            sqlSession.close();

        return reviews;
    }

    //修改评论
    public void updateReview(Review review){
        sqlSession = MybatisUtils.getSqlSession();
            reviewMapper = sqlSession.getMapper(ReviewMapper.class);
            this.reviewMapper.updateReview(review);

            sqlSession.close();

    }

    //新增评论
    public void insertReview(Review review){
        sqlSession = MybatisUtils.getSqlSession();
            reviewMapper = sqlSession.getMapper(ReviewMapper.class);
            this.reviewMapper.insertReview(review);

            sqlSession.close();

    }

    //删除评论
    public void deleteReview(int id){

            sqlSession = MybatisUtils.getSqlSession();
            reviewMapper = sqlSession.getMapper(ReviewMapper.class);
            this.reviewMapper.deleteReview(id);

            sqlSession.close();
        }

}
