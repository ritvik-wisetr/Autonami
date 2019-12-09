package com.autobot.scripts;

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

public class WoocommerceSubscriptionEvents_5 extends BaseLib
{
//	@Test
//	public void SubscriptionCreated_1()
//	{	
//		WaitStatementLib.iSleep(3);
//		driver.findElement(By.id("user_login")).sendKeys("wc");
//		driver.findElement(By.id("user_pass")).sendKeys("hgHGFH7%6565%");
//		driver.findElement(By.id("wp-submit")).click();
//		WaitStatementLib.iSleep(3);
//		WebElement woofunnels=driver.findElement(By.xpath("//div[text()='WooFunnels']"));
//		Actions act=new Actions(driver);
//		act.moveToElement(woofunnels).perform();		
//		WebElement autobotPlugin=driver.findElement(By.xpath("//a[text()='"+plugin+"']"));
//		act.click(autobotPlugin).perform();
//		
//		driver.findElement(By.linkText("Task History")).click();
//		
//		driver.navigate().to("https://autonami.bwfdemo.in/?autobot_clear_tasks=yes");
//		WaitStatementLib.iSleep(3);
//		driver.navigate().to("https://autonami.bwfdemo.in/wp-admin/admin.php?page=autonami&tab=tasks");
//		WaitStatementLib.iSleep(2);
//		WebElement autobot=driver.findElement(By.xpath("//a[text()='Autonami Automations']"));
//		act.moveToElement(autobot).perform();
//		WaitStatementLib.iSleep(2);
//		WebElement autobotStore=driver.findElement(By.xpath("//a[text()='Visit Store']"));
//		act.click(autobotStore).perform();
//		
//		
//		driver.findElement(By.xpath("//a[@data-product_id='138']")).click();
//		driver.findElement(By.xpath("//a[text()='View cart']")).click();
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.xpath("//a[contains(text(),'Proceed to checkout')]")).click();
//		
//		AeroCheckoutPage acp=new AeroCheckoutPage(driver);
//		acp.billingInformation();
//		acp.clickOnCreditCardForNative(driver);
//		acp.placeOrder();
//		OrderDetails od=new OrderDetails(driver);
//		od.finalOrders();
//		od.findOrderNo();
//		
//		String orderNumber=driver.findElement(By.xpath("//div[@class='woocommerce-order']//li[contains(@class,'overview__order')]/strong")).getText();
//		String subscriptionId=driver.findElement(By.xpath("//td[contains(@class,'subscription-id order-number')]")).getText();
//		
//		WaitStatementLib.iSleep(3);
//		WebElement autobot1=driver.findElement(By.xpath("(//a[text()='Autonami Automations'])[2]"));
//		act.moveToElement(autobot1).perform();
//		WaitStatementLib.iSleep(2);
//		WebElement autobotDashboard=driver.findElement(By.xpath("//a[text()='Dashboard']"));
//		act.click(autobotDashboard).perform();
//		WaitStatementLib.iSleep(2);
//		WebElement woofunnels1=driver.findElement(By.xpath("//div[text()='WooFunnels']"));	
//		act.moveToElement(woofunnels1).perform();		
//		WebElement autobotPlugin1=driver.findElement(By.xpath("//a[text()='"+plugin+"']"));
//		act.click(autobotPlugin1).perform();
//		
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.linkText("Task History")).click();
//		WaitStatementLib.iSleep(2);
//		
//		driver.findElements(By.xpath("//div[@class='bwfan-extra-details']//a[text()='"+subscriptionId+"']/../../../..//a[contains(text(),'Testing Subscription Created')]/../..//a[text()='Run Now']")).get(0).click();
//		WaitStatementLib.iSleep(3);
//		
//		((JavascriptExecutor)driver).executeScript("window.open('https://mail.google.com/mail/u/0/#inbox','_blank');");
//		
//		WebDriverCommonLib.switchToNewWindow(2, driver);
//		WaitStatementLib.iSleep(3);
//		driver.findElement(By.id("identifierId")).sendKeys("xlpluginstesting@gmail.com");
//		driver.findElement(By.xpath("//span[text()='Next']")).click();
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.name("password")).sendKeys("XlTesing@321");
//		driver.findElement(By.xpath("//span[text()='Next']")).click();
//		WaitStatementLib.iSleep(5);
//		
//		driver.findElement(By.xpath("//div[@class='Cp']//tr")).click();
//		WaitStatementLib.iSleep(2);
//		
//	}
//	
//	@Test
//	public void SubscriptionStatusChange_2()
//	{	
//		WaitStatementLib.iSleep(3);
//		driver.findElement(By.id("user_login")).sendKeys("wc");
//		driver.findElement(By.id("user_pass")).sendKeys("hgHGFH7%6565%");
//		driver.findElement(By.id("wp-submit")).click();
//		WaitStatementLib.iSleep(3);
//		WebElement woofunnels=driver.findElement(By.xpath("//div[text()='WooFunnels']"));
//		Actions act=new Actions(driver);
//		act.moveToElement(woofunnels).perform();		
//		WebElement autobotPlugin=driver.findElement(By.xpath("//a[text()='"+plugin+"']"));
//		act.click(autobotPlugin).perform();
//		
//		driver.findElement(By.linkText("Task History")).click();
//		
//		driver.navigate().to("https://autonami.bwfdemo.in/?autobot_clear_tasks=yes");
//		WaitStatementLib.iSleep(3);
//		driver.navigate().to("https://autonami.bwfdemo.in/wp-admin/admin.php?page=autonami&tab=tasks");
//		WaitStatementLib.iSleep(2);
//		WebElement autobot=driver.findElement(By.xpath("//a[text()='Autonami Automations']"));
//		act.moveToElement(autobot).perform();
//		WaitStatementLib.iSleep(2);
//		WebElement autobotStore=driver.findElement(By.xpath("//a[text()='Visit Store']"));
//		act.click(autobotStore).perform();
//		
//		driver.findElement(By.xpath("//a[@data-product_id='138']")).click();
//		driver.findElement(By.xpath("//a[text()='View cart']")).click();
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.xpath("//a[contains(text(),'Proceed to checkout')]")).click();
//		
//		AeroCheckoutPage acp=new AeroCheckoutPage(driver);
//		acp.billingInformation();
//		acp.clickOnDirectBankTransferForNative();
//		acp.placeOrder();
//		OrderDetails od=new OrderDetails(driver);
//		od.finalOrders();
//		od.findOrderNo();
//		
//		String orderNumber=driver.findElement(By.xpath("//div[@class='woocommerce-order']//li[contains(@class,'overview__order')]/strong")).getText();
//		String subscriptionId=driver.findElement(By.xpath("//td[contains(@class,'subscription-id order-number')]")).getText();
//		
//		WaitStatementLib.iSleep(3);
//		WebElement autobot1=driver.findElement(By.xpath("(//a[text()='Autonami Automations'])[2]"));
//		act.moveToElement(autobot1).perform();
//		WaitStatementLib.iSleep(2);
//		WebElement autobotDashboard=driver.findElement(By.xpath("//a[text()='Dashboard']"));
//		act.click(autobotDashboard).perform();
//		WaitStatementLib.iSleep(2);
//		
//		WebElement woocommerce=driver.findElement(By.xpath("//div[text()='WooCommerce']"));
//		act.moveToElement(woocommerce).perform();		
//		WebElement woocommOrders=driver.findElement(By.xpath("//a[contains(text(),'Orders')]"));
//		act.click(woocommOrders).perform();
//		
//		driver.findElement(By.xpath("//a[@class='order-view']/strong[contains(text(),'"+orderNumber+"')]")).click();
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.xpath("//div[@class='woocommerce_subscriptions_related_orders']//a[contains(text(),'"+subscriptionId+"')]")).click();
//		WaitStatementLib.iSleep(2);
//		
//		WebElement subscriptionStatusDrpDwn=driver.findElement(By.id("order_status"));
//		WebDriverCommonLib.selectOptionByValue(subscriptionStatusDrpDwn, "wc-active");
//		
//		driver.findElement(By.name("save")).click();
//		WaitStatementLib.iSleep(2);
//		
//		WebElement woofunnels1=driver.findElement(By.xpath("//div[text()='WooFunnels']"));	
//		act.moveToElement(woofunnels1).perform();		
//		WebElement autobotPlugin1=driver.findElement(By.xpath("//a[text()='"+plugin+"']"));
//		act.click(autobotPlugin1).perform();
//		
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.linkText("Task History")).click();
//		WaitStatementLib.iSleep(2);
//		
//		driver.findElements(By.xpath("//div[@class='bwfan-extra-details']//a[text()='"+subscriptionId+"']/../../../..//a[contains(text(),'Testing Subscription Status Changed')]/../..//a[text()='Run Now']")).get(0).click();
//		WaitStatementLib.iSleep(3);
//		
//		((JavascriptExecutor)driver).executeScript("window.open('https://mail.google.com/mail/u/0/#inbox','_blank');");
//		
//		WebDriverCommonLib.switchToNewWindow(2, driver);
//		WaitStatementLib.iSleep(3);
//		driver.findElement(By.id("identifierId")).sendKeys("xlpluginstesting@gmail.com");
//		driver.findElement(By.xpath("//span[text()='Next']")).click();
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.name("password")).sendKeys("XlTesing@321");
//		driver.findElement(By.xpath("//span[text()='Next']")).click();
//		WaitStatementLib.iSleep(5);
//		
//		driver.findElement(By.xpath("//div[@class='Cp']//tr")).click();
//		WaitStatementLib.iSleep(2);
//		
//	}
//	
//	@Test
//	public void SubscriptionTrialEnd_3()
//	{	
//		WaitStatementLib.iSleep(3);
//		driver.findElement(By.id("user_login")).sendKeys("wc");
//		driver.findElement(By.id("user_pass")).sendKeys("hgHGFH7%6565%");
//		driver.findElement(By.id("wp-submit")).click();
//		WaitStatementLib.iSleep(3);
//		WebElement woofunnels=driver.findElement(By.xpath("//div[text()='WooFunnels']"));
//		Actions act=new Actions(driver);
//		act.moveToElement(woofunnels).perform();		
//		WebElement autobotPlugin=driver.findElement(By.xpath("//a[text()='"+plugin+"']"));
//		act.click(autobotPlugin).perform();
//		
//		driver.findElement(By.linkText("Task History")).click();
//		
//		driver.navigate().to("https://autonami.bwfdemo.in/?autobot_clear_tasks=yes");
//		WaitStatementLib.iSleep(3);
//		driver.navigate().to("https://autonami.bwfdemo.in/wp-admin/admin.php?page=autonami&tab=tasks");
//		WaitStatementLib.iSleep(2);
//		WebElement autobot=driver.findElement(By.xpath("//a[text()='Autonami Automations']"));
//		act.moveToElement(autobot).perform();
//		WaitStatementLib.iSleep(2);
//		WebElement autobotStore=driver.findElement(By.xpath("//a[text()='Visit Store']"));
//		act.click(autobotStore).perform();
//		
//		
//		driver.findElement(By.xpath("//a[@data-product_id='352']")).click();
//		driver.findElement(By.xpath("//a[text()='View cart']")).click();
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.xpath("//a[contains(text(),'Proceed to checkout')]")).click();
//		
//		AeroCheckoutPage acp=new AeroCheckoutPage(driver);
//		acp.billingInformation();
//		acp.clickOnCreditCardForNative(driver);
//		acp.placeOrder();
//		OrderDetails od=new OrderDetails(driver);
//		od.finalOrders();
//		od.findOrderNo();
//		
//		String orderNumber=driver.findElement(By.xpath("//div[@class='woocommerce-order']//li[contains(@class,'overview__order')]/strong")).getText();
//		String subscriptionId=driver.findElement(By.xpath("//td[contains(@class,'subscription-id order-number')]")).getText();
//		System.out.println(subscriptionId);
//		String subsId = subscriptionId.replaceAll("#", "");
//		System.out.println(subsId);
//		
//		WaitStatementLib.iSleep(3);
//		WebElement autobot1=driver.findElement(By.xpath("(//a[text()='Autonami Automations'])[2]"));
//		act.moveToElement(autobot1).perform();
//		WaitStatementLib.iSleep(2);
//		WebElement autobotDashboard=driver.findElement(By.xpath("//a[text()='Dashboard']"));
//		act.click(autobotDashboard).perform();
//		WaitStatementLib.iSleep(2);
//		
//		WebElement woocommerce=driver.findElement(By.xpath("//div[text()='WooCommerce']"));
//		act.moveToElement(woocommerce).perform();		
//		WebElement woocommOrders=driver.findElement(By.xpath("//a[contains(text(),'Orders')]"));
//		act.click(woocommOrders).perform();
//		
//		driver.findElement(By.xpath("//a[@class='order-view']/strong[contains(text(),'"+orderNumber+"')]")).click();
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.xpath("//div[@class='woocommerce_subscriptions_related_orders']//a[contains(text(),'"+subscriptionId+"')]")).click();
//		WaitStatementLib.iSleep(2);
//		
//		WebElement subscriptionStatusDrpDwn=driver.findElement(By.id("order_status"));
//		WebDriverCommonLib.selectOptionByValue(subscriptionStatusDrpDwn, "wc-active");
//		
//		driver.findElement(By.name("save")).click();
//		WaitStatementLib.iSleep(2);
//		
//		WebElement woofunnels1=driver.findElement(By.xpath("//div[text()='WooFunnels']"));	
//		act.moveToElement(woofunnels1).perform();		
//		WebElement autobotPlugin1=driver.findElement(By.xpath("//a[text()='"+plugin+"']"));
//		act.click(autobotPlugin1).perform();
//		
//		driver.findElement(By.xpath("//a[contains(text(),'#237')]")).click();
//		WaitStatementLib.iSleep(2);
//		
//		driver.findElement(By.linkText("Save")).click();
//		WaitStatementLib.iSleep(5);
//		
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.xpath("//a[contains(@class,'bwfan_btn_close')]")).click();
//		
//		WebElement tools=driver.findElement(By.xpath("//div[text()='Tools']"));	
//		act.moveToElement(tools).perform();		
//		WebElement scheduledActions=driver.findElement(By.xpath("//a[text()='Scheduled Actions']"));
//		act.click(scheduledActions).perform();
//		
//		driver.findElement(By.id("plugin-search-input")).sendKeys(subsId);
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.id("search-submit")).click();
//		
//		WaitStatementLib.iSleep(2);
//		WebElement trialEnd=driver.findElement(By.xpath("//code[contains(text(),'"+subsId+"')]/../../../preceding-sibling::td[@data-colname='Hook']"));
//		act.moveToElement(trialEnd).perform();
//		WebElement run=driver.findElement(By.xpath("//a[text()='Run']"));
//		act.click(run).perform();
//		
//		WaitStatementLib.iSleep(2);
//		WebElement woofunnels2=driver.findElement(By.xpath("//div[text()='WooFunnels']"));	
//		act.moveToElement(woofunnels2).perform();		
//		WebElement autobotPlugin2=driver.findElement(By.xpath("//a[text()='"+plugin+"']"));
//		act.click(autobotPlugin2).perform();
//		
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.linkText("Task History")).click();
//		WaitStatementLib.iSleep(2);
//		
//		driver.findElements(By.xpath("//div[@class='bwfan-extra-details']//a[text()='"+subscriptionId+"']/../../../..//a[contains(text(),'Testing Subscription Trial End')]/../..//a[text()='Run Now']")).get(0).click();
//		WaitStatementLib.iSleep(3);
//		
//		((JavascriptExecutor)driver).executeScript("window.open('https://mail.google.com/mail/u/0/#inbox','_blank');");
//		
//		WebDriverCommonLib.switchToNewWindow(2, driver);
//		WaitStatementLib.iSleep(3);
//		driver.findElement(By.id("identifierId")).sendKeys("xlpluginstesting@gmail.com");
//		driver.findElement(By.xpath("//span[text()='Next']")).click();
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.name("password")).sendKeys("XlTesing@321");
//		driver.findElement(By.xpath("//span[text()='Next']")).click();
//		WaitStatementLib.iSleep(5);
//		
//		driver.findElement(By.xpath("//div[@class='Cp']//tr")).click();
//		WaitStatementLib.iSleep(2);
//		
//	}
//	
//	@Test
//	public void SubscriptionRenewalPaymentComplete_4()
//	{	
//		WaitStatementLib.iSleep(3);
//		driver.findElement(By.id("user_login")).sendKeys("wc");
//		driver.findElement(By.id("user_pass")).sendKeys("hgHGFH7%6565%");
//		driver.findElement(By.id("wp-submit")).click();
//		WaitStatementLib.iSleep(3);
//		WebElement woofunnels=driver.findElement(By.xpath("//div[text()='WooFunnels']"));
//		Actions act=new Actions(driver);
//		act.moveToElement(woofunnels).perform();		
//		WebElement autobotPlugin=driver.findElement(By.xpath("//a[text()='"+plugin+"']"));
//		act.click(autobotPlugin).perform();
//		
//		driver.findElement(By.linkText("Task History")).click();
//		
//		driver.navigate().to("https://autonami.bwfdemo.in/?autobot_clear_tasks=yes");
//		WaitStatementLib.iSleep(3);
//		driver.navigate().to("https://autonami.bwfdemo.in/wp-admin/admin.php?page=autonami&tab=tasks");
//		WaitStatementLib.iSleep(2);
//		WebElement autobot=driver.findElement(By.xpath("//a[text()='Autonami Automations']"));
//		act.moveToElement(autobot).perform();
//		WaitStatementLib.iSleep(2);
//		WebElement autobotStore=driver.findElement(By.xpath("//a[text()='Visit Store']"));
//		act.click(autobotStore).perform();
//		
//		driver.findElement(By.xpath("//a[@data-product_id='138']")).click();
//		driver.findElement(By.xpath("//a[text()='View cart']")).click();
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.xpath("//a[contains(text(),'Proceed to checkout')]")).click();
//		
//		AeroCheckoutPage acp=new AeroCheckoutPage(driver);
//		acp.billingInformation();
//		WaitStatementLib.iSleep(2);
//		acp.clickOnCreditCardForNative(driver);
//		acp.placeOrder();
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.xpath("//td[contains(@class,'subscription-id order-number')]/a")).click();
//		driver.findElement(By.linkText("Renew Now")).click();
//		
//		WaitStatementLib.iSleep(2);
//		acp.clickOnCreditCardForNative(driver);
//		acp.placeOrder();
//		OrderDetails od=new OrderDetails(driver);
//		od.finalOrders();						
//		od.findOrderNo();
//		
//		String orderNumber=driver.findElement(By.xpath("//div[@class='woocommerce-order']//li[contains(@class,'overview__order')]/strong")).getText();
//		String subscriptionId=driver.findElement(By.xpath("//td[contains(@class,'subscription-id order-number')]")).getText();
//		System.out.println(subscriptionId);
//		String subsId = subscriptionId.replaceAll("#", "");
//		System.out.println(subsId);
//		
//		WaitStatementLib.iSleep(3);
//		WebElement autobot1=driver.findElement(By.xpath("(//a[text()='Autonami Automations'])[2]"));
//		act.moveToElement(autobot1).perform();
//		WaitStatementLib.iSleep(2);
//		WebElement autobotDashboard=driver.findElement(By.xpath("//a[text()='Dashboard']"));
//		act.click(autobotDashboard).perform();
//		WaitStatementLib.iSleep(2);
//		
//		WebElement woofunnels1=driver.findElement(By.xpath("//div[text()='WooFunnels']"));	
//		act.moveToElement(woofunnels1).perform();		
//		WebElement autobotPlugin1=driver.findElement(By.xpath("//a[text()='"+plugin+"']"));
//		act.click(autobotPlugin1).perform();
//		
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.linkText("Task History")).click();
//		WaitStatementLib.iSleep(2);
//		
//		driver.findElements(By.xpath("//div[@class='bwfan-extra-details']//a[text()='"+subscriptionId+"']/../../../..//a[contains(text(),'Testing Subscription Renewal Payment Complete')]/../..//a[text()='Run Now']")).get(0).click();
//		WaitStatementLib.iSleep(3);
//		
//		((JavascriptExecutor)driver).executeScript("window.open('https://mail.google.com/mail/u/0/#inbox','_blank');");
//		
//		WebDriverCommonLib.switchToNewWindow(2, driver);
//		WaitStatementLib.iSleep(3);
//		driver.findElement(By.id("identifierId")).sendKeys("xlpluginstesting@gmail.com");
//		driver.findElement(By.xpath("//span[text()='Next']")).click();
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.name("password")).sendKeys("XlTesing@321");
//		driver.findElement(By.xpath("//span[text()='Next']")).click();
//		WaitStatementLib.iSleep(5);
//		
//		driver.findElement(By.xpath("//div[@class='Cp']//tr")).click();
//		WaitStatementLib.iSleep(2);
//		
//	}
//	
	@Test
	public void SubscriptionRenewalPaymentFailed_5()
	{	
		WaitStatementLib.iSleep(3);
		driver.findElement(By.id("user_login")).sendKeys("wc");
		driver.findElement(By.id("user_pass")).sendKeys("hgHGFH7%6565%");
		driver.findElement(By.id("wp-submit")).click();
		WaitStatementLib.iSleep(3);
		WebElement woofunnels=driver.findElement(By.xpath("//div[text()='WooFunnels']"));
		Actions act=new Actions(driver);
		act.moveToElement(woofunnels).perform();		
		WebElement autobotPlugin=driver.findElement(By.xpath("//a[text()='"+plugin+"']"));
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
		
		driver.findElement(By.xpath("//a[@data-product_id='138']")).click();
		driver.findElement(By.xpath("//a[text()='View cart']")).click();
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("//a[contains(text(),'Proceed to checkout')]")).click();
		
		AeroCheckoutPage acp=new AeroCheckoutPage(driver);
		acp.billingInformation();
		WaitStatementLib.iSleep(2);
		acp.clickOnCreditCardForNative(driver);
		acp.placeOrder();
		WaitStatementLib.iSleep(2);
		OrderDetails od=new OrderDetails(driver);
		od.finalOrders();						
		od.findOrderNo();
		String orderNumber=driver.findElement(By.xpath("//div[@class='woocommerce-order']//li[contains(@class,'overview__order')]/strong")).getText();
		String subscriptionId=driver.findElement(By.xpath("//td[contains(@class,'subscription-id order-number')]")).getText();
		System.out.println(subscriptionId);
		String subsId = subscriptionId.replaceAll("#", "");
		System.out.println(subsId);
		driver.findElement(By.xpath("//td[contains(@class,'subscription-id order-number')]/a")).click();
		driver.findElement(By.linkText("Renew Now")).click();
		
		WaitStatementLib.iSleep(2);
		acp.clickOnDeclinedCreditCard(driver);
		acp.placeOrder();
		WaitStatementLib.iSleep(8);
		
		WebElement autobot1=driver.findElement(By.xpath("(//a[text()='Autonami Automations'])[2]"));
		act.moveToElement(autobot1).perform();
		WaitStatementLib.iSleep(2);
		WebElement autobotDashboard=driver.findElement(By.xpath("//a[text()='Dashboard']"));
		act.click(autobotDashboard).perform();
		WaitStatementLib.iSleep(2);
		
		WebElement woofunnels1=driver.findElement(By.xpath("//div[text()='WooFunnels']"));	
		act.moveToElement(woofunnels1).perform();		
		WebElement autobotPlugin1=driver.findElement(By.xpath("//a[text()='"+plugin+"']"));
		act.click(autobotPlugin1).perform();
		
		WaitStatementLib.iSleep(2);
		driver.findElement(By.linkText("Task History")).click();
		WaitStatementLib.iSleep(2);
		
		driver.findElements(By.xpath("//div[@class='bwfan-extra-details']//a[text()='"+subscriptionId+"']/../../../..//a[contains(text(),'Testing Subscription Renewal Payment Failed')]/../..//a[text()='Run Now']")).get(0).click();
		WaitStatementLib.iSleep(5);
		WebElement scheduledTasks=driver.findElement(By.xpath("//div[text()='Scheduled Tasks']"));
		WebDriverCommonLib.scrollUp(scheduledTasks, driver);
		WaitStatementLib.iSleep(5);
		
		WebElement woocommerce1=driver.findElement(By.xpath("//div[text()='WooCommerce']"));
		act.moveToElement(woocommerce1).perform();	
		WebElement woocommSubscription=driver.findElement(By.xpath("//a[contains(text(),'Subscription')]"));
		act.click(woocommSubscription).perform();
		
		String subscriptionStatus=driver.findElement(By.xpath("//strong[text()='"+subsId+"']/../../../preceding-sibling::td/mark")).getText();
		System.out.println(subscriptionStatus);
		
	}
//	
//	
///************************************************ Perform ALL the below tests Manually *******************************************************/
//	
//	
//	
//	@Test
//	public void SubscriptionBeforeRenewal_6()
//	{	
//		WaitStatementLib.iSleep(3);
//		driver.findElement(By.id("user_login")).sendKeys("wc");
//		driver.findElement(By.id("user_pass")).sendKeys("hgHGFH7%6565%");
//		driver.findElement(By.id("wp-submit")).click();
//		WaitStatementLib.iSleep(3);
//		WebElement woofunnels=driver.findElement(By.xpath("//div[text()='WooFunnels']"));
//		Actions act=new Actions(driver);
//		act.moveToElement(woofunnels).perform();		
//		WebElement autobotPlugin=driver.findElement(By.xpath("//a[text()='"+plugin+"']"));
//		act.click(autobotPlugin).perform();
//		
//		driver.findElement(By.linkText("Task History")).click();
//		
//		driver.navigate().to("https://autonami.bwfdemo.in/?autobot_clear_tasks=yes");
//		WaitStatementLib.iSleep(3);
//		driver.navigate().to("https://autonami.bwfdemo.in/wp-admin/admin.php?page=autonami&tab=tasks");
//		WaitStatementLib.iSleep(2);
//		WebElement autobot=driver.findElement(By.xpath("//a[text()='Autonami Automations']"));
//		act.moveToElement(autobot).perform();
//		WaitStatementLib.iSleep(2);
//		WebElement autobotStore=driver.findElement(By.xpath("//a[text()='Visit Store']"));
//		act.click(autobotStore).perform();
//		
//		driver.findElement(By.xpath("//a[@data-product_id='150']")).click();
//		driver.findElement(By.xpath("//a[text()='View cart']")).click();
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.xpath("//a[contains(text(),'Proceed to checkout')]")).click();
//		
//		AeroCheckoutPage acp=new AeroCheckoutPage(driver);
//		acp.billingInformation();
//		WaitStatementLib.iSleep(2);
//		acp.clickOnCreditCardForNative(driver);
//		acp.placeOrder();
//		WaitStatementLib.iSleep(2);
//		OrderDetails od=new OrderDetails(driver);
//		od.finalOrders();						
//		od.findOrderNo();
//		WaitStatementLib.iSleep(8);
//		
//		String orderNumber=driver.findElement(By.xpath("//div[@class='woocommerce-order']//li[contains(@class,'overview__order')]/strong")).getText();
//		String subscriptionId=driver.findElement(By.xpath("//td[contains(@class,'subscription-id order-number')]")).getText();
//		System.out.println(subscriptionId);
//		String subsId = subscriptionId.replaceAll("#", "");
//		System.out.println(subsId);
//		
//		WaitStatementLib.iSleep(3);
//		WebElement autobot1=driver.findElement(By.xpath("(//a[text()='Autonami Automations'])[2]"));
//		act.moveToElement(autobot1).perform();
//		WaitStatementLib.iSleep(2);
//		WebElement autobotDashboard=driver.findElement(By.xpath("//a[text()='Dashboard']"));
//		act.click(autobotDashboard).perform();
//		WaitStatementLib.iSleep(2);
//		
//		WebElement woofunnels1=driver.findElement(By.xpath("//div[text()='WooFunnels']"));	
//		act.moveToElement(woofunnels1).perform();		
//		WebElement autobotPlugin1=driver.findElement(By.xpath("//a[text()='"+plugin+"']"));
//		act.click(autobotPlugin1).perform();
//		
//		driver.findElement(By.xpath("//a[contains(text(),'#238')]")).click();
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.id("bwfan-days_before")).clear();
//		driver.findElement(By.id("bwfan-days_before")).sendKeys("2");
//		
//		driver.findElement(By.id("bwfan-hours")).clear();
//		driver.findElement(By.id("bwfan-hours")).sendKeys("10");
//		
//		driver.findElement(By.id("bwfan-minutes")).clear();
//		driver.findElement(By.id("bwfan-minutes")).sendKeys("01");
//		
//		driver.findElement(By.linkText("Save")).click();
//		WaitStatementLib.iSleep(5);
//		
//		((JavascriptExecutor)driver).executeScript("window.open('https://autonami.bwfdemo.in/?rest_route=/woofunnels/v1/worker','_blank');");
//		WaitStatementLib.iSleep(5);
//		WebDriverCommonLib.switchToNewWindow(1, driver);
//		
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.xpath("//a[contains(@class,'bwfan_btn_close')]")).click();
//		
//		driver.findElement(By.linkText("Task History")).click();
//		WaitStatementLib.iSleep(2);
//		
//		driver.findElement(By.xpath("//a[contains(text(),'Completed')]")).click();
//		WaitStatementLib.iSleep(2);
//		
//		boolean status = driver.findElement(By.xpath("//div[@class='bwfan-extra-details']//a[text()='"+subscriptionId+"']/../../../..//a[contains(text(),'Testing Subscription Before Renewal')]")).isDisplayed();
//		System.out.println(status);
//		WaitStatementLib.iSleep(3);
//		
//		((JavascriptExecutor)driver).executeScript("window.open('https://mail.google.com/mail/u/0/#inbox','_blank');");
//		
//		WebDriverCommonLib.switchToNewWindow(3, driver);
//		WaitStatementLib.iSleep(3);
//		driver.findElement(By.id("identifierId")).sendKeys("xlpluginstesting@gmail.com");
//		driver.findElement(By.xpath("//span[text()='Next']")).click();
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.name("password")).sendKeys("XlTesing@321");
//		driver.findElement(By.xpath("//span[text()='Next']")).click();
//		WaitStatementLib.iSleep(5);
//		
//		driver.findElement(By.xpath("//div[@class='Cp']//tr")).click();
//		WaitStatementLib.iSleep(2);
//		
//	}
//	
//	@Test
//	public void SubscriptionBeforeEnd_7()
//	{	
//		WaitStatementLib.iSleep(3);
//		driver.findElement(By.id("user_login")).sendKeys("wc");
//		driver.findElement(By.id("user_pass")).sendKeys("hgHGFH7%6565%");
//		driver.findElement(By.id("wp-submit")).click();
//		WaitStatementLib.iSleep(3);
//		WebElement woofunnels=driver.findElement(By.xpath("//div[text()='WooFunnels']"));
//		Actions act=new Actions(driver);
//		act.moveToElement(woofunnels).perform();		
//		WebElement autobotPlugin=driver.findElement(By.xpath("//a[text()='"+plugin+"']"));
//		act.click(autobotPlugin).perform();
//		
//		driver.findElement(By.linkText("Task History")).click();
//		
//		driver.navigate().to("https://autonami.bwfdemo.in/?autobot_clear_tasks=yes");
//		WaitStatementLib.iSleep(3);
//		driver.navigate().to("https://autonami.bwfdemo.in/wp-admin/admin.php?page=autonami&tab=tasks");
//		WaitStatementLib.iSleep(2);
//		WebElement autobot=driver.findElement(By.xpath("//a[text()='Autonami Automations']"));
//		act.moveToElement(autobot).perform();
//		WaitStatementLib.iSleep(2);
//		WebElement autobotStore=driver.findElement(By.xpath("//a[text()='Visit Store']"));
//		act.click(autobotStore).perform();
//		
//		driver.findElement(By.xpath("//a[@data-product_id='150']")).click();
//		driver.findElement(By.xpath("//a[text()='View cart']")).click();
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.xpath("//a[contains(text(),'Proceed to checkout')]")).click();
//		
//		AeroCheckoutPage acp=new AeroCheckoutPage(driver);
//		acp.billingInformation();
//		WaitStatementLib.iSleep(2);
//		acp.clickOnCreditCardForNative(driver);
//		acp.placeOrder();
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.xpath("//td[contains(@class,'subscription-id order-number')]/a")).click();
//		driver.findElement(By.linkText("Renew Now")).click();
//		
//		WaitStatementLib.iSleep(2);
//		acp.clickOnCreditCardForNative(driver);
//		acp.placeOrder();
//		OrderDetails od=new OrderDetails(driver);
//		od.finalOrders();						
//		od.findOrderNo();
//		
//		String orderNumber=driver.findElement(By.xpath("//div[@class='woocommerce-order']//li[contains(@class,'overview__order')]/strong")).getText();
//		String subscriptionId=driver.findElement(By.xpath("//td[contains(@class,'subscription-id order-number')]")).getText();
//		System.out.println(subscriptionId);
//		String subsId = subscriptionId.replaceAll("#", "");
//		System.out.println(subsId);
//		
//		WaitStatementLib.iSleep(3);
//		WebElement autobot1=driver.findElement(By.xpath("(//a[text()='Autonami Automations'])[2]"));
//		act.moveToElement(autobot1).perform();
//		WaitStatementLib.iSleep(2);
//		WebElement autobotDashboard=driver.findElement(By.xpath("//a[text()='Dashboard']"));
//		act.click(autobotDashboard).perform();
//		WaitStatementLib.iSleep(2);
//		
//		WebElement woofunnels1=driver.findElement(By.xpath("//div[text()='WooFunnels']"));	
//		act.moveToElement(woofunnels1).perform();		
//		WebElement autobotPlugin1=driver.findElement(By.xpath("//a[text()='"+plugin+"']"));
//		act.click(autobotPlugin1).perform();
//		
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.xpath("//a[contains(text(),'#239')]")).click();
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.id("bwfan-days_before")).clear();
//		driver.findElement(By.id("bwfan-days_before")).sendKeys("6");
//		
//		driver.findElement(By.id("bwfan-hours")).clear();
//		driver.findElement(By.id("bwfan-hours")).sendKeys("10");
//		
//		driver.findElement(By.id("bwfan-minutes")).clear();
//		driver.findElement(By.id("bwfan-minutes")).sendKeys("01");
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.linkText("Save")).click();
//		WaitStatementLib.iSleep(5);
//		
//		((JavascriptExecutor)driver).executeScript("window.open('https://autonami.bwfdemo.in/?rest_route=/woofunnels/v1/worker','_blank');");
//		WaitStatementLib.iSleep(5);
//		WebDriverCommonLib.switchToNewWindow(1, driver);
//		
//		driver.findElement(By.xpath("//a[contains(@class,'bwfan_btn_close')]")).click();
//		WaitStatementLib.iSleep(5);
//		
//		driver.findElement(By.linkText("Task History")).click();
//		WaitStatementLib.iSleep(2);
//		
//		driver.findElement(By.xpath("//a[contains(text(),'Completed')]")).click();
//		WaitStatementLib.iSleep(2);
//		
//		boolean status = driver.findElement(By.xpath("//div[@class='bwfan-extra-details']//a[text()='"+subscriptionId+"']/../../../..//a[contains(text(),'Testing Subscription Before End')]")).isDisplayed();
//		System.out.println(status);
//		WaitStatementLib.iSleep(3);
//		
//		((JavascriptExecutor)driver).executeScript("window.open('https://mail.google.com/mail/u/0/#inbox','_blank');");
//		
//		WebDriverCommonLib.switchToNewWindow(3, driver);
//		WaitStatementLib.iSleep(3);
//		driver.findElement(By.id("identifierId")).sendKeys("xlpluginstesting@gmail.com");
//		driver.findElement(By.xpath("//span[text()='Next']")).click();
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.name("password")).sendKeys("XlTesing@321");
//		driver.findElement(By.xpath("//span[text()='Next']")).click();
//		WaitStatementLib.iSleep(5);
//		
//		driver.findElement(By.xpath("//div[@class='Cp']//tr")).click();
//		WaitStatementLib.iSleep(2);
//		
//	}
//	
//	@Test
//	public void CustomerBeforeCardExpiry_8()
//	{	
//		WaitStatementLib.iSleep(3);
//		driver.findElement(By.id("user_login")).sendKeys("wc");
//		driver.findElement(By.id("user_pass")).sendKeys("hgHGFH7%6565%");
//		driver.findElement(By.id("wp-submit")).click();
//		WaitStatementLib.iSleep(3);
//		WebElement woofunnels=driver.findElement(By.xpath("//div[text()='WooFunnels']"));
//		Actions act=new Actions(driver);
//		act.moveToElement(woofunnels).perform();		
//		WebElement autobotPlugin=driver.findElement(By.xpath("//a[text()='"+plugin+"']"));
//		act.click(autobotPlugin).perform();
//		
//		driver.findElement(By.linkText("Task History")).click();
//		
//		driver.navigate().to("https://autonami.bwfdemo.in/?autobot_clear_tasks=yes");
//		WaitStatementLib.iSleep(3);
//		driver.navigate().to("https://autonami.bwfdemo.in/wp-admin/admin.php?page=autonami&tab=tasks");
//		WaitStatementLib.iSleep(2);
//		WebElement autobot=driver.findElement(By.xpath("//a[text()='Autonami Automations']"));
//		act.moveToElement(autobot).perform();
//		WaitStatementLib.iSleep(2);
//		WebElement autobotStore=driver.findElement(By.xpath("//a[text()='Visit Store']"));
//		act.click(autobotStore).perform();
//		
//		driver.findElement(By.xpath("//a[@data-product_id='138']")).click();
//		driver.findElement(By.xpath("//a[text()='View cart']")).click();
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.xpath("//a[contains(text(),'Proceed to checkout')]")).click();
//		
//		AeroCheckoutPage acp=new AeroCheckoutPage(driver);
//		acp.billingInformation();
//		WaitStatementLib.iSleep(2);
//		acp.clickOnCreditCardForNative(driver);
//		acp.placeOrder();
//		WaitStatementLib.iSleep(2);
//		OrderDetails od=new OrderDetails(driver);
//		od.finalOrders();						
//		od.findOrderNo();
//		
//		String orderNumber=driver.findElement(By.xpath("//div[@class='woocommerce-order']//li[contains(@class,'overview__order')]/strong")).getText();
//		String subscriptionId=driver.findElement(By.xpath("//td[contains(@class,'subscription-id order-number')]")).getText();
//		System.out.println(subscriptionId);
//		String subsId = subscriptionId.replaceAll("#", "");
//		System.out.println(subsId);
//		
//		WaitStatementLib.iSleep(3);
//		WebElement autobot1=driver.findElement(By.xpath("(//a[text()='Autonami Automations'])[2]"));
//		act.moveToElement(autobot1).perform();
//		WaitStatementLib.iSleep(2);
//		WebElement autobotDashboard=driver.findElement(By.xpath("//a[text()='Dashboard']"));
//		act.click(autobotDashboard).perform();
//		WaitStatementLib.iSleep(2);
//		
//		WebElement woofunnels1=driver.findElement(By.xpath("//div[text()='WooFunnels']"));	
//		act.moveToElement(woofunnels1).perform();		
//		WebElement autobotPlugin1=driver.findElement(By.xpath("//a[text()='"+plugin+"']"));
//		act.click(autobotPlugin1).perform();
//		
//		driver.findElement(By.xpath("//a[contains(text(),'#322')]")).click();
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.name("event_meta[days_before]")).clear();
//		driver.findElement(By.name("event_meta[days_before]")).sendKeys("17");
//		
//		driver.findElement(By.id("bwfan-hours")).clear();
//		driver.findElement(By.id("bwfan-hours")).sendKeys("10");
//		
//		driver.findElement(By.id("bwfan-minutes")).clear();
//		driver.findElement(By.id("bwfan-minutes")).sendKeys("01");
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.linkText("Save")).click();
//		WaitStatementLib.iSleep(5);
//		
//		((JavascriptExecutor)driver).executeScript("window.open('https://autonami.bwfdemo.in/?rest_route=/woofunnels/v1/worker','_blank');");
//		WaitStatementLib.iSleep(5);
//		WebDriverCommonLib.switchToNewWindow(1, driver);
//		
//		driver.findElement(By.xpath("//a[contains(@class,'bwfan_btn_close')]")).click();
//		WaitStatementLib.iSleep(5);
//		
//		driver.findElement(By.linkText("Task History")).click();
//		WaitStatementLib.iSleep(2);
//		
//		driver.findElement(By.xpath("//a[contains(text(),'Completed')]")).click();
//		WaitStatementLib.iSleep(2);
//		
//		boolean status = driver.findElement(By.xpath("//div[@class='bwfan-extra-details']//a[text()='"+subscriptionId+"']/../../../..//a[contains(text(),'Testing Customer Before Card Expiry')]")).isDisplayed();
//		System.out.println(status);
//		WaitStatementLib.iSleep(3);
//		
//		((JavascriptExecutor)driver).executeScript("window.open('https://mail.google.com/mail/u/0/#inbox','_blank');");
//		
//		WebDriverCommonLib.switchToNewWindow(2, driver);
//		WaitStatementLib.iSleep(3);
//		driver.findElement(By.id("identifierId")).sendKeys("xlpluginstesting@gmail.com");
//		driver.findElement(By.xpath("//span[text()='Next']")).click();
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.name("password")).sendKeys("XlTesing@321");
//		driver.findElement(By.xpath("//span[text()='Next']")).click();
//		WaitStatementLib.iSleep(5);
//		
//		driver.findElement(By.xpath("//div[@class='Cp']//tr")).click();
//		WaitStatementLib.iSleep(2);
//		
//	}
	
}
