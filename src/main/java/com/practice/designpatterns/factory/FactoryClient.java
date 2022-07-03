package com.practice.designpatterns.factory;

public class FactoryClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//It removes the burden of object creation by client
		
		Laptop dell=Laptopfactory.getLaptop(LaptopType.DELL);
		Laptop hp=Laptopfactory.getLaptop(LaptopType.HP);
		Laptop mac=Laptopfactory.getLaptop(LaptopType.MAC);
		
		System.out.println(dell.getConfiguration());
		System.out.println(hp.getConfiguration());
		System.out.println(mac.getConfiguration());
	}

}
