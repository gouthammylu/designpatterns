package com.practice.designpatterns.abstractfactory;

public class HP implements Device {

	private String ram;
	private String processor;

	public HP(String ram, String processor) {
		super();
		this.ram = ram;
		this.processor = processor;
	}

	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return "HP details are ram:"+ram+" processor is:"+processor;
	}

	@Override
	public String toString() {
		return "Hp [ram=" + ram + ", processor=" + processor + "]";
	}
	
	

}
