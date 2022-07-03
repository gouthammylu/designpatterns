package com.practice.designpatterns.chainofresponsibility;

public class Atm2000Dispenser extends DispenserHandler {
	

	@Override
	public void dispenseAmount(int amount) {
		
		if(amount>=2000) {
			
			int quotient=amount/2000;
			int remainder=amount%2000;
			System.out.println("dispense amount from 2000 denomination:"+quotient);
			if(remainder!=0)
				dispenserHandler.dispenseAmount(remainder);
				
		}

	}

}
