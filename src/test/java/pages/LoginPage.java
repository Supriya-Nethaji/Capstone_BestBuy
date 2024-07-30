package pages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import base.ProjectSpecificationMethods;

public class LoginPage extends ProjectSpecificationMethods{
	
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="fld-e")WebElement LoginEmail;
	@FindBy(id="fld-p1")WebElement LoginPwd;
	@FindBy(xpath="//button[@data-track='Sign In']") WebElement SignInButton;
	@FindBy(xpath="//div[text()='Sorry, something went wrong. Please try again.']") WebElement WelcomeUser;
	@FindBy(xpath="//p[text()='Please enter a valid email address.']") WebElement EmailErrorMsg;
	@FindBy(xpath="//p[text()='Please enter your password.']") WebElement PwdErrorMsg;
	@FindBy(xpath="//button[text()='Skip for now']") WebElement skipForNow;
	
	public LoginPage enterLoginEmail(String email)
	{
		LoginEmail.sendKeys(email);
		return this;
	}
	
	public LoginPage enterLoginPassword(String pwd)
	{
		LoginPwd.sendKeys(pwd);
		return this;
	}
	
	public void clickSignInButton() throws InterruptedException
	{
		SignInButton.click();
		Thread.sleep(3000);
	}
	
	public void LoginValidation(String Type,String fname) throws IOException
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		SoftAssert sassert = new SoftAssert();
		if(Type.equalsIgnoreCase("Valid"))
		{
			String expected ="Sorry, something went wrong. Please try again.";
			String actual= WelcomeUser.getText();
			//TakeScreenshot("ValidLogin");
			sassert.assertEquals(actual, expected);
			sassert.assertAll();
		}else if(Type.equalsIgnoreCase("EmailBlank"))
		{
			String expected ="Please enter a valid email address.";
			String actual= EmailErrorMsg.getText();
			//TakeScreenshot("InValidLogin_EmailBlank");
			sassert.assertEquals(actual, expected);
			sassert.assertAll();
		}else if(Type.equalsIgnoreCase("PwdBlank"))
		{
			String expected ="Please enter your password.";
			String actual= PwdErrorMsg.getText();
			//TakeScreenshot("InValidLogin_PwdBlank");
			sassert.assertEquals(actual, expected);
			sassert.assertAll();
		}else if(Type.equalsIgnoreCase("InvalidEmailPwd"))
		{
			String expected ="Sorry, something went wrong. Please try again.";
			String actual= WelcomeUser.getText();
			//TakeScreenshot("InValidLogin");
			sassert.assertEquals(actual, expected);
			sassert.assertAll();
		}
	}
	

}
