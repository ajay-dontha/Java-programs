package com.aj.developer;

public class ManagerTest {

	public static void main(String args[]) {

		Manager manager = new Manager();
		manager.managerId = 12345678L;
		manager.name = "Laxminarayana";
		manager.experience=10;
		manager.companyName = "Fisheries";
		manager.age = 35;
		manager.joinDate = "12/02/1995";

		System.out.println("\nManagerId:" + manager.managerId + "\nName:" + manager.name + "\nExperience:"
				+ manager.experience + "\nCompanyName:" + manager.companyName + "\nAge:" + manager.age + "\nJoinDate:"
				+ manager.joinDate);

		Manager developer = new Manager();
		developer.developerId = 12345678L;
		developer.name = "Ajay";
		developer.experience = 4;
		developer.companyName = "infotech";
		developer.age = 24;
		developer.joinDate = "21.12.1197";
		developer.address = "Karimnagar";
		developer.email = "Ajay@gmail.com";

		System.out.println("\nDeveloperId:" + developer.developerId + "\nName:" + developer.name + "\nExperience:"
				+ developer.experience + "\nCompanyName:" + developer.companyName + "\nAge:" + developer.age
				+ "\nJoinDate:" + developer.joinDate + "\nEmail:" + developer.email + "\nAddress:" + developer.address);
	}
}
