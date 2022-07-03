package com.practice.designpatterns.decorator;

public class SandwichClient {
	
	public static void main(String[] args) {
		
		Sandwich sandwich=new WhiteBreadSandwich();
		System.out.printf("Price of %s is $%.2f %n", sandwich.getDescription(), sandwich.getPrice());
		
		Sandwich sandwichWithXtraCheese=new CheeseDecorator(new WhiteBreadSandwich());
		System.out.printf("Price of %s is $%.2f %n", sandwichWithXtraCheese.getDescription(), sandwichWithXtraCheese.getPrice());
		
	}

}
