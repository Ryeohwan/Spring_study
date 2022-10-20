package com.ssafy.member.model.dao;



import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ssafy.member.model.MemberDto;

@Repository
public class MemberDao {
	
	@Autowired
	SqlSession sqlSession;
	
	public MemberDto login(MemberDto m) {
		return sqlSession.selectOne("mapper.member.login",m);		
	}

	
	public void memberInsert(MemberDto m) {
		sqlSession.insert("mapper.member.memberInsert",m);
	}
	public int idCheck(MemberDto m) {
		return sqlSession.selectOne("mapper.member.memberInsert", m.getUserId());
	}


}
