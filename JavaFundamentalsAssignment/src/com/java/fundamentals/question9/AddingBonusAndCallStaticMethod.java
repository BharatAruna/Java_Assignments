package com.java.fundamentals.question9;

import com.java.fundamentals.Employee;

public class AddingBonusAndCallStaticMethod {

	public static void main(String[] args) {
		Employee emp = new Employee(101, "sam", 1000);
		AddingBonusAndCallStaticMethod.show(emp);
		emp.setSal(emp.getSal()+100);
		AddingBonusAndCallStaticMethod.show(emp);

	}
	
	public static void show(Employee ex){
		System.out.println(ex.getId() + " " + ex.getName() + " " + ex.getSal());
		
	}


}
