package pages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import base.ProjectSpecificationMethods;

public class HomePage extends ProjectSpecificationMethods 
{
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	SoftAssert sassert = new SoftAssert();
	Actions act = new Actions(driver);
	
	public HomePage(WebDriver driver)
	{
		this.driver =  driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className="us-link") WebElement UnitedStates;
	@FindBy(xpath="//span[text()='Account']") WebElement AccountLink;
	@FindBy(xpath="//a[text()='Create Account']") WebElement CreateAccClick;
	@FindBy(xpath="//a[@data-lid='ubr_mby_signin_b']") WebElement SignInButtonClick;
	@FindBy(xpath="//a[text()='Top Deals']") WebElement TopDealsMenu;
	@FindBy(xpath="//a[text()='Deal of the Day']") WebElement DealOfTheDay;
	@FindBy(xpath="//a[text()='Yes, Best Buy Sells That']") WebElement YesBestBuySellsThat;
	@FindBy(xpath="(//a[text()='My Best Buy Memberships'])[1]") WebElement MyBestBuyMemberships;
	@FindBy(xpath="//a[text()='Credit Cards']") WebElement CreditCards;
	@FindBy(xpath="//span[text()='Back to School']") WebElement BackToSchool;
	@FindBy(xpath="//a[text()='Back to School Deals']") WebElement BackToSchoolDeals;
	@FindBy(xpath="//span[text()='More']") WebElement MoreMenu;
	@FindBy(xpath="(//a[text()='Gift Ideas'])[1]") WebElement GiftIdeas;
	@FindBy(xpath="//a[text()='Accessibility']") WebElement Accessibility;
	@FindBy(xpath="//a[text()='Terms & Conditions']") WebElement Terms;
	@FindBy(xpath="//a[text()='Privacy']") WebElement Privacy;
	@FindBy(xpath="//a[text()='Interest-Based Ads']") WebElement InterestBasedAds;
	@FindBy(xpath="//a[text()='State Privacy Rights']") WebElement StatePrivacyRights;
	@FindBy(xpath="//a[text()='Health Data Privacy']") WebElement HealthDataPrivacy;
	@FindBy(xpath="//a[text()='Do Not Sell/Share My Personal Information']") WebElement DoNotSell;
	@FindBy(xpath="//a[text()='Limit Use of My Sensitive Personal Information']") WebElement LimitUse;
	@FindBy(xpath="//a[text()='Targeted Advertising Opt Out']") WebElement TargetAds;
	@FindBy(xpath="//a[text()='CA Supply Chain Transparency Act']") WebElement CaSupplyChain;
	@FindBy(id="gh-search-input") WebElement searchInputBox;
	@FindBy(className="header-search-icon") WebElement SearchIcon;
	@FindBy(xpath="//nav[@class='hamburger-menu']") WebElement MainMenu;
	@FindBy(xpath="//button[text()='Appliances']") WebElement Appliances;
	@FindBy(xpath="//button[text()='Small Kitchen Appliances']") WebElement SmallKitchenAppliances;
	@FindBy(xpath="//a[text()='Blenders & Juicers']") WebElement Blender;
	@FindBy(xpath="//p[text()='Try a different search term or check out some of our suggestions below.']") WebElement searchmessage;
	@FindBy(xpath="//button[text()='Brands']") WebElement Brands;
	@FindBy(xpath="//a[text()='Sony']") WebElement Sony;
	
	public HomePage clickUnitedStates()
	{
		wait.until(ExpectedConditions.visibilityOf(UnitedStates));
		UnitedStates.click();
		return new HomePage(driver);
	}
	
	public HomePage clickAccountLink()
	{
		AccountLink.click();
		return this; 
	}
	
	public CreateAccountPage clickCreateAccount()
	{
		CreateAccClick.click();
		return new CreateAccountPage(driver);
	}
	
	public LoginPage clickSignIn()
	{
		SignInButtonClick.click();
		return new LoginPage(driver);
	}
	
	//AllMenu
	public void ClickTopDeals() throws Exception
	{
		TopDealsMenu.click();
		String expected ="Top Deals and Featured Offers on Electronics - Best Buy";
		String actual = driver.getTitle();
		//TakeScreenshot("TopDeals");
		sassert.assertEquals(actual, expected);
		sassert.assertAll();
	}
	
	public void clickDealOfTheDay()throws Exception
	{
		DealOfTheDay.click();
		String expected ="Deal of the Day: Electronics Deals - Best Buy";
		String actual = driver.getTitle();
		//TakeScreenshot("DealOfTheDay");
		sassert.assertEquals(actual, expected);
		sassert.assertAll();
	}
	
	public void clickYesBestBuySellsThat() throws Exception
	{
		YesBestBuySellsThat.click();
		String expected ="Yes, Best Buy Sells That – Best Buy";
		String actual = driver.getTitle();
		//TakeScreenshot("BestBuySellsThat");
		sassert.assertEquals(actual, expected);
		sassert.assertAll();	
	}
	
	public void clickMyBestBuyMemberships() throws Exception
	{
		MyBestBuyMemberships.click();
		String expected ="My Best Buy Memberships";
		String actual = driver.getTitle();
		//TakeScreenshot("BBMemberships");
		sassert.assertEquals(actual, expected);
		sassert.assertAll();	
	}
	
	public void clickCreditCards()throws Exception
	{
		CreditCards.click();
		String expected ="Best Buy Credit Card: Rewards & Financing";
		String actual = driver.getTitle();
		//TakeScreenshot("creditCards");
		sassert.assertEquals(actual, expected);
		sassert.assertAll();	
	}
	
	public void clickBackToSchool() throws Exception
	{
		BackToSchool.click();
		act.moveToElement(BackToSchoolDeals).click().perform();
		String expected = "Top Deals on Back to School Tech - Student Discounts and Deals - Best Buy";
		String actual = driver.getTitle();
		//TakeScreenshot("BackToSchool");
		sassert.assertEquals(actual, expected);
		sassert.assertAll();
	}
	
	public void clickMore() throws Exception
	{
		MoreMenu.click();
		act.moveToElement(GiftIdeas).click().perform();
		String expected = "Gift Ideas 2024: Best Gifts to Give This Year - Best Buy";
		String actual=driver.getTitle();
		//TakeScreenshot("MoreOptions");
		sassert.assertEquals(actual, expected);
		sassert.assertAll();	
	}
	
	//Bottom Links
	public void clickAccessibility() throws Exception
	{
		act.moveToElement(Accessibility).click().perform();
		String expected="Accessibility - Best Buy";
		String actual=driver.getTitle();
		//TakeScreenshot("Accessibility");
		sassert.assertEquals(actual, expected);
		sassert.assertAll();	
	}
	
	public void clickTerms() throws Exception
	{
		act.moveToElement(Terms).click().perform();
		String expected = "BestBuy.com Terms and Conditions";
		String actual = driver.getTitle();
		//TakeScreenshot("terms");
		sassert.assertEquals(actual, expected);
		sassert.assertAll();	
	}
	
	public void clickPrivacy() throws Exception
	{
		act.moveToElement(Privacy).click().perform();
		String expected = "Privacy Policy Hub - Best Buy";
		String actual = driver.getTitle();
		//TakeScreenshot("privacy");
		sassert.assertEquals(actual, expected);
		sassert.assertAll();	;
	}
	
	public void clickInterestBasedAds() throws Exception
	{
		act.moveToElement(InterestBasedAds).click().perform();
		String expected = "Interest-Based Ads - Best Buy";
		String actual = driver.getTitle();
		//TakeScreenshot("InterestBasedAds");
		sassert.assertEquals(actual, expected);
		sassert.assertAll();		
	}
	
	public void clickStatePrivacyRights() throws Exception
	{
		act.moveToElement(StatePrivacyRights).click().perform();
		String expected = "State Privacy Rights - Best Buy";
		String actual = driver.getTitle();
		//TakeScreenshot("StatePrivacy");
		sassert.assertEquals(actual, expected);
		sassert.assertAll();		
	}
	
	public void clickHealthDataPrivacy() throws Exception
	{
		act.moveToElement(HealthDataPrivacy).click().perform();
		String expected = "Health Data Privacy Information - Best Buy";
		String actual = driver.getTitle();
		//TakeScreenshot("HealthData");
		sassert.assertEquals(actual, expected);
		sassert.assertAll();		
	}
	
	public void clickDoNotSell() throws Exception
	{
		act.moveToElement(DoNotSell).click().perform();
		String expected = "Start Request - Best Buy";
		String actual = driver.getTitle();
		//TakeScreenshot("DoNotSell");
		sassert.assertEquals(actual, expected);
		sassert.assertAll();		
	}
	
	public void clickLimitUse() throws Exception
	{
		act.moveToElement(LimitUse).click().perform();
		String expected = "Best Buy";
		String actual = driver.getTitle();
		//TakeScreenshot("LimitUse");
		sassert.assertEquals(actual, expected);
		sassert.assertAll();	
	}
	
	public void clickTargetAds() throws Exception
	{
		act.moveToElement(TargetAds).click().perform();
		String expected = "Start Request - Best Buy";
		String actual = driver.getTitle();
		//TakeScreenshot("TargetAds");
		sassert.assertEquals(actual, expected);
		sassert.assertAll();	
	}
	
	public void clickCaSupplyChain() throws Exception
	{
		act.moveToElement(CaSupplyChain).click().perform();
		String expected = "California Supply Chain Transparency Act - Best Buy";
		String actual = driver.getTitle();
		//TakeScreenshot("CASupplyChain");
		sassert.assertEquals(actual, expected);
		sassert.assertAll();	
	}
	
	//search-input box
	public MobilePage clickSearchInput(String searchInput,String Type) throws Exception
	{
		searchInputBox.sendKeys(searchInput);
		SearchIcon.click();
		if(Type.equalsIgnoreCase("valid"))
		{
		String expected = "mobiles - Best Buy";
		String actual=driver.getTitle();
		//TakeScreenshot("SearchPage_Mobiles");
		sassert.assertEquals(actual, expected);
		sassert.assertAll();
		} else if(Type.equalsIgnoreCase("invalid"))
		{
			String expected ="Try a different search term or check out some of our suggestions below.";
			System.out.println(searchmessage.getText());
			String actual = searchmessage.getText();
			//TakeScreenshot("InValidSearchInput");
			sassert.assertEquals(actual, expected);
			sassert.assertAll();
		}
	
		return new MobilePage(driver);
	}
	
	//MenuOptions(Shop By Department) 
	public BlenderPage ClickMainMenu()
	{
		MainMenu.click();
		Appliances.click();
		SmallKitchenAppliances.click();
		Blender.click();
		return new BlenderPage(driver);

	}
	
	//MenuOptions(Shop by brands
	public SonyPage clickBrands()
	{
		MainMenu.click();
		Brands.click();
		Sony.click();
		return new SonyPage(driver);
		
	}
	
	
}
