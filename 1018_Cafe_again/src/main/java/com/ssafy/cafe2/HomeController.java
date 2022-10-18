package com.ssafy.cafe2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssafy.cafe2.dto.Member;
import com.ssafy.cafe2.service.MemberService;


@Controller
public class HomeController {


	@Autowired
	MemberService memberService;
	
	@RequestMapping(value = "memberInsert.shop", method = RequestMethod.GET, produces = "application/text; charset=utf8" )
	@ResponseBody
	public String memberInsert(Member m ) throws Exception {
		
		System.out.println("HomeController:    "+ m);
		// service...
		memberService.memberInsert(m);
		return m.getName()+"님 가입되셨읍니다....";
	}
	
}
