package com.ssafy.hello.di1;

public class HelloMain {
	public static void main(String[] args) {
//		HelloMessageKor kor = new HelloMessageKor();
//		String greet = kor.helloKor("æ»∑¡»Ø");
		HelloMessageEng eng = new HelloMessageEng();
		String greet = eng.helloEng("Ryeo");
		System.out.println(greet);
	}
}
