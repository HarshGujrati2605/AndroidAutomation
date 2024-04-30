package com.serosoft.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import com.appium.commonactionmethods.CommonMobileActions;
import com.harsh.globalvariable.GlobalVariable;
import com.serosoft.pages.*;

public class LoginSteps extends GlobalVariable {

	@When("I enter username as {string}")
	public void iEnterUsernameAs(String username) throws Exception {
		new LoginPage().enterUsername(username);
	}

	@And("I enter password as {string}")
	public void iEnterPasswordAs(String password) throws Exception {

		new LoginPage().enterPassword(password);

	}

	@And("I login")
	public void iLogin() throws Exception {
		new LoginPage().clickOnLoginButton();
	}

	@Then("login should failed with an error {string}")
	public void loginShouldFailWithAnError(String err) throws InterruptedException {}
		

	@Then("I am on homepage")
	public void validateHomePage() throws InterruptedException {
		Thread.sleep(4000);
		CommonMobileActions.allowPermissionss("allow");
		
	}
	
	

}
