package com.start.allready.often.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class BoardServiceImpl implements BoardService {
    @Autowired BoardDao boardDao;

    @Override
    public int count()throws Exception{
        return boardDao.count();
    }

    @Override
    public List<Board> getList() throws Exception{
        return boardDao.selectAll();
    }

    @Override
    public int write(Board board) throws  Exception {
        return boardDao.insert(board);
    }

    @Override
    public int modify(Board board) throws Exception {
        return boardDao.update(board);
    }

    @Override
    public int remove(Integer bno, String writer) throws Exception{
        return boardDao.delete(bno,writer);
    }

    @Override
    public int deleteAll() throws Exception{
        return boardDao.deleteAll();
    }

    @Override
    public List<Board> getPage(Map map) throws Exception {
        return boardDao.selectPage(map);
    }


}
