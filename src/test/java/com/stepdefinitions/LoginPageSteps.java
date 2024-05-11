package com.stepdefinitions;

import org.testng.Assert;

import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {
	
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	private static String actualTitle;

@Given("user is on login page")
public void user_is_on_login_page() {
   DriverFactory.getDriver().get("http://stock.scriptinglogic.org/");
}

@When("user gets the title of the page")
public void user_gets_the_title_of_the_page() {
	actualTitle  = loginPage.getLoginTitle();
	System.out.println("Login page title is " + actualTitle);
}

@Then("page title should be {string}")
public void page_title_should_be(String expectedTitleName) {
	Assert.assertTrue(actualTitle.contains(expectedTitleName));
}

@Then("forgot your password link should  be displayed")
public void forgot_your_password_link_should_be_displayed() {
    Assert.assertTrue(loginPage.isForgotPwdLinkExist());
}

@When("user enters username {string}")
public void user_enters_username(String uname) {
  loginPage.enterUserName(uname);
}

@When("user enters password {string}")
public void user_enters_password(String pname) {
	loginPage.enterPassword(pname); 
}

@When("user clicks in Login button")
public void user_clicks_in_login_button() {
  loginPage.clickOnLogin();
}


}
