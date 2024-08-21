package com.java.fundamentals.question29;


public class OutputForPassingFloatNumberUsedDisplay {
	public static int m1(int i){
		System.out.println("m1 called");
		return i*i;
	}

	public static void main(String[] args) {
		int j= OutputForPassingFloatNumberUsedDisplay.m1(10);
		int total = 100 + j;
		System.out.println(total);

	}

}
