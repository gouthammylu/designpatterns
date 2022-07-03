package com.practice.designpatterns.decorator;

import java.math.BigDecimal;

public class WhiteBreadSandwich implements Sandwich {

	@Override
	public BigDecimal getPrice() {
		
		return new BigDecimal("3.00");
	}

	@Override
	public String getDescription() {
		
		return "WhiteBreadSandwich";
	}

}
