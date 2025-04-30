package com.leaftaps.pages;

import com.framework.selenium.design.Locators;
import com.framework.testng.base.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods {


	public MyLeadsPage clickLeadsLink() {
		click(locateElement(Locators.LINK_TEXT, "Leads"));
		reportStep("Leads link is clicked", "pass");
		return new MyLeadsPage();
	}
}
