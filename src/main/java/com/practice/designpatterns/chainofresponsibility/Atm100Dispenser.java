package com.practice.designpatterns.chainofresponsibility;

public class Atm100Dispenser extends DispenserHandler {

	@Override
	public void dispenseAmount(int amount) {
		// TODO Auto-generated method stub
		
		if(amount>=100) {
			int quotient=amount/100;
			int remainder=amount%100;
			System.out.println("dispense amount from 100 denomination:"+quotient);
		}
		
	}

}
