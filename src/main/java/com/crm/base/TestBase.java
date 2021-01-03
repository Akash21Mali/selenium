package com.crm.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestBase {
	 public static WebDriver driver;
     public static Properties property;

      //To read property file
      public TestBase(){
			try
			{
				property = new Properties();
			FileInputStream FIT=new FileInputStream("C:\\Users\\Akash_Mali\\eclipse-workspace\\Selenium\\src\\main\\java\\com\\crm\\Configuration\\Configuration.properties");        
           
			property.load(FIT);
      } catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
   	   
      }
      
      
      //Multiple browser initialization.
	public static void Browserinit() {
		String BrowserName=property.getProperty("browser");
		
		if(BrowserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akash_Mali\\eclipse-workspace\\Selenium1\\Drivers\\chromedriver.exe");	
			driver = new ChromeDriver(); 
		}
		else if(BrowserName.equals("firefox")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akash_Mali\\eclipse-workspace\\Selenium1\\Drivers\\geckodriver.exe");	
			driver = new FirefoxDriver();  
		}
		
		//Maximize window
		driver.manage().window().maximize();
		
		//Delete All Cookies before hitting url
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(property.getProperty("url"));
		
	}
	
}
