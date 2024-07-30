package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.HomePage;

public class BottomLinks extends ProjectSpecificationMethods{
	
	public HomePage obj;
	
	@Test
	public void Accessibility() throws Exception
	{
		obj = new HomePage(driver);
		obj.clickUnitedStates();
		obj.clickAccessibility();	
	}
	
	@Test
	public void TermsAndConditions() throws Exception
	{
		obj = new HomePage(driver);
		obj.clickUnitedStates();
		obj.clickTerms();
	}
	
	@Test
	public void Privacy()throws Exception
	{
		obj = new HomePage(driver);
		obj.clickUnitedStates();
		obj.clickPrivacy();
	}
	
	@Test
	public void InterestBasedAds()throws Exception
	{
		obj = new HomePage(driver);
		obj.clickUnitedStates();
		obj.clickInterestBasedAds();
	}
	
	@Test
	public void StatePrivacyRights()throws Exception
	{
		obj = new HomePage(driver);
		obj.clickUnitedStates();
		obj.clickStatePrivacyRights();	
	}
	
	@Test
	public void HealthDataPrivacy()throws Exception
	{
		obj = new HomePage(driver);
		obj.clickUnitedStates();
		obj.clickHealthDataPrivacy();
	}
	
	@Test
	public void DoNotSell()throws Exception
	{
		obj = new HomePage(driver);
		obj.clickUnitedStates();
		obj.clickDoNotSell();
	}
	
	@Test
	public void LimitUse()throws Exception
	{
		obj = new HomePage(driver);
		obj.clickUnitedStates();
		obj.clickLimitUse();
	}
	
	@Test
	public void TargetAds()throws Exception
	{
		obj = new HomePage(driver);
		obj.clickUnitedStates();
		obj.clickTargetAds();
	}
	
	@Test
	public void CaSupplyChain()throws Exception
	{
		obj = new HomePage(driver);
		obj.clickUnitedStates();
		obj.clickCaSupplyChain();
	}
	
	
	
	
}
