package com.start.allready.often.Board;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class BoardDaoImplTest {
@Autowired private BoardDao boardDao;

@Test
public void dummyData() throws Exception {
    boardDao.deleteAll();
    for(int i=1; i<=255;i++){
        Board board = new Board("제목"+i,"내용","관리자");
        boardDao.insert(board);
    }
    assertTrue(boardDao.count()==255);

}

    @Test
    public void countTest()throws Exception{
        boardDao.deleteAll();
        int test = boardDao.count();
        System.out.println(test);
         assertTrue(test == 0 );

         Board board = new Board("no title","no content","관리자");
        assertTrue(boardDao.insert(board)==1);
        assertTrue(boardDao.count()==1);
        assertTrue(boardDao.insert(board)==1);
        assertTrue(boardDao.count()==2);

    }
    @Test
    public void selectAll() throws Exception{

    boardDao.deleteAll();
    assertTrue(boardDao.count() ==0);

    List<Board> list  = boardDao.selectAll();
    assertTrue(list.size()==0);

    Board board = new Board("no title","no content","관리자");
    assertTrue(boardDao.insert(board)==1);

    list = boardDao.selectAll();
    assertTrue(list.size()==1);

    assertTrue(boardDao.insert(board)==1);
    list = boardDao.selectAll();
    assertTrue(list.size()==2);
    }

    @Test
    public void insert() throws Exception {
    boardDao.deleteAll();
        Board board = new Board("no title","no content","관리자");
        assertTrue(boardDao.insert(board)==1);
        assertTrue(boardDao.count()==1);

    }

    @Test
    public void update() throws Exception {
    boardDao.deleteAll();

    Board board = new Board("no title","no content","관리자");
    boardDao.insert(board);
    assertTrue(boardDao.count()==1);
    List<Board> list= boardDao.selectAll();
    int bno = list.get(0).getBno();
    String writer = list.get(0).getWriter();
    board.setBno(bno);
    board.setTitle("yes title");

    assertTrue(boardDao.update(board)==1);
    }

    @Test
    public void delete()throws Exception {
    boardDao.deleteAll();
    Board board = new Board("no title","no content","관리자");
    assertTrue(boardDao.insert(board)==1);

    List<Board> list = boardDao.selectAll();
    int bno = list.get(0).getBno();
    String writer = list.get(0).getWriter();

    assertTrue(boardDao.delete(bno,writer)==1);
    }

    @Test
    public void deleteAll()throws Exception{
    boardDao.deleteAll();
    assertTrue(boardDao.count()==0);

    }
}