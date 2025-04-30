package com.framework.testng.base;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.framework.utils.DataLibrary;
import com.framework.selenium.base.SeleniumBase;


public class ProjectSpecificMethods extends SeleniumBase {

	@DataProvider(name = "fetchData", indices = 0)
	public Object[][] fetchData() throws IOException {
		return DataLibrary.readExcelData(excelFileName);
	}

	@BeforeMethod
	public void preCondition() {
		//public void startApp(String browser, boolean headless, String url);
		startApp("chrome", "http://leaftaps.com/opentaps/control/main");
		setNode();
	}

	@AfterMethod
	public void postCondition() {
		close();

	}

}
