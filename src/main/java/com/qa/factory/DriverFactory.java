package com.qa.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;


public class DriverFactory {
public WebDriver driver;
public static ThreadLocal <WebDriver> tlDriver = new ThreadLocal<>();
/**
 * 
 * @param browser
 */

public WebDriver init_driver(String browser) {
	if(browser.equals("chrome")) {
		tlDriver.set(new ChromeDriver());
	}else if(browser.equals("firefox")) {
		tlDriver.set(new FirefoxDriver());
	}else if(browser.equals("safari")) {
		tlDriver.set(new SafariDriver());
	}else if(browser.equals("edge")) {
		tlDriver.set(new EdgeDriver());
	}else {
		System.out.println("Please pass the correct driver value : "+ browser);
	}
	getDriver().manage().deleteAllCookies();
	getDriver().manage().window().maximize();
	return getDriver();
}
/**
 * this is used to get the driver with ThreadLocal
 * @return
 */
public static synchronized  WebDriver getDriver() {
	 return tlDriver.get();
}
}
