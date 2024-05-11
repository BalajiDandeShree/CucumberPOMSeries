package parallel;

import java.util.List;
import java.util.Map;

import org.testng.Assert;

import com.pages.DashBoardPage;
import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class DashBoardPageSteps {

	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	private DashBoardPage dashBoardPage;

	@Given("user has already logged in to application")
	public void user_has_already_logged_in_to_application(DataTable dataTable) {
		List<Map<String, String>> creadList = dataTable.asMaps();
		String userName = creadList.get(0).get("username");
		String password = creadList.get(0).get("password");
		DriverFactory.getDriver().get("http://stock.scriptinglogic.org/");
		dashBoardPage = loginPage.doLogin(userName, password);

	}

	@Given("user is on Dashboard page")
	public void user_is_on_dashboard_page() {
	String title=	dashBoardPage.getDashBoardPageTitle();
	System.out.println("Page title is " + title);
	}

	@Then("user gets dashboard section")
	public void user_gets_dashboard_section(DataTable dashboardOptions) {
	List<String> expectedOptions = 	dashboardOptions.asList();
	System.out.println("Expected lsit"+expectedOptions);
	List<String> actualOptionsList = dashBoardPage.getDashBoardHeaderList();
	Assert.assertTrue(expectedOptions.containsAll(actualOptionsList));
	
	}

	@Then("Dashboard section count should be {int}")
	public void dashboard_section_count_should_be(Integer count) {
		Assert.assertEquals(dashBoardPage.getDashBoardOptionsCount(), count);

	}
}
