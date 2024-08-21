package com.java.fundamentals.question25;

import com.java.fundamentals.Employee;


public class OutputForStaicMethodCallingDisplayObject {
public static void m1(Object obj){
	Employee emp=(Employee)obj;
		
		System.out.println("Employee id: "+emp.getId()+"\nEmployee name: "+emp.getName()+"\nEmployee Salary: "+emp.getSal());

	}

	public static void main(String[] args) {
		Employee emp=new Employee(101,"Sam",1000);
		OutputForStaicMethodCallingDisplayObject.m1(emp);

	}

}
