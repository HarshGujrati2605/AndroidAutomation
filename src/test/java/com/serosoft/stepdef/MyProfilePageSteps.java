package com.serosoft.stepdef;

import com.serosoft.pages.MyProfilePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class MyProfilePageSteps {

	@And("I click on {string}")
	public void SelectProfileModule(String nameofmodule) throws InterruptedException {

		MyProfilePage.iSelectProfileModule(nameofmodule);

	}

	@Then("I am on {string} page")
	public void iValidateModulePageProfile(String Modulename) throws Exception {

		MyProfilePage.iValidateModuleNameOnPage(Modulename);
	}

	@And("I click on Add button")
	public void iClickAdd() throws Exception {
		MyProfilePage.iClickAdd();
	}

	@Then("I add medical condtions with {string}")
	public void iAddMedicalCondtions(String option) throws Exception {
		
		MyProfilePage.addingMedicalConditions(option);

	}

}
