package com.aj.developer;

public class SoftwareCompanyDetails {

	public static void main(String args[]) {
		displayBusinessAnalystInfo();
		displayJavaDeveloperInfo();
		displayUIDeveloperInfo();
	}

	public static void displayUIDeveloperInfo() {
		// TODO Auto-generated method stub
		UIDeveloper.developerId = 1234567L;
		UIDeveloper.name = "Ajay";
		UIDeveloper.age = 30;
		UIDeveloper.mobileNumber = 132222121L;
		UIDeveloper.email = "ajay@gmail.com";
		UIDeveloper.experience = 10;
		UIDeveloper.joinDate = "12.2.13";
		UIDeveloper.salary = 800000.00;

		System.out.println("\nUIDeveloperId:" + UIDeveloper.developerId + "\nName:" + UIDeveloper.name + "\nAge:"
				+ UIDeveloper.age + "\nMobileNumber:" + UIDeveloper.mobileNumber + "\nEmail:" + UIDeveloper.email
				+ "\nExperience:" + UIDeveloper.experience + "\nJoinDate:" + UIDeveloper.joinDate + "\nSalary:"
				+ UIDeveloper.salary);
	}

	public static void displayJavaDeveloperInfo() {
		// TODO Auto-generated method stub

		JavaDeveloper.developerId = 1234567L;
		JavaDeveloper.name = "Ajay";
		JavaDeveloper.age = 30;
		JavaDeveloper.mobileNumber = 132222121L;
		JavaDeveloper.email = "ajay@gmail.com";
		JavaDeveloper.experience = 10;
		JavaDeveloper.joinDate = "12.2.13";
		JavaDeveloper.salary = 800000.00;

		System.out.println("\nJavaDeveloperId:" + JavaDeveloper.developerId + "\nName:" + JavaDeveloper.name + "\nAge:"
				+ JavaDeveloper.age + "\nMobileNumber:" + JavaDeveloper.mobileNumber + "\nEmail:" + JavaDeveloper.email
				+ "\nExperience:" + JavaDeveloper.experience + "\nJoinDate:" + JavaDeveloper.joinDate + "\nSalary:"
				+ JavaDeveloper.salary);

	}

	public static void displayBusinessAnalystInfo() {
		// TODO Auto-generated method stub
		BusinessAnalyst.analystId = 1234567L;
		BusinessAnalyst.name = "Ajay";
		BusinessAnalyst.age = 30;
		BusinessAnalyst.mobileNumber = 132222121L;
		BusinessAnalyst.email = "ajay@gmail.com";
		BusinessAnalyst.experience = 10;
		BusinessAnalyst.joinDate = "12.2.13";
		BusinessAnalyst.salary = 800000.00;

		System.out.println("\nAnalystId:" + BusinessAnalyst.analystId + "\nName:" + BusinessAnalyst.name + "\nAge:"
				+ BusinessAnalyst.age + "\nMobileNumber:" + BusinessAnalyst.mobileNumber + "\nEmail:"
				+ BusinessAnalyst.email + "\nExperience:" + BusinessAnalyst.experience + "\nJoinDate:"
				+ BusinessAnalyst.joinDate + "\nSalary:" + BusinessAnalyst.salary);

	}

	class TesterDetails {

		public void main1(String args[]) {

			Tester tester = new Tester();
			tester.testerId = 12345678L;
			tester.name = "Aj";
			tester.age = 26;
			tester.mobileNumber = 258547855L;
			tester.email = "Aj@gmail.com";
			tester.experience = 20;
			tester.joinDate = "31.10.1999";
			tester.salary = 123123;

			System.out.println("\nTesterId:" + tester.testerId + "\nName:" + tester.name + "\nAge:" + tester.age
					+ "\nMobileNumber:" + tester.mobileNumber + "\nEmail:" + tester.email + "\nExperience:"
					+ tester.experience + "\nJoinDate:" + tester.joinDate + "\nSalary:" + tester.salary);

			Manager manager = new Manager();
			manager.managerId = 12345678L;
			manager.name = "Aj";
			manager.age = 26;
			manager.mobileNumber = 258547855L;
			manager.email = "ajay@gmail.com";
			manager.experience = 19;
			manager.joinDate = "31.10.1996";
			manager.salary = 5848484;

			System.out.println("\nManagerId:" + manager.managerId + "\nName:" + manager.name + "\nAge:" + manager.age
					+ "\nMobileNumber:" + manager.mobileNumber + "\nEmail:" + manager.email + "\nExperience:"
					+ manager.experience + "\nJoinDate:" + manager.joinDate + "\nSalary:" + manager.salary);

			Ceo ceo = new Ceo();
			ceo.ceoId = 12345678L;
			ceo.name = "nani";
			ceo.age = 46;
			ceo.mobileNumber = 258547855L;
			ceo.email = "nani@gmail.com";
			ceo.experience = 20;
			ceo.joinDate = "01.02.2019";
			ceo.salary = 210211;

			System.out.println("\nCeoId:" + ceo.ceoId + "\nName:" + ceo.name + "\nAge:" + ceo.age + "\nMobileNumber:"
					+ ceo.mobileNumber + "\nEmail:" + ceo.email + "\nExperience:" + ceo.experience + "\nJoinDate:"
					+ ceo.joinDate + "\nSalary:" + ceo.salary);
		}
	}
}
