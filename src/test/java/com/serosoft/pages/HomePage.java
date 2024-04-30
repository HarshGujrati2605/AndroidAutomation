package com.serosoft.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.appium.commonactionmethods.CommonMobileActions;
import com.harsh.globalvariable.GlobalVariable;

public class HomePage extends GlobalVariable {

	static By MenuButton = By.xpath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]");

	public static void selectOptionFromProfileMenu(String opt) throws Exception {
		WebElement menu = CommonMobileActions.getElement(MenuButton);
		CommonMobileActions.iClick(menu, "Menu for drawer");
		CommonMobileActions.iImplicitlywait(30, opt);
		driver.findElement(By.xpath("//android.widget.CheckedTextView[@text = '" + opt + "']")).click();
		CommonMobileActions.iLogMessage("I clicked on" + opt);
	}
	

	public static void iSelectModuleFromHomePage(String ModuleName) throws InterruptedException {
		Thread.sleep(4000);
		CommonMobileActions.iImplicitlywait(30, ModuleName);
		List<WebElement> element = driver.findElements(By.xpath(
				"//androidx.recyclerview.widget.RecyclerView[@resource-id = 'com.serosoft.academiassu:id/rvModules']/android.widget.LinearLayout//android.widget.TextView[@resource-id = 'com.serosoft.academiassu:id/tvModuleName']"));
		for (WebElement ele : element) {
			System.out.println(ele.getText());
			if (ele.getText().contains(ModuleName)) {
				System.out.println(ele.getText());
				Thread.sleep(2000);
				CommonMobileActions.iTapWithCoordinates(ele, ModuleName);
				break;
			}
		}
	}

}
