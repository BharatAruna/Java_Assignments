package com.java.fundamentals.question23;

public class OutputForStaicMethodCallingWithObject {
	public static void m1(Object o){
		System.out.println("m1 method");
	}


	public static void main(String[] args) {
		OutputForStaicMethodCallingWithObject.m1(new Object());

	}

}
