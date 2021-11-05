package com.aj.developer;

public class Main {

	public static void main(String args[]) {

		Laptop laptop = new Laptop();
		laptop.laptopId = "BS576tx";
		laptop.laptopName = "HP";
		laptop.laptopColour = "Black";
		laptop.laptopRam = "8GB";
		laptop.laptopRom = "1 TB HDD";
		laptop.laptopScreenResolution = "15-inch Display 1080p";

		System.out.println("\nLaptopId:" + laptop.laptopId + "\nLaptopName:" + laptop.laptopName + "\nLaptopColour:"
				+ laptop.laptopColour + "\nLaptopRam:" + laptop.laptopRam + "\nLaptopRom:" + laptop.laptopRom
				+ "\nLaptopScreenResolution:" + laptop.laptopScreenResolution);

		Laptop desktop = new Laptop();
		desktop.desktopId = "Vstro12345";
		desktop.name = "Dell";
		desktop.colour = "Black";
		desktop.ram = "4GB";
		desktop.rom = "500GB HDD";
		desktop.screenResolution = "14-inch Display 1080p";

		System.out.println("\nDesktopId:" + desktop.desktopId + "\nName:" + desktop.name + 
				"\nColour:" + desktop.colour + "\nRam:" + desktop.ram + 
				"\nRom:" + desktop.rom + "\nscreenResolution:" + desktop.screenResolution);
	}
}
