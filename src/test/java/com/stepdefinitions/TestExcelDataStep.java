package com.stepdefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.qa.util.ExcelReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class TestExcelDataStep {

	@When("Sheet name is {string} and row number is {string}")
	public void sheet_name_is_and_row_number_is(String sheetname, String rowno)
			throws InvalidFormatException, IOException {
		System.out.println(sheetname);
		System.out.println(rowno);

		ExcelReader excelReader = new ExcelReader();
		List<Map<String, String>> testData = excelReader.getData(
				"C:\\Users\\balaji.d\\eclipse-workspace\\CucumberPOMSeries\\testData\\testdata.xlsx", sheetname);
		String testcase = testData.get(Integer.parseInt(rowno)).get("testCases");
		String Data1 = testData.get(Integer.parseInt(rowno)).get("Data1");
		String Data2 = testData.get(Integer.parseInt(rowno)).get("Data2");
		String Data3 = testData.get(Integer.parseInt(rowno)).get("Data3");
		System.out.println(testcase + "  " + Data1 + "  " + " " + Data2 + " " + Data3);

	}

	@Given("Display site")
	public void display_site() {
		System.out.println("Display site");
	}

}
