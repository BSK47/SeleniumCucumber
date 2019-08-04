package StepDefinition;

import org.openqa.selenium.WebDriver;

import Utilities.BrowserFunctions;
import cucumber.api.java.en.When;
import pageObjects.HomePage;

public class HomePageSteps {
	
	BrowserFunctions bFunc = new BrowserFunctions();
	WebDriver driver = bFunc.Browserdriver();
	
	HomePage homePage = new HomePage(driver);
	
	@When("^Click the Add Customer link$")
	public void click_add_customer_link() {
		homePage.clickAddCustomer();
	}
}
