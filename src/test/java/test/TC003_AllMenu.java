package test;

import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.HomePage;

public class TC003_AllMenu extends ProjectSpecificationMethods {
	
	public HomePage obj;
	@Test
	public void TopDealsValidation() throws Exception
	{
		obj= new HomePage(driver);
		obj.clickUnitedStates();
		obj.ClickTopDeals();
	}
	
	@Test
	public void DealsOfTheDayValidation() throws Exception
	{
		obj= new HomePage(driver);
		obj.clickUnitedStates();
		obj.clickDealOfTheDay();
	}
	
	@Test
	public void BBSellsValidation() throws Exception
	{
		obj= new HomePage(driver);
		obj.clickUnitedStates();
		obj.clickYesBestBuySellsThat();
	}

	@Test
	public void BBMembershipsValidation() throws Exception
	{
		obj= new HomePage(driver);
		obj.clickUnitedStates();
		obj.clickMyBestBuyMemberships();
	}
	
	@Test
	public void CreditCardsValidation() throws Exception
	{
		obj= new HomePage(driver);
		obj.clickUnitedStates();
		obj.clickCreditCards();
	}
	
	@Test
	public void BackToSchoolValidation() throws Exception
	{
		obj= new HomePage(driver);
		obj.clickUnitedStates();
		obj.clickBackToSchool();
	}
	
	@Test
	public void MoreOptionsValidation() throws Exception
	{
		obj= new HomePage(driver);
		obj.clickUnitedStates();
		obj.clickMore();
	}
}
