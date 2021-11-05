package com.aj.developer;

public class Addition {
	// Constructor Creation
public Addition() {
		//no-args Constructor
	}
public Addition(int a) {
		int result = a;
		System.out.println("The Addition of 1 param is:" + a);
	}
public Addition(int a, int b) {
		int c = a + b;
		System.out.println("The Addition of 2 param is:" + c);
	}
public Addition(int a, int b, int c) {
		int d = a + b + c;
		System.out.println("The Addition of 3 param is:" + d);
	}

}
