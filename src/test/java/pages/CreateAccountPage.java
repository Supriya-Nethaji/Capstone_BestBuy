package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import base.ProjectSpecificationMethods;

public class CreateAccountPage extends ProjectSpecificationMethods{
	
	//Constructor
	public CreateAccountPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	//Element locators
	@FindBy(id="firstName") WebElement FName;
	@FindBy(id="lastName") WebElement LName;
	@FindBy(id="email") WebElement Email;
	@FindBy(id="fld-p1") WebElement Password;
	@FindBy(id="reenterPassword") WebElement confirmPassword;
	@FindBy(id="phone") WebElement mobileNumber;
	@FindBy(xpath="//button[@data-track='Create Account']") WebElement CreateAccountButtonClick;
	@FindBy(xpath="//strong[text()='An account with this email already exists.']") WebElement SignUpErrorMessage;
	@FindBy(xpath="//p[text()='Passwords do not match.']") WebElement PwdErrorMsg;
	@FindBy(xpath="//p[text()='Please enter your first name.']") WebElement FNameErrorMsg;
	@FindBy(xpath="//p[text()='Please enter your last name.']") WebElement LNameErrorMsg;
	@FindBy(xpath="//p[text()='Please enter a valid email address.']") WebElement EmailErrorMsg;
	@FindBy(xpath="//span[contains(@class,'line-clamp')]") WebElement WelcomeUser;
	
	 //Methods
	public CreateAccountPage enterFirstName(String fname)
	{
		FName.sendKeys(fname);
		return this;
	}
	
	public CreateAccountPage enterLastName(String lname)
	{
		LName.sendKeys(lname);
		return this;
	}
	
	public CreateAccountPage enterEmail(String email)
	{
		Email.sendKeys(email);
		return this;
	}
	
	public CreateAccountPage enterPassword(String pwd)
	{
		Password.sendKeys(pwd);
		return this;
	}
	
	public CreateAccountPage enterConfirmPassword(String confirmPwd)
	{
		confirmPassword.sendKeys(confirmPwd);
		return this;
	}
	
	public CreateAccountPage enterMobileNumber(String mobile)
	{
		mobileNumber.sendKeys(mobile);
		return this;
	}
	
	public void clickCreateAccountButton()
	{
		CreateAccountButtonClick.click();
		
	}
	
	public void validation(String fname,String Type) throws Exception
	{
		SoftAssert sassert = new SoftAssert();
		if(Type.equalsIgnoreCase("Valid"))
		{
			String expected ="Hi, "+fname+"";
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.visibilityOf(WelcomeUser));
			String actual= WelcomeUser.getText();
			sassert.assertEquals(actual, expected);
			sassert.assertAll();
		}else if(Type.equalsIgnoreCase("UserExist"))
		{
			String expected="An account with this email already exists.";
			String actual= SignUpErrorMessage.getText();
			sassert.assertEquals(actual, expected);
			sassert.assertAll();
		}else if(Type.equalsIgnoreCase("PassDiff"))
		{
			String expected="Passwords do not match.";
			String actual= PwdErrorMsg.getText();
			sassert.assertEquals(actual, expected);
			sassert.assertAll();
		}else if(Type.equalsIgnoreCase("FnameBlank"))
		{
			String expected="Please enter your first name.";
			String actual= FNameErrorMsg.getText();
			sassert.assertEquals(actual, expected);
			sassert.assertAll();
		}else if(Type.equalsIgnoreCase("LnameBlank"))
		{
			String expected="Please enter your last name.";
			String actual= LNameErrorMsg.getText();
			sassert.assertEquals(actual, expected);
			sassert.assertAll();
		}else if(Type.equalsIgnoreCase("EmailBlank"))
		{
			String expected="Please enter a valid email address.";
			String actual= EmailErrorMsg.getText();
			sassert.assertEquals(actual, expected);
			sassert.assertAll();
		}
	}
		
}
