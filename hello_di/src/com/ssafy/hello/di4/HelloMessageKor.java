package com.ssafy.hello.di4;

public class HelloMessageKor implements HelloMessage{
	public HelloMessageKor() {
		System.out.println("Kor ��ü �������!~~");
	}
	
	public void init() {
		System.out.println("Kor ��ü�� �ʱ�ȭ");
	}
	
	public String hello(String name) {
		return "�ȳ�"+name;
	}
}
