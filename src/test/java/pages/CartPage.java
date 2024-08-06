package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificationMethods;

public class CartPage extends ProjectSpecificationMethods {
	
	//Constructor
	public CartPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Element locators
	@FindBy(xpath="//button[@data-track='Checkout - Top']") WebElement CheckOutButton;
	
	//methods
	public ContinueAsGuestPage clickCheckOutButton()
	{
		CheckOutButton.click();
		return new ContinueAsGuestPage(driver);
	}
	
	

}
