package com.java.fundamentals.question33;

import com.java.fundamentals.Employee;

public class CallingShowAndProcessMethods {
	public static void show(Employee emp){
		System.out.println("Employee id: "+emp.getId()+"\nEmployee name: "+emp.getName()+"\nEmployee Salary: "+emp.getSal());


	}
	public static Employee process(Employee emp){
		emp=new Employee(101,"Sam",1000);
		return emp;
	}


	public static void main(String[] args) {
		Employee emp=new Employee();
		Employee emp2=CallingShowAndProcessMethods.process(emp);
		CallingShowAndProcessMethods.show(emp2);

	}

}
