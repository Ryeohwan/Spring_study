package com.ssafy.cafe3;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssafy.cafe3.dto.Member;
import com.ssafy.cafe3.service.MemberService;


@Controller
public class HomeController {
	@Autowired
	MemberService memberService;
	
	
		
	@RequestMapping(value = "memberInsert.shop", method = RequestMethod.POST, produces = "application/text; charset=utf8")
	@ResponseBody
	public String home(Member m) {
		System.out.println(m);
		memberService.memberInsert(m);
		return m.getName()+"님 가입 되셨읍니다..!";
	}
	
	
	
	@RequestMapping(value = "login.shop", 
			method= {RequestMethod.POST},
			produces = "application/text; charset=utf8")			
	@ResponseBody
	public String login(HttpServletRequest request,
			HttpServletResponse response){
		String id=request.getParameter("id");
		String pw=request.getParameter("pw");		
		JSONObject json=new JSONObject();

		try {
			Member m=new Member(id,pw); 
			String name=memberService.login(m);
			if(name!=null) {
				HttpSession session=request.getSession();
				session.setAttribute("member", m);
				json.put("name", name);
			}else {
				json.put("msg", "로그인 실패");

			}
		}catch(Exception e) {
			json.put("msg", e.getMessage());

		}		
		return json.toJSONString();
	}

	
	@RequestMapping(value = "logout.shop", 
			method= {RequestMethod.POST},
			produces = "application/text; charset=utf8")			
	@ResponseBody
	public String logout(HttpServletRequest request,
			HttpServletResponse response){
		
			HttpSession session=request.getSession(false);
			session.invalidate();
			return "";
		
	}

	
	
}
