package test;

import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.HomePage;

public class AllMenu extends ProjectSpecificationMethods {
	@Test
	public void AllMenuValidation() throws Exception
	{
		HomePage obj = new HomePage(driver);
		
		obj.clickUnitedStates();
		obj.ClickTopDeals();
		obj.clickDealOfTheDay();
		obj.clickYesBestBuySellsThat();
		obj.clickMyBestBuyMemberships();
		obj.clickCreditCards();
		obj.clickBackToSchool();
		obj.clickMore();
	}

}
