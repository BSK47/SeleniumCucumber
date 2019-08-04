package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//h3/a[text()='Add Customer']")
	private WebElement AddCustomer;
	
	@FindBy(how = How.XPATH, using = "//h3/a[text()='Add Tariff Plan to Customer']")
	private WebElement AddTariffPlanToCustomer;
	
	@FindBy(how = How.XPATH, using = "//h3/a[text()='Add Tariff Plan']")
	private WebElement AddTariffPlan;
	
	@FindBy(how = How.XPATH, using = "//h3/a[text()='Pay Billing']")
	private WebElement PayBilling;
	
	public void clickAddCustomer() {
		System.out.println(AddCustomer.getText());
		AddCustomer.click();
	}
	
	public void clickAddTariffPlanToCustomer() {
		AddTariffPlanToCustomer.click();
	}
	
	public void clickAddTariffPlan() {
		AddTariffPlan.click();
	}
	
	public void clickPayBilling() {
		PayBilling.click();
	}
}
