package com.java.fundamentals.question14;

class NonStaticTest {
	
	public void show(){
		System.out.println("Hello world");
	}
}

public class CallShowMethodFromAnotherClass {

	public static void main(String[] args) {
		NonStaticTest test=new NonStaticTest();
		test.show();

	}

}
