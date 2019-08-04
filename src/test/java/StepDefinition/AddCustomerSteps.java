package StepDefinition;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utilities.BrowserFunctions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pageObjects.AddCustomer;
import pageObjects.HomePage;

public class AddCustomerSteps {
	BrowserFunctions bFunc = new BrowserFunctions();
	WebDriver driver = bFunc.Browserdriver();
	AddCustomer addCustomer = new AddCustomer(driver);
	HomePage homePage = new HomePage(driver);
	
	@When("^Provide the BackGround Check as \"(.*)\"$")
	public void provide_background_check(String backGroundCheckStatus) {
		if(backGroundCheckStatus.equals("Pending"))
			addCustomer.selectBackGroundCheck(false);
		else
			addCustomer.selectBackGroundCheck(true);
	}
	
	@When("^Provide the First Name as \"(.*)\"$")
	public void provide_the_first_name(String firstName) {
		addCustomer.fillFirstName(firstName);
	}
	
	@When("^Provide the Last Name as \"(.*)\"$")
	public void provide_the_last_name(String lastName) {
		addCustomer.fillLastName(lastName);
	}
	
	@When("^Provide the email id as \"(.*)\"$")
	public void provide_the_email_id(String emailID) {
		addCustomer.fillEmail(emailID);
	}
	
	@When("^Provide the mobile number as \"(.*)\"$")
	public void provide_the_mobile_number(String mobileNumber) {
		addCustomer.fillMobileNumber(mobileNumber);
	}
	
	@When("^Click \"(.*)\"$")
	public void click(String buttonName) {
		if(buttonName.equals("Submit"))
			addCustomer.clickSubmit();
		else if(buttonName.equals("Reset"))
			addCustomer.clickReset();
	}
	
	@Then("^Verify the customer Id is generated$")
	public void verify_customer_id() {
		Assert.assertEquals(false, addCustomer.getCustomerID().equals(""));
	}
}
