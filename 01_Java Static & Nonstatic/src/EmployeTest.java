
public class EmployeTest {
	public static void main(String args[]) {

		displayEmployeDetails();
	}

	public static void displayEmployeDetails() {

		Employe.name = "Raja";
		Employe.age = 28;
		Employe.mobileNumber = 2222222222L;
		Employe.address = "karimnagar";

		System.out.println("Name::" + Employe.name);
		System.out.println("Age::" + Employe.age);
		System.out.println("MobileNumber::" + Employe.mobileNumber);
		System.out.println("Address::" + Employe.address);
	}
}
