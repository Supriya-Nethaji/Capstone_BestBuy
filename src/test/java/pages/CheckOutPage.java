package pages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v125.page.model.Screenshot;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.asserts.SoftAssert;

import base.ProjectSpecificationMethods;

public class CheckOutPage extends ProjectSpecificationMethods {
	
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	SoftAssert sassert = new SoftAssert();
	
	
	private String fileName;
	public CheckOutPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="user.emailAddress") WebElement emailField;
	@FindBy(id="user.phone") WebElement phoneField;
	@FindBy(id="emailAddress") WebElement EmailErrorMsg;
	@FindBy(id="phone") WebElement PhoneErrorMsg;
	@FindBy(xpath="//span[text()='Request failed because of network connection']") WebElement Message;
	@FindBy(xpath="//span[text()='Continue to Payment Information']") WebElement ContinueToPaymentButton;
	
	public void enterEmailAddress(String email)
	{
		emailField.sendKeys(email);
	}
	
	public void enterPhone(String phone)
	{
		phoneField.sendKeys(phone);
	}
	
	public void CheckOutValidation(String Type) throws InterruptedException, IOException
	{
		ContinueToPaymentButton.click();
		if(Type.equalsIgnoreCase("valid"))
		{
			String expected="Request failed because of network connection";
			String actual = Message.getText();
			//TakeScreenshot("ValidCheckOut");
			sassert.assertEquals(actual, expected);
			sassert.assertAll();	
			
		}else if(Type.equalsIgnoreCase("InvalidEmail")|| Type.equalsIgnoreCase("InvalidData"))
		{
			String expected ="Please enter a valid email address.";
			String actual = EmailErrorMsg.getText();
			//TakeScreenshot("InvalidEmailCheckout");
			sassert.assertEquals(actual, expected);
			sassert.assertAll();	
		}else if(Type.equalsIgnoreCase("InvalidPhone"))
		{
			String expected ="Please enter a valid 10-digit phone number.";
			Thread.sleep(5000);
			wait.until(ExpectedConditions.visibilityOf(PhoneErrorMsg));
			String actual = PhoneErrorMsg.getText();
			//TakeScreenshot("InValidPhoneCheckOut");
			sassert.assertEquals(actual, expected);
			sassert.assertAll();	
		}
	}


}
