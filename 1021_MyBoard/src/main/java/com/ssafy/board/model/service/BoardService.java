package com.ssafy.board.model.service;

import java.util.List;
import java.util.Map;

import com.ssafy.board.model.dto.BoardDto;


public interface BoardService {

	List<BoardDto> listArticle(Map<String, String> map) throws Exception;
	
}
