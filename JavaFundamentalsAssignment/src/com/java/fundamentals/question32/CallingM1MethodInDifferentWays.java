package com.java.fundamentals.question32;

import com.java.fundamentals.Employee;

public class CallingM1MethodInDifferentWays {
	public static int m1(int i){
		return i*i;
	}


	public static void main(String[] args) {
		Employee emp=new Employee(101,"Sam",1000);
		System.out.println(CallingM1MethodInDifferentWays.m1(emp.getId()));
		CallingM1MethodInDifferentWays ways=new CallingM1MethodInDifferentWays();
		System.out.println(ways.m1(emp.getId()));

	}

}
