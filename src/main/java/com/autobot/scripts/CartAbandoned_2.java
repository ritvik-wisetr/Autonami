package com.autobot.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.autobot.generics.BaseLib;
import com.autobot.generics.WaitStatementLib;
import com.autobot.generics.WebDriverCommonLib;
import com.autobot.pageobjects.AeroCheckoutPage;
import com.autobot.pageobjects.OrderDetails;

public class CartAbandoned_2 extends BaseLib
{
/********************** On Native Checkout Page *********/	

	@Test
	public void RecoveryLinkCheck_1()
	{
		WaitStatementLib.iSleep(3);
		driver.findElement(By.id("user_login")).sendKeys("wc");
		driver.findElement(By.id("user_pass")).sendKeys("hgHGFH7%6565%");
		driver.findElement(By.id("wp-submit")).click();
		WaitStatementLib.iSleep(3);
		WebElement woofunnels=driver.findElement(By.xpath("//div[text()='WooFunnels']"));
		Actions act=new Actions(driver);
		act.moveToElement(woofunnels).perform();
		
		WebElement woofunnelsSettings=driver.findElement(By.xpath("//a[contains(@href,'woofunnels_settings')]"));
		act.click(woofunnelsSettings).perform();
		WaitStatementLib.iSleep(2);
		driver.findElement(By.id("wfacp-miscellaneous")).click();
		WebElement defaultCheckoutDrpDwn=driver.findElement(By.id("override-default-checkout-page"));
		WebDriverCommonLib.selectOptionByValue(defaultCheckoutDrpDwn, "0");
		driver.findElement(By.xpath("//input[@value='Save Settings']")).click();
		WaitStatementLib.iSleep(3);
		
		WebElement autobotPlugin=driver.findElement(By.xpath("//a[text()='"+plugin+"']"));
		act.click(autobotPlugin).perform();
		
		driver.findElement(By.linkText("Task History")).click();
		
		driver.navigate().to("https://autonami.bwfdemo.in/?autobot_clear_tasks=yes");
		WaitStatementLib.iSleep(3);
		driver.navigate().to("https://autonami.bwfdemo.in/wp-admin/admin.php?page=autonami&tab=tasks");
		WaitStatementLib.iSleep(2);
		driver.findElement(By.linkText("Carts")).click();
		WaitStatementLib.iSleep(2);
		
		String cartsInitiatedbefore=driver.findElements(By.xpath("//div[@class='bwfan_h3']")).get(1).getText();
		System.out.println("Carts Initiated Before Abandonment: "+cartsInitiatedbefore);
		String abandonedCartsbefore=driver.findElements(By.xpath("//div[@class='bwfan_h3']")).get(3).getText();
		System.out.println("Abandoned Carts Before Abandonment: "+abandonedCartsbefore);
		String capturedCartsbefore=driver.findElements(By.xpath("//div[@class='bwfan_h3']")).get(5).getText();
		System.out.println("Captured Carts Before Abandonment: "+capturedCartsbefore);
		String recoveredCartsbefore=driver.findElements(By.xpath("//div[@class='bwfan_h3']")).get(9).getText();
		System.out.println("Recovered Carts Before Abandonment: "+recoveredCartsbefore);
		
		WebElement autobot=driver.findElement(By.xpath("//a[text()='Autonami Automations']"));
		act.moveToElement(autobot).perform();
		WaitStatementLib.iSleep(2);
		WebElement autobotStore=driver.findElement(By.xpath("//a[text()='Visit Store']"));
		act.click(autobotStore).perform();
		
		driver.findElement(By.xpath("//a[@data-product_id='442']")).click();
		driver.findElement(By.xpath("//a[text()='View cart']")).click();
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("//a[contains(text(),'Proceed to checkout')]")).click();
		
		AeroCheckoutPage acp=new AeroCheckoutPage(driver);
		acp.billingInformation();
		WaitStatementLib.iSleep(2);
		String email=driver.findElement(By.id("billing_email")).getAttribute("value");
		
		WaitStatementLib.iSleep(2);
		WebElement autobot1=driver.findElement(By.xpath("(//a[text()='Autonami Automations'])[2]"));
		act.moveToElement(autobot1).perform();
		WaitStatementLib.iSleep(2);
		WebElement autobotDashboard1=driver.findElement(By.xpath("//a[text()='Dashboard']"));
		act.click(autobotDashboard1).perform();
		WaitStatementLib.iSleep(2);
		WebElement woofunnels1=driver.findElement(By.xpath("//div[text()='WooFunnels']"));	
		act.moveToElement(woofunnels1).perform();		
		WebElement autobotPlugin1=driver.findElement(By.xpath("//a[text()='"+plugin+"']"));
		act.click(autobotPlugin1).perform();
		
		driver.findElement(By.linkText("Carts")).click();
		WaitStatementLib.iSleep(2);
		
		String cartsInitiatedAfterAbandonment=driver.findElements(By.xpath("//div[@class='bwfan_h3']")).get(1).getText();
		System.out.println("Carts Initiated After Abandonment: "+cartsInitiatedAfterAbandonment);
		String abandonedCartsAfterAbandonment=driver.findElements(By.xpath("//div[@class='bwfan_h3']")).get(3).getText();
		System.out.println("Abandoned Carts After Abandonment: "+abandonedCartsAfterAbandonment);
		String capturedCartsAfterAbandonment=driver.findElements(By.xpath("//div[@class='bwfan_h3']")).get(5).getText();
		System.out.println("Captured Carts After Abandonment: "+capturedCartsAfterAbandonment);
		String recoveredCartsAfterAbandonment=driver.findElements(By.xpath("//div[@class='bwfan_h3']")).get(9).getText();
		System.out.println("Recovered Carts After Abandonment: "+recoveredCartsAfterAbandonment);
		WaitStatementLib.iSleep(2);
		driver.findElement(By.linkText("Recoverable Carts")).click();
		
		String expMsg=email;
		String actMsg=driver.findElement(By.xpath("//span[text()='"+email+"']")).getText();
		Assert.assertEquals(actMsg, expMsg);
		Reporter.log(expMsg+" Email existing", true);
		
		WaitStatementLib.iSleep(180);
		
		driver.findElement(By.linkText("Task History")).click();
		WaitStatementLib.iSleep(2);
//		driver.findElements(By.xpath("//div[@class='bwfan-extra-details']//a[text()='"+email+"']/../../../..//a[contains(text(),'Testing Abandoned Cart')]/../..//a[text()='Run Now']")).get(0).click();
//		WaitStatementLib.iSleep(10);
//		
//		WebElement profile=driver.findElement(By.xpath("//a[text()='Howdy, ']"));
//		act.moveToElement(profile).perform();
//		
//		WebElement logOut=driver.findElement(By.xpath("//a[text()='Log Out']"));
//		act.click(logOut).perform();
//		WaitStatementLib.iSleep(2);
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
//		WaitStatementLib.iSleep(4);
//		driver.findElement(By.xpath("//a[text()='Click here']")).click();
//		WaitStatementLib.iSleep(2);
//		
//		WebDriverCommonLib.switchToNewWindow(3, driver);
//		
//		WaitStatementLib.iSleep(2);
//		acp.clickOnDirectBankTransferForNative();
//		acp.placeOrder();
//		OrderDetails od=new OrderDetails(driver);
//		od.finalOrders();
//		od.findOrderNo();
//		
//		String orderNumber=driver.findElement(By.xpath("//div[@class='woocommerce-order']//li[contains(@class,'overview__order')]/strong")).getText();
//		WaitStatementLib.iSleep(2);
//		
//		WebDriverCommonLib.switchToNewWindow(1, driver);
//		
//		WaitStatementLib.iSleep(3);
//		driver.findElement(By.id("user_login")).sendKeys("wc");
//		driver.findElement(By.id("user_pass")).sendKeys("hgHGFH7%6565%");
//		driver.findElement(By.id("wp-submit")).click();
//		
//		WaitStatementLib.iSleep(2);
//		WebElement woofunnels2=driver.findElement(By.xpath("//div[text()='WooFunnels']"));	
//		act.moveToElement(woofunnels2).perform();		
//		WebElement autobotPlugin2=driver.findElement(By.xpath("//a[text()='"+plugin+"']"));
//		act.click(autobotPlugin2).perform();
//		
//		driver.findElement(By.linkText("Carts")).click();
//		WaitStatementLib.iSleep(2);
//		
//		String cartsInitiatedAfterOrder=driver.findElements(By.xpath("//div[@class='bwfan_h3']")).get(1).getText();
//		System.out.println("Carts Initiated After Order: "+cartsInitiatedAfterOrder);
//		String abandonedCartsAfterOrder=driver.findElements(By.xpath("//div[@class='bwfan_h3']")).get(3).getText();
//		System.out.println("Abandoned Carts After Order: "+abandonedCartsAfterOrder);
//		String capturedCartsAfterOrder=driver.findElements(By.xpath("//div[@class='bwfan_h3']")).get(5).getText();
//		System.out.println("Captured Carts After Order: "+capturedCartsAfterOrder);
//		String recoveredCartsAfterOrder=driver.findElements(By.xpath("//div[@class='bwfan_h3']")).get(9).getText();
//		System.out.println("Recovered Carts After Order: "+recoveredCartsAfterOrder);
//		
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.linkText("Recovered Carts")).click();
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.xpath("//span[text()='"+email+"']/../../following-sibling::td[contains(@class,'order')]//strong[contains(text(),'"+orderNumber+"')]/../../following-sibling::td//a")).click();
//		WaitStatementLib.iSleep(3);
//		
	}
//	
//	@Test
//	public void NoThanksAfterEmail_2()
//	{
//		WaitStatementLib.iSleep(3);
//		driver.findElement(By.id("user_login")).sendKeys("wc");
//		driver.findElement(By.id("user_pass")).sendKeys("hgHGFH7%6565%");
//		driver.findElement(By.id("wp-submit")).click();
//		WaitStatementLib.iSleep(3);
//		WebElement woofunnels=driver.findElement(By.xpath("//div[text()='WooFunnels']"));
//		Actions act=new Actions(driver);
//		act.moveToElement(woofunnels).perform();
//		
//		WebElement woofunnelsSettings=driver.findElement(By.xpath("//a[contains(@href,'woofunnels_settings')]"));
//		act.click(woofunnelsSettings).perform();
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.id("wfacp-miscellaneous")).click();
//		WebElement defaultCheckoutDrpDwn=driver.findElement(By.id("override-default-checkout-page"));
//		WebDriverCommonLib.selectOptionByValue(defaultCheckoutDrpDwn, "0");
//		driver.findElement(By.xpath("//input[@value='Save Settings']")).click();
//		WaitStatementLib.iSleep(3);
//		
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
//		driver.findElement(By.xpath("//a[@data-product_id='442']")).click();
//		driver.findElement(By.xpath("//a[text()='View cart']")).click();
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.xpath("//a[contains(text(),'Proceed to checkout')]")).click();
//		
//		AeroCheckoutPage acp=new AeroCheckoutPage(driver);
//		acp.billingInformation();
//		String email=driver.findElement(By.id("billing_email")).getAttribute("value");
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.linkText("No Thanks")).click();
//		WaitStatementLib.iSleep(5);
//		
//		WebElement autobot1=driver.findElement(By.xpath("(//a[text()='Autonami Automations'])[2]"));
//		act.moveToElement(autobot1).perform();
//		WaitStatementLib.iSleep(2);
//		WebElement autobotDashboard1=driver.findElement(By.xpath("//a[text()='Dashboard']"));
//		act.click(autobotDashboard1).perform();
//		WaitStatementLib.iSleep(2);
//		WebElement woofunnels1=driver.findElement(By.xpath("//div[text()='WooFunnels']"));	
//		act.moveToElement(woofunnels1).perform();		
//		WebElement autobotPlugin1=driver.findElement(By.xpath("//a[text()='"+plugin+"']"));
//		act.click(autobotPlugin1).perform();
//		
//		driver.findElement(By.linkText("Carts")).click();
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.linkText("Recoverable Carts")).click();
//		WaitStatementLib.iSleep(3);
//		
//	}
//	
//	@Test
//	public void NoThanksBeforeEmail_3()
//	{
//		WaitStatementLib.iSleep(3);
//		driver.findElement(By.id("user_login")).sendKeys("wc");
//		driver.findElement(By.id("user_pass")).sendKeys("hgHGFH7%6565%");
//		driver.findElement(By.id("wp-submit")).click();
//		WaitStatementLib.iSleep(3);
//		WebElement woofunnels=driver.findElement(By.xpath("//div[text()='WooFunnels']"));
//		Actions act=new Actions(driver);
//		act.moveToElement(woofunnels).perform();	
//		
//		WebElement woofunnelsSettings=driver.findElement(By.xpath("//a[contains(@href,'woofunnels_settings')]"));
//		act.click(woofunnelsSettings).perform();
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.id("wfacp-miscellaneous")).click();
//		WebElement defaultCheckoutDrpDwn=driver.findElement(By.id("override-default-checkout-page"));
//		WebDriverCommonLib.selectOptionByValue(defaultCheckoutDrpDwn, "0");
//		driver.findElement(By.xpath("//input[@value='Save Settings']")).click();
//		WaitStatementLib.iSleep(3);
//		
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
//		driver.findElement(By.xpath("//a[@data-product_id='442']")).click();
//		driver.findElement(By.xpath("//a[text()='View cart']")).click();
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.xpath("//a[contains(text(),'Proceed to checkout')]")).click();
//		
//		driver.findElement(By.linkText("No Thanks")).click();
//		WaitStatementLib.iSleep(5);
//		
//		AeroCheckoutPage acp=new AeroCheckoutPage(driver);
//		acp.billingInformation();
//		String email=driver.findElement(By.id("billing_email")).getAttribute("value");
//		WaitStatementLib.iSleep(2);
//		
//		WebElement autobot1=driver.findElement(By.xpath("(//a[text()='Autonami Automations'])[2]"));
//		act.moveToElement(autobot1).perform();
//		WaitStatementLib.iSleep(2);
//		WebElement autobotDashboard1=driver.findElement(By.xpath("//a[text()='Dashboard']"));
//		act.click(autobotDashboard1).perform();
//		WaitStatementLib.iSleep(2);
//		WebElement woofunnels1=driver.findElement(By.xpath("//div[text()='WooFunnels']"));	
//		act.moveToElement(woofunnels1).perform();		
//		WebElement autobotPlugin1=driver.findElement(By.xpath("//a[text()='"+plugin+"']"));
//		act.click(autobotPlugin1).perform();
//		
//		driver.findElement(By.linkText("Carts")).click();
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.linkText("Recoverable Carts")).click();
//		WaitStatementLib.iSleep(3);
//		
//	}
//	
//	@Test
//	public void ActiveCampaign_4()
//	{
//		WaitStatementLib.iSleep(3);
//		driver.findElement(By.id("user_login")).sendKeys("wc");
//		driver.findElement(By.id("user_pass")).sendKeys("hgHGFH7%6565%");
//		driver.findElement(By.id("wp-submit")).click();
//		WaitStatementLib.iSleep(3);
//		WebElement woofunnels=driver.findElement(By.xpath("//div[text()='WooFunnels']"));
//		Actions act=new Actions(driver);
//		act.moveToElement(woofunnels).perform();
//		
//		WebElement woofunnelsSettings=driver.findElement(By.xpath("//a[contains(@href,'woofunnels_settings')]"));
//		act.click(woofunnelsSettings).perform();
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.id("wfacp-miscellaneous")).click();
//		WebElement defaultCheckoutDrpDwn=driver.findElement(By.id("override-default-checkout-page"));
//		WebDriverCommonLib.selectOptionByValue(defaultCheckoutDrpDwn, "0");
//		driver.findElement(By.xpath("//input[@value='Save Settings']")).click();
//		WaitStatementLib.iSleep(3);
//		
//		WebElement autobotPlugin=driver.findElement(By.xpath("//a[text()='"+plugin+"']"));
//		act.click(autobotPlugin).perform();
//		
//		driver.findElement(By.linkText("Task History")).click();
//		
//		driver.navigate().to("https://autonami.bwfdemo.in/?autobot_clear_tasks=yes");
//		WaitStatementLib.iSleep(3);
//		driver.navigate().to("https://autonami.bwfdemo.in/wp-admin/admin.php?page=autonami&tab=tasks");
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.linkText("Carts")).click();
//		WaitStatementLib.iSleep(2);
//		
//		String cartsInitiatedbefore=driver.findElements(By.xpath("//div[@class='bwfan_h3']")).get(1).getText();
//		System.out.println("Carts Initiated Before Abandonment: "+cartsInitiatedbefore);
//		String abandonedCartsbefore=driver.findElements(By.xpath("//div[@class='bwfan_h3']")).get(3).getText();
//		System.out.println("Abandoned Carts Before Abandonment: "+abandonedCartsbefore);
//		String capturedCartsbefore=driver.findElements(By.xpath("//div[@class='bwfan_h3']")).get(5).getText();
//		System.out.println("Captured Carts Before Abandonment: "+capturedCartsbefore);
//		String recoveredCartsbefore=driver.findElements(By.xpath("//div[@class='bwfan_h3']")).get(9).getText();
//		System.out.println("Recovered Carts Before Abandonment: "+recoveredCartsbefore);
//		
//		WebElement autobot=driver.findElement(By.xpath("//a[text()='Autonami Automations']"));
//		act.moveToElement(autobot).perform();
//		WaitStatementLib.iSleep(2);
//		WebElement autobotStore=driver.findElement(By.xpath("//a[text()='Visit Store']"));
//		act.click(autobotStore).perform();
//		
//		driver.findElement(By.xpath("//a[@data-product_id='442']")).click();
//		driver.findElement(By.xpath("//a[text()='View cart']")).click();
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.xpath("//a[contains(text(),'Proceed to checkout')]")).click();
//		
//		AeroCheckoutPage acp=new AeroCheckoutPage(driver);
//		acp.billingInformation();
//		WaitStatementLib.iSleep(2);
//		String email=driver.findElement(By.id("billing_email")).getAttribute("value");
//		System.out.println(email);
//		
//		WaitStatementLib.iSleep(2);
//		WebElement autobot1=driver.findElement(By.xpath("(//a[text()='Autonami Automations'])[2]"));
//		act.moveToElement(autobot1).perform();
//		WaitStatementLib.iSleep(2);
//		WebElement autobotDashboard1=driver.findElement(By.xpath("//a[text()='Dashboard']"));
//		act.click(autobotDashboard1).perform();
//		WaitStatementLib.iSleep(2);
//		WebElement woofunnels1=driver.findElement(By.xpath("//div[text()='WooFunnels']"));	
//		act.moveToElement(woofunnels1).perform();		
//		WebElement autobotPlugin1=driver.findElement(By.xpath("//a[text()='"+plugin+"']"));
//		act.click(autobotPlugin1).perform();
//		
//		driver.findElement(By.linkText("Carts")).click();
//		WaitStatementLib.iSleep(2);
//		
//		String cartsInitiatedAfterAbandonment=driver.findElements(By.xpath("//div[@class='bwfan_h3']")).get(1).getText();
//		System.out.println("Carts Initiated After Abandonment: "+cartsInitiatedAfterAbandonment);
//		String abandonedCartsAfterAbandonment=driver.findElements(By.xpath("//div[@class='bwfan_h3']")).get(3).getText();
//		System.out.println("Abandoned Carts After Abandonment: "+abandonedCartsAfterAbandonment);
//		String capturedCartsAfterAbandonment=driver.findElements(By.xpath("//div[@class='bwfan_h3']")).get(5).getText();
//		System.out.println("Captured Carts After Abandonment: "+capturedCartsAfterAbandonment);
//		String recoveredCartsAfterAbandonment=driver.findElements(By.xpath("//div[@class='bwfan_h3']")).get(9).getText();
//		System.out.println("Recovered Carts After Abandonment: "+recoveredCartsAfterAbandonment);
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.linkText("Recoverable Carts")).click();
//		
//		String expMsg=email;
//		String actMsg=driver.findElement(By.xpath("//span[text()='"+email+"']")).getText();
//		Assert.assertEquals(actMsg, expMsg);
//		Reporter.log(expMsg+" Email existing", true);
//		
//		WaitStatementLib.iSleep(180);
//		
//		driver.findElement(By.linkText("Task History")).click();
//		WaitStatementLib.iSleep(2);
//		driver.findElements(By.xpath("//div[@class='bwfan-extra-details']//a[text()='"+email+"']/../../../..//a[contains(text(),'Testing Active Campaign on Abandoned Cart')]/../..//a[text()='Run Now']")).get(0).click();
//		WaitStatementLib.iSleep(10);
//		
//		WebElement profile=driver.findElement(By.xpath("//a[text()='Howdy, ']"));
//		act.moveToElement(profile).perform();
//		
//		WebElement logOut=driver.findElement(By.xpath("//a[text()='Log Out']"));
//		act.click(logOut).perform();
//		WaitStatementLib.iSleep(2);
//		
//		((JavascriptExecutor)driver).executeScript("window.open('https://tact995765.activehosted.com/','_blank');");
//		WaitStatementLib.iSleep(2);
//		WebDriverCommonLib.switchToNewWindow(2, driver);
//		
//		driver.findElement(By.id("user")).sendKeys("parmod@tact9.in");
//		driver.findElement(By.id("pass")).sendKeys("parmod@123");
//		driver.findElement(By.xpath("//input[@value='Login']")).click();
//		WaitStatementLib.iSleep(2);
//		
//		driver.findElement(By.xpath("//div[contains(text(),'Contacts')]")).click();
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.xpath("//a[text()='Date Created']")).click();
//		WaitStatementLib.iSleep(4);
//		driver.findElement(By.xpath("//td[@class='text_left email']/a")).click();
//		WaitStatementLib.iSleep(3);
//		WebElement ele=driver.findElement(By.xpath("//div[@class='body ']//td[text()='Tags']"));
//		WebDriverCommonLib.elementDisplay("Tags", ele, driver);
//		WaitStatementLib.iSleep(6);
//		
//		driver.findElement(By.xpath("//span[text()='Products']")).click();
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.xpath("//a[text()='View Details']")).click();
//		
//		WebDriverCommonLib.switchToNewWindow(3, driver);
//		
//		WaitStatementLib.iSleep(2);
//		acp.clickOnDirectBankTransferForNative();
//		acp.placeOrder();
//		OrderDetails od=new OrderDetails(driver);
//		od.finalOrders();
//		od.findOrderNo();
//		
//		String orderNumber=driver.findElement(By.xpath("//div[@class='woocommerce-order']//li[contains(@class,'overview__order')]/strong")).getText();
//		WaitStatementLib.iSleep(2);
//		
//		WebDriverCommonLib.switchToNewWindow(1, driver);
//		
//		WaitStatementLib.iSleep(3);
//		driver.findElement(By.id("user_login")).sendKeys("wc");
//		driver.findElement(By.id("user_pass")).sendKeys("hgHGFH7%6565%");
//		driver.findElement(By.id("wp-submit")).click();
//		
//		WaitStatementLib.iSleep(2);
//		WebElement woofunnels2=driver.findElement(By.xpath("//div[text()='WooFunnels']"));	
//		act.moveToElement(woofunnels2).perform();		
//		WebElement autobotPlugin2=driver.findElement(By.xpath("//a[text()='"+plugin+"']"));
//		act.click(autobotPlugin2).perform();
//		
//		driver.findElement(By.linkText("Carts")).click();
//		WaitStatementLib.iSleep(2);
//		
//		String cartsInitiatedAfterOrder=driver.findElements(By.xpath("//div[@class='bwfan_h3']")).get(1).getText();
//		System.out.println("Carts Initiated After Order: "+cartsInitiatedAfterOrder);
//		String abandonedCartsAfterOrder=driver.findElements(By.xpath("//div[@class='bwfan_h3']")).get(3).getText();
//		System.out.println("Abandoned Carts After Order: "+abandonedCartsAfterOrder);
//		String capturedCartsAfterOrder=driver.findElements(By.xpath("//div[@class='bwfan_h3']")).get(5).getText();
//		System.out.println("Captured Carts After Order: "+capturedCartsAfterOrder);
//		String recoveredCartsAfterOrder=driver.findElements(By.xpath("//div[@class='bwfan_h3']")).get(9).getText();
//		System.out.println("Recovered Carts After Order: "+recoveredCartsAfterOrder);
//		
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.linkText("Recovered Carts")).click();
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.xpath("//span[text()='"+email+"']/../../following-sibling::td[contains(@class,'order')]//strong[contains(text(),'"+orderNumber+"')]/../../following-sibling::td//a")).click();
//		WaitStatementLib.iSleep(3);
//		
//		
//	}
//	
//	
//	
//	/********************** On Embed Checkout Page *********/		
//	
//	@Test
//	public void TestOnAeroEmbed_5()
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
//		driver.findElement(By.linkText("Carts")).click();
//		WaitStatementLib.iSleep(2);
//		
//		String cartsInitiatedbefore=driver.findElements(By.xpath("//div[@class='bwfan_h3']")).get(1).getText();
//		System.out.println("Carts Initiated Before Abandonment: "+cartsInitiatedbefore);
//		
//		String abandonedCartsbefore=driver.findElements(By.xpath("//div[@class='bwfan_h3']")).get(3).getText();
//		System.out.println("Abandoned Carts Before Abandonment: "+abandonedCartsbefore);
//		
//		String capturedCartsbefore=driver.findElements(By.xpath("//div[@class='bwfan_h3']")).get(5).getText();
//		System.out.println("Captured Carts Before Abandonment: "+capturedCartsbefore);
//
//		String recoveredCartsbefore=driver.findElements(By.xpath("//div[@class='bwfan_h3']")).get(9).getText();
//		System.out.println("Recovered Carts Before Abandonment: "+recoveredCartsbefore);
//		
//		WebElement profile=driver.findElement(By.xpath("//a[text()='Howdy, ']"));
//		act.moveToElement(profile).perform();
//		
//		WebElement logOut=driver.findElement(By.xpath("//a[text()='Log Out']"));
//		act.click(logOut).perform();
//		WaitStatementLib.iSleep(2);
//		
//		((JavascriptExecutor)driver).executeScript("window.open('https://autonami.bwfdemo.in/sample-page/','_blank');");
//		
//		WebDriverCommonLib.switchToNewWindow(2, driver);
//		WaitStatementLib.iSleep(2);
//		
//		AeroCheckoutPage acp=new AeroCheckoutPage(driver);
//		acp.shippingInformation();
//		String email=driver.findElement(By.id("billing_email")).getAttribute("value");
//		acp.showProduct(driver);
//		WaitStatementLib.iSleep(2);
//		driver.close();
//		
//		WebDriverCommonLib.switchToNewWindow(1, driver);
//		WaitStatementLib.iSleep(3);
//		driver.findElement(By.id("user_login")).clear();
//		driver.findElement(By.id("user_login")).sendKeys("wc");
//		driver.findElement(By.id("user_pass")).clear();
//		driver.findElement(By.id("user_pass")).sendKeys("hgHGFH7%6565%");
//		driver.findElement(By.id("wp-submit")).click();
//		
//		WebElement woofunnels2=driver.findElement(By.xpath("//div[text()='WooFunnels']"));	
//		act.moveToElement(woofunnels2).perform();		
//		WebElement autobotPlugin1=driver.findElement(By.xpath("//a[text()='"+plugin+"']"));
//		act.click(autobotPlugin1).perform();
//		
//		driver.findElement(By.linkText("Carts")).click();
//		WaitStatementLib.iSleep(2);
//		
//		String cartsInitiatedAfterAbandonment=driver.findElements(By.xpath("//div[@class='bwfan_h3']")).get(1).getText();
//		System.out.println("Carts Initiated After Abandonment: "+cartsInitiatedAfterAbandonment);
//
//		String abandonedCartsAfterAbandonment=driver.findElements(By.xpath("//div[@class='bwfan_h3']")).get(3).getText();
//		System.out.println("Abandoned Carts After Abandonment: "+abandonedCartsAfterAbandonment);
//
//		String capturedCartsAfterAbandonment=driver.findElements(By.xpath("//div[@class='bwfan_h3']")).get(5).getText();
//		System.out.println("Captured Carts After Abandonment: "+capturedCartsAfterAbandonment);
//
//		String recoveredCartsAfterAbandonment=driver.findElements(By.xpath("//div[@class='bwfan_h3']")).get(9).getText();
//		System.out.println("Recovered Carts After Abandonment: "+recoveredCartsAfterAbandonment);
//
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.linkText("Recoverable Carts")).click();
//		
//		String expMsg=email;
//		String actMsg=driver.findElement(By.xpath("//span[text()='"+email+"']")).getText();
//		Assert.assertEquals(actMsg, expMsg);
//		Reporter.log(expMsg+" Email existing", true);
//		
//		WaitStatementLib.iSleep(150);
//		
//		driver.findElement(By.linkText("Task History")).click();
//		WaitStatementLib.iSleep(3);
//		
//		driver.findElements(By.xpath("//div[@class='bwfan-extra-details']//a[text()='"+email+"']/../../../..//a[contains(text(),'Testing Abandoned Cart')]/../../../..//a[text()='Run Now']")).get(0).click();
//		WaitStatementLib.iSleep(4);
//		
//		((JavascriptExecutor)driver).executeScript("window.open('https://mail.google.com/mail/u/0/#inbox','_blank');");
//		WaitStatementLib.iSleep(2);
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
//		driver.findElement(By.xpath("//a[text()='Click here']")).click();
//		
//		WebDriverCommonLib.switchToNewWindow(3, driver);
//		
//		WaitStatementLib.iSleep(2);
//		acp.clickOnDirectBankTransferForNative();
//		acp.placeOrder();
//		OrderDetails od=new OrderDetails(driver);
//		od.finalOrders();
//		od.findOrderNo();
//		
//		String orderNumber=driver.findElement(By.xpath("//div[@class='woocommerce-order']//li[contains(@class,'overview__order')]/strong")).getText();
//		WaitStatementLib.iSleep(2);
//		
//		WebDriverCommonLib.switchToNewWindow(1, driver);
//		
//		driver.findElement(By.linkText("Carts")).click();
//		WaitStatementLib.iSleep(2);
//		
//		String cartsInitiatedAfterOrder=driver.findElements(By.xpath("//div[@class='bwfan_h3']")).get(1).getText();
//		System.out.println("Carts Initiated After Order: "+cartsInitiatedAfterOrder);
//		
//		String abandonedCartsAfterOrder=driver.findElements(By.xpath("//div[@class='bwfan_h3']")).get(3).getText();
//		System.out.println("Abandoned Carts After Order: "+abandonedCartsAfterOrder);
//		
//		String capturedCartsAfterOrder=driver.findElements(By.xpath("//div[@class='bwfan_h3']")).get(5).getText();
//		System.out.println("Captured Carts After Order: "+capturedCartsAfterOrder);
//		
//		String recoveredCartsAfterOrder=driver.findElements(By.xpath("//div[@class='bwfan_h3']")).get(9).getText();
//		System.out.println("Recovered Carts After Order: "+recoveredCartsAfterOrder);
//		
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.linkText("Recovered Carts")).click();
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.xpath("//span[text()='"+email+"']/../../following-sibling::td[contains(@class,'order')]//strong[contains(text(),'"+orderNumber+"')]/../../following-sibling::td//a")).click();
//		WaitStatementLib.iSleep(3);
//		
//	}
//	
//	@Test
//	public void UnsubscribeLink_6()
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
//		driver.findElement(By.linkText("Carts")).click();
//		WaitStatementLib.iSleep(2);
//		
//		String cartsInitiatedbefore=driver.findElements(By.xpath("//div[@class='bwfan_h3']")).get(1).getText();
//		System.out.println("Carts Initiated Before Abandonment: "+cartsInitiatedbefore);
//		
//		String abandonedCartsbefore=driver.findElements(By.xpath("//div[@class='bwfan_h3']")).get(3).getText();
//		System.out.println("Abandoned Carts Before Abandonment: "+abandonedCartsbefore);
//		
//		String capturedCartsbefore=driver.findElements(By.xpath("//div[@class='bwfan_h3']")).get(5).getText();
//		System.out.println("Captured Carts Before Abandonment: "+capturedCartsbefore);
//
//		String recoveredCartsbefore=driver.findElements(By.xpath("//div[@class='bwfan_h3']")).get(9).getText();
//		System.out.println("Recovered Carts Before Abandonment: "+recoveredCartsbefore);
//		
//		WebElement profile=driver.findElement(By.xpath("//a[text()='Howdy, ']"));
//		act.moveToElement(profile).perform();
//		
//		WebElement logOut=driver.findElement(By.xpath("//a[text()='Log Out']"));
//		act.click(logOut).perform();
//		WaitStatementLib.iSleep(2);
//		
//		((JavascriptExecutor)driver).executeScript("window.open('https://autonami.bwfdemo.in/sample-page/','_blank');");
//		
//		WebDriverCommonLib.switchToNewWindow(2, driver);
//		WaitStatementLib.iSleep(2);
//		
//		AeroCheckoutPage acp=new AeroCheckoutPage(driver);
//		acp.shippingInformation();
//		String email=driver.findElement(By.id("billing_email")).getAttribute("value");
//		acp.showProduct(driver);
//		WaitStatementLib.iSleep(2);
//		driver.close();
//		
//		WebDriverCommonLib.switchToNewWindow(1, driver);
//		WaitStatementLib.iSleep(3);
//		driver.findElement(By.id("user_login")).clear();
//		driver.findElement(By.id("user_login")).sendKeys("wc");
//		driver.findElement(By.id("user_pass")).clear();
//		driver.findElement(By.id("user_pass")).sendKeys("hgHGFH7%6565%");
//		driver.findElement(By.id("wp-submit")).click();
//		
//		WebElement woofunnels2=driver.findElement(By.xpath("//div[text()='WooFunnels']"));	
//		act.moveToElement(woofunnels2).perform();		
//		WebElement autobotPlugin1=driver.findElement(By.xpath("//a[text()='"+plugin+"']"));
//		act.click(autobotPlugin1).perform();
//		
//		driver.findElement(By.linkText("Carts")).click();
//		WaitStatementLib.iSleep(2);
//		
//		String cartsInitiatedAfterAbandonment=driver.findElements(By.xpath("//div[@class='bwfan_h3']")).get(1).getText();
//		System.out.println("Carts Initiated After Abandonment: "+cartsInitiatedAfterAbandonment);
//
//		String abandonedCartsAfterAbandonment=driver.findElements(By.xpath("//div[@class='bwfan_h3']")).get(3).getText();
//		System.out.println("Abandoned Carts After Abandonment: "+abandonedCartsAfterAbandonment);
//
//		String capturedCartsAfterAbandonment=driver.findElements(By.xpath("//div[@class='bwfan_h3']")).get(5).getText();
//		System.out.println("Captured Carts After Abandonment: "+capturedCartsAfterAbandonment);
//
//		String recoveredCartsAfterAbandonment=driver.findElements(By.xpath("//div[@class='bwfan_h3']")).get(9).getText();
//		System.out.println("Recovered Carts After Abandonment: "+recoveredCartsAfterAbandonment);
//
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.linkText("Recoverable Carts")).click();
//		
//		String expMsg=email;
//		String actMsg=driver.findElement(By.xpath("//span[text()='"+email+"']")).getText();
//		Assert.assertEquals(actMsg, expMsg);
//		Reporter.log(expMsg+" Email existing", true);
//		
//		WaitStatementLib.iSleep(150);
//		
//		driver.findElement(By.linkText("Task History")).click();
//		WaitStatementLib.iSleep(3);
//		
//		driver.findElements(By.xpath("//div[@class='bwfan-extra-details']//a[text()='"+email+"']/../../../..//a[contains(text(),'Testing Abandoned Cart')]/../../../..//a[text()='Run Now']")).get(0).click();
//		WaitStatementLib.iSleep(4);
//		
//		((JavascriptExecutor)driver).executeScript("window.open('https://mail.google.com/mail/u/0/#inbox','_blank');");
//		WaitStatementLib.iSleep(2);
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
//		WaitStatementLib.iSleep(3);
//		driver.findElement(By.xpath("//a[text()='unsubscribe']")).click();
//		WaitStatementLib.iSleep(2);
//		
//		WebDriverCommonLib.switchToNewWindow(3, driver);
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.id("bwfan_unsubscribe")).click();
//		WaitStatementLib.iSleep(2);
//		
//		WebDriverCommonLib.switchToNewWindow(1, driver);
//		
//		driver.findElement(By.linkText("Unsubscribers")).click();
//		WaitStatementLib.iSleep(4);
//		
//	}
//	
///********************************* IMPORTANT NOTE **********************************************/	
//	
//	
//	
///*** On AeroCheckout Page - Set Global Checkout page as Checkout Page_Ritvik as shown in http://imgwxl.com/s/chrome_2H9F3sMIng.png ***/	
//
//	
//	@Test
//	public void TestOnAeroCheckout_7()
//	{
//		WaitStatementLib.iSleep(3);
//		driver.findElement(By.id("user_login")).sendKeys("wc");
//		driver.findElement(By.id("user_pass")).sendKeys("hgHGFH7%6565%");
//		driver.findElement(By.id("wp-submit")).click();
//		WaitStatementLib.iSleep(3);
//		WebElement woofunnels=driver.findElement(By.xpath("//div[text()='WooFunnels']"));
//		Actions act=new Actions(driver);
//		act.moveToElement(woofunnels).perform();
//		WebElement woofunnelsSettings=driver.findElement(By.xpath("//a[contains(@href,'woofunnels_settings')]"));
//		act.click(woofunnelsSettings).perform();
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.id("wfacp-miscellaneous")).click();
//		WebElement defaultCheckoutDrpDwn=driver.findElement(By.id("override-default-checkout-page"));
//		WebDriverCommonLib.selectOptionByValue(defaultCheckoutDrpDwn, "603");
//		driver.findElement(By.xpath("//input[@value='Save Settings']")).click();
//		WaitStatementLib.iSleep(3);
//		
//		WebElement autobotPlugin=driver.findElement(By.xpath("//a[text()='"+plugin+"']"));
//		act.click(autobotPlugin).perform();
//		
//		driver.findElement(By.linkText("Task History")).click();
//		
//		driver.navigate().to("https://autonami.bwfdemo.in/?autobot_clear_tasks=yes");
//		WaitStatementLib.iSleep(3);
//		driver.navigate().to("https://autonami.bwfdemo.in/wp-admin/admin.php?page=autonami&tab=tasks");
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.linkText("Carts")).click();
//		WaitStatementLib.iSleep(2);
//		
//		String cartsInitiatedbefore=driver.findElements(By.xpath("//div[@class='bwfan_h3']")).get(1).getText();
//		System.out.println("Carts Initiated Before Abandonment: "+cartsInitiatedbefore);
//		
//		String abandonedCartsbefore=driver.findElements(By.xpath("//div[@class='bwfan_h3']")).get(3).getText();
//		System.out.println("Abandoned Carts Before Abandonment: "+abandonedCartsbefore);
//		
//		String capturedCartsbefore=driver.findElements(By.xpath("//div[@class='bwfan_h3']")).get(5).getText();
//		System.out.println("Captured Carts Before Abandonment: "+capturedCartsbefore);
//
//		String recoveredCartsbefore=driver.findElements(By.xpath("//div[@class='bwfan_h3']")).get(9).getText();
//		System.out.println("Recovered Carts Before Abandonment: "+recoveredCartsbefore);
//		
//		WebElement profile=driver.findElement(By.xpath("//a[text()='Howdy, ']"));
//		act.moveToElement(profile).perform();
//		
//		WebElement logOut=driver.findElement(By.xpath("//a[text()='Log Out']"));
//		act.click(logOut).perform();
//		WaitStatementLib.iSleep(2);
//		
//		((JavascriptExecutor)driver).executeScript("window.open('https://autonami.bwfdemo.in/shop/','_blank');");
//		WebDriverCommonLib.switchToNewWindow(2, driver);
//		
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.xpath("//a[@data-product_id='442']")).click();
//		driver.findElement(By.xpath("//a[text()='View cart']")).click();
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.xpath("//a[contains(text(),'Proceed to checkout')]")).click();
//		
//		AeroCheckoutPage acp=new AeroCheckoutPage(driver);
//		acp.shippingInformation();
//		String email=driver.findElement(By.id("billing_email")).getAttribute("value");
//		acp.showProduct(driver);
//		WaitStatementLib.iSleep(2);
//		driver.close();
//		
//		WebDriverCommonLib.switchToNewWindow(1, driver);
//		WaitStatementLib.iSleep(3);
//		driver.findElement(By.id("user_login")).clear();
//		driver.findElement(By.id("user_login")).sendKeys("wc");
//		driver.findElement(By.id("user_pass")).clear();
//		driver.findElement(By.id("user_pass")).sendKeys("hgHGFH7%6565%");
//		driver.findElement(By.id("wp-submit")).click();
//		
//		WebElement woofunnels2=driver.findElement(By.xpath("//div[text()='WooFunnels']"));	
//		act.moveToElement(woofunnels2).perform();		
//		WebElement autobotPlugin1=driver.findElement(By.xpath("//a[text()='"+plugin+"']"));
//		act.click(autobotPlugin1).perform();
//		
//		driver.findElement(By.linkText("Carts")).click();
//		WaitStatementLib.iSleep(2);
//		
//		String cartsInitiatedAfterAbandonment=driver.findElements(By.xpath("//div[@class='bwfan_h3']")).get(1).getText();
//		System.out.println("Carts Initiated After Abandonment: "+cartsInitiatedAfterAbandonment);
//
//		String abandonedCartsAfterAbandonment=driver.findElements(By.xpath("//div[@class='bwfan_h3']")).get(3).getText();
//		System.out.println("Abandoned Carts After Abandonment: "+abandonedCartsAfterAbandonment);
//
//		String capturedCartsAfterAbandonment=driver.findElements(By.xpath("//div[@class='bwfan_h3']")).get(5).getText();
//		System.out.println("Captured Carts After Abandonment: "+capturedCartsAfterAbandonment);
//
//		String recoveredCartsAfterAbandonment=driver.findElements(By.xpath("//div[@class='bwfan_h3']")).get(9).getText();
//		System.out.println("Recovered Carts After Abandonment: "+recoveredCartsAfterAbandonment);
//
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.linkText("Recoverable Carts")).click();
//		
//		String expMsg=email;
//		String actMsg=driver.findElement(By.xpath("//span[text()='"+email+"']")).getText();
//		Assert.assertEquals(actMsg, expMsg);
//		Reporter.log(expMsg+" Email existing", true);
//		
//		WaitStatementLib.iSleep(150);
//		
//		driver.findElement(By.linkText("Task History")).click();
//		WaitStatementLib.iSleep(3);
//		
//		driver.findElements(By.xpath("//div[@class='bwfan-extra-details']//a[text()='"+email+"']/../../../..//a[contains(text(),'Testing Abandoned Cart')]/../../../..//a[text()='Run Now']")).get(0).click();
//		WaitStatementLib.iSleep(4);
//		
//		((JavascriptExecutor)driver).executeScript("window.open('https://mail.google.com/mail/u/0/#inbox','_blank');");
//		WaitStatementLib.iSleep(2);
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
//		driver.findElement(By.xpath("//a[text()='Click here']")).click();
//		
//		WebDriverCommonLib.switchToNewWindow(3, driver);
//		
//		WaitStatementLib.iSleep(2);
//		acp.clickOnDirectBankTransferForNative();
//		acp.placeOrder();
//		OrderDetails od=new OrderDetails(driver);
//		od.finalOrders();
//		od.findOrderNo();
//		
//		String orderNumber=driver.findElement(By.xpath("//div[@class='woocommerce-order']//li[contains(@class,'overview__order')]/strong")).getText();
//		WaitStatementLib.iSleep(2);
//		
//		WebDriverCommonLib.switchToNewWindow(1, driver);
//		
//		driver.findElement(By.linkText("Carts")).click();
//		WaitStatementLib.iSleep(2);
//		
//		String cartsInitiatedAfterOrder=driver.findElements(By.xpath("//div[@class='bwfan_h3']")).get(1).getText();
//		System.out.println("Carts Initiated After Order: "+cartsInitiatedAfterOrder);
//
//		String abandonedCartsAfterOrder=driver.findElements(By.xpath("//div[@class='bwfan_h3']")).get(3).getText();
//		System.out.println("Abandoned Carts After Order: "+abandonedCartsAfterOrder);
//
//		String capturedCartsAfterOrder=driver.findElements(By.xpath("//div[@class='bwfan_h3']")).get(5).getText();
//		System.out.println("Captured Carts After Order: "+capturedCartsAfterOrder);
//
//		String recoveredCartsAfterOrder=driver.findElements(By.xpath("//div[@class='bwfan_h3']")).get(9).getText();
//		System.out.println("Recovered Carts After Order: "+recoveredCartsAfterOrder);
//		
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.linkText("Recovered Carts")).click();
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.xpath("//span[text()='"+email+"']/../../following-sibling::td[contains(@class,'order')]//strong[contains(text(),'"+orderNumber+"')]/../../following-sibling::td//a")).click();
//		WaitStatementLib.iSleep(2);
//		
//		WebElement woofunnelsSettings1=driver.findElement(By.xpath("//a[contains(@href,'woofunnels_settings')]"));
//		act.click(woofunnelsSettings1).perform();
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.id("wfacp-miscellaneous")).click();
//		WebElement defaultCheckoutDrpDwn1=driver.findElement(By.id("override-default-checkout-page"));
//		WebDriverCommonLib.selectOptionByValue(defaultCheckoutDrpDwn1, "0");
//		driver.findElement(By.xpath("//input[@value='Save Settings']")).click();
//		WaitStatementLib.iSleep(3);
//		
//	}
//	
//	@Test
//	public void TestingApplyCouponSilently_8()
//	{
//		WaitStatementLib.iSleep(3);
//		driver.findElement(By.id("user_login")).sendKeys("wc");
//		driver.findElement(By.id("user_pass")).sendKeys("hgHGFH7%6565%");
//		driver.findElement(By.id("wp-submit")).click();
//		WaitStatementLib.iSleep(3);
//		WebElement woofunnels=driver.findElement(By.xpath("//div[text()='WooFunnels']"));
//		Actions act=new Actions(driver);
//		act.moveToElement(woofunnels).perform();
//		WebElement woofunnelsSettings=driver.findElement(By.xpath("//a[contains(@href,'woofunnels_settings')]"));
//		act.click(woofunnelsSettings).perform();
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.id("wfacp-miscellaneous")).click();
//		WebElement defaultCheckoutDrpDwn=driver.findElement(By.id("override-default-checkout-page"));
//		WebDriverCommonLib.selectOptionByValue(defaultCheckoutDrpDwn, "603");
//		driver.findElement(By.xpath("//input[@value='Save Settings']")).click();
//		WaitStatementLib.iSleep(3);
//		
//		WebElement autobotPlugin=driver.findElement(By.xpath("//a[text()='"+plugin+"']"));
//		act.click(autobotPlugin).perform();
//		
//		driver.findElement(By.linkText("Task History")).click();
//		
//		driver.navigate().to("https://autonami.bwfdemo.in/?autobot_clear_tasks=yes");
//		WaitStatementLib.iSleep(3);
//		driver.navigate().to("https://autonami.bwfdemo.in/wp-admin/admin.php?page=autonami&tab=tasks");
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.linkText("Carts")).click();
//		WaitStatementLib.iSleep(2);
//		
//		String cartsInitiatedbefore=driver.findElements(By.xpath("//div[@class='bwfan_h3']")).get(1).getText();
//		System.out.println("Carts Initiated Before Abandonment: "+cartsInitiatedbefore);
//		
//		String abandonedCartsbefore=driver.findElements(By.xpath("//div[@class='bwfan_h3']")).get(3).getText();
//		System.out.println("Abandoned Carts Before Abandonment: "+abandonedCartsbefore);
//		
//		String capturedCartsbefore=driver.findElements(By.xpath("//div[@class='bwfan_h3']")).get(5).getText();
//		System.out.println("Captured Carts Before Abandonment: "+capturedCartsbefore);
//
//		String recoveredCartsbefore=driver.findElements(By.xpath("//div[@class='bwfan_h3']")).get(9).getText();
//		System.out.println("Recovered Carts Before Abandonment: "+recoveredCartsbefore);
//		
//		WebElement profile=driver.findElement(By.xpath("//a[text()='Howdy, ']"));
//		act.moveToElement(profile).perform();
//		
//		WebElement logOut=driver.findElement(By.xpath("//a[text()='Log Out']"));
//		act.click(logOut).perform();
//		WaitStatementLib.iSleep(2);
//		
//		((JavascriptExecutor)driver).executeScript("window.open('https://autonami.bwfdemo.in/shop/','_blank');");
//		WebDriverCommonLib.switchToNewWindow(2, driver);
//		
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.xpath("//a[@data-product_id='442']")).click();
//		driver.findElement(By.xpath("//a[text()='View cart']")).click();
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.xpath("//a[contains(text(),'Proceed to checkout')]")).click();
//		
//		AeroCheckoutPage acp=new AeroCheckoutPage(driver);
//		acp.shippingInformation();
//		String email=driver.findElement(By.id("billing_email")).getAttribute("value");
//		acp.couponApply("coupon1");
//		WaitStatementLib.iSleep(2);
//		driver.close();
//		
//		WebDriverCommonLib.switchToNewWindow(1, driver);
//		WaitStatementLib.iSleep(3);
//		driver.findElement(By.id("user_login")).clear();
//		driver.findElement(By.id("user_login")).sendKeys("wc");
//		driver.findElement(By.id("user_pass")).clear();
//		driver.findElement(By.id("user_pass")).sendKeys("hgHGFH7%6565%");
//		driver.findElement(By.id("wp-submit")).click();
//		
//		WebElement woofunnels2=driver.findElement(By.xpath("//div[text()='WooFunnels']"));	
//		act.moveToElement(woofunnels2).perform();		
//		WebElement autobotPlugin1=driver.findElement(By.xpath("//a[text()='"+plugin+"']"));
//		act.click(autobotPlugin1).perform();
//		
//		driver.findElement(By.linkText("Carts")).click();
//		WaitStatementLib.iSleep(2);
//		
//		String cartsInitiatedAfterAbandonment=driver.findElements(By.xpath("//div[@class='bwfan_h3']")).get(1).getText();
//		System.out.println("Carts Initiated After Abandonment: "+cartsInitiatedAfterAbandonment);
//
//		String abandonedCartsAfterAbandonment=driver.findElements(By.xpath("//div[@class='bwfan_h3']")).get(3).getText();
//		System.out.println("Abandoned Carts After Abandonment: "+abandonedCartsAfterAbandonment);
//
//		String capturedCartsAfterAbandonment=driver.findElements(By.xpath("//div[@class='bwfan_h3']")).get(5).getText();
//		System.out.println("Captured Carts After Abandonment: "+capturedCartsAfterAbandonment);
//
//		String recoveredCartsAfterAbandonment=driver.findElements(By.xpath("//div[@class='bwfan_h3']")).get(9).getText();
//		System.out.println("Recovered Carts After Abandonment: "+recoveredCartsAfterAbandonment);
//
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.linkText("Recoverable Carts")).click();
//		
//		String expMsg=email;
//		String actMsg=driver.findElement(By.xpath("//span[text()='"+email+"']")).getText();
//		Assert.assertEquals(actMsg, expMsg);
//		Reporter.log(expMsg+" Email existing", true);
//		
//		WaitStatementLib.iSleep(150);
//		
//		driver.findElement(By.linkText("Task History")).click();
//		WaitStatementLib.iSleep(3);
//		
//		driver.findElements(By.xpath("//div[@class='bwfan-extra-details']//a[text()='"+email+"']/../../../..//a[contains(text(),'Testing Abandoned Cart')]/../../../..//a[text()='Run Now']")).get(0).click();
//		WaitStatementLib.iSleep(4);
//		
//		((JavascriptExecutor)driver).executeScript("window.open('https://mail.google.com/mail/u/0/#inbox','_blank');");
//		WaitStatementLib.iSleep(2);
//		WebDriverCommonLib.switchToNewWindow(3, driver);
//		WaitStatementLib.iSleep(3);
//		driver.findElement(By.id("identifierId")).sendKeys("xlpluginstesting@gmail.com");
//		driver.findElement(By.xpath("//span[text()='Next']")).click();
//		WaitStatementLib.iSleep(3);
//		driver.findElement(By.name("password")).sendKeys("XlTesing@321");
//		driver.findElement(By.xpath("//span[text()='Next']")).click();
//		WaitStatementLib.iSleep(5);
//		
//		driver.findElement(By.xpath("//div[@class='Cp']//tr")).click();
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.xpath("//a[text()='Click here']")).click();
//		
//		WebDriverCommonLib.switchToNewWindow(3, driver);
//		
//		WaitStatementLib.iSleep(2);
//		acp.clickOnDirectBankTransferForNative();
//		acp.placeOrder();
//		OrderDetails od=new OrderDetails(driver);
//		od.finalOrders();
//		od.findOrderNo();
//		
//		String orderNumber=driver.findElement(By.xpath("//div[@class='woocommerce-order']//li[contains(@class,'overview__order')]/strong")).getText();
//		WaitStatementLib.iSleep(2);
//		
//		WebDriverCommonLib.switchToNewWindow(1, driver);
//		
//		driver.findElement(By.linkText("Carts")).click();
//		WaitStatementLib.iSleep(2);
//		
//		String cartsInitiatedAfterOrder=driver.findElements(By.xpath("//div[@class='bwfan_h3']")).get(1).getText();
//		System.out.println("Carts Initiated After Order: "+cartsInitiatedAfterOrder);
//
//		String abandonedCartsAfterOrder=driver.findElements(By.xpath("//div[@class='bwfan_h3']")).get(3).getText();
//		System.out.println("Abandoned Carts After Order: "+abandonedCartsAfterOrder);
//
//		String capturedCartsAfterOrder=driver.findElements(By.xpath("//div[@class='bwfan_h3']")).get(5).getText();
//		System.out.println("Captured Carts After Order: "+capturedCartsAfterOrder);
//
//		String recoveredCartsAfterOrder=driver.findElements(By.xpath("//div[@class='bwfan_h3']")).get(9).getText();
//		System.out.println("Recovered Carts After Order: "+recoveredCartsAfterOrder);
//		
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.linkText("Recovered Carts")).click();
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.xpath("//span[text()='"+email+"']/../../following-sibling::td[contains(@class,'order')]//strong[contains(text(),'"+orderNumber+"')]/../../following-sibling::td//a")).click();
//		WaitStatementLib.iSleep(2);
//		
//		WebElement woofunnelsSettings1=driver.findElement(By.xpath("//a[contains(@href,'woofunnels_settings')]"));
//		act.click(woofunnelsSettings1).perform();
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.id("wfacp-miscellaneous")).click();
//		WebElement defaultCheckoutDrpDwn1=driver.findElement(By.id("override-default-checkout-page"));
//		WebDriverCommonLib.selectOptionByValue(defaultCheckoutDrpDwn1, "0");
//		driver.findElement(By.xpath("//input[@value='Save Settings']")).click();
//		WaitStatementLib.iSleep(3);
//		
//	}
//	
//	@Test
//	public void aeroCheckout_DiscountOnProduct_9()
//	{
//		WaitStatementLib.iSleep(3);
//		driver.findElement(By.id("user_login")).sendKeys("wc");
//		driver.findElement(By.id("user_pass")).sendKeys("hgHGFH7%6565%");
//		driver.findElement(By.id("wp-submit")).click();
//		WaitStatementLib.iSleep(3);
//		WebElement woofunnels=driver.findElement(By.xpath("//div[text()='WooFunnels']"));
//		Actions act=new Actions(driver);
//		act.moveToElement(woofunnels).perform();
//		WebElement woofunnelsSettings=driver.findElement(By.xpath("//a[contains(@href,'woofunnels_settings')]"));
//		act.click(woofunnelsSettings).perform();
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.id("wfacp-miscellaneous")).click();
//		WebElement defaultCheckoutDrpDwn=driver.findElement(By.id("override-default-checkout-page"));
//		WebDriverCommonLib.selectOptionByValue(defaultCheckoutDrpDwn, "603");
//		driver.findElement(By.xpath("//input[@value='Save Settings']")).click();
//		WaitStatementLib.iSleep(3);
//		
//		WebElement autobotPlugin=driver.findElement(By.xpath("//a[text()='"+plugin+"']"));
//		act.click(autobotPlugin).perform();
//		
//		driver.findElement(By.linkText("Task History")).click();
//		
//		driver.navigate().to("https://autonami.bwfdemo.in/?autobot_clear_tasks=yes");
//		WaitStatementLib.iSleep(3);
//		driver.navigate().to("https://autonami.bwfdemo.in/wp-admin/admin.php?page=autonami&tab=tasks");
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.linkText("Carts")).click();
//		WaitStatementLib.iSleep(2);
//		
//		String cartsInitiatedbefore=driver.findElements(By.xpath("//div[@class='bwfan_h3']")).get(1).getText();
//		System.out.println("Carts Initiated Before Abandonment: "+cartsInitiatedbefore);
//		
//		String abandonedCartsbefore=driver.findElements(By.xpath("//div[@class='bwfan_h3']")).get(3).getText();
//		System.out.println("Abandoned Carts Before Abandonment: "+abandonedCartsbefore);
//		
//		String capturedCartsbefore=driver.findElements(By.xpath("//div[@class='bwfan_h3']")).get(5).getText();
//		System.out.println("Captured Carts Before Abandonment: "+capturedCartsbefore);
//
//		String recoveredCartsbefore=driver.findElements(By.xpath("//div[@class='bwfan_h3']")).get(9).getText();
//		System.out.println("Recovered Carts Before Abandonment: "+recoveredCartsbefore);
//		
//		WebElement profile=driver.findElement(By.xpath("//a[text()='Howdy, ']"));
//		act.moveToElement(profile).perform();
//		
//		WebElement logOut=driver.findElement(By.xpath("//a[text()='Log Out']"));
//		act.click(logOut).perform();
//		WaitStatementLib.iSleep(2);
//		
//		((JavascriptExecutor)driver).executeScript("window.open('https://autonami.bwfdemo.in/checkouts/checkout-page_ritvik/','_blank');");
//		WebDriverCommonLib.switchToNewWindow(2, driver);
//		
//		AeroCheckoutPage acp=new AeroCheckoutPage(driver);
//		acp.shippingInformation();
//		String email=driver.findElement(By.id("billing_email")).getAttribute("value");
//		acp.showProduct(driver);
//		WaitStatementLib.iSleep(2);
//		driver.close();
//		
//		WebDriverCommonLib.switchToNewWindow(1, driver);
//		WaitStatementLib.iSleep(3);
//		driver.findElement(By.id("user_login")).clear();
//		driver.findElement(By.id("user_login")).sendKeys("wc");
//		driver.findElement(By.id("user_pass")).clear();
//		driver.findElement(By.id("user_pass")).sendKeys("hgHGFH7%6565%");
//		driver.findElement(By.id("wp-submit")).click();
//		
//		WebElement woofunnels2=driver.findElement(By.xpath("//div[text()='WooFunnels']"));	
//		act.moveToElement(woofunnels2).perform();		
//		WebElement autobotPlugin1=driver.findElement(By.xpath("//a[text()='"+plugin+"']"));
//		act.click(autobotPlugin1).perform();
//		
//		driver.findElement(By.linkText("Carts")).click();
//		WaitStatementLib.iSleep(2);
//		
//		String cartsInitiatedAfterAbandonment=driver.findElements(By.xpath("//div[@class='bwfan_h3']")).get(1).getText();
//		System.out.println("Carts Initiated After Abandonment: "+cartsInitiatedAfterAbandonment);
//
//		String abandonedCartsAfterAbandonment=driver.findElements(By.xpath("//div[@class='bwfan_h3']")).get(3).getText();
//		System.out.println("Abandoned Carts After Abandonment: "+abandonedCartsAfterAbandonment);
//
//		String capturedCartsAfterAbandonment=driver.findElements(By.xpath("//div[@class='bwfan_h3']")).get(5).getText();
//		System.out.println("Captured Carts After Abandonment: "+capturedCartsAfterAbandonment);
//
//		String recoveredCartsAfterAbandonment=driver.findElements(By.xpath("//div[@class='bwfan_h3']")).get(9).getText();
//		System.out.println("Recovered Carts After Abandonment: "+recoveredCartsAfterAbandonment);
//
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.linkText("Recoverable Carts")).click();
//		
//		String expMsg=email;
//		String actMsg=driver.findElement(By.xpath("//span[text()='"+email+"']")).getText();
//		Assert.assertEquals(actMsg, expMsg);
//		Reporter.log(expMsg+" Email existing", true);
//		
//		WaitStatementLib.iSleep(150);
//		
//		driver.findElement(By.linkText("Task History")).click();
//		WaitStatementLib.iSleep(3);
//		
//		driver.findElements(By.xpath("//div[@class='bwfan-extra-details']//a[text()='"+email+"']/../../../..//a[contains(text(),'Testing Abandoned Cart')]/../../../..//a[text()='Run Now']")).get(0).click();
//		WaitStatementLib.iSleep(4);
//		
//		((JavascriptExecutor)driver).executeScript("window.open('https://mail.google.com/mail/u/0/#inbox','_blank');");
//		WaitStatementLib.iSleep(2);
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
//		driver.findElement(By.xpath("//a[text()='Click here']")).click();
//		
//		WebDriverCommonLib.switchToNewWindow(3, driver);
//		
//		WaitStatementLib.iSleep(2);
//		acp.clickOnDirectBankTransferForNative();
//		acp.placeOrder();
//		OrderDetails od=new OrderDetails(driver);
//		od.finalOrders();
//		od.findOrderNo();
//		
//		String orderNumber=driver.findElement(By.xpath("//div[@class='woocommerce-order']//li[contains(@class,'overview__order')]/strong")).getText();
//		WaitStatementLib.iSleep(2);
//		
//		WebDriverCommonLib.switchToNewWindow(1, driver);
//		
//		driver.findElement(By.linkText("Carts")).click();
//		WaitStatementLib.iSleep(2);
//		
//		String cartsInitiatedAfterOrder=driver.findElements(By.xpath("//div[@class='bwfan_h3']")).get(1).getText();
//		System.out.println("Carts Initiated After Order: "+cartsInitiatedAfterOrder);
//
//		String abandonedCartsAfterOrder=driver.findElements(By.xpath("//div[@class='bwfan_h3']")).get(3).getText();
//		System.out.println("Abandoned Carts After Order: "+abandonedCartsAfterOrder);
//
//		String capturedCartsAfterOrder=driver.findElements(By.xpath("//div[@class='bwfan_h3']")).get(5).getText();
//		System.out.println("Captured Carts After Order: "+capturedCartsAfterOrder);
//
//		String recoveredCartsAfterOrder=driver.findElements(By.xpath("//div[@class='bwfan_h3']")).get(9).getText();
//		System.out.println("Recovered Carts After Order: "+recoveredCartsAfterOrder);
//		
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.linkText("Recovered Carts")).click();
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.xpath("//span[text()='"+email+"']/../../following-sibling::td[contains(@class,'order')]//strong[contains(text(),'"+orderNumber+"')]/../../following-sibling::td//a")).click();
//		WaitStatementLib.iSleep(2);
//		
//		WebElement woofunnelsSettings1=driver.findElement(By.xpath("//a[contains(@href,'woofunnels_settings')]"));
//		act.click(woofunnelsSettings1).perform();
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.id("wfacp-miscellaneous")).click();
//		WebElement defaultCheckoutDrpDwn1=driver.findElement(By.id("override-default-checkout-page"));
//		WebDriverCommonLib.selectOptionByValue(defaultCheckoutDrpDwn1, "0");
//		driver.findElement(By.xpath("//input[@value='Save Settings']")).click();
//		WaitStatementLib.iSleep(3);
//		
//	}
	
}
