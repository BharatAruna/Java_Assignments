package com.java.fundamentals.question8;

import com.java.fundamentals.Employee;

public class FindingOutputForEmployee {

	public static void main(String[] args) {
		Employee emp = new Employee(101, "sam", 1000);
		FindingOutputForEmployee.show(emp);
		System.out.println(emp.getId()+" " + emp.getName() + " "+ emp.getSal());

	}
	public static void show(Employee ex) {
		System.out.println(ex.getId() + " " + ex.getName() + " " + ex.getSal());
		ex.setId(102);
	}

}
