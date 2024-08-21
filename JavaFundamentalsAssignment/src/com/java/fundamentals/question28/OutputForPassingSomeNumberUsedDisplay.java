package com.java.fundamentals.question28;

public class OutputForPassingSomeNumberUsedDisplay {
	public static int m1(int i){
		System.out.println("m1 called");
		return i*i;
	}


	public static void main(String[] args) {
		int j= OutputForPassingSomeNumberUsedDisplay.m1(10);
		int total = 100 + j;
		System.out.println(total);
	
	}

}
