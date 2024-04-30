package com.serosoft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.appium.commonactionmethods.CommonMobileActions;

public class CircularPage {

	public void selectDataRowOfCirculars(String rownumber) throws Exception {
		WebElement row = CommonMobileActions.getElement(By
				.xpath("//androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[" + rownumber + "]"));
		CommonMobileActions.iClick(row, "Circular Data is clicked");

	}

}
