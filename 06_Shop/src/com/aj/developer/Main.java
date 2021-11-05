package com.aj.developer;

public class Main {
	
		public static void main(String args[]) {
		
			Customer customer=new Customer();
			
			customer.customerId=151110531L;
			customer.name="Ramu";
			customer.email="ramu@gmail.com";
			customer.mobilenumber=8888811555L;
			customer.age=23;
			customer.address="Karimnagar";
			
			System.out.println("\nId::"+customer.customerId+"\nName::"+customer.name+
					"\nEmail::"+customer.email+ "\nMobileNumber::"+customer.mobilenumber+ 
					"\nAge::"+customer.age+ "\nAddress::"+customer.address);

		}

		public class ShopkeeperDetails {

			public static void main(String args[]) {
					
			displayShopkeeperDetails();
		}

			public static void displayShopkeeperDetails() {
				// TODO Auto-generated method stub
				Shopkeeper.shopKeeperId=151110531L;
				Shopkeeper.name="Ramu";
				Shopkeeper.email="ramu@gmail.com";
				Shopkeeper.mobilenumber=8888811555L;
				Shopkeeper.aadharNumber=885588559966L;
				Shopkeeper.licence=12345689L;
				
				System.out.println("\nId::"+Shopkeeper.shopKeeperId+"\nName::"+Shopkeeper.name+
						"\nEmail::"+Shopkeeper.email+ "\nMobileNumber::"+Shopkeeper.mobilenumber+ 
						"\nAdharNumber::"+Shopkeeper.aadharNumber+ "\nLicence::"+Shopkeeper.licence);
			}



			}
	


