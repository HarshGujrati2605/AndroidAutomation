package com.serosoft.pages;

import io.cucumber.java.Scenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.*;
import org.openqa.selenium.By;

import com.appium.commonactionmethods.CommonMobileActions;
import com.harsh.globalvariable.GlobalVariable;

public class MyProfilePage extends GlobalVariable {

	static By ModuleHeaderName = By
			.xpath("//android.view.ViewGroup[contains(@resource-id , 'includeTB')]/android.widget.TextView");
	static By NavigateBack = By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");
	static By AddButton = By.xpath("//android.widget.ImageView[contains(@resource-id ,  'Add')]");
	static By ConditionDropDown = By.xpath("//android.widget.Spinner[contains(@resource-id ,  'Condition')]");
	static By MedicalCondtionTextField = By
			.xpath("//android.widget.EditText[contains(@resource-id , 'MedicalCondition')]");
	static By calenderoption = By
			.xpath("//android.widget.TextView[@resource-id = 'com.serosoft.academiassu:id/tvSince']");
	static By date = By.xpath("//android.view.View[@text = '1']");
	static By okButton = By.xpath("//android.widget.Button[@text = 'OK']");
	static By consultingDoctorField = By.xpath("//android.widget.EditText[contains(@resource-id , 'Doctor')]");
	static By contactNumber = By.xpath("//android.widget.EditText[contains(@resource-id , 'Contact')]");
	static By submitButton = By.xpath("//android.widget.Button[contains(@resource-id , 'Submit')]");

	public static void iSelectProfileModule(String name) throws InterruptedException {
		Thread.sleep(2000);
		CommonMobileActions.iImplicitlywait(30, "My Profile page");
		@SuppressWarnings("unchecked")
		List<WebElement> modulesname = driver.findElements(By.xpath(
				"//android.widget.RelativeLayout[@resource-id = 'com.serosoft.academiassu:id/llProfileInfo']//android.widget.TextView"));
		for (WebElement ele : modulesname) {
			if (ele.getText().contains(name)) {
				ele.click();
				break;
			}
		}
	}

	public static void iValidateModuleNameOnPage(String name) throws Exception {
		Thread.sleep(6000);
		CommonMobileActions.iImplicitlywait(30, "Module");
		WebElement ele = CommonMobileActions.getElement(ModuleHeaderName);
		WebElement back = CommonMobileActions.getElement(NavigateBack);
		String Modulenameactual = CommonMobileActions.iGetText(ele, name).toLowerCase();
		System.out.println("****" + Modulenameactual + "****");
		if (Modulenameactual.contains(name.toLowerCase())) {
			CommonMobileActions.iLogMessage("Validated the Module");
			CommonMobileActions.iClick(back, "Back button");
		}

		else {
			CommonMobileActions.iLogErrorMessage("Module page is not opened");
			CommonMobileActions.iClick(back, "Back button");
		}
	}

	public static void iClickAdd() throws Exception {
		iSelectProfileModule("Medical");
		WebElement ele = CommonMobileActions.getElement(AddButton);
		CommonMobileActions.iClick(ele, "Add button");
	}

	public static void addingMedicalConditions(String conditionoption) throws Exception {
		WebElement ele = CommonMobileActions.getElement(ConditionDropDown);
		CommonMobileActions.iClick(ele, "Condtion dropdown");
		@SuppressWarnings("unchecked")
		List<WebElement> condtionoptionsdropdownlist = driver.findElements(
				By.xpath("//android.widget.ListView//android.widget.TextView[contains(@resource-id , 'Item')]"));
		for (WebElement option : condtionoptionsdropdownlist) {
			Thread.sleep(2000);
			if (option.getText().toLowerCase().contains(conditionoption.toLowerCase())) {
				option.click();
				break;
			}
		}
		CommonMobileActions.clickOnElementAndType(MedicalCondtionTextField, "Test", "Medical condtion text field");
		WebElement calendericonsince = CommonMobileActions.getElement(calenderoption);
		CommonMobileActions.iClick(calendericonsince, "calender");
		WebElement dateoptiom = CommonMobileActions.getElement(date);
		CommonMobileActions.iClick(dateoptiom, "Date option from caleder");
	    WebElement okbutton = CommonMobileActions.getElement(okButton);
	    CommonMobileActions.iClick(okbutton, "OKButton");
        CommonMobileActions.clickOnElementAndType(consultingDoctorField, "Test", "Consulting doctor");
        driver.navigate().back();
        Thread.sleep(1000);
        CommonMobileActions.clickOnElementAndType(contactNumber, "8989898989", "Contact number");
        Thread.sleep(2000);
        driver.navigate().back();
        WebElement submitbutton = CommonMobileActions.getElement(submitButton);
        CommonMobileActions.iClick(submitbutton, "Submit button");
        CommonMobileActions.iClickBack(2);        
	}

}
