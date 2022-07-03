package com.practice.designpatterns.factory;

public class Dell implements Laptop {
	
	private String ramSize;
	private String processor;

	public Dell(String ramSize, String processor) {
		super();
		this.ramSize = ramSize;
		this.processor = processor;
	}


	@Override
	public String getConfiguration() {
		return "Dell ram size is:"+ramSize+" processor is:"+processor;
	}


	@Override
	public String toString() {
		return "Dell [ramSize=" + ramSize + ", processor=" + processor + "]";
	}
	
	

}
