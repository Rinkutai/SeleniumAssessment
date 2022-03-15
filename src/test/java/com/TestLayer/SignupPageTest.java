package com.TestLayer;

import org.testng.annotations.Test;

import com.PageLayer.BAse;
import com.PageLayer.Pages;
import com.PageLayer.SignUpPage;

public class SignupPageTest extends BAse{

	
	
	Pages h;
	SignUpPage signuppage; 
	@Test
	public void signUp() throws Exception
	{
		h = new Pages();
		h.popUp();
		h.updateciTy();
		
		signuppage = h.signUP();
		signuppage.phoneNO();
	}
	
}
