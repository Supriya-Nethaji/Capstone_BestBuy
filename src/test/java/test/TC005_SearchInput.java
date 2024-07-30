package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.HomePage;
import pages.MobilePage;

public class TC005_SearchInput extends ProjectSpecificationMethods
{

	public HomePage obj; 
	public MobilePage obj1;
	
	@BeforeTest
	public void setUp()
	{
		sheetnum = 3;
	}
	
	@Test(dataProvider = "Data")
	public void SearchInputTest(String SearchInput,String Type) throws Exception{
		
		obj = new HomePage(driver);
		obj.clickUnitedStates();
		obj.clickSearchInput(SearchInput,Type);
	}
	
	@Test(dataProvider = "Data")
	public void SelectMobileTest(String SearchInput,String Type) throws Exception
	{
		obj = new HomePage(driver);
		obj1 = new MobilePage(driver);
		obj.clickUnitedStates();
		obj.clickSearchInput(SearchInput,Type);
		obj1.clickSelectMobile();
	}
	
	@Test(dataProvider = "Data")
	public void AddToCartTest(String SearchInput,String Type)throws Exception
	{
		obj = new HomePage(driver);
		obj1 = new MobilePage(driver);
		obj.clickUnitedStates();
		obj.clickSearchInput(SearchInput,Type);
		obj1.clickSelectMobile();
		obj1.clickAddToCart();
	}
	
	@Test(dataProvider = "Data")
	public void GoToCartTest(String SearchInput,String Type) throws Exception
	{
		if(Type.equalsIgnoreCase("valid"))
		{
		obj = new HomePage(driver);
		obj1 = new MobilePage(driver);
		obj.clickUnitedStates();
		obj.clickSearchInput(SearchInput,Type);
		obj1.clickSelectMobile();
		obj1.clickAddToCart();
		obj1.clickGoToCart();
		} else if(Type.equalsIgnoreCase("invalid"))
		{
			obj = new HomePage(driver);
			obj1 = new MobilePage(driver);
			obj.clickUnitedStates();
			obj.clickSearchInput(SearchInput,Type);
		}
	}
}
