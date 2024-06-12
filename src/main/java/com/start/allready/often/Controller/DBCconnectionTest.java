package com.start.allready.often.Controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.sql.Connection;

public class DBCconnectionTest {
    public static void main(String[] args) throws Exception {

        // 1차 확인 dbconnection
//        String DB_URL = "jdbc:mysql://localhost:3306/blog_site?useUnicode=true&characterEcnoding=utf8";
//
//        String DB_id = "root";
//        String DB_pwd = "0000";
//        String DB_driver = "com.mysql.jdbc.Driver";
//
//        DriverManagerDataSource ds = new DriverManagerDataSource();
//        ds.setDriverClassName(DB_driver);
//        ds.setUrl(DB_URL);
//        ds.setUsername(DB_id);
//        ds.setPassword(DB_pwd);

//        Connection conn = (Connection) ds.getConnection();

        // 2차 bean 등록, DBconnetion 테스트 확인
        ApplicationContext ac =
                new GenericXmlApplicationContext("file:src\\main\\webapp\\WEB-INF\\spring\\root-context.xml");
        //C:\Users\kangw\allready02\src\main\webapp\WEB-INF\spring\root-context.xml
        //"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"

        DataSource ds = ac.getBean(DataSource.class);

        Connection conn = ds.getConnection();



        System.out.println("conn = " +conn);

    }
}
