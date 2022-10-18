package com.ssafy.cafe3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.cafe3.dao.MemberDao;
import com.ssafy.cafe3.dto.Member;

@Service
// reposi 인지 component 인지 Service 인지 모르면 그냥 commponent 쓰자.
public class MemberService {
	
	@Autowired
	MemberDao memberDao;
	
	public void memberInsert(Member m) {
		memberDao.memberInsert(m);
	}

	public String login(Member m) {
		return memberDao.login(m);		
	}

}
