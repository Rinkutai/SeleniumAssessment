package com.PageLayer;



import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pages extends BAse{
      
	
	
	//public  WebDriver driver;
	
	public Pages()
	{
		//this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//div[@class='style__close-icon___3FflV']")
	WebElement alert;
	
	@FindBy(xpath ="//div[text()='Cancel']")
	WebElement updateCity;
	
	//signUp authentication
	@FindBy(xpath ="//span[text()='Sign Up']")
	WebElement signUp;
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/div[2]/div[2]/div/div/div/div[3]")
	WebElement Arrow;
	
	//Pick Last Product
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/div[2]/div[2]/div/div/div/div[2]/div/div[9]/div/div/div/a/div[1]/div/img")
	WebElement lastProduct;
	@FindBy(xpath = "//*[@id=\"category-container\"]/div[2]/div[2]/div[2]/div/div[2]/div[1]/div[1]/div/a/div[1]/div/img")
	WebElement POBPage;
    @FindBy(xpath = "//div[@class='style__interaction___3cb12']")
    WebElement addtC;
     @FindBy(xpath ="//*[@id=\"header\"]/div[4]/div[2]/div/div[3]/div/div")
    WebElement carT;
     @FindBy(xpath ="//*[@id=\"container\"]/div/div/div/div/div/div/div[3]/div/div[3]/div[2]/div[1]/div/div/div[2]/div/div[1]/div[1]/div[1]")
    WebElement desC;

	public void popUp() throws Exception
	{	
		alert.click();
		Thread.sleep(5000);
	}
	public void updateciTy()
	{
		updateCity.click();
	}
	
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
	public void lastP()
	{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("window.scrollBy(0,400)");
		lastProduct.click();
		
	}
	public void clickonPOB()
	{
	POBPage.click();
	}
	public void AddtoCart()
	{
	addtC.click();
	}
	public void caRT()
	{
	carT.click();
	}
	public boolean DescriptioN()
	{
	return desC.isDisplayed();
	}
}
	

