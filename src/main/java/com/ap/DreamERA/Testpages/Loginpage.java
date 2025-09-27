package com.ap.DreamERA.Testpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.ap.DreamERA.TestBase.TestBase;

public class Loginpage extends TestBase {
  
public Loginpage()
{
	super();
	PageFactory.initElements(driver,this);

}

@FindBy(xpath = "//input[@data-qa='login-email']")
WebElement userid ;


@FindBy(xpath = "//input[@placeholder='Password']")
WebElement password;

@FindBy(xpath = "//button[normalize-space()='Login']")
WebElement loginbutton;


public void enterusername(String uname)
{
	userid.sendKeys(uname);
}

public void enterpassword(String upassword)
{
	password.sendKeys(upassword);
}

public void clicklogin()
{
	loginbutton.click();
}
}
