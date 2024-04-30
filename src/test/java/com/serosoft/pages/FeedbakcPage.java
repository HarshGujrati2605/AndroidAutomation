package com.serosoft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.appium.commonactionmethods.CommonMobileActions;

public class FeedbakcPage {

	By starrating = By
			.xpath("(//android.widget.FrameLayout[contains(@resource-id , 'ratingBar')]//android.widget.ImageView)[5]");

	By FeedbackToast = By.xpath("//android.widget.Toast[contains(@text , 'Feedback Submitted Successfully' )]");

	By feedbackTextarea = By.xpath("//android.widget.EditText[contains(@resource-id, 'Feedback')]");

	By SubmitButton = By.xpath("//android.widget.Button[contains(@resource-id , 'Submit')]");

	public void iGiveRating() throws Exception {
		WebElement stars = CommonMobileActions.getElement(starrating);
		CommonMobileActions.iClick(stars, "Star rating");
		CommonMobileActions.clickOnElementAndType(feedbackTextarea, "Test feedback", "Feedback text field");
	}

	public void ivalidateToast() throws Exception {
		WebElement toast = CommonMobileActions.getElement(FeedbackToast);
		if (toast.isDisplayed()) {
			CommonMobileActions.iLogMessage("Submit feeback toast is present");

		} else {
			throw new Exception("Feedback toast is not appeared");
		}

	}

	public void iClickSubmitButton() throws Exception {
		WebElement submitbutton = CommonMobileActions.getElement(SubmitButton);
		CommonMobileActions.iClick(submitbutton, "Submit button");
	}

}
