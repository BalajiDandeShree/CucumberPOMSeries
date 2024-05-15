package com.stepdefinitions;

import io.cucumber.java.en.Given;

public class TestFailedScenarioStep {

	@Given("check the arithmetic expression")
	public void check_the_arithmetic_expression() {
	   System.out.println("Failed test scenario");
	}
}
