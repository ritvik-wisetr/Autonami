package com.autobot.generics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class ScreenshotLib 
{
	public void takeScreenshot(WebDriver driver, String scriptName)
	{
		TakesScreenshot scrShot =((TakesScreenshot)driver);

		File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./screenshots/"+scriptName+".png");
		
		try
		{
			FileUtils.copyFile(srcFile, destFile);
		}
		
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
