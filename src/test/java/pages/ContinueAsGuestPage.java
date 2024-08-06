package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificationMethods;

public class ContinueAsGuestPage extends ProjectSpecificationMethods {
	
	//Constructor
	public ContinueAsGuestPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Element locators
	@FindBy(xpath="//button[text()='Continue as Guest']") WebElement ContinueAsGuestButton;
	
	//Methods
	public CheckOutPage clickContinueAsGuest()
	{
		ContinueAsGuestButton.click();
		return new CheckOutPage(driver);
	}

}
