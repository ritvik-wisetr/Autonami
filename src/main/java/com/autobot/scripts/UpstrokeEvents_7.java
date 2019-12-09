package com.autobot.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.autobot.pageobjects.OrderDetails;
import com.autobot.generics.BaseLib;
import com.autobot.generics.WaitStatementLib;
import com.autobot.generics.WebDriverCommonLib;
import com.autobot.pageobjects.AeroCheckoutPage;

public class UpstrokeEvents_7 extends BaseLib
{
/** put " Upstroke Page_Ritvik " in Live mode & other one in sandbox mode under upstroke plugin to perform below tests & after perform put it again in sandbox **/	
	
	@Test
	public void FunnelStarted_1()
	{
		WaitStatementLib.iSleep(3);
		driver.findElement(By.id("user_login")).sendKeys("wc");
		driver.findElement(By.id("user_pass")).sendKeys("hgHGFH7%6565%");
		driver.findElement(By.id("wp-submit")).click();
		WaitStatementLib.iSleep(3);
		WebElement woofunnels=driver.findElement(By.xpath("//div[text()='WooFunnels']"));
		Actions act=new Actions(driver);
		act.moveToElement(woofunnels).perform();
		WebElement oneClickUpsellsPlugin=driver.findElement(By.xpath("//a[@href='admin.php?page=upstroke']"));
		act.click(oneClickUpsellsPlugin).perform();
		driver.findElement(By.xpath("//input[@data-id='557']/following-sibling::label")).click();
		WaitStatementLib.iSleep(2);
		
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
		
		
		driver.findElement(By.xpath("//a[@data-product_id='442']")).click();
		driver.findElement(By.xpath("//a[text()='View cart']")).click();
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("//a[contains(text(),'Proceed to checkout')]")).click();
		
		AeroCheckoutPage acp=new AeroCheckoutPage(driver);
		acp.billingInformation();
		acp.clickOnCreditCardForNative(driver);
		String email=driver.findElement(By.id("billing_email")).getAttribute("value");
		acp.placeOrder();
		
		WaitStatementLib.iSleep(6);
		
		driver.navigate().to("https://autonami.bwfdemo.in/wp-admin/admin.php?page=autonami&tab=tasks");
		WaitStatementLib.iSleep(3);
		
		driver.findElements(By.xpath("//div[@class='bwfan-extra-details']//a[contains(text(),'557')]/../following-sibling::li/span[contains(text(),'"+email+"')]/../../../..//a[contains(text(),'Testing Funnel Started Upstroke')]/../..//a[text()='Run Now']")).get(0).click();
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
		
		WebDriverCommonLib.switchToNewWindow(1, driver);
		
		WebElement oneClickUpsellsPlugin1=driver.findElement(By.xpath("//a[@href='admin.php?page=upstroke']"));
		act.click(oneClickUpsellsPlugin1).perform();
		driver.findElement(By.xpath("//input[@data-id='557']/following-sibling::label")).click();
		WaitStatementLib.iSleep(2);
	}
	
	@Test
	public void FunnelEnded_Yes_2()
	{
		WaitStatementLib.iSleep(3);
		driver.findElement(By.id("user_login")).sendKeys("wc");
		driver.findElement(By.id("user_pass")).sendKeys("hgHGFH7%6565%");
		driver.findElement(By.id("wp-submit")).click();
		WaitStatementLib.iSleep(3);
		WebElement woofunnels=driver.findElement(By.xpath("//div[text()='WooFunnels']"));
		Actions act=new Actions(driver);
		act.moveToElement(woofunnels).perform();
		WebElement oneClickUpsellsPlugin=driver.findElement(By.xpath("//a[@href='admin.php?page=upstroke']"));
		act.click(oneClickUpsellsPlugin).perform();
		driver.findElement(By.xpath("//input[@data-id='557']/following-sibling::label")).click();
		WaitStatementLib.iSleep(2);
		
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
		
		
		driver.findElement(By.xpath("//a[@data-product_id='442']")).click();
		driver.findElement(By.xpath("//a[text()='View cart']")).click();
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("//a[contains(text(),'Proceed to checkout')]")).click();
		
		AeroCheckoutPage acp=new AeroCheckoutPage(driver);
		acp.billingInformation();
		acp.clickOnCreditCardForNative(driver);
		String email=driver.findElement(By.id("billing_email")).getAttribute("value");
		acp.placeOrder();
		WaitStatementLib.iSleep(5);
		driver.findElement(By.xpath("//span[@class='wfocu-btn-sub']")).click();
		WaitStatementLib.iSleep(3);
		OrderDetails od=new OrderDetails(driver);
        od.finalOrders();
		
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
		
		driver.findElement(By.linkText("Task History")).click();
		WaitStatementLib.iSleep(2);
		
		driver.findElements(By.xpath("//div[@class='bwfan-extra-details']//a[contains(text(),'557')]/../following-sibling::li/span[contains(text(),'"+email+"')]/../../../..//a[contains(text(),'Testing Funnel Ended Upstroke')]/../..//a[text()='Run Now']")).get(0).click();
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
		
		WebDriverCommonLib.switchToNewWindow(1, driver);
		
		WebElement oneClickUpsellsPlugin1=driver.findElement(By.xpath("//a[@href='admin.php?page=upstroke']"));
		act.click(oneClickUpsellsPlugin1).perform();
		driver.findElement(By.xpath("//input[@data-id='557']/following-sibling::label")).click();
		WaitStatementLib.iSleep(2);
	}
	
	@Test
	public void FunnelEnded_No_3()
	{
		WaitStatementLib.iSleep(3);
		driver.findElement(By.id("user_login")).sendKeys("wc");
		driver.findElement(By.id("user_pass")).sendKeys("hgHGFH7%6565%");
		driver.findElement(By.id("wp-submit")).click();
		WaitStatementLib.iSleep(3);
		WebElement woofunnels=driver.findElement(By.xpath("//div[text()='WooFunnels']"));
		Actions act=new Actions(driver);
		act.moveToElement(woofunnels).perform();
		WebElement oneClickUpsellsPlugin=driver.findElement(By.xpath("//a[@href='admin.php?page=upstroke']"));
		act.click(oneClickUpsellsPlugin).perform();
		driver.findElement(By.xpath("//input[@data-id='557']/following-sibling::label")).click();
		WaitStatementLib.iSleep(2);
		
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
		
		
		driver.findElement(By.xpath("//a[@data-product_id='442']")).click();
		driver.findElement(By.xpath("//a[text()='View cart']")).click();
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("//a[contains(text(),'Proceed to checkout')]")).click();
		
		AeroCheckoutPage acp=new AeroCheckoutPage(driver);
		acp.billingInformation();
		acp.clickOnCreditCardForNative(driver);
		String email=driver.findElement(By.id("billing_email")).getAttribute("value");
		acp.placeOrder();
		WaitStatementLib.iSleep(5);
		driver.findElement(By.xpath("//a[contains(@class,'wfocu-skip-offer-link')]")).click();
		WaitStatementLib.iSleep(3);
		OrderDetails od=new OrderDetails(driver);
        od.finalOrders();
		
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
		
		driver.findElement(By.linkText("Task History")).click();
		WaitStatementLib.iSleep(2);
		
		driver.findElements(By.xpath("//div[@class='bwfan-extra-details']//a[contains(text(),'557')]/../following-sibling::li/span[contains(text(),'"+email+"')]/../../../..//a[contains(text(),'Testing Funnel Ended Upstroke')]/../..//a[text()='Run Now']")).get(0).click();
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
		
		WebDriverCommonLib.switchToNewWindow(1, driver);
		
		WebElement oneClickUpsellsPlugin1=driver.findElement(By.xpath("//a[@href='admin.php?page=upstroke']"));
		act.click(oneClickUpsellsPlugin1).perform();
		driver.findElement(By.xpath("//input[@data-id='557']/following-sibling::label")).click();
		WaitStatementLib.iSleep(2);
	}
	
	@Test
	public void OfferViewed_4()
	{
		WaitStatementLib.iSleep(3);
		driver.findElement(By.id("user_login")).sendKeys("wc");
		driver.findElement(By.id("user_pass")).sendKeys("hgHGFH7%6565%");
		driver.findElement(By.id("wp-submit")).click();
		WaitStatementLib.iSleep(3);
		WebElement woofunnels=driver.findElement(By.xpath("//div[text()='WooFunnels']"));
		Actions act=new Actions(driver);
		act.moveToElement(woofunnels).perform();
		WebElement oneClickUpsellsPlugin=driver.findElement(By.xpath("//a[@href='admin.php?page=upstroke']"));
		act.click(oneClickUpsellsPlugin).perform();
		driver.findElement(By.xpath("//input[@data-id='557']/following-sibling::label")).click();
		WaitStatementLib.iSleep(2);
		
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
		
		driver.findElement(By.xpath("//a[@data-product_id='442']")).click();
		driver.findElement(By.xpath("//a[text()='View cart']")).click();
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("//a[contains(text(),'Proceed to checkout')]")).click();
		
		AeroCheckoutPage acp=new AeroCheckoutPage(driver);
		acp.billingInformation();
		acp.clickOnCreditCardForNative(driver);
		String email=driver.findElement(By.id("billing_email")).getAttribute("value");
		acp.placeOrder();
		WaitStatementLib.iSleep(5);
		
		WebElement ele=driver.findElement(By.xpath("//div[text()='We Standby Our Product']"));
		WebDriverCommonLib.scrollDown(ele, driver);
		
		WaitStatementLib.iSleep(5);
		driver.navigate().to("https://autonami.bwfdemo.in/wp-admin/admin.php?page=autonami&tab=tasks");
		WaitStatementLib.iSleep(5);
		
		driver.findElements(By.xpath("//div[@class='bwfan-extra-details']//a[contains(text(),'557')]/../following-sibling::li/span[contains(text(),'"+email+"')]/../../../..//a[contains(text(),'Testing Offer Viewed Upstroke')]/../..//a[text()='Run Now']")).get(0).click();
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
		
		WebDriverCommonLib.switchToNewWindow(1, driver);
		
		WebElement oneClickUpsellsPlugin1=driver.findElement(By.xpath("//a[@href='admin.php?page=upstroke']"));
		act.click(oneClickUpsellsPlugin1).perform();
		driver.findElement(By.xpath("//input[@data-id='557']/following-sibling::label")).click();
		WaitStatementLib.iSleep(2);
	}
	
	@Test
	public void OfferAccepted_5()
	{
		WaitStatementLib.iSleep(3);
		driver.findElement(By.id("user_login")).sendKeys("wc");
		driver.findElement(By.id("user_pass")).sendKeys("hgHGFH7%6565%");
		driver.findElement(By.id("wp-submit")).click();
		WaitStatementLib.iSleep(3);
		WebElement woofunnels=driver.findElement(By.xpath("//div[text()='WooFunnels']"));
		Actions act=new Actions(driver);
		act.moveToElement(woofunnels).perform();
		WebElement oneClickUpsellsPlugin=driver.findElement(By.xpath("//a[@href='admin.php?page=upstroke']"));
		act.click(oneClickUpsellsPlugin).perform();
		driver.findElement(By.xpath("//input[@data-id='557']/following-sibling::label")).click();
		WaitStatementLib.iSleep(2);
		
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
		
		
		driver.findElement(By.xpath("//a[@data-product_id='442']")).click();
		driver.findElement(By.xpath("//a[text()='View cart']")).click();
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("//a[contains(text(),'Proceed to checkout')]")).click();
		
		AeroCheckoutPage acp=new AeroCheckoutPage(driver);
		acp.billingInformation();
		acp.clickOnCreditCardForNative(driver);
		String email=driver.findElement(By.id("billing_email")).getAttribute("value");
		acp.placeOrder();
		WaitStatementLib.iSleep(5);
		driver.findElement(By.xpath("//span[@class='wfocu-btn-sub']")).click();
		WaitStatementLib.iSleep(3);
		OrderDetails od=new OrderDetails(driver);
        od.finalOrders();
		
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
		
		driver.findElement(By.linkText("Task History")).click();
		WaitStatementLib.iSleep(2);
		
		driver.findElements(By.xpath("//div[@class='bwfan-extra-details']//a[contains(text(),'557')]/../following-sibling::li/span[contains(text(),'"+email+"')]/../../../..//a[contains(text(),'Testing Offer Accepted Upstroke')]/../..//a[text()='Run Now']")).get(0).click();
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
		
		WebDriverCommonLib.switchToNewWindow(1, driver);
		
		WebElement oneClickUpsellsPlugin1=driver.findElement(By.xpath("//a[@href='admin.php?page=upstroke']"));
		act.click(oneClickUpsellsPlugin1).perform();
		driver.findElement(By.xpath("//input[@data-id='557']/following-sibling::label")).click();
		WaitStatementLib.iSleep(2);
	}
	
	@Test
	public void OfferRejected_6()
	{
		WaitStatementLib.iSleep(3);
		driver.findElement(By.id("user_login")).sendKeys("wc");
		driver.findElement(By.id("user_pass")).sendKeys("hgHGFH7%6565%");
		driver.findElement(By.id("wp-submit")).click();
		WaitStatementLib.iSleep(3);
		WebElement woofunnels=driver.findElement(By.xpath("//div[text()='WooFunnels']"));
		Actions act=new Actions(driver);
		act.moveToElement(woofunnels).perform();
		WebElement oneClickUpsellsPlugin=driver.findElement(By.xpath("//a[@href='admin.php?page=upstroke']"));
		act.click(oneClickUpsellsPlugin).perform();
		driver.findElement(By.xpath("//input[@data-id='557']/following-sibling::label")).click();
		WaitStatementLib.iSleep(2);
		
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
		
		driver.findElement(By.xpath("//a[@data-product_id='442']")).click();
		driver.findElement(By.xpath("//a[text()='View cart']")).click();
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("//a[contains(text(),'Proceed to checkout')]")).click();
		
		AeroCheckoutPage acp=new AeroCheckoutPage(driver);
		acp.billingInformation();
		acp.clickOnCreditCardForNative(driver);
		String email=driver.findElement(By.id("billing_email")).getAttribute("value");
		acp.placeOrder();
		WaitStatementLib.iSleep(5);
		driver.findElement(By.xpath("//a[contains(@class,'wfocu-skip-offer-link')]")).click();
		WaitStatementLib.iSleep(3);
		OrderDetails od=new OrderDetails(driver);
        od.finalOrders();
		
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
		
		driver.findElement(By.linkText("Task History")).click();
		WaitStatementLib.iSleep(2);
		
		driver.findElements(By.xpath("//div[@class='bwfan-extra-details']//a[contains(text(),'557')]/../following-sibling::li/span[contains(text(),'"+email+"')]/../../../..//a[contains(text(),'Testing Offer Rejected Upstroke')]/../..//a[text()='Run Now']")).get(0).click();
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
		
		WebDriverCommonLib.switchToNewWindow(1, driver);
		
		WebElement oneClickUpsellsPlugin1=driver.findElement(By.xpath("//a[@href='admin.php?page=upstroke']"));
		act.click(oneClickUpsellsPlugin1).perform();
		driver.findElement(By.xpath("//input[@data-id='557']/following-sibling::label")).click();
		WaitStatementLib.iSleep(2);
	}

/** put "Offer Payment Failed Upstroke Page_Ritvik" in Live mode & other one in sandbox mode under upstroke plugin to perform this & after perform put it again in sandbox **/	
	
	@Test
	public void OfferPaymentFailed_7()
	{
		WaitStatementLib.iSleep(3);
		driver.findElement(By.id("user_login")).sendKeys("wc");
		driver.findElement(By.id("user_pass")).sendKeys("hgHGFH7%6565%");
		driver.findElement(By.id("wp-submit")).click();
		WaitStatementLib.iSleep(3);
		WebElement woofunnels=driver.findElement(By.xpath("//div[text()='WooFunnels']"));
		Actions act=new Actions(driver);
		act.moveToElement(woofunnels).perform();
		WebElement oneClickUpsellsPlugin=driver.findElement(By.xpath("//a[@href='admin.php?page=upstroke']"));
		act.click(oneClickUpsellsPlugin).perform();
		driver.findElement(By.xpath("//input[@data-id='577']/following-sibling::label")).click();
		WaitStatementLib.iSleep(2);
		
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
		
		driver.findElement(By.xpath("//a[@data-product_id='442']")).click();
		driver.findElement(By.xpath("//a[text()='View cart']")).click();
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("//a[contains(text(),'Proceed to checkout')]")).click();
		
		AeroCheckoutPage acp=new AeroCheckoutPage(driver);
		acp.billingInformation();
		acp.clickOnCreditCardForNative(driver);
		String email=driver.findElement(By.id("billing_email")).getAttribute("value");
		acp.placeOrder();
		WaitStatementLib.iSleep(5);
		driver.findElement(By.xpath("//span[@class='wfocu-btn-sub']")).click();
		WaitStatementLib.iSleep(6);
		OrderDetails od=new OrderDetails(driver);
        od.finalOrders();
		
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
		
		driver.findElement(By.linkText("Task History")).click();
		WaitStatementLib.iSleep(2);
		
		driver.findElements(By.xpath("//div[@class='bwfan-extra-details']//a[contains(text(),'577')]/../following-sibling::li/span[contains(text(),'"+email+"')]/../../../..//a[contains(text(),'Testing Offer Payment Failed Upstroke')]/../..//a[text()='Run Now']")).get(0).click();
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
		
		WebDriverCommonLib.switchToNewWindow(1, driver);
		
		WebElement oneClickUpsellsPlugin1=driver.findElement(By.xpath("//a[@href='admin.php?page=upstroke']"));
		act.click(oneClickUpsellsPlugin1).perform();
		driver.findElement(By.xpath("//input[@data-id='577']/following-sibling::label")).click();
		WaitStatementLib.iSleep(2);
	}
	
}
