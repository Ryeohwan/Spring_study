package com.ssafy.hello.di4;

public class HelloMessageKor implements HelloMessage{
	public HelloMessageKor() {
		System.out.println("Kor 객체 만들어유!~~");
	}
	
	public void init() {
		System.out.println("Kor 객체를 초기화");
	}
	
	public String hello(String name) {
		return "안녕"+name;
	}
}
