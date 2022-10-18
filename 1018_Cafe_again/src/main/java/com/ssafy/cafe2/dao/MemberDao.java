package com.ssafy.cafe2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ssafy.cafe2.dto.Member;


@Repository
public class MemberDao {
	
	@Autowired
	SqlSession sqlSession;

	
	public void memberInsert(Member m)  {
		System.out.println("MemberDao:  "+m);
		System.out.println("MemberDao"+sqlSession);
		sqlSession.insert("mapper.member.memberInsert", m);
	}
	
}
