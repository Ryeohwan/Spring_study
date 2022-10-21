package com.ssafy.member.controller;

import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ssafy.member.model.dto.MemberDto;
import com.ssafy.member.model.service.MemberService;


@Controller
@RequestMapping("/user")
public class MemberController {
    
    @Autowired
    MemberService memberService;

    @GetMapping("/join")
    public String join() {
        return "user/join";
    }
    
    @PostMapping("/join")
    public String join(MemberDto memberDto) {
        System.out.println("MemberController: "+memberDto);
        
        try {
            memberService.joinMember(memberDto);
            return "redirect:/user/login";
        } catch (Exception e) {
            e.printStackTrace();
            return "error/error";            
        }
    }
    @GetMapping("/login")
    public String login() {
        return "user/login";
    }
    
    @PostMapping("/login")
    public String login(Model model, @RequestParam Map<String,String> map,HttpServletRequest request, HttpServletResponse response) {
        
        try {
            MemberDto memberDto = memberService.loginMember(map);
            System.out.println(memberDto);
            if(memberDto!=null) {
                HttpSession session = request.getSession();
                session.setAttribute("userinfo", memberDto);
                Cookie cookie = new Cookie("ssafy_id", memberDto.getUserId());
                cookie.setPath("/board");
                response.addCookie(cookie);
                return "redirect:/";
            }else {
                model.addAttribute("msg","아이디 또는 비밀번호 확인 후 다시 로그인하세요");
                return "user/login";                
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "error/error";            
        }
    }
    
    @GetMapping("/logout")
    public String logout(HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        if(session!=null) {
            session.invalidate();
        }
        return "redirect:/";
    }
    
    

    
}