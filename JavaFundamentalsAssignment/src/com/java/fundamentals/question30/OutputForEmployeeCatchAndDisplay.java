package com.java.fundamentals.question30;

import com.java.fundamentals.Employee;

public class OutputForEmployeeCatchAndDisplay {
	public static Employee m1(){
		Employee emp=new Employee(101,"Sam",1000);
		return emp;
	}

	public static void main(String[] args) {
		Employee emp=OutputForEmployeeCatchAndDisplay.m1();
		System.out.println("Employee id: "+emp.getId()+"\nEmployee name: "+emp.getName()+"\nEmployee Salary: "+emp.getSal());


	}

}
