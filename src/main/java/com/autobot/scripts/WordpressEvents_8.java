package com.autobot.scripts;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.autobot.generics.BaseLib;
import com.autobot.generics.WaitStatementLib;
import com.autobot.generics.WebDriverCommonLib;

public class WordpressEvents_8 extends BaseLib
{
	@Test
	public void UserCreation_1()
	{	
		Date date = new Date();
		String strDateFormat = "dd-MM-yyyy-hh-mm-ss";
		DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
		String formattedDate= dateFormat.format(date);
		WaitStatementLib.iSleep(3);
		driver.findElement(By.id("reg_email")).sendKeys(formattedDate+"@tact9.in");
		String email=driver.findElement(By.id("reg_email")).getAttribute("value");
		driver.findElement(By.name("register")).click();
		WaitStatementLib.iSleep(5);
		
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
		WaitStatementLib.iSleep(3);
		
		WaitStatementLib.iSleep(3);
		driver.findElement(By.id("username")).sendKeys("wc");
		driver.findElement(By.id("password")).sendKeys("hgHGFH7%6565%");
		driver.findElement(By.name("login")).click();
		WaitStatementLib.iSleep(3);
		
		WebElement autobot1=driver.findElement(By.xpath("(//a[text()='Autonami Automations'])[2]"));
		Actions act=new Actions(driver);
		act.moveToElement(autobot1).perform();
		WaitStatementLib.iSleep(2);
		WebElement autobotDashboard=driver.findElement(By.xpath("(//a[text()='Dashboard'])[2]"));
		act.click(autobotDashboard).perform();
		WaitStatementLib.iSleep(2);
		WebElement woofunnels=driver.findElement(By.xpath("//div[text()='WooFunnels']"));
		act.moveToElement(woofunnels).perform();		
		WebElement autobotPlugin=driver.findElement(By.xpath("//a[text()='"+plugin+"']"));
		act.click(autobotPlugin).perform();
		
		driver.findElement(By.linkText("Task History")).click();
		WaitStatementLib.iSleep(2);
		driver.findElement(By.id("bwfan-search-input")).sendKeys("Testing User Creation Wordpress");
		WaitStatementLib.iSleep(2);
		driver.findElement(By.id("search-submit")).click();
		
		WaitStatementLib.iSleep(2);
		driver.findElements(By.xpath("//span[contains(text(),'"+email+"')]/../../../..//a[contains(text(),'Testing User Creation Wordpress')]/../..//a[text()='Run Now']")).get(0).click();
		WaitStatementLib.iSleep(4);
		
		((JavascriptExecutor)driver).executeScript("window.open('https://mail.google.com/mail/u/0/#inbox','_blank');");
		
		WebDriverCommonLib.switchToNewWindow(2, driver);
		
		WaitStatementLib.iSleep(3);
		driver.findElement(By.id("identifierId")).sendKeys("xlpluginstesting@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		WaitStatementLib.iSleep(2);
		driver.findElement(By.name("password")).sendKeys("XlTesing@321");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		WaitStatementLib.iSleep(5);
		
		driver.findElement(By.xpath("//div[@class='Cp']//tr")).click();
		WaitStatementLib.iSleep(2);
		
	}
	
	@Test
	public void UserLogin_2()
	{	
		WaitStatementLib.iSleep(3);
		driver.findElement(By.id("username")).sendKeys("wc");
		driver.findElement(By.id("password")).sendKeys("hgHGFH7%6565%");
		driver.findElement(By.name("login")).click();
		WaitStatementLib.iSleep(3);
		
		WebElement autobot1=driver.findElement(By.xpath("(//a[text()='Autonami Automations'])[2]"));
		Actions act=new Actions(driver);
		act.moveToElement(autobot1).perform();
		WaitStatementLib.iSleep(2);
		WebElement autobotDashboard=driver.findElement(By.xpath("(//a[text()='Dashboard'])[2]"));
		act.click(autobotDashboard).perform();
		WaitStatementLib.iSleep(2);
		
		WebElement woofunnels=driver.findElement(By.xpath("//div[text()='WooFunnels']"));
		act.moveToElement(woofunnels).perform();		
		WebElement autobotPlugin=driver.findElement(By.xpath("//a[text()='"+plugin+"']"));
		act.click(autobotPlugin).perform();
		
		driver.findElement(By.linkText("Task History")).click();
		WaitStatementLib.iSleep(2);
		driver.findElement(By.id("bwfan-search-input")).sendKeys("Testing User Login Wordpress");
		WaitStatementLib.iSleep(2);
		driver.findElement(By.id("search-submit")).click();
		
		WaitStatementLib.iSleep(2);
		driver.findElements(By.xpath("//div[@class='bwfan-extra-details']//a[contains(text(),'wc')]/../following-sibling::li/span[contains(text(),'prousertester1@gmail.com')]/../../../..//a[contains(text(),'Testing User Login Wordpress')]/../..//a[text()='Run Now']")).get(0).click();
		WaitStatementLib.iSleep(4);
		
		((JavascriptExecutor)driver).executeScript("window.open('https://mail.google.com/mail/u/0/#inbox','_blank');");
		
		WebDriverCommonLib.switchToNewWindow(2, driver);
		
		WaitStatementLib.iSleep(3);
		driver.findElement(By.id("identifierId")).sendKeys("xlpluginstesting@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		WaitStatementLib.iSleep(2);
		driver.findElement(By.name("password")).sendKeys("XlTesing@321");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		WaitStatementLib.iSleep(5);
		
		driver.findElement(By.xpath("//div[@class='Cp']//tr")).click();
		WaitStatementLib.iSleep(2);
		
	}
	
}
