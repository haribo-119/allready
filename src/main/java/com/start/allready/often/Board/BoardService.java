package com.start.allready.often.Board;

import java.util.List;
import java.util.Map;

public interface BoardService {
    int count() throws Exception;

    List<Board> getList() throws Exception;

    int write(Board board) throws Exception;

    int modify(Board board) throws Exception;

    int remove(Integer bno, String writer) throws Exception;

    int deleteAll() throws Exception;

    List<Board> getPage(Map map) throws Exception;
}
