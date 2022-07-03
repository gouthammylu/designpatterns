package com.practice.designpatterns.chainofresponsibility;

public class ATMClient {
	
	public static void main(String[] args) {
		
		Atm2000Dispenser atm2000Dispenser=new Atm2000Dispenser();
		Atm500Dispenser atm500Dispenser=new Atm500Dispenser();
		Atm100Dispenser atm100Dispenser=new Atm100Dispenser();
		
		atm2000Dispenser.setNextDispenser(atm500Dispenser);
		atm500Dispenser.setNextDispenser(atm100Dispenser);
		
		atm2000Dispenser.dispenseAmount(2600);
		
	}

}
