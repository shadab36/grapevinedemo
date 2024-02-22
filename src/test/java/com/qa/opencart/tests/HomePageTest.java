package com.qa.opencart.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;
import com.qa.opencart.constants.AppConstants;

public class HomePageTest extends BaseTest {

	@BeforeClass
	public void accSetUp() {
		homePage = loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Test
	public void getAccPageHeading() {
		String actUrl = homePage.getHemePageUrl();

		Assert.assertTrue(actUrl.contains("Welcome"));
	}

}
