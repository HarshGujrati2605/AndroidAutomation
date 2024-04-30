package com.serosoft.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.appium.commonactionmethods.CommonMobileActions;
import com.harsh.globalvariable.GlobalVariable;

//import okio.Timeout;
//import io.appium.java_client.MobileElement;

public class LoginPage extends GlobalVariable {
	By Username = By.xpath("//android.widget.EditText[@resource-id ='com.serosoft.academiassu:id/etUsername']");
	By Password = By.xpath("//android.widget.EditText[@resource-id ='com.serosoft.academiassu:id/etPassword']");
	By SigninButton = By.xpath("//android.widget.Button[@resource-id= 'com.serosoft.academiassu:id/btnLogin']");

	public void enterUsername(String username) throws Exception {

		CommonMobileActions.clickOnElementAndType(Username, username, "Username field");
//			Thread.sleep(8000);

	}

	public void enterPassword(String password) throws Exception {

		CommonMobileActions.clickOnElementAndType(Password, password, "Password field");

	}

	public void clickOnLoginButton() throws Exception {
	
			WebElement signin = CommonMobileActions.getElement(SigninButton);
			CommonMobileActions.iClick(signin, "Login button");
		

	}
}
