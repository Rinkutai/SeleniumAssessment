package com.TestLayer;

import org.testng.annotations.Test;

import com.PageLayer.BAse;
import com.PageLayer.BrandPage;
import com.PageLayer.HomePAge;

import Utility.Takescreenshot;

public class BrandPageTest extends BAse {
  HomePAge h;
  Takescreenshot  x;
  
  BrandPage brandpage;
	@Test 
	public void selectLP() throws Exception
	{
		h = new HomePAge();
		h.popUp();
		h.updateciTy();
		
		h.arroW();
		h.lastP();
		brandpage = h.lastP();
		brandpage.clickonPOB();
		
		
	}
	
	
	
}
