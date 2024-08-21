package com.java.fundamentals.question11;

public class DifferentWaysOfCallingStaticMethod {

	public static void main(String[] args) {
		show();
		DifferentWaysOfCallingStaticMethod.show();
		DifferentWaysOfCallingStaticMethod staticMethod=new DifferentWaysOfCallingStaticMethod();
		staticMethod.show();
	}
	
	public static void show(){
		System.out.println("show method");
	}


}
