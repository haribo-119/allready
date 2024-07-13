package com.start.allready.often.User;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class UserDaoImplTest {
@Autowired UserDao userDao;
    @Test
    public void selectTest() throws Exception {
        User user = new User();
        user.setId("test");
        User user1 = userDao.select(user.getId());
//        assertTrue(user1.getId() == user.getId());
    }

    @Test
    public void insert() {
    }
}