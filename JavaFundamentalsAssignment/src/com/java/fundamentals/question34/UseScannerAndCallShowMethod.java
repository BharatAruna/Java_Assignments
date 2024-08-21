package com.java.fundamentals.question34;

import java.util.Scanner;

import com.java.fundamentals.Employee;

public class UseScannerAndCallShowMethod {
	public  void show(Employee emp){
		System.out.println("Employee id: "+emp.getId()+"\nEmployee name: "+emp.getName()+"\nEmployee Salary: "+emp.getSal());


	}
	public static void main(String[] args) {
		Employee emp=new Employee();
		Scanner sc =new Scanner(System.in);
		 emp.setId(sc.nextInt());
		 emp.setName(sc.next());
		 emp.setSal(sc.nextInt());
		 UseScannerAndCallShowMethod method=new UseScannerAndCallShowMethod();
		 method.show(emp);

	}

}
