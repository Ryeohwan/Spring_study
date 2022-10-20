package com.ssafy.board.model.dao;


import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ssafy.board.model.BoardDto;

@Repository
public class BoardDao {
	
	@Autowired
	SqlSession sqlSession;
	
	public int writeArticle(BoardDto b) {
		return sqlSession.insert("mapper.board.writeArticle",b);
	}
	
	public BoardDto getArticle(int b) {
		return sqlSession.selectOne("mapper.board.getArticle", b);
	}
	
	public void updateHit(int b) {
		sqlSession.selectOne("mapper.board.updateHit", b);
	}
	
	public void modifyArticle(BoardDto b) {
		sqlSession.update("mapper.board.modifyArticle", b);
	}
	
	public void deleteArticle(int b) {
		sqlSession.delete("mapper.board.deleteArticle", b);
	} 
	
}

