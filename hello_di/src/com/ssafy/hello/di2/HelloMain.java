package com.ssafy.hello.di2;

public class HelloMain {
	public static void main(String[] args) {
//		HelloMessageKor kor = new HelloMessageKor();
//		String greet = kor.helloKor("æ»∑¡»Ø");
//		HelloMessageEng eng = new HelloMessageEng();
		HelloMessage hello = new HelloMessageEng();
		String greet = hello.hello("Ryeo");
		System.out.println(greet);
	}
}
