package com.tmall.mapper;

import com.tmall.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by 格瑞 on 2019/11/24.
 */
public interface UserMapper {
    //查询所有用户
    public List<User> selectAll ();

    //根据id查询用户
    public User selectUserById(@Param("id") int id);

    public User selectUserByNmAndPw(@Param("name") String name, @Param("password") String password);

    //查询用户名是否存在
    public User selectUserByName(@Param("name") String name);

    //新增用户
    public void insertUser( User review);

    //修改用户信息
    public void  updateUser( User review);

    //删除用户
    public void deleteUser(@Param("id") int id);


}
