package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomer {
	public AddCustomer(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
//	286157
	
	@FindBy(how = How.XPATH, using = "//div[./input[@id='done']]/label")
	private WebElement BackgroundCheck_Done;
	
	@FindBy(how = How.XPATH, using = "//div[./input[@id='pending']]/label")
	private WebElement BackgroundCheck_Pending;
	
	@FindBy(how = How.XPATH, using = "//input[@id='fname']")
	private WebElement BillingAddress_FirstName;
	
	@FindBy(how = How.XPATH, using = "//input[@id='lname']")
	private WebElement BillingAddress_LastName;
	
	@FindBy(how = How.XPATH, using = "//input[@id='email']")
	private WebElement BillingAddress_Email;
	
	@FindBy(how = How.XPATH, using = "//input[@id='telephoneno']")
	private WebElement BillingAddress_MobileNumber;
	
	@FindBy(how = How.XPATH, using = "//input[@value='Submit']")
	private WebElement BillingAddress_Submit;
	
	@FindBy(how = How.XPATH, using = "//input[@value='Reset']")
	private WebElement BillingAddress_Reset;
	
	@FindBy(how = How.XPATH, using = "//section[@id='main']//h3")
	private WebElement CustomerID;
	
	public void selectBackGroundCheck(Boolean backGroundCheck) {
		if(backGroundCheck)
			BackgroundCheck_Done.click();
		else
			BackgroundCheck_Pending.click();
	}
	
	public void fillFirstName(String firstName) {
		BillingAddress_FirstName.sendKeys(firstName);
	}
	
	public void fillLastName(String lastName) {
		BillingAddress_LastName.sendKeys(lastName);
	}
	
	public void fillEmail(String emailID) {
		BillingAddress_Email.sendKeys(emailID);
	}
	
	public void fillMobileNumber(String mobileNumber) {
		BillingAddress_MobileNumber.sendKeys(mobileNumber);
	}
	
	public void clickSubmit()
	{
		BillingAddress_Submit.click();
	}
	
	public void clickReset()
	{
		BillingAddress_Reset.click();
	}
	
	public String getCustomerID()
	{
		return CustomerID.getText();
	}
	
	
}
