package com.start.allready.often.domain;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class BoardDaoImplTest {
@Autowired private BoardDao boardDao;

    @Test
    public void countTest()throws Exception{
        int test =boardDao.count();
        System.out.println(test);
//         assertTrue(test == 7 );

    }
    @Test
    public void selectAll() throws Exception{
        List<Board> board  = boardDao.selectAll();
        for(int i=0; i<board.size(); i++){
            System.out.println(board.get(i));
        }
    }

    @Test
    public void insert() throws Exception {
        Board board =new Board();
        board.setTitle("인서트TDD");
        board.setContent("테스트");
        board.setWriter("관리자");
        boardDao.insert(board);

    }

    @Test
    public void update() throws Exception {
        Board board =new Board();
        board.setBno(8);
        board.setWriter("관리자");
        board.setTitle("인서트TDD 업데이트");
        board.setContent("테스트 업데이트");
        int tset = boardDao.update(board);
        System.out.println(tset);
        assertTrue(tset ==1);

    }

    @Test
    public void delete()throws Exception {
    int test = boardDao.delete(8,"관리자");
        System.out.println(test);
        assertTrue(test ==1);

    }
}