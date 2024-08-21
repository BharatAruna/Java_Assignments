package com.java.fundamentals.question7;

import com.java.fundamentals.Employee;

public class CallShowMethodWithTwoEmpObjects {
	
	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setId(101);
		emp.setName("Sam");
		emp.setSal(1000);
		Employee emp2=new Employee();
		emp2.setId(102);
		emp2.setName("Ram");
		emp2.setSal(2000);
		CallShowMethodWithTwoEmpObjects twoEmpObjects=new CallShowMethodWithTwoEmpObjects();
		twoEmpObjects.show(emp,emp2);

	}

	public  void show(Employee emp, Employee emp2) {
		System.out.println("Employee id: "+emp.getId()+"\nEmployee name: "+emp.getName()+"\nEmployee Salary: "+emp.getSal());
		System.out.println("Employee id: "+emp2.getId()+"\nEmployee name: "+emp2.getName()+"\nEmployee Salary: "+emp2.getSal());
		
	}

}
