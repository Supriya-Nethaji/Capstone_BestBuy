package base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utils.UtilityClass;

public class ProjectSpecificationMethods extends UtilityClass {
	
	//Browser launch
	@Parameters({"browser", "url"})
	@BeforeMethod
	public void LaunchBrowser(String browser, String url) throws Exception
	{
		browserLaunch(browser, url);
	}
	
	//reading data and storing in 2D array
	@DataProvider(name = "Data")
	public String[][] getData() throws Exception
	{
		String [] [] data = ReadExcel(sheetnum);
		return data;
	}
	
	
	//close browser instance
	@AfterMethod
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(5000);		
		driver.quit();
	}

}
