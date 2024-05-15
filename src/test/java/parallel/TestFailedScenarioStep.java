package parallel;

import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;

public class TestFailedScenarioStep {

	@Given("check the arithmetic expression")
	public void check_the_arithmetic_expression() {
		DriverFactory.getDriver().get("https://www.google.com/");
			}
}
