package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.constants.AppConstants;
import com.qa.opencart.utils.ElementUtil;

public class HomePage {

	private WebDriver driver;
	private ElementUtil eleUtil;

	private By pageTitle = By.linkText("//span[text()='Shop Products: Vendor Network']");
	
	// page const...
	public HomePage(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(this.driver);
	}

	// page actions:

	public String getHemePageUrl() {
		 return eleUtil.waitForURLContains("Welcome", AppConstants.MEDIUM_DEFAUTT_WAIT);
	}
}
