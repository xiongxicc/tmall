package com.tmall.mapper;

import com.tmall.pojo.Review;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by 格瑞 on 2019/11/24.
 */
public interface ReviewMapper {
    //查询所有评论
    public List<Review> selectAll ();

    //根据id查询评论
    public Review selectReviewById(@Param("id") int id);

    //根据产品查询评论
    public List<Review> selectReviewByPid(@Param("pid") int pid);

    //根据用户查询评论
    public List<Review> selectReviewByUid(@Param("uid") int uid);

    //新增评论
    public void insertReview( Review review);

    //修改评论
    public void  updateReview( Review review);

    //删除评论
    public void deleteReview(@Param("id") int id);
}
