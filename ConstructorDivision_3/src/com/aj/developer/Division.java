package com.aj.developer;

public class Division {
	// Constructor Creation

	public Division() {
		// no-args Constructor
	}

	public Division(int a) {
		int result = a;
		System.out.println("The Division of 1 param is:" + a);
	}

	public Division(int a, int b) {
		int c = a / b;
		System.out.println("The Division of 2 param is:" + c);
	}

	public Division(int a, int b, int c) {
		int d = a / b / c;
		System.out.println("The Division of 3 param is:" + d);
	}

}
