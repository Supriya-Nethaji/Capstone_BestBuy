package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import base.ProjectSpecificationMethods;

public class SonyPage extends ProjectSpecificationMethods {
	
	public Actions act = new Actions(driver);
	public SoftAssert sassert = new SoftAssert();
	
	public SonyPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Cameras']") WebElement SonyCameras;
	@FindBy(xpath="//a[text()='Mirrorless Cameras']") WebElement MirrorlessCameras;
	@FindBy(xpath="//a[text()='Sony - Alpha 6100 Mirrorless 4K Video Camera with E PZ 16-50mm Lens - Black']") WebElement chooseCamera;
	@FindBy(xpath="(//button[@data-button-state='ADD_TO_CART'])[4]") WebElement AddToCartButton;
	@FindBy(xpath="//a[text()='Go to Cart']") WebElement GoToCartButton;
	
	public SonyPage clickSonyCameras()
	{
		SonyCameras.click();
		return this;
	}

	public SonyPage clickMirrorlessCameras()
	{
		MirrorlessCameras.click();
		return this;
	}
	
	public void SelectCamera()
	{
		act.moveToElement(chooseCamera).click().perform();
	}
	
	public void clickAddToCart()
	{
		act.moveToElement(AddToCartButton).click().perform();
	}
	
	public CartPage clickGoToCart() throws IOException
	{
		GoToCartButton.click();
		String expected = "Cart - Best Buy";
		String actual = driver.getTitle();
		TakeScreenshot("CameraAddedInCart");
		sassert.assertEquals(actual, expected);
		sassert.assertAll();
		return new CartPage(driver);
	}
	
	
}
