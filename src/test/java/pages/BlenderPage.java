package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import base.ProjectSpecificationMethods;

public class BlenderPage extends ProjectSpecificationMethods {
	
	SoftAssert sassert = new SoftAssert();
	
	public BlenderPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[text()='Bella Pro Series - Precision Max Performance Blender - Black'])[1]") WebElement ChooseBlender;
	@FindBy(xpath="//button[@data-button-state='ADD_TO_CART']") WebElement AddToCartButton;
	@FindBy(xpath="//a[text()='Go to Cart']") WebElement GoToCartClick;
	
	public void selectBlender()
	{
		ChooseBlender.click();
		String expected ="Bella Pro Series Precision Max Performance Blender Black 90200 - Best Buy";
		String actual=driver.getTitle();
		sassert.assertEquals(actual, expected);
		sassert.assertAll();
	}
	
	public void clickAddToCart()
	{
		AddToCartButton.click();
	}
	
	public void clickGoToCart() throws IOException
	{
		GoToCartClick.click();
		String expected = "Cart - Best Buy";
		String actual = driver.getTitle();
		//TakeScreenshot("BlenderAddedToCart");
		sassert.assertEquals(actual, expected);
		sassert.assertAll();
	}

}
