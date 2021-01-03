package com.crm.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.base.TestBase;

public class LoginPage extends TestBase {

	@FindBy (xpath="//input[@name='email']")
	WebElement Username;
	
	@FindBy (xpath="//input[@name='password']")
	WebElement Password;
	
    @FindBy(xpath="//div[@class='ui fluid large blue submit button']")
	WebElement Login;
    
    @FindBy(xpath="//a[@href='https://api.cogmento.com/register']")
	WebElement Singup;

    public LoginPage(){
		PageFactory.initElements(driver, this);
	}

    
    public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	
	public HomePage login(String un, String pwd) throws IOException{
		Username.sendKeys("akashmali5657@gmail.com");
		Password.sendKeys("Akash@123");
		Login.click();
		    
		return new HomePage();
	}
 
}
