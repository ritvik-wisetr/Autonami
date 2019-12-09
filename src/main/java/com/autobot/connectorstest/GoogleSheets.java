package com.autobot.connectorstest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.autobot.generics.WaitStatementLib;
import com.autobot.generics.WebDriverCommonLib;
import com.autobot.pageobjects.AeroCheckoutPage;
import com.autobot.pageobjects.OrderDetails;

public class GoogleSheets {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://autonami.bwfdemo.in/wp-login.php");
		
		WaitStatementLib.iSleep(3);
		driver.findElement(By.id("user_login")).sendKeys("wc");
		driver.findElement(By.id("user_pass")).sendKeys("hgHGFH7%6565%");
		driver.findElement(By.id("wp-submit")).click();
		WaitStatementLib.iSleep(3);
		WebElement woofunnels=driver.findElement(By.xpath("//div[text()='WooFunnels']"));
		Actions act=new Actions(driver);
		act.moveToElement(woofunnels).perform();		
		WebElement autobotPlugin=driver.findElement(By.xpath("//a[text()='Autonami']"));
		act.click(autobotPlugin).perform();
		
		driver.findElement(By.linkText("Task History")).click();
		
		driver.navigate().to("https://autonami.bwfdemo.in/?autobot_clear_tasks=yes");
		WaitStatementLib.iSleep(3);
		driver.navigate().to("https://autonami.bwfdemo.in/wp-admin/admin.php?page=autonami&tab=tasks");
		WaitStatementLib.iSleep(2);
		WebElement autobot=driver.findElement(By.xpath("//a[text()='Autonami Automations']"));
		act.moveToElement(autobot).perform();
		WaitStatementLib.iSleep(2);
		WebElement autobotStore=driver.findElement(By.xpath("//a[text()='Visit Store']"));
		act.click(autobotStore).perform();
		
		
		driver.findElement(By.xpath("(//a[@data-product_id='442'])")).click();
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("(//a[@data-product_id='188'])")).click();
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("(//a[text()='View cart'])")).click();
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("//a[contains(text(),'Proceed to checkout')]")).click();
		
		AeroCheckoutPage acp=new AeroCheckoutPage(driver);
		acp.billingInformation();
		acp.placeOrder();
		OrderDetails od=new OrderDetails(driver);
		od.finalOrders();
		od.findOrderNo();
		
		String orderNumber=driver.findElement(By.xpath("//div[@class='woocommerce-order']//li[contains(@class,'overview__order')]/strong")).getText();
		
		WaitStatementLib.iSleep(3);
		WebElement autobot1=driver.findElement(By.xpath("(//a[text()='Autonami Automations'])[2]"));
		act.moveToElement(autobot1).perform();
		WaitStatementLib.iSleep(2);
		WebElement autobotDashboard=driver.findElement(By.xpath("//a[text()='Dashboard']"));
		act.click(autobotDashboard).perform();
		WaitStatementLib.iSleep(2);
		WebElement woofunnels1=driver.findElement(By.xpath("//div[text()='WooFunnels']"));	
		act.moveToElement(woofunnels1).perform();		
		WebElement autobotPlugin1=driver.findElement(By.xpath("//a[text()='Autonami']"));
		act.click(autobotPlugin1).perform();
		
		driver.findElement(By.linkText("Task History")).click();
		WaitStatementLib.iSleep(2);
		
		driver.findElements(By.xpath("//div[@class='wfab-extra-details']//a[text()='"+orderNumber+"']/../../../..//a[contains(text(),'Testing GoogleSheets')]/../..//a[text()='Run Now']")).get(0).click();
		WaitStatementLib.iSleep(4);
		
		((JavascriptExecutor)driver).executeScript("window.open('https://docs.google.com/spreadsheets/d/1ABjYVszDhQqA2Q6JUz9_SYuP2CCIgmRswCdHqXuwkvw/edit#gid=0','_blank');");
		
		WebDriverCommonLib.switchToNewWindow(2, driver);
		WaitStatementLib.iSleep(2);
		
		WaitStatementLib.iSleep(2);
		driver.findElement(By.id("identifierId")).sendKeys("xlpluginstesting@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		WaitStatementLib.iSleep(2);
		driver.findElement(By.name("password")).sendKeys("XlTesing@321");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		WaitStatementLib.iSleep(10);
		
		WebDriverCommonLib.switchToNewWindow(1, driver);
		
		WebElement woocommerce=driver.findElement(By.xpath("//div[text()='WooCommerce']"));
		act.moveToElement(woocommerce).perform();		
		WebElement woocommOrders=driver.findElement(By.xpath("//a[contains(text(),'Orders')]"));
		act.click(woocommOrders).perform();
		
		driver.findElement(By.xpath("//a[@class='order-view']/strong[contains(text(),'"+orderNumber+"')]")).click();
		WaitStatementLib.iSleep(2);
		WebElement orderStatusDrpDwn=driver.findElement(By.id("order_status"));
		WebDriverCommonLib.selectOptionByValue(orderStatusDrpDwn, "wc-completed");
		
		driver.findElement(By.name("save")).click();
		WaitStatementLib.iSleep(2);
		
		WebElement woofunnels2=driver.findElement(By.xpath("//div[text()='WooFunnels']"));
		act.moveToElement(woofunnels2).perform();		
		WebElement autobotPlugin2=driver.findElement(By.xpath("//a[text()='Autonami']"));
		act.click(autobotPlugin2).perform();
		
		driver.findElement(By.linkText("Task History")).click();
		WaitStatementLib.iSleep(2);
		
		driver.findElements(By.xpath("//div[@class='wfab-extra-details']//a[text()='"+orderNumber+"']/../../../..//a[contains(text(),'Testing GoogleSheets')]/../..//a[text()='Run Now']")).get(0).click();
		WaitStatementLib.iSleep(4);
		
		WebDriverCommonLib.switchToNewWindow(2, driver);
		WaitStatementLib.iSleep(5);
		driver.navigate().refresh();
		
	}

}
