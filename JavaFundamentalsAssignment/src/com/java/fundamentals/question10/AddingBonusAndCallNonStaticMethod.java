package com.java.fundamentals.question10;

import com.java.fundamentals.Employee;
import com.java.fundamentals.question9.AddingBonusAndCallStaticMethod;

public class AddingBonusAndCallNonStaticMethod {

	public static void main(String[] args) {
		Employee emp = new Employee(101, "sam", 1000);
		AddingBonusAndCallNonStaticMethod nonStaticMethod= new AddingBonusAndCallNonStaticMethod();
		nonStaticMethod.show(emp);
		emp.setSal(emp.getSal()+100);
		nonStaticMethod.show(emp);

	}
	
	public  void show(Employee ex){
		System.out.println(ex.getId() + " " + ex.getName() + " " + ex.getSal());
		
	}


}
