package com.practice.designpatterns.decorator;

import java.math.BigDecimal;

public class CheeseDecorator extends SandwichDecorator {
	
	private Sandwich sandwich;

	public CheeseDecorator(Sandwich sandwich) {
		super(sandwich);
		this.sandwich=sandwich;
	}

	@Override
	public BigDecimal getPrice() {
		// TODO Auto-generated method stub
		return super.getPrice().add(new BigDecimal("0.50"));
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return super.getDescription().concat(" with cheese");
	}
	
	

}
