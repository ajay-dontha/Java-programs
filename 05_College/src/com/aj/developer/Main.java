package com.aj.developer;

public class Main {
 
	public static void main(String args[]) {
		
		displayStudentDetails();
	}
	public static void displayStudentDetails() {
	
		Student.studentId="15UM1A0531";
		Student.name="Ajay";
		Student.age=23;
		Student.collegeName="Vaageshwari";
		Student.address="Karimnagar";
		Student.email="donthaajay531@gmail.com";
		
		System.out.println("StudendId::"+Student.studentId);
		System.out.println("Name::"+Student.name);
		System.out.println("Age::"+Student.age);
		System.out.println("CollegeName::"+Student.collegeName);
		System.out.println("Address::"+Student.address);
		System.out.println("Email::"+Student.email);
		
	}
	public class TeacherTest {

			Teacher teacher=new Teacher();
			
			teacher.teacherId="TE12345";
			teacher.name="Abhinay";
			teacher.subject="Java";
			teacher.experience="5years";
			teacher.email="abhinay@gmail.com";
			
			System.out.println("\nId:"+teacher.teacherId+ "\nName:"+teacher.name+
					"\nSubject:"+teacher.subject+ "\nExperience:"+teacher.experience+
					"\nEmail:"+teacher.email);
			
		}
	}

	}

