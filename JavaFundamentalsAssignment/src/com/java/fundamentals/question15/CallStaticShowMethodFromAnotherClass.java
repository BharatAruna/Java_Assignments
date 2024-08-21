package com.java.fundamentals.question15;

class StaticTest {
	
	public static void show(){
		System.out.println("Hello world");
	}
}

public class CallStaticShowMethodFromAnotherClass {

	public static void main(String[] args) {
		StaticTest.show();

	}

}
