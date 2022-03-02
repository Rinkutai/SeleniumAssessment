package com.TestLayer;

import org.testng.annotations.Test;

import com.PageLayer.BAse;
import com.PageLayer.HomePAge;
import com.PageLayer.SignUpPage;

public class SignupPageTest extends BAse{

	
	
	HomePAge h;
	SignUpPage signuppage; 
	@Test
	public void signUp() throws Exception
	{
		h = new HomePAge();
		h.popUp();
		h.updateciTy();
		
		signuppage = h.signUP();
		signuppage.phoneNO();
	}
	
}
