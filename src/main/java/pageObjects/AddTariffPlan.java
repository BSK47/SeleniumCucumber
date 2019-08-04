package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddTariffPlan {

	public AddTariffPlan(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//input[@name='rental']")
	private WebElement MonthlyRental;
	
	@FindBy(how = How.XPATH, using = "//input[@name='local_minutes']")
	private WebElement FreeLocalMinutes;
	
	@FindBy(how = How.XPATH, using = "//input[@name='inter_minutes']")
	private WebElement FreeInternationalMinutes;
	
	@FindBy(how = How.XPATH, using = "//input[@name='sms_pack']")
	private WebElement FreeSMSPack;
	
	@FindBy(how = How.XPATH, using = "//input[@name='minutes_charges")
	private WebElement LocalMinuteCharges;
	
	@FindBy(how = How.XPATH, using = "//input[@name='inter_charges']")
	private WebElement InternationalMinuteCharges;
	
	@FindBy(how = How.XPATH, using = "//input[@name='sms_charges']")
	private WebElement SMSCharges;
	
	@FindBy(how = How.XPATH, using = "//input[@name='submit']")
	private WebElement Submit;
	
	@FindBy(how = How.XPATH, using = "//input[@value='Reset']")
	private WebElement Reset;
	
	public void AddMonthlyRental(Integer monRental) {
		MonthlyRental.sendKeys(String.valueOf(monRental));
	}
	
	public void AddFreeLocalMin(Integer freeLocalMin) {
		FreeLocalMinutes.sendKeys(String.valueOf(freeLocalMin));
	}
	
	public void AddFreeInternationalMin(Integer freeInterMin) {
		FreeInternationalMinutes.sendKeys(String.valueOf(freeInterMin));
	}
	
	public void AddFreeSMSPack(Integer freeSMSPack) {
		FreeSMSPack.sendKeys(String.valueOf(freeSMSPack));
	}
	
	public void AddLocalMinCharges(Integer localMinuteCharges) {
		LocalMinuteCharges.sendKeys(String.valueOf(localMinuteCharges));
	}
	
	public void AddInternationalMinuteCharges(Integer interMinuteCharges) {
		InternationalMinuteCharges.sendKeys(String.valueOf(interMinuteCharges));
	}
	
	public void AddSMSCharges(Integer smsCharges) {
		SMSCharges.sendKeys(String.valueOf(smsCharges));
	}
	
	public void clickSubmit() {
		Submit.click();
	}
	
	public void clickReset() {
		Reset.click();
	}
}
