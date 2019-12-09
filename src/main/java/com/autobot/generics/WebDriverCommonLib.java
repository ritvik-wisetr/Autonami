package com.autobot.generics;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class WebDriverCommonLib 
{
	static boolean status;
//	WebDriver driver;
	
//	public WebDriverCommonLib(WebDriver driver)
//	{
//		this.driver=driver;
//	}

/**
 * @return ************************************************************************************/	
	
	public static void elementDisplay(String message, WebElement ele, WebDriver driver)
	{
		try 
		{
			if(ele.isDisplayed())
			{
				Reporter.log(message+" Displayed", true);
				WaitStatementLib.iSleep(1);
				JavascriptExecutor je=(JavascriptExecutor) driver;
				je.executeScript("arguments[0].scrollIntoView(true)", ele);
			}
			
			else
			{
				Reporter.log(message+" Not displayed", true);
			}	
		}
		catch(NoSuchElementException e)
		{
			System.out.println("Element is not present, hence not displayed as well");
		}
		
	}

	/****************************************************************************************/	
	
	
	public static void scrollDown(WebElement ele, WebDriver driver)
	{
		JavascriptExecutor je=(JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(true)", ele);
//		status=elementDisplay(ele);
//		return status;
	}
	
	
	/****************************************************************************************/	
	
	
	public static void scrollUp(WebElement ele, WebDriver driver)
	{
		JavascriptExecutor je=(JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(false)", ele);

	}


	/**************************************************************************************/		
	
	
	public static void selectOptionByText(WebElement drpDwn, String optionText)
	{
			Select sel=new Select(drpDwn);
			sel.selectByVisibleText(optionText);
	}
	
	
/**************************************************************************************/		
	
	
	public static void selectOptionByValue(WebElement drpDwn, String optionValue)
	{
			Select sel=new Select(drpDwn);
			sel.selectByValue(optionValue);
	}


	/**************************************************************************************/		
	
	
	public static void switchToNewWindow(int windowNumber, WebDriver driver) 
	{
	    Set<String> s = driver.getWindowHandles();   
	    Iterator<String> itr = s.iterator();
	    int i = 1;
	    while (itr.hasNext() && i < 10) 
	    {
	        String popupHandle = itr.next().toString();
	        driver.switchTo().window(popupHandle);
//	        System.out.println("Window title is : "+driver.getTitle());
	        if (i == windowNumber) break;
	        i++;
	    }
	}

}
