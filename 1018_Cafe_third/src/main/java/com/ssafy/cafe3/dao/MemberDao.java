package com.ssafy.cafe3.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ssafy.cafe3.dto.Member;

@Repository
public class MemberDao {
	
	@Autowired
	SqlSession sqlSession;
	
	public void memberInsert(Member m) {
		sqlSession.insert("mapper.member.memberInsert",m);
	}

	public String login(Member m) {
		return sqlSession.selectOne("mapper.member.login",m);		
	}

}
