package com.coffee3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coffee3.Coffee;

public class CoffeeApp {
	// ApplicationContext -> Container 라고 부른다. 자식도 Container 타입이다.
	// CONTAINER란? 어플리케이션에서 필요로 하는 객체를 생성, 공급, 소멸까지 객체의 모든 과정을 관리하는 객체이다.
	// ClassPathXmlApplicationContext 도 컨테이너이다. classpath로 지정된 위치에서 xml문서룰 읽어와서 객체를 생성함.
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("coffee.xml");  // ApplicationContext 이게 붙은 애들은 다 자식
		Coffee cof = context.getBean("coffee1",Coffee.class); // 인터페이스로 레퍼런스 할 것이라는 말 라떼를 만들어서 사용
		// 생성된 객체 요청 먼저 id 요청을 해준다. 여러 가지의 타입을 받기 위해서 인터페이스타입으로 줘야 한다.
		// context만들어진 객체가 지금 xml 에서 두 개 있다. 그런 상태에서 getBean 으로 요청을 하면 
		// id를 기준으로 해서 coffe1이 누구니? 해서 찾은걸 리턴한다. 생성된 객체들이 저장된 컨테이너 안에서 찾을 때
		// id 기준으로 찾기 때문에 id 만 맞으면 찾는다. id가 일치하는건 알겠는데 리턴 타입이 뭔지는 알 수 없음
		// 그 타입을 Coffee.class로 명시해주는 것이다. 
		
		cof.info();		 // 이러면 아메리카노의 info() 메소드가 실행이 된다.
	}

}
