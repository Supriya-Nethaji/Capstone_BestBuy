package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import base.ProjectSpecificationMethods;

public class MobilePage extends ProjectSpecificationMethods 
{
	SoftAssert sassert= new SoftAssert();
	
	public MobilePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[text()='Boost Mobile - moto g play 2024 64GB Prepaid - Black'])[1]") WebElement selectMobile;
	@FindBy(xpath="(//button[@data-button-state='ADD_TO_CART'])[2]") WebElement AddToCart;	
	@FindBy(xpath="//a[text()='Go to Cart']") WebElement GoToCartButton;
	
	//select particular mobile
	public void clickSelectMobile()
	{
		selectMobile.click();
		String expected = "Boost Mobile moto g play 2024 64GB Prepaid Black MT24132BL64RB - Best Buy";
		String actual = driver.getTitle();
		sassert.assertEquals(actual, expected);
		sassert.assertAll();
	}
	
	//click on the add to cart button
	public void clickAddToCart()
	{
		AddToCart.click();
	}
	
	//To verify the product is added to cart (GoToCart after adding)
	public void clickGoToCart() throws InterruptedException, IOException
	{
		GoToCartButton.click();
		String expected = "Cart - Best Buy";
		String actual = driver.getTitle();
		TakeScreenshot("MobileAddedInCart");
		sassert.assertEquals(actual, expected);
		sassert.assertAll();
		
	}
}
