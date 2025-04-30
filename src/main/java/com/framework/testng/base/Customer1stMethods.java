package com.framework.testng.base;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.framework.selenium.base.SeleniumBase;
import com.framework.utils.DataLibrary;

public class Customer1stMethods extends SeleniumBase {
	public static String elementText;
	@DataProvider(name = "fetchData", indices = 0)
	public Object[][] fetchData() throws IOException {
		return DataLibrary.readExcelData(excelFileName);
	}

	@BeforeMethod
	public void preCondition() {
		startApp("chrome", "https://www.standardbank.co.za/");
		setNode();
	}

	@AfterMethod
	public void postCondition() {
		close();

	}

}
