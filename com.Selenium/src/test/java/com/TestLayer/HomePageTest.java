package com.TestLayer;




import org.testng.Assert;
import org.testng.annotations.Test;

import com.PageLayer.BAse;

import com.PageLayer.HomePAge;



public class HomePageTest extends BAse {

	//WebDriver driver;
	HomePAge h;
	
	@Test
     //Validate Presence of Home page
	public void validateHomePage() throws Exception
	{
		 h = new HomePAge();
		
		
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
			h = new HomePAge();
			h.popUp();
			h.updateciTy();
			
			h.arroW();
			
			
		}
		
	
}
