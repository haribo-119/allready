package com.start.allready.often.domain;

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



}