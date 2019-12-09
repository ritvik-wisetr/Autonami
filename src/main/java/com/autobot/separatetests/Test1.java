package com.autobot.separatetests;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;

import com.autobot.generics.WaitStatementLib;
import com.autobot.generics.WebDriverCommonLib;

public class Test1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://demo.buildwoofunnels.com/autobot/wp-login.php");
		
		WaitStatementLib.iSleep(3);
		driver.findElement(By.id("user_login")).sendKeys("wc");
		driver.findElement(By.id("user_pass")).sendKeys("wf2yFzJoVRbVOEAfq9ts%oZr");
		driver.findElement(By.id("wp-submit")).click();
		WaitStatementLib.iSleep(3);
		WebElement woofunnels=driver.findElement(By.xpath("//div[text()='WooFunnels']"));
		Actions act=new Actions(driver);
		act.moveToElement(woofunnels).perform();		
		WebElement autobotPlugin=driver.findElement(By.xpath("//a[text()='AutoBot']"));
		act.click(autobotPlugin).perform();
		WaitStatementLib.iSleep(1);
		driver.findElement(By.linkText("Add New")).click();
		WaitStatementLib.iSleep(2);
		driver.findElement(By.id("title")).sendKeys("Autobot Automation Testing");
		driver.findElement(By.xpath("//button[text()='Create']")).click();
		
//		driver.findElement(By.linkText("Scenario Testing (#21)")).click();
		WaitStatementLib.iSleep(3);
//		driver.findElement(By.xpath("//div[@class='item_wrap_single item_modify_trigger item_active']")).click();
		WebElement sourceDrpDwn=driver.findElement(By.xpath("//select[@name='source']"));
		WebDriverCommonLib.selectOptionByValue(sourceDrpDwn, "wc");
		
		WebElement eventDrpDwn=driver.findElement(By.xpath("//select[@name='event']"));
		WebDriverCommonLib.selectOptionByValue(eventDrpDwn, "wc_new_order");
		
		driver.findElement(By.id("wfab-wc-completed")).click();
		driver.findElement(By.id("wfab-wc-processing")).click();
		driver.findElement(By.linkText("Save")).click();
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("//div[@class='item_wrap_html_add']/i")).click();
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("//div[text()='Direct Action']")).click();
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("//div[@class='item_wrap_single item_add_action']/i")).click();
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("//div[@class='action_text']")).click();
		
		WebElement actionDrpDwn=driver.findElement(By.xpath("//select[@name='wfab[0][action_slug]']"));
		WebDriverCommonLib.selectOptionByValue(actionDrpDwn, "wc_create_coupon");
		
		driver.findElement(By.xpath("//span[@id='select2--container']")).click();
//		WebElement selectCouponDrpDwn=driver.findElement(By.xpath("//select[@name='wfab[0][data][coupon]']"));
//		WebDriverCommonLib.selectOptionByValue(selectCouponDrpDwn, "wc_create_coupon");
		
		driver.findElement(By.xpath("//span[@class='select2-search select2-search--dropdown']/input")).sendKeys("coupon1");
		driver.findElement(By.xpath("//li[text()='coupon1']")).click();
		
		driver.findElement(By.name("wfab[0][data][coupon_name]")).sendKeys("TipTop");
		
		WebElement expiryDrpDwn=driver.findElement(By.xpath("//select[@name='wfab[0][data][expiry_type]']"));
		WebDriverCommonLib.selectOptionByValue(expiryDrpDwn, "days");
		
		driver.findElement(By.name("wfab[0][data][expiry]")).sendKeys("5");
		
		driver.findElement(By.linkText("Save")).click();
		WaitStatementLib.iSleep(3);
		
		String coupon = driver.findElement(By.xpath("//span[@id='select2--container']")).getAttribute("title");
		System.out.println(coupon);
		
		driver.navigate().refresh();
		
		WaitStatementLib.iSleep(5);
		driver.findElement(By.xpath("//div[@class='item_wrap_single item_modify_action']")).click();
		
		String expMsg1="TipTop";
		String actMsg1=driver.findElement(By.name("wfab[0][data][coupon_name]")).getAttribute("value");
		Assert.assertEquals(actMsg1, expMsg1);
		Reporter.log(expMsg1, true);
		
		String expMsg2="5";
		String actMsg2=driver.findElement(By.name("wfab[0][data][expiry]")).getAttribute("value");
		Assert.assertEquals(actMsg2, expMsg2);
		Reporter.log(expMsg2, true);
		
		String expMsg3=coupon;
		String actMsg3=driver.findElement(By.xpath("//span[@id='select2--container']")).getAttribute("title");
		Assert.assertEquals(actMsg3, expMsg3);
		Reporter.log(expMsg3, true);
			
	}

}
