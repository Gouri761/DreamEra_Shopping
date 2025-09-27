package com.ap.DreamERA.Testpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.ap.DreamERA.TestBase.TestBase;

public class DashBoard extends TestBase {
	
	public DashBoard()
	{
		super();
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//b[normalize-space()='Gouri']")
	WebElement username;
	
	public String Loggedinuser()
	{
		String uname = username.getText();
		return uname;
	}
}
