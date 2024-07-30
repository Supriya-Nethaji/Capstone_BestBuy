package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificationMethods;

public class ContinueAsGuestPage extends ProjectSpecificationMethods {
	
	public ContinueAsGuestPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[text()='Continue as Guest']") WebElement ContinueAsGuestButton;
	
	public CheckOutPage clickContinueAsGuest()
	{
		ContinueAsGuestButton.click();
		return new CheckOutPage(driver);
	}

}
