package com.practice.designpatterns.abstractfactory;

public interface AbstractDeviceFactory {
	
	public Device getDeviceDetails(DeviceType deviceType);

}
