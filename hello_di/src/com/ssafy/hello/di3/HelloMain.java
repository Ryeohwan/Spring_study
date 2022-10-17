package com.ssafy.hello.di3;

public class HelloMain {
	public static void main(String[] args) {

		HelloMessage hello = HelloMessageFactory.getHelloMessage("kor");
		String greet = hello.hello("Ryeo");
		System.out.println(greet);
	}
}
