package com.java.fundamentals.question26;

import com.java.fundamentals.Employee;

public class OutputForStaicMethodCallingDisplayEmployeeId {
	
	public static void m1(int i){
		System.out.println(i);
	}

	public static void main(String[] args) {
		Employee emp=new Employee(101,"Sam",1000);
		OutputForStaicMethodCallingDisplayEmployeeId.m1(emp.getId());

	}

}
