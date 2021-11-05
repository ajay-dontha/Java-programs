package Com.aj.developer;

public class ModuloDivision {

	// Constructor Creation

	public ModuloDivision() {
		// no-args Constructor
	}

	public ModuloDivision(int a) {
		int result = a;
		System.out.println("The ModuloDivision of 1 param is:" + a);
	}

	public ModuloDivision(int a, int b) {
		int c = a % b;
		System.out.println("The ModuloDivision of 2 param is:" + c);
	}

	public ModuloDivision(int a, int b, int c) {
		int d = a % b % c;
		System.out.println("The ModuloDivision of 3 param is:" + d);
	}

}
