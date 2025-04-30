package com.leaftaps.pages;

import com.framework.selenium.design.Locators;
import com.framework.testng.base.ProjectSpecificMethods;


public class DeleteLeadPage extends ProjectSpecificMethods {

	
	public DeleteLeadPage verifyErrorMsg(String eleErrorMsgValue){
		verifyPartialText(locateElement(Locators.CLASS_NAME,"x-paging-info"), eleErrorMsgValue);
		return this;
	}
}
