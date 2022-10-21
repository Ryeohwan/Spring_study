package com.ssafy.member.model.service;

import java.util.Map;

import com.ssafy.member.model.dto.MemberDto;

public interface MemberService {
	public void joinMember(MemberDto memberDto)throws Exception;

	public MemberDto loginMember(Map<String, String> map)throws Exception;
}
