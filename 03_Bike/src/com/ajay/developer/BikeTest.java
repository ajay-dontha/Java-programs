package com.ajay.developer;

public class BikeTest {

	
		public static void main(String args[]) {
			
			Bike bike=new Bike();
			bike.bikeId="APAL4094";
			bike.name="Splender";
			bike.model="Plus2010";
			bike.address="Karimnagar";
			
			System.out.println("\nId:"+bike.bikeId+ "\nName:"+bike.name+
					"\nModel:"+bike.model+ "\nAddress:"+bike.address);
		
			Bike bike1=new Bike();
			
			bike1.bikeId="AP15BP3674";
			bike1.name="Scooty";
			bike1.model="Pep+";
			bike1.address="Karimnagar";
			
			System.out.println("\nId:"+bike.bikeId+ "\nName:"+bike.name+
					"\nModel:"+bike.model+ "\nAddress:"+bike.address);
		}
	}

