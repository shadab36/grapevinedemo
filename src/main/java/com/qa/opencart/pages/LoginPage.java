package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.opencart.constants.AppConstants;
import com.qa.opencart.utils.ElementUtil;

import io.qameta.allure.Step;

public class LoginPage{
		
	private WebDriver driver;
	private ElementUtil eleUtil;

	// By locators: OR
	private By email = By.name("email");
	private By password = By.name("password");
	private By signInBtn = By.xpath("//button[text()='Sign In']");
	
	// page const...
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(this.driver);
	}

	public HomePage doLogin(String username, String pwd) {
		System.out.println("creds are: " + username + " : " + pwd);
		eleUtil.waitForVisibilityOfElement(email, AppConstants.MEDIUM_DEFAUTT_WAIT).sendKeys(username);
		eleUtil.doSendKeys(password, pwd);
		eleUtil.doClick(signInBtn);
		return new HomePage(driver);
	}
	
}