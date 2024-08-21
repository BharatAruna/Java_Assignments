package com.java.fundamentals.question2;

import com.java.fundamentals.Employee;

public class CreateEmployeeObject {

	public static void main(String[] args) {
	Employee employee=new Employee();
	employee.setId(101);
	employee.setName("Sam");
	employee.setSal(1000);
	System.out.println("Employee Id: "+employee.getId()+"\nEmployee Name: "+ employee.getName()+"\nEmployee Salary: "+employee.getSal());

	}

}
