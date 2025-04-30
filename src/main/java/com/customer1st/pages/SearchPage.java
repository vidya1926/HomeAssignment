package com.customer1st.pages;

import org.openqa.selenium.WebElement;

import com.framework.selenium.design.Locators;
import com.framework.testng.base.Customer1stMethods;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchPage extends Customer1stMethods{
	
	@When("Switch the control to application {string} in new tab")
    public SearchPage dashboardIsDisplayed(String url) {
		switchToNewApplication(url);
		reportStep("New application is opened", "pass");
		return this;
	}
	
	@Then("The control should be in new application")
    public SearchPage verifyTheNewApplication() {
		WebElement ele = locateElement(Locators.NAME, "email");
		verifyDisplayed(ele);
		clearAndType(ele, elementText);
		reportStep("Google search page is displayed", "pass");
		return this;
	}
	
	
}
