package com.ssafy.board.model.dao;

import java.util.List;
import java.util.Map;

import com.ssafy.board.model.dto.BoardDto;


public interface BoardDao {
	List<BoardDto> listArticle(Map<String,String> map) throws Exception;
}
