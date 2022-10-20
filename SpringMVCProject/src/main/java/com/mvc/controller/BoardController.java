package com.mvc.controller;

import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//FrontController에게서 요청을 넘겨 받아 Service에게 넘김

import com.mvc.model.service.BoardService;
import com.mvc.model.vo.Board;

@Controller
public class BoardController {

	@Autowired
	BoardService service;// interface type

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(Model model) {
		ArrayList<Board> list = service.selectAll();
		model.addAttribute("list", list);
		return "list";
	}
	

}
