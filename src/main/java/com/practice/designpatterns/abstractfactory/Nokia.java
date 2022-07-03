package com.practice.designpatterns.abstractfactory;

public class Nokia implements Device {

	private String ram;
	private String storage;
	
	

	public Nokia(String ram, String storage) {
		super();
		this.ram = ram;
		this.storage = storage;
	}



	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return "Nokia details are: "+ram+" storage:"+storage;
	}



	@Override
	public String toString() {
		return "Nokia [ram=" + ram + ", storage=" + storage + "]";
	}

}
