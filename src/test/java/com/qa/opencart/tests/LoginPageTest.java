package com.qa.opencart.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;
import com.qa.opencart.constants.AppConstants;

public class LoginPageTest extends BaseTest {

	@Test(priority = 5)
	public void loginTest() {
		homePage = loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));

		String actUrl = homePage.getHemePageUrl();

		Assert.assertTrue(actUrl.contains("Welcome"));
	}
}