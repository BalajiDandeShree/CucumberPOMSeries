package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	// 1. By Locators Object repository
	private WebDriver driver;
	private By userName = By.name("username");
	private By password = By.id("login-password");
	private By loginButton = By.xpath("//input[@name='submit']");
	private By forgotPWDLink = By.linkText("Forgot your password?");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public String getLoginTitle() {
		return driver.getTitle();
	}

	public boolean isForgotPwdLinkExist() {
		return driver.findElement(forgotPWDLink).isDisplayed();
	}

	public void enterUserName(String uname) {
		driver.findElement(userName).sendKeys(uname);
		
	}

	public void enterPassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}

	public void clickOnLogin() {
		driver.findElement(loginButton).click();
	}

	public DashBoardPage doLogin(String uname, String pwd) {
		System.out.println("Log in with " + uname + " =" + pwd);
		driver.findElement(userName).sendKeys(uname);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(loginButton).click();

		return new DashBoardPage(driver);

	}
}
