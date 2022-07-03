package com.practice.designpatterns.chainofresponsibility;

public abstract class DispenserHandler {
	
	protected DispenserHandler dispenserHandler;
	
	public void setNextDispenser(DispenserHandler dispenserHandler) {
		
		this.dispenserHandler=dispenserHandler;
		
	}
	
	public abstract void dispenseAmount(int amount);

}
