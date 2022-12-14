package com.ssafy.board.model.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.board.model.BoardDto;
import com.ssafy.board.model.dao.BoardDao;
import com.ssafy.util.SizeConstant;

@Service
public class BoardServiceImpl implements BoardService {
	
	private BoardDao boardDao;
	
	@Autowired
	public BoardServiceImpl(BoardDao boardDao) {
		this.boardDao = boardDao;
	}

	@Override
	public int writeArticle(BoardDto boardDto) throws Exception {
		return boardDao.writeArticle(boardDto);
	}


	@Override
	public BoardDto getArticle(int articleNo) throws Exception {
		return boardDao.getArticle(articleNo);
	}

	@Override
	public void updateHit(int articleNo) throws Exception {
		boardDao.updateHit(articleNo);
	}

	@Override
	public void modifyArticle(BoardDto boardDto) throws Exception {
		boardDao.modifyArticle(boardDto);
	}

	@Override
	public void deleteArticle(int articleNo) throws Exception {
		boardDao.deleteArticle(articleNo);
	}

	@Override
	public List<BoardDto> listArticle(Map<String, String> map) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
