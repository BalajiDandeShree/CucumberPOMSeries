package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashBoardPage {
	private WebDriver driver;
	private By dashBoardSection = By.xpath("//ul[@id='tabs']//a");
	private List<WebElement> options;
	private List<String> dashBoardList = new ArrayList<String>();

	public DashBoardPage(WebDriver driver) {
		this.driver = driver;
	}

	public int getDashBoardOptionsCount() {
		options = driver.findElements(dashBoardSection);
		return options.size();
	}

	public List<String> getDashBoardHeaderList() {
		options = driver.findElements(dashBoardSection);
		for (WebElement e : options) {
			dashBoardList.add(e.getText());
			System.out.println(e.getText());
		}
		return dashBoardList;
	}
	public String getDashBoardPageTitle() {
		return driver.getTitle();
	}
}
