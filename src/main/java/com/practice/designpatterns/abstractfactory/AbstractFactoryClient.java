package com.practice.designpatterns.abstractfactory;

public class AbstractFactoryClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Abstract factory design pattern is a abstract layer on factory pattern. In other words factory of factories
		
		Device dell=FactoryGenerator.getFactory(FactoryType.LaptopFactory).getDeviceDetails(DeviceType.DELL);
		Device nokia=FactoryGenerator.getFactory(FactoryType.MobileFactory).getDeviceDetails(DeviceType.NOKIA);
		
		System.out.println(dell.getDetails());
		System.out.println(nokia.getDetails());
		
	}

}
