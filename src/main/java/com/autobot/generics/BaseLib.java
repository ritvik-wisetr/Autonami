package com.autobot.generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseLib 
{
	public final String plugin="Autonami";
	public WebDriver driver;
	
	@BeforeMethod
	@Parameters({"browser", "testurl"})
	
	public void setUp(String browserName, String url)
	{
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
			driver=new ChromeDriver();
			Reporter.log("Chrome Launched", true);
		}
		
		else if (browserName.equalsIgnoreCase("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver", "./exefiles/geckodriver.exe");
			driver=new FirefoxDriver();
			Reporter.log("Firefox Launched", true);	
		}
		
		else if (browserName.equalsIgnoreCase("internetexplorer")) 
		{
			System.setProperty("webdriver.ie.driver", "./exefiles/IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			Reporter.log("IE Launched", true);	
		}
		
		else if (browserName.equalsIgnoreCase("edge")) 
		{
			System.setProperty("webdriver.edge.driver", "./exefiles/msedgedriver.exe");
			driver=new EdgeDriver();
			Reporter.log("Edge Launched", true);	
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
		Reporter.log(url+" Url Navigated", true);
		
		WaitStatementLib.iSleep(3);
		
	}
	
	@AfterMethod

	public void tearDown(ITestResult result)
	{
		String scriptName = result.getMethod().getMethodName();
		
		if(result.isSuccess())
		{
			Reporter.log(scriptName+ " script is passed", true);
		}
		
		else
		{
			ScreenshotLib slib = new ScreenshotLib();
			slib.takeScreenshot(driver, scriptName);
			Reporter.log("Screenshot has been taken", true);
		}
		
//		driver.quit();
//		Reporter.log("Browser Closed", true);
	}

}
