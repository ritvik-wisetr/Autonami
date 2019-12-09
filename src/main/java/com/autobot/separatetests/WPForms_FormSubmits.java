package com.autobot.separatetests;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.autobot.generics.WaitStatementLib;
import com.autobot.generics.WebDriverCommonLib;

public class WPForms_FormSubmits {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://autonami.bwfdemo.in/wp-form-page/");
		
		Date date = new Date();
		String strDateFormat = "dd-MM-yyyy-hh-mm-ss";
		DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
		String formattedDate= dateFormat.format(date);
		
		driver.findElement(By.id("wpforms-1072-field_0")).sendKeys("Ritvik");
		driver.findElement(By.id("wpforms-1072-field_0-last")).sendKeys("Raj");
		driver.findElement(By.id("wpforms-1072-field_1")).sendKeys(formattedDate+"@tact9.in");
		driver.findElement(By.id("wpforms-1072-field_2")).sendKeys("Hello!!");
		
		driver.findElement(By.id("wpforms-submit-1072")).click();
		WaitStatementLib.iSleep(2);
		driver.findElement(By.linkText("My account")).click();
		
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
		WebElement autobotPlugin=driver.findElement(By.xpath("//a[text()='Autonami']"));
		act.click(autobotPlugin).perform();
		
		driver.findElement(By.linkText("Task History")).click();
		WaitStatementLib.iSleep(2);
		driver.findElement(By.id("bwfan-search-input")).sendKeys("Testing Form Submits WP Forms");
		WaitStatementLib.iSleep(2);
		driver.findElement(By.id("search-submit")).click();
		
		WaitStatementLib.iSleep(2);
		driver.findElements(By.xpath("//div[@class='bwfan-extra-details']//span[contains(text(),'1072')]/../../../..//a[contains(text(),'Testing Form Submits WP Forms')]/../..//a[text()='Run Now']")).get(0).click();
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
