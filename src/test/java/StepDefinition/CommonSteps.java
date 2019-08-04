package StepDefinition;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utilities.BrowserFunctions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CommonSteps {

	BrowserFunctions bFunc = new BrowserFunctions();
	WebDriver driver = bFunc.Browserdriver();
	
	@Given("^Open the Chrome and launch the \"(.*)\" application$")					
    public void open_the_Chrome_and_launch_the_application(String appName) throws Throwable							
    {		
		bFunc.launchBrowser(driver, appName);
    }
	
	@Then("^Close the browser$")
	public void close_the_browser()
	{
		bFunc.quitBrowser(driver);
	}
}
