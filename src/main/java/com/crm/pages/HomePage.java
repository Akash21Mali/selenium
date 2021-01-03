package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.crm.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath ="//span[@class='user-display']")
	WebElement userDisplay;
	
	@FindBy(xpath ="//div[@class='ui navbar fixed main menu']")
	WebElement topHeader;
	
	@FindBy(xpath ="//a[@href='/contacts']")
	WebElement ContactTab;
	
	@FindBy(xpath ="//i[@class='money icon']")
	WebElement DealsTab;
}
