package test;

import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.HomePage;
import pages.SonyPage;

public class TC007_ShopByBrands extends ProjectSpecificationMethods {
	
	public HomePage obj;
	public SonyPage obj1;
	
	@Test
	public void ShopByBrandsTest() throws Exception
	{
		obj = new HomePage(driver);
		
		obj.clickUnitedStates();
		obj.clickBrands();
		
		obj1 = new SonyPage(driver);
		
		obj1.clickSonyCameras();
		obj1.clickMirrorlessCameras();
		obj1.SelectCamera();
		obj1.clickAddToCart();
		obj1.clickGoToCart();
		
	}

}
