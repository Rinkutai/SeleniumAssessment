package com.TestLayer;




import org.testng.Assert;
import org.testng.annotations.Test;

import com.PageLayer.BAse;

import com.PageLayer.Pages;



public class TestScript extends BAse {

	//WebDriver driver;
	Pages h;
	
	
	@Test
     //Validate Presence of Home page
	public void validateHomePage() throws Exception
	{
		 h = new Pages();
		
		
	 h.popUp();
	 h.updateciTy();
	String actual = h.HomePageTitle();
	String expected ="Online Pharmacy India | Buy Medicines from India's Trusted Medicine Store: 1mg.com";
	Assert.assertEquals(actual,expected);
	
	}
	//Select last item 
		@Test 
		public void Feature() throws Exception
		{
			h = new Pages();
			h.popUp();
			h.updateciTy();
			h.arroW();
		    h.lastP();
			h.clickonPOB();
			Thread.sleep(2000);
            h.AddtoCart();
            h.caRT();
            boolean result = h.DescriptioN();
            Assert.assertTrue(result);
            System.out.println("Item is added in cart Successfully");
		}
	
}
