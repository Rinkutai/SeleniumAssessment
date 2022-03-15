package com.PageLayer;


import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeSuite;

import Utility.Takescreenshot;
import io.github.bonigarcia.wdm.WebDriverManager;
//import org.testng.annotations.BeforeSuite;

public class BAse {
  public static WebDriver driver;
	@SuppressWarnings("deprecation")
	@BeforeClass
	public  void testBrowser()
	{
		//System.setProperty("webdriver.chrome.driver","/Users/rinkutaidatkhile/Downloads/chromedriver");
		WebDriverManager.chromedriver().setup();
		 // driver=new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		 driver = new ChromeDriver(options);
	   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.1mg.com/");
		
}
	@AfterClass
	public void tearDown(ITestResult result) {
		  if(result.FAILURE==result.getStatus())
		  {
			  Takescreenshot.screenShot(driver, result.getName());
		  }
		  //driver.close();
		 }
	
}