package com.serosoft.stepdef;

import com.appium.commonactionmethods.CommonMobileActions;
import com.serosoft.pages.HomePage;
import com.serosoft.pages.MyProfilePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomepageSteps {

	@Then("I click on {string} from menu")

	public void iSelectOption(String option) throws Exception {
		
		HomePage.selectOptionFromProfileMenu(option);
		
	}
	
	@And("I select {string}")
	public void iSelectModule(String Modulename) throws Exception {
		HomePage.iSelectModuleFromHomePage(Modulename);
	}

}
