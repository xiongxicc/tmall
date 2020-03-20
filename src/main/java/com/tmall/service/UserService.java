package com.tmall.service;

import com.tmall.mapper.UserMapper;
import com.tmall.pojo.User;
import com.tmall.utill.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by 格瑞 on 2019/11/24.
 */
public class UserService {
    private UserMapper userMapper;
    private SqlSession sqlSession;
    //private UserService userJdbc = new UserService();

    //查询所有属性
    public List<User> selectAll(){
        List<User> users = null;
        sqlSession = MybatisUtils.getSqlSession();
            userMapper = sqlSession.getMapper(UserMapper.class);
            users = this.userMapper.selectAll();

            sqlSession.close();
        return users;
    }

    //根据id查询属性
    public User selectUserById(int id){
        User user;
        sqlSession = MybatisUtils.getSqlSession();
            userMapper = sqlSession.getMapper(UserMapper.class);
            user = this.userMapper.selectUserById(id);

            sqlSession.close();

        return user;
    }

    //查询分类属性
    public User selectUserByNmAndPw(String name, String password){
        User user = null;
        sqlSession = MybatisUtils.getSqlSession();
            userMapper = sqlSession.getMapper(UserMapper.class);
            user = this.userMapper.selectUserByNmAndPw(name, password);

            sqlSession.close();
        return user;
    }
    //修改属性
    public void updateUser(User user){
        sqlSession = MybatisUtils.getSqlSession();
            userMapper = sqlSession.getMapper(UserMapper.class);
            this.userMapper.updateUser(user);

            sqlSession.close();

    }

    //新增属性
    public void insertUser(User user){
        sqlSession = MybatisUtils.getSqlSession();
            userMapper = sqlSession.getMapper(UserMapper.class);
            this.userMapper.insertUser(user);

            sqlSession.close();

    }

    //删除属性
    public void deleteUser(int id){
        sqlSession = MybatisUtils.getSqlSession();
            userMapper = sqlSession.getMapper(UserMapper.class);
            this.userMapper.deleteUser(id);

            sqlSession.close();

    }

    //查询用户名是否存在
    public User selectUserByName(String userName) {
        User user = null;
        sqlSession = MybatisUtils.getSqlSession();
            userMapper = sqlSession.getMapper(UserMapper.class);
            user = this.userMapper.selectUserByName(userName);
        sqlSession.close();
        return user;

    }
}
