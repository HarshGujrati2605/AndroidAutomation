package com.serosoft.implementation;

import java.io.IOException;

import com.appium.utilities.DriverUtils;
import com.harsh.globalvariable.GlobalVariable;
import com.serosoft.base.BaseClass;

import io.appium.java_client.AppiumDriver;

public class AppAcess extends GlobalVariable {

	public static void openApplication() throws IOException {

		if (driver == null || driver.toString().contains("null")) {

			driver = DriverUtils.getDriver();

		}
	}

//	private static void openApplication() {
//		
//		driver.get(url);
//		
//	}

	public static void resetDriver() {
		try {
//			driver.quit();
		} catch (Exception e) {

		}
	}

}
