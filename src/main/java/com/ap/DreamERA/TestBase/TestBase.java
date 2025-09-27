package com.ap.DreamERA.TestBase;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestBase {
 
	public static Properties prop;
	public static WebDriver driver;
	
	public TestBase()
	{
		try
		{
			prop = new Properties();
			FileInputStream fis = new FileInputStream("C:\\Users\\DELL 3410\\eclipse-workspace\\Com.ap.DreamERA\\src\\main\\java\\com\\ap\\DreamERA\\Config\\Config.Properties");
			prop.load(fis);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	
		public void Intilization()
		{
			String browesrname = prop.getProperty("browser");
			if(browesrname.equals("chrome"))
			{
				driver = new ChromeDriver();
				
			}
			else
			{
				driver = new EdgeDriver();
			}
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(prop.getProperty("url"));
		}
	
}
