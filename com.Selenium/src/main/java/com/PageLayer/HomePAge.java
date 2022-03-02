package com.PageLayer;


import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePAge extends BAse{
      
	
	
	//public  WebDriver driver;
	
	public HomePAge()
	{
		//this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//div[@class='style__close-icon___3FflV']")
	WebElement alert;
	
	@FindBy(xpath ="//div[text()='Cancel']")
	WebElement updateCity;
	
	////@FindBy(xpath ="//span[@class='style__close___1l-EN']")
	//WebElement alerT1;
	//signUp authentication
	@FindBy(xpath ="//span[text()='Sign Up']")
	WebElement signUp;
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/div[2]/div[2]/div/div/div/div[3]")
	WebElement Arrow;
	
	//Pick Last Product
	@FindBy(xpath = "//div[text()='Cetaphil']")
	WebElement lastProduct;
	
	public void popUp() throws Exception
	{	
		alert.click();
		Thread.sleep(5000);
	}
	public void updateciTy()
	{
		updateCity.click();
	}
	/*public void alerT()
	{
		alerT1.click();
	}*/
	public SignUpPage signUP()
	{
       signUp.click(); 
           return new SignUpPage();
	}
	public String HomePageTitle()
	{
		 String result = driver.getTitle();
		 return result;
	}
	public void arroW()
	{
		Arrow.click();
	}
	public BrandPage lastP()
	{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("window.scrollBy(0,500)");
		lastProduct.click();
		return new BrandPage();
		
	}
}
	

