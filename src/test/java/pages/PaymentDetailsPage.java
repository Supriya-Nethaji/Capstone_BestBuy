package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import base.ProjectSpecificationMethods;

public class PaymentDetailsPage extends ProjectSpecificationMethods{
	
	SoftAssert sassert = new SoftAssert();
	
	//Constructor
	public PaymentDetailsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Element locators
	@FindBy(id="number") WebElement CardNumber;
	@FindBy(id="expirationDate") WebElement ExpirationDate;
	@FindBy(id="cvv") WebElement CVV;
	@FindBy(id="first-name") WebElement Firstname;
	@FindBy(id="last-name") WebElement Lastname;
	@FindBy(id="address-input") WebElement AddressLine1;
	@FindBy(id="city") WebElement City;
	@FindBy(id="state") WebElement State;
	@FindBy(id="postalCode") WebElement PostalCode;
	@FindBy(xpath="//span[text()='Place Your Order']") WebElement PlaceYourOrderButton;
	@FindBy(xpath="//span[text()='Unfortunately, we were unable to process your credit card. Please try again or use a different card to continue "
			+ "with your order. For questions regarding your credit card, please contact your bank.']") WebElement FinalMesg;
	@FindBy(xpath="//p[text()='Please enter a valid expiration date.']") WebElement ExpdateError;
	@FindBy(xpath="//p[text()='Please enter a valid Security Code.']") WebElement CvvError;
	@FindBy(xpath="//p[text()='Please enter a valid card number.']") WebElement CardError;
	@FindBy(xpath="//p[text()='Please enter a first name.']") WebElement FnameError;
	
	//Methods
	public void enterCardNumber(String cardNum)
	{
		CardNumber.sendKeys(cardNum);
	}
	
	public void enterExpDate(String exp)
	{
		ExpirationDate.sendKeys(exp);
	}

	public void enterCvv(String cvvCode)
	{
		CVV.sendKeys(cvvCode);
	}

	public void enterFirstName(String fname)
	{
		Firstname.sendKeys(fname);
	}

	public void enterLastName(String lname)
	{
		Lastname.sendKeys(lname);
	}

	public void enterAddress(String addr)
	{
		AddressLine1.sendKeys(addr);
	}

	public void enterCity(String city)
	{
		City.sendKeys(city);
	}

	public void enterState(String state)
	{
		State.sendKeys(state);
	}
	
	public void enterPostalCode(String postalCode)
	{
		PostalCode.sendKeys(postalCode);
	}

	public void PlaceOrderValidation(String type)
	{
		PlaceYourOrderButton.click();
		if(type.equalsIgnoreCase("valid"))
		{
			String expected = "Unfortunately, we were unable to process your credit card. Please try again or use a different "
					+ "card to continue with your order. For questions regarding your credit card, please contact your bank.";
			String actual = FinalMesg.getText();
			sassert.assertEquals(actual, expected);
			sassert.assertAll();
		}else if(type.equalsIgnoreCase("InvalidCard"))
		{
			String expected = "Please enter a valid card number.";
			String actual = CardError.getText();
			sassert.assertEquals(actual, expected);
			sassert.assertAll();
		}else if(type.equalsIgnoreCase("InvalidCvv"))
		{
			String expected = "Please enter a valid Security Code.";
			String actual = CvvError.getText();
			sassert.assertEquals(actual, expected);
			sassert.assertAll();
		}else if(type.equalsIgnoreCase("BlankFnameLname"))
		{
			String expected = "Please enter a first name.";
			String actual = FnameError.getText();
			sassert.assertEquals(actual, expected);
			sassert.assertAll();
		}
		
	}
	
	
	
	
	
	
	

}
