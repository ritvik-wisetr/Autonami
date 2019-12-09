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

public class ConnectorsConnectionTest_3 extends BaseLib
{
	@Test
	public void ActiveCampaign_1()
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
		
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("//a[@data-product_id='442']")).click();
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
		WebElement autobotPlugin1=driver.findElement(By.xpath("//a[text()='"+plugin+"']"));
		act.click(autobotPlugin1).perform();
		
		driver.findElement(By.linkText("Connectors")).click();
		WaitStatementLib.iSleep(2);
		
		driver.findElement(By.xpath("//div[text()='ActiveCampaign']/../../following-sibling::div//a[@class=' wfco-connector-delete']")).click();
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		WaitStatementLib.iSleep(5);
		driver.findElement(By.xpath("//div[text()='ActiveCampaign']/../../following-sibling::div//a[contains(text(),'Connect')]")).click();
		WaitStatementLib.iSleep(2);
		
		driver.findElement(By.name("api_url")).sendKeys("https://xlp.api-us1.com");
		driver.findElement(By.name("api_key")).sendKeys("ef31738a363fb79731cd2d25433c49289be1a965d24b6ad21db037b35db688e164136647");
		driver.findElement(By.xpath("//input[@value='Save']")).click();
		WaitStatementLib.iSleep(6);
		
		driver.findElement(By.xpath("//div[text()='ActiveCampaign']/../../following-sibling::div//a[@class=' wfco-connector-delete']")).click();
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		WaitStatementLib.iSleep(5);
//		String disconnect=driver.findElement(By.xpath("//div[text()='ActiveCampaign']/../../following-sibling::div//a[@class=' wfco-connector-delete']")).getText();
//		System.out.println(disconnect);
		
		driver.findElement(By.linkText("Task History")).click();
		WaitStatementLib.iSleep(2);
		
		driver.findElements(By.xpath("//div[@class='bwfan-extra-details']//a[contains(text(),'"+orderNumber+"')]/../../../..//a[contains(text(),'Testing Active Campaign')]/../../../..//a[text()='Run Now']")).get(0).click();
		WaitStatementLib.iSleep(3);
		
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("//a[contains(text(),'Failed')]")).click();
		WaitStatementLib.iSleep(2);
		
		boolean failedStatus=driver.findElement(By.xpath("//div[@class='bwfan-extra-details']//a[contains(text(),'"+orderNumber+"')]/../../../..//a[contains(text(),'Testing Active Campaign')]")).isDisplayed();
		System.out.println(failedStatus);
		
		driver.findElement(By.linkText("Connectors")).click();
		WaitStatementLib.iSleep(2);
		
		driver.findElement(By.xpath("//div[text()='ActiveCampaign']/../../following-sibling::div//a[contains(text(),'Connect')]")).click();
		WaitStatementLib.iSleep(2);
		driver.findElement(By.name("api_url")).sendKeys("https://xlp.api-us1.com");
		driver.findElement(By.name("api_key")).sendKeys("ef31738a363fb79731cd2d25433c49289be1a965d24b6ad21db037b35db688e164136647");
		driver.findElement(By.xpath("//input[@value='Save']")).click();
		
	}
	
	@Test
	public void Drip_2()
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
		
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("//a[@data-product_id='442']")).click();
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
		WebElement autobotPlugin1=driver.findElement(By.xpath("//a[text()='"+plugin+"']"));
		act.click(autobotPlugin1).perform();
		
		driver.findElement(By.linkText("Connectors")).click();
		WaitStatementLib.iSleep(2);
		
		driver.findElement(By.xpath("//div[text()='Drip']/../../following-sibling::div//a[@class=' wfco-connector-delete']")).click();
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		WaitStatementLib.iSleep(5);
		driver.findElement(By.xpath("//div[text()='Drip']/../../following-sibling::div//a[contains(text(),'Connect')]")).click();
		WaitStatementLib.iSleep(2);
		
		driver.findElement(By.name("access_token")).sendKeys("ac8235f635e1c869d8994a2eb8e3a8c3");
		driver.findElement(By.name("account_id")).sendKeys("6781235");
		driver.findElement(By.xpath("//input[@value='Save']")).click();
		WaitStatementLib.iSleep(6);
		
		driver.findElement(By.xpath("//div[text()='Drip']/../../following-sibling::div//a[@class=' bwfco-connector-delete']")).click();
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		WaitStatementLib.iSleep(5);
		
		driver.findElement(By.linkText("Task History")).click();
		WaitStatementLib.iSleep(2);
		
		driver.findElements(By.xpath("//div[@class='bwfan-extra-details']//a[contains(text(),'"+orderNumber+"')]/../../../..//a[contains(text(),'Testing Drip')]/../../../..//a[text()='Run Now']")).get(0).click();
		WaitStatementLib.iSleep(3);
		
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("//a[contains(text(),'Failed')]")).click();
		WaitStatementLib.iSleep(2);
		
		boolean failedStatus=driver.findElement(By.xpath("//div[@class='bwfan-extra-details']//a[contains(text(),'"+orderNumber+"')]/../../../..//a[contains(text(),'Testing Drip')]")).isDisplayed();
		System.out.println(failedStatus);
		
		driver.findElement(By.linkText("Connectors")).click();
		WaitStatementLib.iSleep(2);
		
		driver.findElement(By.xpath("//div[text()='Drip']/../../following-sibling::div//a[contains(text(),'Connect')]")).click();
		WaitStatementLib.iSleep(2);
		driver.findElement(By.name("access_token")).sendKeys("ac8235f635e1c869d8994a2eb8e3a8c3");
		driver.findElement(By.name("account_id")).sendKeys("6781235");
		driver.findElement(By.xpath("//input[@value='Save']")).click();
		
	}
	
	@Test
	public void ConvertKit_3()
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
		
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("//a[@data-product_id='442']")).click();
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
		WebElement autobotPlugin1=driver.findElement(By.xpath("//a[text()='"+plugin+"']"));
		act.click(autobotPlugin1).perform();
		
		driver.findElement(By.linkText("Connectors")).click();
		WaitStatementLib.iSleep(2);
		
		driver.findElement(By.xpath("//div[text()='ConvertKit']/../../following-sibling::div//a[@class=' wfco-connector-delete']")).click();
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		WaitStatementLib.iSleep(5);
		driver.findElement(By.xpath("//div[text()='ConvertKit']/../../following-sibling::div//a[contains(text(),'Connect')]")).click();
		WaitStatementLib.iSleep(2);
		
		driver.findElement(By.name("api_secret")).sendKeys("ys_tbq-BFrkAKwgruwyzW0vilCuU8lS5ovY0wUXVhBM");
		driver.findElement(By.xpath("//input[@value='Save']")).click();
		WaitStatementLib.iSleep(6);
		
		driver.findElement(By.xpath("//div[text()='ConvertKit']/../../following-sibling::div//a[@class=' wfco-connector-delete']")).click();
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		WaitStatementLib.iSleep(5);
		
		driver.findElement(By.linkText("Task History")).click();
		WaitStatementLib.iSleep(2);
		
		driver.findElements(By.xpath("//div[@class='bwfan-extra-details']//a[contains(text(),'"+orderNumber+"')]/../../../..//a[contains(text(),'Testing ConvertKit')]/../../../..//a[text()='Run Now']")).get(0).click();
		WaitStatementLib.iSleep(3);
		
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("//a[contains(text(),'Failed')]")).click();
		WaitStatementLib.iSleep(2);
		
		boolean failedStatus=driver.findElement(By.xpath("//div[@class='bwfan-extra-details']//a[contains(text(),'"+orderNumber+"')]/../../../..//a[contains(text(),'Testing ConvertKit')]")).isDisplayed();
		System.out.println(failedStatus);
		
		driver.findElement(By.linkText("Connectors")).click();
		WaitStatementLib.iSleep(2);
		
		driver.findElement(By.xpath("//div[text()='ConvertKit']/../../following-sibling::div//a[contains(text(),'Connect')]")).click();
		WaitStatementLib.iSleep(2);
		driver.findElement(By.name("api_secret")).sendKeys("ys_tbq-BFrkAKwgruwyzW0vilCuU8lS5ovY0wUXVhBM");
		driver.findElement(By.xpath("//input[@value='Save']")).click();
		
	}
	
	@Test
	public void Twilio_4()
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
		
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("//a[@data-product_id='442']")).click();
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
		WebElement autobotPlugin1=driver.findElement(By.xpath("//a[text()='"+plugin+"']"));
		act.click(autobotPlugin1).perform();
		
		driver.findElement(By.linkText("Connectors")).click();
		WaitStatementLib.iSleep(2);
		
		driver.findElement(By.xpath("//div[text()='Twilio']/../../following-sibling::div//a[@class=' bwfco-connector-delete']")).click();
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		WaitStatementLib.iSleep(5);
		driver.findElement(By.xpath("//div[text()='Twilio']/../../following-sibling::div//a[contains(text(),'Connect')]")).click();
		WaitStatementLib.iSleep(2);
		
		driver.findElement(By.name("account_sid")).sendKeys("ACa96d1f1f08472137b4b491fa5e022ac8");
		driver.findElement(By.name("auth_token")).sendKeys("57429b1e330057d2e671e84ec60bec46");
		driver.findElement(By.name("twilio_no")).sendKeys("(351) 999-8284");
		driver.findElement(By.xpath("//input[@value='Save']")).click();
		WaitStatementLib.iSleep(6);
		
		driver.findElement(By.xpath("//div[text()='Twilio']/../../following-sibling::div//a[@class=' bwfco-connector-delete']")).click();
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		WaitStatementLib.iSleep(5);
		
		driver.findElement(By.linkText("Task History")).click();
		WaitStatementLib.iSleep(2);
		
		driver.findElements(By.xpath("//div[@class='bwfan-extra-details']//a[contains(text(),'"+orderNumber+"')]/../../../..//a[contains(text(),'Testing Twilio')]/../../../..//a[text()='Run Now']")).get(0).click();
		WaitStatementLib.iSleep(3);
		
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("//a[contains(text(),'Failed')]")).click();
		WaitStatementLib.iSleep(2);
		
		boolean failedStatus=driver.findElement(By.xpath("//div[@class='bwfan-extra-details']//a[contains(text(),'"+orderNumber+"')]/../../../..//a[contains(text(),'Testing Twilio')]")).isDisplayed();
		System.out.println(failedStatus);
		
		driver.findElement(By.linkText("Connectors")).click();
		WaitStatementLib.iSleep(2);
		
		driver.findElement(By.xpath("//div[text()='Twilio']/../../following-sibling::div//a[contains(text(),'Connect')]")).click();
		WaitStatementLib.iSleep(2);
		driver.findElement(By.name("account_sid")).sendKeys("ACa96d1f1f08472137b4b491fa5e022ac8");
		driver.findElement(By.name("auth_token")).sendKeys("57429b1e330057d2e671e84ec60bec46");
		driver.findElement(By.name("twilio_no")).sendKeys("(351) 999-8284");
		driver.findElement(By.xpath("//input[@value='Save']")).click();
		
	}

	@Test
	public void Slack_5()
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
		
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("//a[@data-product_id='442']")).click();
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
		WebElement autobotPlugin1=driver.findElement(By.xpath("//a[text()='"+plugin+"']"));
		act.click(autobotPlugin1).perform();
		
		driver.findElement(By.linkText("Connectors")).click();
		WaitStatementLib.iSleep(2);
		
		driver.findElement(By.xpath("//div[text()='Slack']/../../following-sibling::div//a[@class=' wfco-connector-delete']")).click();
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		WaitStatementLib.iSleep(5);
		driver.findElement(By.xpath("//div[text()='Slack']/../../following-sibling::div//a[contains(text(),'Connect')]")).click();
		WaitStatementLib.iSleep(2);
		
		WebElement ele = driver.findElement(By.xpath("//div[@id='bwfco_connector_fields']//a[text()='Connect Me']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);
		
		driver.findElement(By.id("domain")).sendKeys("wisetr");
		driver.findElement(By.xpath("//span[text()='Continue']")).click();
		WaitStatementLib.iSleep(2);
		driver.findElement(By.id("email")).sendKeys("ritvik@tact9.in");
		driver.findElement(By.id("password")).sendKeys("ritvik@123");
		driver.findElement(By.id("signin_btn")).click();
		WaitStatementLib.iSleep(2);
		
		driver.findElement(By.xpath("//button[text()='Allow']")).click();
		WaitStatementLib.iSleep(2);
		
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		
		driver.findElement(By.xpath("//div[text()='Slack']/../../following-sibling::div//a[@class=' bwfco-connector-delete']")).click();
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		WaitStatementLib.iSleep(5);
		
		driver.findElement(By.linkText("Task History")).click();
		WaitStatementLib.iSleep(2);
		
		driver.findElements(By.xpath("//div[@class='bwfan-extra-details']//a[contains(text(),'"+orderNumber+"')]/../../../..//a[contains(text(),'Testing Slack')]/../../../..//a[text()='Run Now']")).get(0).click();
		WaitStatementLib.iSleep(3);
		
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("//a[contains(text(),'Failed')]")).click();
		WaitStatementLib.iSleep(2);
		
		boolean failedStatus=driver.findElement(By.xpath("//div[@class='bwfan-extra-details']//a[contains(text(),'"+orderNumber+"')]/../../../..//a[contains(text(),'Testing Slack')]")).isDisplayed();
		System.out.println(failedStatus);
		
		driver.findElement(By.linkText("Connectors")).click();
		WaitStatementLib.iSleep(2);
		
		driver.findElement(By.xpath("//div[text()='Slack']/../../following-sibling::div//a[contains(text(),'Connect')]")).click();
		WaitStatementLib.iSleep(2);
		
		WebElement ele1 = driver.findElement(By.xpath("//div[@id='bwfco_connector_fields']//a[text()='Connect Me']"));
		JavascriptExecutor executor1 = (JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();", ele1);
		WaitStatementLib.iSleep(2);
		
		driver.findElement(By.xpath("//button[text()='Allow']")).click();
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		WaitStatementLib.iSleep(2);
	}
	
	@Test
	public void GoogleSpreadSheets_6()
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
		
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("//a[@data-product_id='442']")).click();
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
		WebElement autobotPlugin1=driver.findElement(By.xpath("//a[text()='"+plugin+"']"));
		act.click(autobotPlugin1).perform();
		
		driver.findElement(By.linkText("Connectors")).click();
		WaitStatementLib.iSleep(2);
		
		driver.findElement(By.xpath("//div[text()='Google Spread Sheets']/../../following-sibling::div//a[@class=' wfco-connector-delete']")).click();
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		WaitStatementLib.iSleep(5);
		driver.findElement(By.xpath("//div[text()='Google Spread Sheets']/../../following-sibling::div//a[contains(text(),'Connect')]")).click();
		WaitStatementLib.iSleep(2);
		
		driver.findElement(By.name("account_sid")).sendKeys("ACa96d1f1f08472137b4b491fa5e022ac8");
		driver.findElement(By.name("auth_token")).sendKeys("57429b1e330057d2e671e84ec60bec46");
		driver.findElement(By.name("twilio_no")).sendKeys("(351) 999-8284");
		driver.findElement(By.xpath("//input[@value='Save']")).click();
		WaitStatementLib.iSleep(6);
		
		driver.findElement(By.xpath("//div[text()='Google Spread Sheets']/../../following-sibling::div//a[@class=' wfco-connector-delete']")).click();
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		WaitStatementLib.iSleep(5);
		
		driver.findElement(By.linkText("Task History")).click();
		WaitStatementLib.iSleep(2);
		
		driver.findElements(By.xpath("//div[@class='bwfan-extra-details']//a[contains(text(),'"+orderNumber+"')]/../../../..//a[contains(text(),'Testing GoogleSheets')]/../../../..//a[text()='Run Now']")).get(0).click();
		WaitStatementLib.iSleep(3);
		
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("//a[contains(text(),'Failed')]")).click();
		WaitStatementLib.iSleep(2);
		
		boolean failedStatus=driver.findElement(By.xpath("//div[@class='bwfan-extra-details']//a[contains(text(),'"+orderNumber+"')]/../../../..//a[contains(text(),'Testing GoogleSheets')]")).isDisplayed();
		System.out.println(failedStatus);
		
		driver.findElement(By.linkText("Connectors")).click();
		WaitStatementLib.iSleep(2);
		
		driver.findElement(By.xpath("//div[text()='Google Spread Sheets']/../../following-sibling::div//a[contains(text(),'Connect')]")).click();
		WaitStatementLib.iSleep(2);
		
	}
	
	
	
}
