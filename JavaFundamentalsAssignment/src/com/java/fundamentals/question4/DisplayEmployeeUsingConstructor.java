package com.java.fundamentals.question4;

import com.java.fundamentals.Employee;

public class DisplayEmployeeUsingConstructor {
	public static void main(String[] args) {
		Employee emp=new Employee(101,"Sam",1000);
		System.out.println("Employee id: "+emp.getId()+"\nEmployee name: "+emp.getName()+"\nEmployee Salary: "+emp.getSal());
	}

}
