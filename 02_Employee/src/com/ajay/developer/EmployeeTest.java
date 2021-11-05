package com.ajay.developer;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee();
		employee.employeeId = 8074218906L;
		employee.name = "Ajay";
		employee.age = 24;
		employee.email="donthaajay@gmail.com";
		employee.gender = "Male";
		employee.address = "Karimnagar";


		System.out.println("\nId:" + employee.employeeId + 
				"\nName::" + employee.name + "\nAge:" + employee.age +
				"\nEmail::" + employee.email  + 
				"\nGender:" + employee.gender + 
				"\nAddress::" + employee.address);

		Employee employee1 = new Employee();

		employee1.employeeId = 7794042900L;
		employee1.name = "Nani";
		employee1.age = 24;
		employee1.gender = "male";
		employee1.address = "Karimnagar";
		System.out.println("\nId:" + employee1.employeeId + 
				"\nName::" + employee1.name + "\nAge:" + employee1.age + 
				"\nGender:" + employee1.gender + "\nAddress::" + employee1.address);
	}

}