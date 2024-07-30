package test;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.HomePage;
import pages.LoginPage;

public class Login extends ProjectSpecificationMethods{
	
	@BeforeTest
	public void setUp()
	{
		sheetnum = 1;
	}
	
	@Test(dataProvider ="Data")
	public void Login(String email, String Pwd, String type, String Fname) throws InterruptedException, IOException 
	{
		HomePage obj = new HomePage(driver);
		
		obj.clickUnitedStates();
		obj.clickAccountLink();
		obj.clickSignIn();
		
		LoginPage obj1 = new LoginPage(driver);
		
		obj1.enterLoginEmail(email);
		obj1.enterLoginPassword(Pwd);
		obj1.clickSignInButton();
		obj1.LoginValidation(type, Fname);

	}

}
