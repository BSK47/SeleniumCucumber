package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddTariffToCustomer {
	public AddTariffToCustomer(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//input[@name='customer_id']")
	private WebElement CustomerID;
	
	@FindBy(how = How.XPATH, using = "//input[@value='submit']")
	private WebElement Submit;
	
	@FindBy(how = How.XPATH, using = "//td[./input[@name='tariff_plan']/label")
	private WebElement SelectTariffPlan;
	
	@FindBy(how = How.XPATH, using = "//input[@value='Add Tariff Plan to Customer']")
	private WebElement AddTariffPlanToCustomer;
	
	
}
