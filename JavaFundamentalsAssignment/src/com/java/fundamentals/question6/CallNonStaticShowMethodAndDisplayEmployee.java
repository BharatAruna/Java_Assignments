package com.java.fundamentals.question6;

import com.java.fundamentals.Employee;

public class CallNonStaticShowMethodAndDisplayEmployee {
	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setId(101);
		emp.setName("Sam");
		emp.setSal(1000);
		CallNonStaticShowMethodAndDisplayEmployee nonStatic=new CallNonStaticShowMethodAndDisplayEmployee();
		nonStatic.show(emp);

	}

	public void show(Employee emp) {
		System.out.println("Employee id: "+emp.getId()+"\nEmployee name: "+emp.getName()+"\nEmployee Salary: "+emp.getSal());
	}
}
