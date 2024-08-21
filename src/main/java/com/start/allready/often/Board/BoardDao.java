package com.start.allready.often.Board;

import java.util.List;
import java.util.Map;

  interface BoardDao {
    int count()throws Exception;

    Board select(Integer bno)throws  Exception;

    List<Board> selectAll() throws Exception;

    int insert(Board board) throws Exception;

    int update(Board board) throws Exception;

    int delete(Integer bno, String writer) throws Exception;

    int deleteAll() throws Exception;

    List<Board> selectPage(Map map) throws Exception;
}
