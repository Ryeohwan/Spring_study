package com.ssafy.member.model.service;


import com.ssafy.member.model.MemberDto;

public interface MemberService {

	void joinMember(MemberDto memberDto) throws Exception;
	MemberDto loginMember(MemberDto memberDto) throws Exception;
	int idCheck(String userId);
	
}
