package test;

import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.BlenderPage;
import pages.HomePage;

public class TC006_ShopByDepartment extends ProjectSpecificationMethods {
	
	public HomePage obj;
	
	@Test
	public void ShopByDepttest() throws Exception
	{
		obj = new HomePage(driver);
		
		obj.clickUnitedStates();
		obj.ClickMainMenu();
		
		BlenderPage obj1= new BlenderPage(driver);
		
		obj1.selectBlender();
		obj1.clickAddToCart();
		obj1.clickGoToCart();

	}

}
