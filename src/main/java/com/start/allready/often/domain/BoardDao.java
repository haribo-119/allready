package com.start.allready.often.domain;

import java.util.List;

public interface BoardDao {
    public int count()throws Exception;
    List<Board> selectAll() throws Exception;

    int insert(Board board) throws Exception;

    int update(Board board) throws Exception;

    int delete(Integer bno, String writer) throws Exception;
}
