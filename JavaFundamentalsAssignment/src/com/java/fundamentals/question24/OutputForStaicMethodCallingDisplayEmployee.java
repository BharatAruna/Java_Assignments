package com.java.fundamentals.question24;

import com.java.fundamentals.Employee;

public class OutputForStaicMethodCallingDisplayEmployee {
	public static void m1(Employee emp){
		
		System.out.println("Employee id: "+emp.getId()+"\nEmployee name: "+emp.getName()+"\nEmployee Salary: "+emp.getSal());

	}

	public static void main(String[] args) {
		Employee emp=new Employee(101,"Sam",1000);
        OutputForStaicMethodCallingDisplayEmployee.m1(emp);

	}

}
