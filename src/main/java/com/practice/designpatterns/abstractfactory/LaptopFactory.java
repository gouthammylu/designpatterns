package com.practice.designpatterns.abstractfactory;

public class LaptopFactory implements AbstractDeviceFactory {
	
		@SuppressWarnings("incomplete-switch")
		@Override
		public Device getDeviceDetails(DeviceType deviceType) {
			switch(deviceType) {
			
			case DELL:
				return new Dell("4gb","intel i5");
			case HP:
				return new HP("6gb","Qualcomm");			
			
			}
			
			return null;
		}
}
