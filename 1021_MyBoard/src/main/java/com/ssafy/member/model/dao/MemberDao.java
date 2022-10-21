package com.ssafy.member.model.dao;

import java.util.Map;

import com.ssafy.member.model.dto.MemberDto;

public interface MemberDao {
	void joinMember(MemberDto memberDto) throws Exception;

	MemberDto loginMember(Map<String, String> map) throws Exception;
}
