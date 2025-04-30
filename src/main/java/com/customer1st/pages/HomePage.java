package com.customer1st.pages;

import org.openqa.selenium.WebElement;

import com.framework.selenium.design.Locators;
import com.framework.testng.base.Customer1stMethods;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePage extends Customer1stMethods{
	
	@Given("Navigate to Contact Us page in Standard Bank Website")
    public ContactUsPage dashboardIsDisplayed() {		
		WebElement bankName = locateElement(Locators.ID, "Standard_Bank-Copy");
		verifyDisplayed(bankName);
		click(locateElement(Locators.LINK_TEXT, "Contact us"));
		reportStep("Login button is clicked successfully", "pass");
		return new ContactUsPage();
	}
	
	

	
}
