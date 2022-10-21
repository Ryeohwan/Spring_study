package com.ssafy.member.model.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.member.model.dao.MemberDao;
import com.ssafy.member.model.dto.MemberDto;

@Service // autowiring 받아야 하는 클래스니까 service 어노테이션 해줘야 한다.
public class MemberServiceImpl implements MemberService {

	@Autowired MemberDao memberDao;
	
	
	@Override
	public void joinMember(MemberDto memberDto) throws Exception {
		System.out.println("MemberServiceImpl:  "+memberDto);
		memberDao.joinMember(memberDto);
	}


	@Override
	public MemberDto loginMember(Map<String, String> map) throws Exception {
		return memberDao.loginMember(map);
	}

}
