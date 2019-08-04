package StepDefinition;		

import java.io.File;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;		

import cucumber.api.java.en.Given;		
import cucumber.api.java.en.Then;		
import cucumber.api.java.en.When;		

public class Steps {				

    WebDriver driver;		

    @When("^Enter the Username and Password$")					
    public void enter_the_Username_and_Password() throws Throwable 							
    {		
       driver.findElement(By.name("uid")).sendKeys("username12");							
       driver.findElement(By.name("password")).sendKeys("password12");							
    }		
    
    @When("^Enter the Username \"(.*)\" and Password \"(.*)\"$")			
    public void enter_the_Username_and_Password(String username,String password) throws Throwable 							
    {		
       driver.findElement(By.name("uid")).sendKeys(username);					
       driver.findElement(By.name("password")).sendKeys(password);					
    }

    @Then("^Reset the credential$")					
    public void Reset_the_credential() throws Throwable 							
    {		
       driver.findElement(By.name("btnReset")).click();
       driver.close();
    }		
}	