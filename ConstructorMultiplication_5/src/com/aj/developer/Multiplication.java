package com.aj.developer;

public class Multiplication {

	// Constructor Creation

	public Multiplication() {
		// no-args Constructor
	}

	public Multiplication(int a) {
		int result = a;
		System.out.println("The Multiplication of 1 param is:" + a);
	}

	public Multiplication(int a, int b) {
		int c = a * b;
		System.out.println("The Multiplication of 2 param is:" + c);
	}

	public Multiplication(int a, int b, int c) {
		int d = a * b * c;
		System.out.println("The Multiplication of 3 param is:" + d);
	}

	public Multiplication(int a, int b, int c, int d) {
		int e = a * b * c * d;
		System.out.println("The Multiplication of 3 param is:" + e);
	}
}
