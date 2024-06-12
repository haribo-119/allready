package com.start.allready.often.Controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.Connection;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src\\main\\webapp\\WEB-INF\\spring\\root-context.xml"})
public class DBCconnectionTestTest {
    @Autowired DataSource ds;
    @Test
    public void main() throws Exception {

//        ApplicationContext ac =
//                new GenericXmlApplicationContext("file:src\\main\\webapp\\WEB-INF\\spring\\root-context.xml");
//        //C:\Users\kangw\allready02\src\main\webapp\WEB-INF\spring\root-context.xml
//        //"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"
//
//        DataSource ds = ac.getBean(DataSource.class);

        Connection conn = ds.getConnection();

        System.out.println("conn = " + conn);
        assertTrue(conn != null);
    }
}