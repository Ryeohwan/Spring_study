package com.ssafy.util;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlMapConfig {
	
	private static SqlSessionFactory factory;

	static {  // 이건 클래스로더가 이 클래스를 로딩하는 순간에 로딩되고 한 번만 초기화되고 
		try {
			String resource = "mapper/mybatis-config.xml";
			Reader reader = Resources.getResourceAsReader(resource);
			factory = new SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static SqlSession getSqlSession() {  // sql 세션 얻어와라
		return factory.openSession();  // 이러면 sqlsession 이 만들어 진다.
	}
	
}
