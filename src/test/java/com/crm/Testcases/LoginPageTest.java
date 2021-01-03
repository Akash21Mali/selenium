package com.crm.Testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.base.TestBase;
import com.crm.pages.HomePage;
import com.crm.pages.LoginPage;

public class LoginPageTest extends TestBase{
	LoginPage LP;
	HomePage homepage;
	
	public LoginPageTest() {
		super();
	}
	
	
	@BeforeMethod
	public void in () {
		Browserinit();
		
		 LP=new LoginPage();
		
	}
	
	@Test(priority = 1)
	public void Titletest() throws InterruptedException {
		String Title = LP.validateLoginPageTitle();
		
		Assert.assertEquals(Title, "Cogmento CRM");
		Thread.sleep(5000);
	}
	
	@Test(priority = 2)
	public void LoginPage() throws IOException, InterruptedException {
		 homepage = LP.login(property.getProperty("username"),property.getProperty("password"));
			Thread.sleep(5000);

	}
	
	
	
	@AfterMethod
	public void out() {
		
		driver.quit();
	}
}
