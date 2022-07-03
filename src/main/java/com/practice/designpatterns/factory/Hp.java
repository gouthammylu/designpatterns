package com.practice.designpatterns.factory;

public class Hp implements Laptop {
	
	private String ramSize;
	private String processor;

	public Hp(String ramSize, String processor) {
		super();
		this.ramSize = ramSize;
		this.processor = processor;
	}



	@Override
	public String getConfiguration() {
		// TODO Auto-generated method stub
		return "HP ram size is:"+ramSize+" processor is:"+processor;
	}



	@Override
	public String toString() {
		return "Hp [ramSize=" + ramSize + ", processor=" + processor + "]";
	}
	
	

}
