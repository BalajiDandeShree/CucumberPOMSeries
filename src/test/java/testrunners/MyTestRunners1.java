package testrunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/AppFeatures/DashBoardPage.feature"},
				glue= {"com/stepdefinitions","apphooks"},
				plugin = {"pretty",
						"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
                )
public class MyTestRunners1 extends AbstractTestNGCucumberTests{

	
	
}
