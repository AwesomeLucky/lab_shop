package net.shop.dao;

import net.shop.vo.BoardVO;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

/**
 * Description
 * Donghyun Seo (egaoneko@naver.com)
 * 2015-03-21
 * Copyright ⓒ 2013-2015 Donghyun Seo All rights reserved.
 * version
 */

@Repository("boardDAO")
public class BoardDAOMySql implements BoardDAO {
    SqlSessionFactory sqlSessionFactory;

    @Autowired
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory){
        this.sqlSessionFactory = sqlSessionFactory;
    }

    public int selectCount() throws Exception{
        SqlSession sqlSession = sqlSessionFactory.openSession();

        try{
            return sqlSession.selectOne("net.BoardDao.selectCount");
        }finally{
            sqlSession.close();
        }
    }

    public List<BoardVO> selectList(int firstRow, int endRow) throws Exception{
        SqlSession sqlSession = sqlSessionFactory.openSession();

        RowBounds rowBounds = new RowBounds(firstRow - 1, endRow - firstRow + 1);

        try{
            return sqlSession.selectList("net.BoardDao.selectList", rowBounds);
        }finally{
            sqlSession.close();
        }
    }

    public int insert(BoardVO boardVO) throws Exception{
        SqlSession sqlSession = sqlSessionFactory.openSession();

        try{
            return sqlSession.insert("net.BoardDao.insert");
        }finally{
            sqlSession.close();
        }
    }

    public BoardVO selectOne(int boardNumber) throws Exception{
        SqlSession sqlSession = sqlSessionFactory.openSession();

        try{
            return sqlSession.selectOne("net.BoardDao.selectOne", boardNumber);
        }finally{
            sqlSession.close();
        }
    }

    public void increaseReadCount(int boardNumber) throws Exception{
        SqlSession sqlSession = sqlSessionFactory.openSession();

        try{
            sqlSession.update("net.BoardDao.increaseReadCount", boardNumber);
        }finally{
            sqlSession.close();
        }
    }

    public String selectLastSequenceNumber(String searchMaxSeqNum, String searchMinSeqNum) throws Exception{
        SqlSession sqlSession = sqlSessionFactory.openSession();

        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("searchMaxSeqNum", searchMaxSeqNum);
        map.put("searchMinSeqNum", searchMinSeqNum);

        try{
            return sqlSession.selectOne("net.BoardDao.selectLastSequenceNumber", map);
        }finally{
            sqlSession.close();
        }
    }

    public int update(BoardVO boardVO) throws Exception{
        SqlSession sqlSession = sqlSessionFactory.openSession();

        try{
            return sqlSession.update("net.BoardDao.update", boardVO);
        } finally{
            sqlSession.close();
        }
    }

    public int delete(int boardNumber) throws Exception{
        SqlSession sqlSession = sqlSessionFactory.openSession();

        try{
            return sqlSession.delete("net.BoardDao.delete", boardNumber);
        } finally{
            sqlSession.close();
        }
    }
}
