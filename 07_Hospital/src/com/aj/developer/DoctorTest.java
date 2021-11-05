package com.aj.developer;

public class DoctorTest {

	public static void main(String args[]) {
		
	Doctor doctor=new Doctor();
	
	doctor.doctorId=12345678L;
	doctor.doctorName="Ajay";         
	doctor.doctorAge=24;
	doctor.doctorExperience="2years";
	doctor.doctorSpecilizedIn="Bones";
	
	System.out.println("\nDoctorId::"+doctor.doctorId+ "\nDoctorName::"+doctor.doctorName+ 
			"\nDoctorAge:"+doctor.doctorAge+
		"\nDoctorExperience:"+doctor.doctorExperience+ "\nDpctorSpecilizedIn:"+doctor.doctorSpecilizedIn );
	
	Doctor patient=new Doctor();
	
	patient.patientId=1234567L;
	patient.patientName="Akhil";
	patient.patientDisease="Corona";
	patient.patientAge=25;
	patient.patientWeight=60.00D;
	patient.patientAddress="Karimnagar";
	System.out.println("\nPatientId:"+patient.patientId+ "\nPatientName:"+patient.patientName+
			"\nPatientDisease:"+patient.patientDisease+ "\nPatientAge:"+patient.patientAge+
			"\nPatientWeight:"+patient.patientWeight+ "\nPatientAddress:"+patient.patientAddress);
	
}
}