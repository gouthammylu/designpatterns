package com.practice.designpatterns.abstractfactory;

public class MobileFactory implements AbstractDeviceFactory{
	
	@SuppressWarnings("incomplete-switch")
	@Override
	public Device getDeviceDetails(DeviceType deviceType) {
		switch(deviceType) {
		
		case ONEPLUS:
			return new OnePlus("12gb","250gb");
		case NOKIA:
			return new Nokia("8gb","120gb");			
		
		}
		
		
		return null;
	}

}
