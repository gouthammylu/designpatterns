package com.practice.designpatterns.decorator;

public class FancyDress extends DressDecorator {

	public FancyDress(Dress dress) {
		super(dress);
	}

	@Override
	public void assemble() {
		super.assemble();
		System.out.println("Adding features of fancy dress");

	}

}
