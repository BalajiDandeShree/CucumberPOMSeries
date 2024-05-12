package testrunners;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features = {"src/test/resources/AppFeatures/TestExcelData.feature"},
glue= {"com/stepdefinitions"},
plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","timeline:test-output-thread/"}
)
public class TestExcelDataRunner extends AbstractTestNGCucumberTests{
	@Override
	@DataProvider(parallel = true)
	public  Object[][] scenarios(){
		
		return super.scenarios();
		
	}

}
