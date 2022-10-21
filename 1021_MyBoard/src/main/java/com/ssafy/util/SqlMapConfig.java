package com.ssafy.util;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


// MemberDaoImpl 에 있는 
//	@Autowired
//SqlSession sqlSession;
// 로 할 수 있는건데 교수님이 진도때문에 이것을 직접 구현하신 거라고 한다.

public class SqlMapConfig {
	static SqlSessionFactory factory;
	
	static {
		try {
			String resource = "mapper/mybatis-config.xml";
			Reader reader = Resources.getResourceAsReader(resource);
			factory = new SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static SqlSession getSqlSession() {
		return factory.openSession(true);
	}
}
