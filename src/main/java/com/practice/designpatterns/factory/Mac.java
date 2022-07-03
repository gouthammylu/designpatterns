package com.practice.designpatterns.factory;

public class Mac implements Laptop {
	
	private String ramSize;
	private String processor;
	private String gpuType;
	
	public Mac(String ramSize, String processor, String gpuType) {
		super();
		this.ramSize = ramSize;
		this.processor = processor;
		this.gpuType = gpuType;
	}
	
	@Override
	public String getConfiguration() {
		// TODO Auto-generated method stub
		return "Mac ram size is:"+ramSize+" processor is:"+processor+"gpuType is:"+gpuType;
	}
	
	@Override
	public String toString() {
		return "Mac [ramSize=" + ramSize + ", processor=" + processor + ", gpuType=" + gpuType + "]";
	}
	
	

}
