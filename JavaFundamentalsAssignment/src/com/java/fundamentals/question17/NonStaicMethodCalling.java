package com.java.fundamentals.question17;

public class NonStaicMethodCalling {
	public  void m1(){	
		System.out.println("m1 method");
	}

	public static void main(String[] args) {
		NonStaicMethodCalling calling=new NonStaicMethodCalling();
		calling.m1();

	}

}
