package com.java.fundamentals.question19;

public class NonStaicMethodCallingWithParam {
	public  void m1(float a){
		System.out.println(a);
	}


	public static void main(String[] args) {
		NonStaicMethodCallingWithParam withParam=new NonStaicMethodCallingWithParam();
		withParam.m1(12.0f);

	}

}
