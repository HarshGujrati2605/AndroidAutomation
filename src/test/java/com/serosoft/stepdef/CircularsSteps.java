package com.serosoft.stepdef;

import com.appium.commonactionmethods.CommonMobileActions;
import com.serosoft.pages.CircularPage;

import io.cucumber.java.en.And;

public class CircularsSteps {
	
	
	@And("I select the {string} from circulars")
	public void iSelectCircularData(String datanumber) throws Exception {
		
		new CircularPage().selectDataRowOfCirculars(datanumber);
		
	}
		
	@And("I click back {string} times")
	public void iClickBack(String times) throws NumberFormatException, InterruptedException {	
		CommonMobileActions.iClickBack(Integer.parseInt(times));		
	}

}
