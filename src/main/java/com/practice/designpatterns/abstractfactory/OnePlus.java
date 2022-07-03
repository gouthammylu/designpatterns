package com.practice.designpatterns.abstractfactory;

public class OnePlus implements Device {
	
	private String ram;
	private String storage;
	
	

	public OnePlus(String ram, String storage) {
		super();
		this.ram = ram;
		this.storage = storage;
	}



	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return "OnePlus details are: "+ram+" storage:"+storage;
	}



	@Override
	public String toString() {
		return "OnePlus [ram=" + ram + ", storage=" + storage + "]";
	}
	
	

}
