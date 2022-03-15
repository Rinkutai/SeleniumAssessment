package com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage extends BAse {

	
	public SignUpPage()
	{
		//this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	//Phone Number Tab
	@FindBy(xpath ="//input[@class='style__input___3NmkT']")
	WebElement phoneNo;
	//Click on continue Button
	@FindBy(xpath = "//a[@class='button-text']")
	WebElement continueButton;
	//
	public void phoneNO()
	{
		phoneNo.sendKeys("8380951932");
		continueButton.click();
	}
	
}
	
