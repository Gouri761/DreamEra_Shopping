package com.ap.DreamERA.TestCases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ap.DreamERA.TestBase.TestBase;
import com.ap.DreamERA.Testpages.DashBoard;
import com.ap.DreamERA.Testpages.HomePage;
import com.ap.DreamERA.Testpages.Loginpage;

public class LoginPageTestCases extends TestBase{
 
	
	HomePage home;
	Loginpage login;
	DashBoard dash;
	
	public LoginPageTestCases()
	{
		super();
		PageFactory.initElements(driver,this);
	}
	 @BeforeMethod
	  void init()
	  {
		  Intilization();
		  home  = new HomePage();
		  login = new Loginpage();
		  dash = new DashBoard();
	  }
	  @AfterMethod
	  void teardown()
	  {
		  driver.quit();
	  }
	  @Test
	  void verify_Vaild_Login() throws InterruptedException
	  {
		  home.Click();
		  Thread.sleep(1000);
		  login.enterusername("username");
		  login.enterpassword("password");
		  login.clicklogin();
		  
		 // String expectedUser = dash.Loggedinuser();
		 // assertEquals(expectedUser, "Gouri");
	  }
}
