package com.ssafy.hello.di4;

public class HelloMessageEng implements HelloMessage{
	public HelloMessageEng() {
		System.out.println("Eng ��ü �������!~~");
	}
	
	public String hello(String name) {
		return "hello" + name;
	}

}
