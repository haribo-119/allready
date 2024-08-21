package com.start.allready.often.User;


public interface UserDao {

    User select (String id) throws Exception;

    int insert (User user) throws Exception;
}
