package com.practice.designpatterns.decorator;

public class CasualDress extends DressDecorator {

	public CasualDress(Dress dress) {
		super(dress);

	}
	
	@Override
	public void assemble() {
		super.assemble();
		System.out.println("Adding features of casual dress");

	}

}
