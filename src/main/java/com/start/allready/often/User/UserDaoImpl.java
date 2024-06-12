package com.start.allready.often.User;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    @Autowired private SqlSession sqlsession;

    private static String namespace="com.start.allready.mapper.UserMapper.";

    @Override
    public User select(String id)throws Exception{
        return sqlsession.selectOne(namespace+"select",id);
    }

    @Override
    public int insert(User user)throws Exception{
        return sqlsession.insert(namespace+"insert",user);
    }

}
