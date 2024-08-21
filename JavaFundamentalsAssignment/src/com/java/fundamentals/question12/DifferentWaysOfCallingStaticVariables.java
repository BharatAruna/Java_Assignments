package com.java.fundamentals.question12;

public class DifferentWaysOfCallingStaticVariables {
	private static int total = 10;

	public static void main(String[] args) {
		System.out.println(DifferentWaysOfCallingStaticVariables.total);
		System.out.println(total);
		DifferentWaysOfCallingStaticVariables variables=new DifferentWaysOfCallingStaticVariables();
		System.out.println(variables.total);

	}
	
	

}
