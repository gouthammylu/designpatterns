package com.practice.designpatterns.decorator;

import java.math.BigDecimal;

public class SandwichDecorator implements Sandwich {
	
	private Sandwich sandwich;

	public SandwichDecorator(Sandwich sandwich) {
		super();
		this.sandwich = sandwich;
	}


	@Override
	public BigDecimal getPrice() {
		// TODO Auto-generated method stub
		return sandwich.getPrice();
	}


	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return sandwich.getDescription();
	}

}
