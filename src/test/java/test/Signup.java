package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.CreateAccountPage;
import pages.HomePage;

public class Signup extends ProjectSpecificationMethods{

	@BeforeTest
	public void setUp()
	{
		sheetnum = 0;
	}
	
	@Test(dataProvider = "Data")
	public void Account(String fname, String lname,String email,String pwd, String confirmPwd,String mobile, String type) throws Exception 
	{
		HomePage obj = new HomePage(driver);
	
		obj.clickUnitedStates();
		obj.clickAccountLink();
		obj.clickCreateAccount();
		
		CreateAccountPage obj1 = new CreateAccountPage(driver);
		
		obj1.enterFirstName(fname);
		obj1.enterLastName(lname);
		obj1.enterEmail(email);
		obj1.enterPassword(pwd);
		obj1.enterConfirmPassword(confirmPwd);
		obj1.enterMobileNumber(mobile);
		obj1.clickCreateAccountButton();
		obj1.validation(fname, type);
	}

}
