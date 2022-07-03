package com.practice.designpatterns.decorator;

public class DecoratorClient {

	public static void main(String[] args) {
		
		Dress fancyDress=new FancyDress(new CasualDress(new BasicDress()));
		fancyDress.assemble();
		System.out.println("--------------------------------------------------------------");
		Dress casualDress=new CasualDress(new BasicDress());
		casualDress.assemble();

	}

}
