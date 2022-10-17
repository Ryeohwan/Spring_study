package com.ssafy.hello.di4;

public class HelloMessageEng implements HelloMessage{
	public HelloMessageEng() {
		System.out.println("Eng 객체 만들어유!~~");
	}
	
	public String hello(String name) {
		return "hello" + name;
	}

}
