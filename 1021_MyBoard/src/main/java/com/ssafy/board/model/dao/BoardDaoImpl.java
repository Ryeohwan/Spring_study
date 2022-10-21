package com.ssafy.board.model.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.ssafy.board.model.dto.BoardDto;
import com.ssafy.util.SqlMapConfig;
@Repository
public class BoardDaoImpl implements BoardDao {

	@Override
	public List<BoardDto> listArticle(Map<String, String> map) throws Exception {
		try(SqlSession sqlSession=SqlMapConfig.getSqlSession()){
			return sqlSession.selectList("com.ssafy.board.model.dao.BoardDao.listArticle", map);
		}
	}

}