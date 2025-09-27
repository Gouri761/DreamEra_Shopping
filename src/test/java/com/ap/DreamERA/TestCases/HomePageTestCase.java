package com.ap.DreamERA.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ap.DreamERA.TestBase.TestBase;
import com.ap.DreamERA.Testpages.HomePage;

public class HomePageTestCase extends TestBase {
	
	HomePage home ;
public	HomePageTestCase()
	{
		super();
	}
  @BeforeMethod
  void init()
  {
	  Intilization();
  }
  @AfterMethod
  void teardown()
  {
	  driver.quit();
  }
  
  
}
