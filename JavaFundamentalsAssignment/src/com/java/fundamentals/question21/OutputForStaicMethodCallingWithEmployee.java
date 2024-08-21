package com.java.fundamentals.question21;

import com.java.fundamentals.Employee;

public class OutputForStaicMethodCallingWithEmployee {
	public static void m1(Employee e){
		System.out.println("m1 method");
	}

	public static void main(String[] args) {
		Employee employee=new Employee();
		OutputForStaicMethodCallingWithEmployee.m1(employee);
	}

}
