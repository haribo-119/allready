package com.start.allready.often.domain;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Repository
public class BoardDaoImpl implements BoardDao {
    @Autowired
    private SqlSession sqlSession;

    private static String namespace = "com.start.allready.mapper.BoardMapper.";

    @Override
    public int count() throws Exception {
        return sqlSession.selectOne(namespace + "count");
    }

    @Override
    public List<Board> selectAll() throws Exception {
        return sqlSession.selectList(namespace + "selectAll");
    }

    @Override
    public int insert(Board board) throws Exception {
        return sqlSession.insert(namespace + "insert", board);
    }

    @Override
    public int update(Board board) throws Exception {
        return sqlSession.update(namespace + "update", board);
    }

    @Override
    public int delete(Integer bno, String writer) throws Exception {
       Map map = new HashMap();
       map.put("bno",bno);
       map.put("writer",writer);
        return sqlSession.delete(namespace + map);
    }

}