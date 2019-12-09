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
import com.autobot.pageobjects.AeroCheckoutPage;
import com.autobot.pageobjects.OrderDetails;

public class AffiliateWPEvents_9 extends BaseLib
{
	@Test
	public void ApplicationSignUp_1()
	{
		WaitStatementLib.iSleep(3);
		Date date = new Date();
		String strDateFormat = "dd-MM-yyyy-hh-mm-ss";
		DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
		String formattedDate= dateFormat.format(date);
		driver.findElement(By.id("affwp-user-name")).sendKeys(formattedDate+"@tact9.in");
		driver.findElement(By.id("affwp-user-login")).sendKeys(formattedDate+"@tact9.in");
		driver.findElement(By.id("affwp-user-email")).sendKeys(formattedDate+"@tact9.in");
		String email=driver.findElement(By.id("affwp-user-email")).getAttribute("value");
		
		driver.findElement(By.id("affwp-payment-email")).sendKeys(formattedDate+"@tact9.in");
		driver.findElement(By.id("affwp-user-url")).sendKeys("https://autonami.bwfdemo.in/");
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		WaitStatementLib.iSleep(2);
		
		driver.findElement(By.xpath("//a[text()='My account']")).click();
		WaitStatementLib.iSleep(2);
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
		
		WebElement affiliatesTab=driver.findElement(By.xpath("//div[text()='Affiliates']"));
		act.moveToElement(affiliatesTab).perform();		
		WebElement affiliates=driver.findElement(By.xpath("//a[text()='Affiliates']"));
		act.click(affiliates).perform();
		
		WaitStatementLib.iSleep(2);
		String affiliateId=driver.findElement(By.xpath("//a[text()='"+email+"']/../following-sibling::td[@data-colname='Affiliate ID']")).getText();
//		String affiliateId=driver.findElement(By.id("affiliate_id")).getAttribute("value");
		System.out.println(affiliateId);
		WaitStatementLib.iSleep(2);
		driver.navigate().back();
		
		WaitStatementLib.iSleep(2);
		WebElement woofunnels=driver.findElement(By.xpath("//div[text()='WooFunnels']"));
		act.moveToElement(woofunnels).perform();		
		WebElement autobotPlugin=driver.findElement(By.xpath("//a[text()='Autonami']"));
		act.click(autobotPlugin).perform();
		
		driver.findElement(By.linkText("Task History")).click();
		WaitStatementLib.iSleep(3);
		
		driver.findElement(By.xpath("//div[@class='bwfan-extra-details']//a[text()='"+affiliateId+"']/../../../..//a[contains(text(),'Testing Application Sign Up AffiliateWP')]/../..//a[text()='Run Now']")).click();
		WaitStatementLib.iSleep(3);
		
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
	public void ApplicationApproved_2()
	{
		WaitStatementLib.iSleep(3);
		Date date = new Date();
		String strDateFormat = "dd-MM-yyyy-hh-mm-ss";
		DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
		String formattedDate= dateFormat.format(date);
		driver.findElement(By.id("affwp-user-name")).sendKeys(formattedDate+"@tact9.in");
		driver.findElement(By.id("affwp-user-login")).sendKeys(formattedDate+"@tact9.in");
		driver.findElement(By.id("affwp-user-email")).sendKeys(formattedDate+"@tact9.in");
		String email=driver.findElement(By.id("affwp-user-email")).getAttribute("value");
		
		driver.findElement(By.id("affwp-payment-email")).sendKeys(formattedDate+"@tact9.in");
		driver.findElement(By.id("affwp-user-url")).sendKeys("https://autonami.bwfdemo.in/");
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		WaitStatementLib.iSleep(2);
		
		driver.findElement(By.xpath("//a[text()='My account']")).click();
		WaitStatementLib.iSleep(2);
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
		WebElement autobotPlugin=driver.findElement(By.xpath("//a[text()='Autonami']"));
		act.click(autobotPlugin).perform();
		
		driver.findElement(By.linkText("Task History")).click();
		driver.navigate().to("https://autonami.bwfdemo.in/?autobot_clear_tasks=yes");
		WaitStatementLib.iSleep(3);
		driver.navigate().to("https://autonami.bwfdemo.in/wp-admin/admin.php?page=autonami&tab=tasks");
		WaitStatementLib.iSleep(2);
		
		WebElement affiliatesTab=driver.findElement(By.xpath("//div[text()='Affiliates']"));
		act.moveToElement(affiliatesTab).perform();		
		WebElement affiliates=driver.findElement(By.xpath("//a[text()='Affiliates']"));
		act.click(affiliates).perform();
		
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("//a[text()='"+email+"']")).click();
		String affiliateId=driver.findElement(By.id("affiliate_id")).getAttribute("value");
		System.out.println(affiliateId);
		WaitStatementLib.iSleep(2);
		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[text()='"+email+"']/../preceding-sibling::th/input[@name='affiliate_id[]']")).click();
		
		WebElement actionSelector= driver.findElement(By.xpath("//select[@id='bulk-action-selector-top']"));
		WebDriverCommonLib.selectOptionByValue(actionSelector, "accept");
		
		driver.findElement(By.id("doaction")).click();
		WaitStatementLib.iSleep(2);
		
		WebElement woofunnels1=driver.findElement(By.xpath("//div[text()='WooFunnels']"));
		act.moveToElement(woofunnels1).perform();		
		WebElement autobotPlugin2=driver.findElement(By.xpath("//a[text()='Autonami']"));
		act.click(autobotPlugin2).perform();
		
		driver.findElement(By.linkText("Task History")).click();
		WaitStatementLib.iSleep(2);
		
		driver.findElements(By.xpath("//div[@class='bwfan-extra-details']//a[text()='"+affiliateId+"']/../../../..//a[contains(text(),'Testing Application Approved AffiliateWP')]/../..//a[text()='Run Now']")).get(0).click();
		WaitStatementLib.iSleep(3);
		
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
	public void ApplicationRejected_3()
	{
		WaitStatementLib.iSleep(3);
		Date date = new Date();
		String strDateFormat = "dd-MM-yyyy-hh-mm-ss";
		DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
		String formattedDate= dateFormat.format(date);
		driver.findElement(By.id("affwp-user-name")).sendKeys(formattedDate+"@tact9.in");
		driver.findElement(By.id("affwp-user-login")).sendKeys(formattedDate+"@tact9.in");
		driver.findElement(By.id("affwp-user-email")).sendKeys(formattedDate+"@tact9.in");
		String email=driver.findElement(By.id("affwp-user-email")).getAttribute("value");
		
		driver.findElement(By.id("affwp-payment-email")).sendKeys(formattedDate+"@tact9.in");
		driver.findElement(By.id("affwp-user-url")).sendKeys("https://autonami.bwfdemo.in/");
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		WaitStatementLib.iSleep(2);
		
		driver.findElement(By.xpath("//a[text()='My account']")).click();
		WaitStatementLib.iSleep(2);
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
		WebElement autobotPlugin=driver.findElement(By.xpath("//a[text()='Autonami']"));
		act.click(autobotPlugin).perform();
		
		driver.findElement(By.linkText("Task History")).click();
		driver.navigate().to("https://autonami.bwfdemo.in/?autobot_clear_tasks=yes");
		WaitStatementLib.iSleep(3);
		driver.navigate().to("https://autonami.bwfdemo.in/wp-admin/admin.php?page=autonami&tab=tasks");
		WaitStatementLib.iSleep(2);
		
		WebElement affiliatesTab=driver.findElement(By.xpath("//div[text()='Affiliates']"));
		act.moveToElement(affiliatesTab).perform();		
		WebElement affiliates=driver.findElement(By.xpath("//a[text()='Affiliates']"));
		act.click(affiliates).perform();
		
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("//a[text()='"+email+"']")).click();
		String affiliateId=driver.findElement(By.id("affiliate_id")).getAttribute("value");
		System.out.println(affiliateId);
		WaitStatementLib.iSleep(2);
		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[text()='"+email+"']/../preceding-sibling::th/input[@name='affiliate_id[]']")).click();
		
		WebElement actionSelector= driver.findElement(By.xpath("//select[@id='bulk-action-selector-top']"));
		WebDriverCommonLib.selectOptionByValue(actionSelector, "reject");
		
		driver.findElement(By.id("doaction")).click();
		WaitStatementLib.iSleep(2);
		
		WebElement woofunnels1=driver.findElement(By.xpath("//div[text()='WooFunnels']"));
		act.moveToElement(woofunnels1).perform();		
		WebElement autobotPlugin2=driver.findElement(By.xpath("//a[text()='Autonami']"));
		act.click(autobotPlugin2).perform();
		
		driver.findElement(By.linkText("Task History")).click();
		WaitStatementLib.iSleep(2);
		
		driver.findElements(By.xpath("//div[@class='bwfan-extra-details']//a[text()='"+affiliateId+"']/../../../..//a[contains(text(),'Testing Application Rejected AffiliateWP')]/../..//a[text()='Run Now']")).get(0).click();
		WaitStatementLib.iSleep(3);
		
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
	public void ReferralRejected_4()
	{
		WaitStatementLib.iSleep(3);
		Date date = new Date();
		String strDateFormat = "dd-MM-yyyy-hh-mm-ss";
		DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
		String formattedDate= dateFormat.format(date);
		driver.findElement(By.id("affwp-user-name")).sendKeys(formattedDate+"@tact9.in");
		driver.findElement(By.id("affwp-user-login")).sendKeys(formattedDate+"@tact9.in");
		driver.findElement(By.id("affwp-user-email")).sendKeys(formattedDate+"@tact9.in");
		String email=driver.findElement(By.id("affwp-user-email")).getAttribute("value");
		
		driver.findElement(By.id("affwp-payment-email")).sendKeys(formattedDate+"@tact9.in");
		driver.findElement(By.id("affwp-user-url")).sendKeys("https://autonami.bwfdemo.in/");
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		WaitStatementLib.iSleep(2);
		
		driver.findElement(By.xpath("//a[text()='My account']")).click();
		WaitStatementLib.iSleep(2);
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
		
		WebElement affiliatesTab=driver.findElement(By.xpath("//div[text()='Affiliates']"));
		act.moveToElement(affiliatesTab).perform();		
		WebElement affiliates=driver.findElement(By.xpath("//a[text()='Affiliates']"));
		act.click(affiliates).perform();
		
		WaitStatementLib.iSleep(2);
		WebElement affiliatesName=driver.findElement(By.xpath("//a[text()='"+email+"']"));
		act.moveToElement(affiliatesName).perform();
		WebElement affiliatesAccept=driver.findElement(By.xpath("//a[text()='"+email+"']/..//a[text()='Accept']"));
		act.click(affiliatesAccept).perform();
		
		driver.findElement(By.xpath("//a[text()='"+email+"']")).click();
		String affiliateId=driver.findElement(By.id("affiliate_id")).getAttribute("value");
		System.out.println(affiliateId);
		String affiliateUrl=driver.findElement(By.id("affiliate_url")).getAttribute("value");
		System.out.println(affiliateUrl);
		WaitStatementLib.iSleep(2);
		
		WebElement profile=driver.findElement(By.xpath("//a[text()='Howdy, ']"));
		act.moveToElement(profile).perform();
		
		WebElement logOut=driver.findElement(By.xpath("//a[text()='Log Out']"));
		act.click(logOut).perform();
		WaitStatementLib.iSleep(2);
		
		driver.navigate().to(affiliateUrl);
		WaitStatementLib.iSleep(2);
		
		driver.findElement(By.xpath("//a[text()='Shop']")).click();
		WaitStatementLib.iSleep(2);
		
		driver.findElement(By.xpath("//a[@data-product_id='442']")).click();
		driver.findElement(By.xpath("//a[text()='View cart']")).click();
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("//a[contains(text(),'Proceed to checkout')]")).click();
		
		AeroCheckoutPage acp=new AeroCheckoutPage(driver);
		acp.billingInformation();
		
		acp.clickOnCashOnDeliveryForNative();
		acp.placeOrder();
		OrderDetails od=new OrderDetails(driver);
		od.finalOrders();
		od.findOrderNo();
		
		driver.findElement(By.xpath("//a[text()='My account']")).click();
		WaitStatementLib.iSleep(2);
		
		WaitStatementLib.iSleep(3);
		driver.findElement(By.id("username")).sendKeys("wc");
		driver.findElement(By.id("password")).sendKeys("hgHGFH7%6565%");
		driver.findElement(By.name("login")).click();
		WaitStatementLib.iSleep(3);
		
		WebElement autobot2=driver.findElement(By.xpath("(//a[text()='Autonami Automations'])[2]"));
		Actions act1=new Actions(driver);
		act1.moveToElement(autobot2).perform();
		WaitStatementLib.iSleep(2);
		WebElement autobotDashboard1=driver.findElement(By.xpath("(//a[text()='Dashboard'])[2]"));
		act.click(autobotDashboard1).perform();
		WaitStatementLib.iSleep(2);
		
		WebElement woofunnels=driver.findElement(By.xpath("//div[text()='WooFunnels']"));
		act.moveToElement(woofunnels).perform();		
		WebElement autobotPlugin=driver.findElement(By.xpath("//a[text()='Autonami']"));
		act.click(autobotPlugin).perform();
		
		driver.findElement(By.linkText("Task History")).click();
		driver.navigate().to("https://autonami.bwfdemo.in/?autobot_clear_tasks=yes");
		WaitStatementLib.iSleep(3);
		driver.navigate().to("https://autonami.bwfdemo.in/wp-admin/admin.php?page=autonami&tab=tasks");
		WaitStatementLib.iSleep(2);
		
		WebElement affiliatesTab1=driver.findElement(By.xpath("//div[text()='Affiliates']"));
		act.moveToElement(affiliatesTab1).perform();		
		WebElement referrals=driver.findElement(By.xpath("//a[text()='Referrals']"));
		act.click(referrals).perform();
		
		String referralId=driver.findElement(By.xpath("//a[text()='"+email+"']/../preceding-sibling::th/input[@name='referral_id[]']")).getAttribute("value");
		
		driver.findElement(By.xpath("//a[text()='"+email+"']/../following-sibling::td[@data-colname='Actions']//a[text()='Reject']")).click();
		
		WebElement woofunnels1=driver.findElement(By.xpath("//div[text()='WooFunnels']"));
		act.moveToElement(woofunnels1).perform();		
		WebElement autobotPlugin2=driver.findElement(By.xpath("//a[text()='Autonami']"));
		act.click(autobotPlugin2).perform();
		
		driver.findElement(By.linkText("Task History")).click();
		WaitStatementLib.iSleep(2);
		
		driver.findElements(By.xpath("//div[@class='bwfan-extra-details']//span[text()='"+referralId+"']/../../../..//a[contains(text(),'Testing Referral Rejected AffiliateWP')]/../..//a[text()='Run Now']")).get(0).click();
		WaitStatementLib.iSleep(3);
		
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
	public void AffiliateMakesASale_5()
	{
		WaitStatementLib.iSleep(3);
		Date date = new Date();
		String strDateFormat = "dd-MM-yyyy-hh-mm-ss";
		DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
		String formattedDate= dateFormat.format(date);
		driver.findElement(By.id("affwp-user-name")).sendKeys(formattedDate+"@tact9.in");
		driver.findElement(By.id("affwp-user-login")).sendKeys(formattedDate+"@tact9.in");
		driver.findElement(By.id("affwp-user-email")).sendKeys(formattedDate+"@tact9.in");
		String email=driver.findElement(By.id("affwp-user-email")).getAttribute("value");
		
		driver.findElement(By.id("affwp-payment-email")).sendKeys(formattedDate+"@tact9.in");
		driver.findElement(By.id("affwp-user-url")).sendKeys("https://autonami.bwfdemo.in/");
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		WaitStatementLib.iSleep(2);
		
		driver.findElement(By.xpath("//a[text()='My account']")).click();
		WaitStatementLib.iSleep(2);
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
		WebElement autobotPlugin=driver.findElement(By.xpath("//a[text()='Autonami']"));
		act.click(autobotPlugin).perform();
		
		driver.findElement(By.linkText("Task History")).click();
		driver.navigate().to("https://autonami.bwfdemo.in/?autobot_clear_tasks=yes");
		WaitStatementLib.iSleep(3);
		driver.navigate().to("https://autonami.bwfdemo.in/wp-admin/admin.php?page=autonami&tab=tasks");
		WaitStatementLib.iSleep(2);
		
		WebElement affiliatesTab=driver.findElement(By.xpath("//div[text()='Affiliates']"));
		act.moveToElement(affiliatesTab).perform();		
		WebElement affiliates=driver.findElement(By.xpath("//a[text()='Affiliates']"));
		act.click(affiliates).perform();
		
		WaitStatementLib.iSleep(2);
		WebElement affiliatesName=driver.findElement(By.xpath("//a[text()='"+email+"']"));
		act.moveToElement(affiliatesName).perform();
		WebElement affiliatesAccept=driver.findElement(By.xpath("//a[text()='"+email+"']/..//a[text()='Accept']"));
		act.click(affiliatesAccept).perform();
		
		driver.findElement(By.xpath("//a[text()='"+email+"']")).click();
		String affiliateId=driver.findElement(By.id("affiliate_id")).getAttribute("value");
		System.out.println(affiliateId);
		String affiliateUrl=driver.findElement(By.id("affiliate_url")).getAttribute("value");
		System.out.println(affiliateUrl);
		WaitStatementLib.iSleep(2);
		
		WebElement profile=driver.findElement(By.xpath("//a[text()='Howdy, ']"));
		act.moveToElement(profile).perform();
		
		WebElement logOut=driver.findElement(By.xpath("//a[text()='Log Out']"));
		act.click(logOut).perform();
		WaitStatementLib.iSleep(2);
		
		driver.navigate().to(affiliateUrl);
		WaitStatementLib.iSleep(2);
		
		driver.findElement(By.xpath("//a[text()='Shop']")).click();
		WaitStatementLib.iSleep(2);
		
		driver.findElement(By.xpath("//a[@data-product_id='442']")).click();
		driver.findElement(By.xpath("//a[text()='View cart']")).click();
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("//a[contains(text(),'Proceed to checkout')]")).click();
		
		AeroCheckoutPage acp=new AeroCheckoutPage(driver);
		acp.billingInformation();
		
		acp.clickOnCashOnDeliveryForNative();
		acp.placeOrder();
		OrderDetails od=new OrderDetails(driver);
		od.finalOrders();
		od.findOrderNo();
		
		driver.findElement(By.xpath("//a[text()='My account']")).click();
		WaitStatementLib.iSleep(2);
		
		WaitStatementLib.iSleep(3);
		driver.findElement(By.id("username")).sendKeys("wc");
		driver.findElement(By.id("password")).sendKeys("hgHGFH7%6565%");
		driver.findElement(By.name("login")).click();
		WaitStatementLib.iSleep(3);
		
		WebElement autobot2=driver.findElement(By.xpath("(//a[text()='Autonami Automations'])[2]"));
		Actions act1=new Actions(driver);
		act1.moveToElement(autobot2).perform();
		WaitStatementLib.iSleep(2);
		WebElement autobotDashboard1=driver.findElement(By.xpath("(//a[text()='Dashboard'])[2]"));
		act.click(autobotDashboard1).perform();
		WaitStatementLib.iSleep(2);
		
		WebElement woofunnels1=driver.findElement(By.xpath("//div[text()='WooFunnels']"));
		act.moveToElement(woofunnels1).perform();		
		WebElement autobotPlugin1=driver.findElement(By.xpath("//a[text()='Autonami']"));
		act.click(autobotPlugin1).perform();
		
		driver.findElement(By.linkText("Task History")).click();
		WaitStatementLib.iSleep(2);
		
		driver.findElements(By.xpath("//a[contains(text(),'Testing Affiliate Makes A Sale AffiliateWP')]/../..//a[text()='Run Now']")).get(0).click();
		WaitStatementLib.iSleep(3);
		
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
