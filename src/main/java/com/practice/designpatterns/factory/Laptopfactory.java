package com.practice.designpatterns.factory;

public class Laptopfactory {

	public static Laptop getLaptop(LaptopType laptopType) {

		switch (laptopType) {

		case DELL:
			return new Dell("4gb", "intel i5");
		case HP:
			return new Hp("8gb", "intel i7");
		case MAC:
			return new Mac("12gb", "ryzen 7", "4");
		}

		return null;
	}

}
