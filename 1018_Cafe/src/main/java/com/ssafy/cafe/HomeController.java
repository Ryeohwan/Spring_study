package com.ssafy.cafe;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssafy.cafe.dto.Member;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "memberInsert.shop", method = RequestMethod.GET, produces = "application/text; charset=utf8")
	@ResponseBody  // 이게 조각만 보내겠다는 것이다. response의 바디에다가 직접 넣겠다 jsp로 가지마세요
	public String home(Member m) {
	// 얘는 서비스 메서드라서 맘대로 	HttpServletRequest 위치 상관없이 넣을 수 있다. 
	// 전에 서비스는  request 와 response 위치를 못바꿨는데 이건 중간에서 해석기가 거대하게 돌아가서 가능하다 한다.
		System.out.println(m);

		
//		Member m = new Member(name,id,pw);
//		
//		model.addAttribute("member", m );
		
		return m.getName()+"님 가입되셨습니다.";
	}
	
}
