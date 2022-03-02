package com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrandPage extends BAse {
	public BrandPage()
	{
		//this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[@id=\"category-container\"]/div[2]/div[2]/div[2]/div/div[2]/div[1]/div[8]/div/a/div[2]/div/img")
			WebElement POBPage;
	
	public void clickonPOB()
	{
		POBPage.click();
	}
}
