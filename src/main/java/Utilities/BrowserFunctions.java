package Utilities;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFunctions {
	WebDriver driver;
	
	public WebDriver Browserdriver() {
		return this.driver;
	}
	
	public void launchBrowser(WebDriver driver, String appName) {
		File file = new File("Resources/chromedriver");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());					
		driver= new ChromeDriver();					
		driver.manage().window().maximize();
		if(appName.equals("tours"))
			driver.get("http://demo.guru99.com/test/newtours/");
		else if(appName.equals("telecom"))
			driver.get("http://demo.guru99.com/telecom/index.html");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	}
	
	public void quitBrowser(WebDriver driver) {
		driver.quit();
	}
}
