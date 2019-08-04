package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//input[@name='userName']")
	private WebElement UserName;
	
	@FindBy(how = How.XPATH, using = "//input[@name='password']")
	private WebElement Password;
	
	@FindBy(how = How.XPATH, using = "//input[@name='submit']")
	private WebElement SignIn;
}
