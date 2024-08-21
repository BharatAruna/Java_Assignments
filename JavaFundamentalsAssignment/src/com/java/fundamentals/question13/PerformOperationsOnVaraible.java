package com.java.fundamentals.question13;

public class PerformOperationsOnVaraible {
	
	int x = 10;
	public void show(){
		int x = 100;
		System.out.println(x);
		PerformOperationsOnVaraible onVaraible=new PerformOperationsOnVaraible();
		System.out.println(onVaraible.x);
	}

	public static void main(String[] args) {
		PerformOperationsOnVaraible varaible=new PerformOperationsOnVaraible();
		varaible.show();
	}

}
