package com.practice.designpatterns.chainofresponsibility;

public class Atm500Dispenser extends DispenserHandler{

	@Override
	public void dispenseAmount(int amount) {
		
		if(amount>=500) {
			int quotient=amount/500;
			int remainder=amount%500;
			System.out.println("dispense amount from 500 denomination:"+quotient);
			if(remainder!=0)
			dispenserHandler.dispenseAmount(remainder);
		}
		
		
		
	}

}
