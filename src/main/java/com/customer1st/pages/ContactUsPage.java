package com.customer1st.pages;

import org.openqa.selenium.WebElement;

import com.framework.selenium.design.Locators;
import com.framework.testng.base.Customer1stMethods;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class ContactUsPage extends Customer1stMethods {	
	
	
	@And("Extract Email from Contact Us")
    public ContactUsPage dashboardIsDisplayed() throws InterruptedException {		
		WebElement fraudLine = locateElement(Locators.XPATH, "//div[contains(text(),'Fraud line - Report a NEW fraud incident')]");
		scrollTOElement(fraudLine);
		verifyDisplayed(fraudLine);
		WebElement email = locateElement(Locators.XPATH, "(//span[contains(text(),'EMAIL')]/following::span)[1]");
		verifyDisplayed(email);
		elementText = getElementText(email);
		reportStep("Homepage is displayed", "pass");
		return this;
	}

}
