package com.ssafy.member.model.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.member.model.MemberDto;
import com.ssafy.member.model.dao.MemberDao;

@Service
public class MemberServiceImpl implements MemberService {
	
	private MemberDao memberDao;
	
	@Autowired
	private MemberServiceImpl(MemberDao memberDao) {
		this.memberDao = memberDao;
	}


	public void joinMember(MemberDto memberDto) throws Exception {
		memberDao.memberInsert(memberDto);
	}

	@Override
	public MemberDto loginMember(MemberDto memberDto) throws Exception {
		return memberDao.login(memberDto);
	}


	@Override
	public int idCheck(String userId) {
		return 0;
	}


}
