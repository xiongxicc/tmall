package com.tmall.utill;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by 格瑞 on 2019/11/19.
 */
public class MybatisUtils {
    private static SqlSessionFactory sqlSessionFactory;


    static  {

        String resource = "mybatis-config.xml";

        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }

        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

    }
    private MybatisUtils(){}

    public static SqlSessionFactory getSqlSessionFactory(){
        return sqlSessionFactory;
    }

    public static SqlSession getSqlSession(){
        SqlSessionFactory sqlSessionFactory = MybatisUtils.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        return sqlSession;
    }
}
