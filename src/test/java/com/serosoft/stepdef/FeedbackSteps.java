package com.serosoft.stepdef;

import com.serosoft.pages.CommonLoactorPage;
import com.serosoft.pages.FeedbakcPage;

import io.cucumber.java.en.*;

public class FeedbackSteps {

	@Then("I am on {string} Screen")
	public void iValidateFeedbackPage(String pagename) throws Exception {

		new CommonLoactorPage().iValidateTitle(pagename);

	}

	@And("I give rating and enter feedback to the app")
	public void giveRating() throws Exception {
		new FeedbakcPage().iGiveRating();
	}

	@And("I click on submit button")
	public void iClickSubmitButton() throws Exception {

		new FeedbakcPage().iClickSubmitButton();

	}

	@Then("feedback is submitted and toast is appear")
	public void ivalidateSubmitToast() throws Exception {

		new FeedbakcPage().ivalidateToast();

	}

}
