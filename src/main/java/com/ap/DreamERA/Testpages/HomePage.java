package com.ap.DreamERA.Testpages;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.ap.DreamERA.TestBase.TestBase;

public class HomePage extends TestBase {
	public HomePage()
	{
		super();
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(xpath = "//a[normalize-space()='Signup / Login']")
	WebElement Login_Link ;
	
	public void Click()
	{
		Login_Link.click();
	}
}
