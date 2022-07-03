package com.practice.designpatterns.abstractfactory;

public class Dell implements Device{
	
	private String ram;
	private String processor;

	public Dell(String ram, String processor) {
		super();
		this.ram = ram;
		this.processor = processor;
	}

	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return "Dell details are ram:"+ram+" processor is:"+processor;
	}

	@Override
	public String toString() {
		return "Dell [ram=" + ram + ", processor=" + processor + "]";
	}
	
	

}
