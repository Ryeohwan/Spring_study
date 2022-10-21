package com.ssafy.member.model.dao;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import com.ssafy.member.model.dto.MemberDto;
import com.ssafy.util.SqlMapConfig;

@Repository
public class MemberDaoImpl implements MemberDao {
//	// import 안되면 mybatis 라이브러리가 안되어 있는 것이다.
//	@Autowired
//	SqlSession sqlSession;

	@Override
	public void joinMember(MemberDto memberDto) throws Exception {
		System.out.println("MemberDaoImpl:   " + memberDto);
		
		try(SqlSession sqlSession = SqlMapConfig.getSqlSession();){
			sqlSession.insert("com.ssafy.member.model.dao.MemberDao.joinMember",memberDto);  
		}
	}

	@Override
	public MemberDto loginMember(Map<String, String> map) throws Exception  {
		try(SqlSession sqlSession = SqlMapConfig.getSqlSession();){
			return sqlSession.selectOne("com.ssafy.member.model.dao.MemberDao.loginMember",map);  
		}
	}


}
