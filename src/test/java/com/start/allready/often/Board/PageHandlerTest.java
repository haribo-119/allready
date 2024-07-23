package com.start.allready.often.Board;

import org.junit.Test;

import static org.junit.Assert.*;

public class PageHandlerTest {

    @Test
    public void test1(){
        PageHandler ph = new PageHandler(250, 1,10);
        assertTrue(ph.getBeginPage() == 1);
        assertTrue(ph.getEndPage() == 10);
        ph.print();
    }

    @Test
    public void test2(){
        PageHandler ph = new PageHandler(250, 12,10);
        assertTrue(ph.getBeginPage() == 11);
        assertTrue(ph.getEndPage() == 20);
        ph.print();
    }

    @Test
    public void test3(){
        PageHandler ph = new PageHandler(55, 53,10);
        assertTrue(ph.getBeginPage() == 51);
        assertTrue(ph.getEndPage() == 55);
        ph.print();
    }


    @Test
    public void test4(){
        PageHandler ph = new PageHandler(31, 31,10);
        assertTrue(ph.getBeginPage() == 31);
        assertTrue(ph.getEndPage() == 31);
        ph.print();
    }

    @Test
    public void test5(){
        PageHandler ph = new PageHandler(255, 120,10);
//        assertTrue(ph.getBeginPage() == 110);
//        assertTrue(ph.getEndPage() == );
        ph.print();
    }



}