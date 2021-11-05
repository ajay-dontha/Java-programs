package com.aj.developer;

public class Substraction {

	// Constructor Creation

	public Substraction() {
		// no-args Constructor
	}

	public Substraction(int a) {
		int result = a;
		System.out.println("The Substraction of 1 param is:" + a);
	}

	public Substraction(int a, int b) {
		int c = a - b;
		System.out.println("The Substraction of 2 param is:" + c);
	}

	public Substraction(int a, int b, int c) {
		int d = a - b - c;
		System.out.println("The Substraction of 3 param is:" + d);
	}

}
