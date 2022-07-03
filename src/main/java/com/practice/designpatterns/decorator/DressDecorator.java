package com.practice.designpatterns.decorator;

public class DressDecorator implements Dress {

	protected Dress dress;

	public DressDecorator(Dress dress) {
		super();
		this.dress = dress;
	}

	@Override
	public void assemble() {
		this.dress.assemble();

	}

}
