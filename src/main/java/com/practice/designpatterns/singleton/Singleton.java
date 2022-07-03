package com.practice.designpatterns.singleton;

public class Singleton {

	private Singleton() {

	}

	private static Singleton singleton = null;

	public static Singleton getinstance() {

		synchronized (Singleton.class) {
			if (singleton == null)
				singleton = new Singleton();
		}

		return singleton;
	}

}
