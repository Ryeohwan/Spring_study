package com.ssafy.board.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.ssafy.board.model.dto.BoardDto;
import com.ssafy.board.model.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	BoardService boardService;
	
	
	@GetMapping("/list")
	public ModelAndView list(@RequestParam Map<String,String> map) {
		ModelAndView mav=new ModelAndView();
		try {
			List<BoardDto> list=boardService.listArticle(map);
			mav.setViewName("board/list");
			mav.addObject("articles", list);
			
		} catch (Exception e) {
			e.printStackTrace();
			mav.setViewName("error/error");
			
		}
		return mav;
	}
	
	@GetMapping("/write")
	public String write() {
		return "board/write";
	}
	
	@PostMapping("/writeBoard")
	public String write(@RequestParam("subject")String subject,@RequestParam("content")String content,@RequestParam("upfile") MultipartFile file) {
		System.out.println(subject);
		System.out.println(content);
		System.out.println(file);
		try {
			file.transferTo(new File("c:\\temp2\\"+file.getOriginalFilename()));
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "board/list";
	}
}