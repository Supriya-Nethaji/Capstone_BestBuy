package test;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.CartPage;
import pages.CheckOutPage;
import pages.ContinueAsGuestPage;
import pages.HomePage;
import pages.PaymentDetailsPage;
import pages.SonyPage;

public class TC009_Payment extends ProjectSpecificationMethods {
	
	@BeforeTest
	public void setUp()
	{
		sheetnum=4;
	}
	
	@Test(dataProvider = "Data")
	public void PaymentTest(String email, String phone,String type,String cardNum, String exp,String cvvCode,String fname,
							String lname, String addr, String city,String state, String PostalCode, String testType) throws InterruptedException, IOException
	{
		HomePage obj = new HomePage(driver);
		
		obj.clickUnitedStates();
		obj.clickBrands();
		
		SonyPage obj1 = new SonyPage(driver);
		
		obj1.clickSonyCameras();
		obj1.clickMirrorlessCameras();
		obj1.SelectCamera();
		obj1.clickAddToCart();
		obj1.clickGoToCart();
		
		CartPage obj2= new CartPage(driver);
		
		obj2.clickCheckOutButton();
		
		ContinueAsGuestPage obj3 = new ContinueAsGuestPage(driver);
		
		obj3.clickContinueAsGuest(); 
		
		CheckOutPage obj4 = new CheckOutPage(driver);
		
		obj4.enterEmailAddress(email);
		obj4.enterPhone(phone);
		obj4.CheckOutValidation(type);	
		
		PaymentDetailsPage obj5= new PaymentDetailsPage(driver);
		
		obj5.enterCardNumber(cardNum);
		obj5.enterExpDate(exp);
		obj5.enterCvv(cvvCode);
		obj5.enterFirstName(fname);
		obj5.enterLastName(lname);
		obj5.enterAddress(addr);
		obj5.enterCity(city);
		obj5.enterState(state);
		obj5.enterPostalCode(PostalCode);
		obj5.PlaceOrderValidation(testType);
		
	}


}
