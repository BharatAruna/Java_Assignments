package com.java.fundamentals.question3;

import com.java.fundamentals.Employee;

public class DisplayEmployeeUsingSetter {
	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setId(101);
		emp.setName("Sam");
		emp.setSal(1000);
		
		System.out.println("Employee id: "+emp.getId()+"\nEmployee name: "+emp.getName()+"\nEmployee Salary: "+emp.getSal());
	}

}
