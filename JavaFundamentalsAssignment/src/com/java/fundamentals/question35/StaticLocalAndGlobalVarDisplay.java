package com.java.fundamentals.question35;

public class StaticLocalAndGlobalVarDisplay {
	static int total = 0;

	public static void add() {  
		int total = 10 + 30;
	}


	public static void main(String[] args) {
		StaticLocalAndGlobalVarDisplay.add();
		System.out.println(total);

	}

}
