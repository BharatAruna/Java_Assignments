package com.java.fundamentals.question31;

import com.java.fundamentals.Employee;

public class OutputForEmployeeAsObjectCatchAndDisplay {
	public static Object m1(){
		Employee emp=new Employee(101,"Sam",1000);
		return emp;
	}

	public static void main(String[] args) {
		Employee emp=(Employee)OutputForEmployeeAsObjectCatchAndDisplay.m1();
		System.out.println("Employee id: "+emp.getId()+"\nEmployee name: "+emp.getName()+"\nEmployee Salary: "+emp.getSal());


	}

}
