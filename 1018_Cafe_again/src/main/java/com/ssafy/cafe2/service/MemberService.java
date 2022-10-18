package com.ssafy.cafe2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.cafe2.dao.MemberDao;
import com.ssafy.cafe2.dto.Member;

@Service
public class MemberService {
	
	@Autowired
	MemberDao memberDao;
	
	public void memberInsert(Member m) throws Exception {
		System.out.println("MemberService:  "+m);
		memberDao.memberInsert(m);
	
	}
	
}
