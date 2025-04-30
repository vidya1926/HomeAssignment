package Runner;

import org.testng.annotations.BeforeTest;

import com.framework.testng.base.Customer1stMethods;

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//import org.junit.runner.RunWith;

//@RunWith(Cucumber.class)
@CucumberOptions( 
                 features = "src/main/java/features/TestOnline.feature", 
                 glue = "com.customer1st.pages",
		// plugin =
		// {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		        monochrome = true
)

public class CucumberRunner extends Customer1stMethods {
	
	@BeforeTest
	public void setupData() {
		testcaseName = "Originate Test Online";
		testDescription = "Originate Test Online Flow";
		authors = "Hari";
		category = "Regression";

	}
}
