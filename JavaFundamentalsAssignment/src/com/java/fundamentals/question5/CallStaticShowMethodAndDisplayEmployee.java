package com.java.fundamentals.question5;

import com.java.fundamentals.Employee;

public class CallStaticShowMethodAndDisplayEmployee {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setId(101);
		emp.setName("Sam");
		emp.setSal(1000);
		show(emp);

	}

	public static void show(Employee emp) {
		System.out.println("Employee id: "+emp.getId()+"\nEmployee name: "+emp.getName()+"\nEmployee Salary: "+emp.getSal());
	}

}
