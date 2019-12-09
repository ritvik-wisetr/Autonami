package com.autobot.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.autobot.generics.BaseLib;
import com.autobot.generics.WaitStatementLib;
import com.autobot.generics.WebDriverCommonLib;
import com.autobot.pageobjects.ActionsMethods;
import com.autobot.pageobjects.AeroCheckoutPage;
import com.autobot.pageobjects.OrderDetails;

public class OrderNoteAdded_4 extends BaseLib 
{
	@Test
	public void OrderNoteMode_Both_1()
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
		WaitStatementLib.iSleep(1);
		driver.findElement(By.linkText("Add New")).click();
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("//a[@data-izimodal-transitionin='comingIn']/i")).click();
		WaitStatementLib.iSleep(2);
		driver.findElement(By.id("title")).clear();
		driver.findElement(By.id("title")).sendKeys("Testing Order Note Added");
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("//a[text()='Update']")).click();
		WaitStatementLib.iSleep(3);
		
		WaitStatementLib.iSleep(3);

		WebElement sourceDrpDwn=driver.findElement(By.xpath("//select[@name='source']"));
		WebDriverCommonLib.selectOptionByValue(sourceDrpDwn, "wc");
		
		WebElement eventDrpDwn=driver.findElement(By.xpath("//select[@name='event']"));
		WebDriverCommonLib.selectOptionByValue(eventDrpDwn, "wc_order_note_added");
		
		WebElement orderNoteModeDrpDwn=driver.findElement(By.id("bwfan-select-box-order-note"));
		WebDriverCommonLib.selectOptionByValue(orderNoteModeDrpDwn, "both");
		
		driver.findElement(By.linkText("Save")).click();
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("//div[@class='item_wrap_html_add']/i")).click();
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("//div[text()='Direct Action']")).click();
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("//div[@class='item_wrap_single item_add_action']/i")).click();
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("//div[@class='action_text']")).click();
		
		ActionsMethods am=new ActionsMethods(driver);
//		am.selectActionInsertRow_GoogleSheets(driver);
		am.selectActionSendEmail_Wordpress(driver);
		WaitStatementLib.iSleep(3);
		driver.findElement(By.xpath("//div[@class='automation_state_toggle bwfan_toggle_btn']")).click();
		WaitStatementLib.iSleep(1);
		driver.findElement(By.xpath("//a[contains(@class,'bwfan_btn_close')]")).click();
		WaitStatementLib.iSleep(2);
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
		WaitStatementLib.iSleep(2);
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
		
		String orderNumber=driver.findElement(By.xpath("//div[@class='woocommerce-order']//li[contains(@class,'overview__order')]/strong")).getText();
		
		WaitStatementLib.iSleep(3);
		WebElement autobot1=driver.findElement(By.xpath("(//a[text()='Autonami Automations'])[2]"));
		act.moveToElement(autobot1).perform();
		WaitStatementLib.iSleep(2);
		WebElement autobotDashboard=driver.findElement(By.xpath("//a[text()='Dashboard']"));
		act.click(autobotDashboard).perform();
		WaitStatementLib.iSleep(2);
		
		WebElement woocommerce=driver.findElement(By.xpath("//div[text()='WooCommerce']"));
		act.moveToElement(woocommerce).perform();		
		WebElement woocommOrders=driver.findElement(By.xpath("//a[contains(text(),'Orders')]"));
		act.click(woocommOrders).perform();
		
		driver.findElement(By.xpath("//a[@class='order-view']/strong[contains(text(),'"+orderNumber+"')]")).click();
		WaitStatementLib.iSleep(2);
		
		driver.findElement(By.id("add_order_note")).sendKeys("Hello Ritvik");
		
		WebElement orderNoteTypeDrpDwn=driver.findElement(By.id("order_note_type"));
		WebDriverCommonLib.selectOptionByValue(orderNoteTypeDrpDwn, "customer");
		
		driver.findElement(By.xpath("//button[text()='Add']")).click();
		WaitStatementLib.iSleep(2);
		
		WebElement ele=driver.findElement(By.xpath("//span[text()='Order actions']"));
		WebDriverCommonLib.scrollUp(ele, driver);
		WaitStatementLib.iSleep(2);
		driver.findElement(By.name("save")).click();
		WaitStatementLib.iSleep(2);
		
		WebElement woofunnels1=driver.findElement(By.xpath("//div[text()='WooFunnels']"));	
		act.moveToElement(woofunnels1).perform();		
		WebElement autobotPlugin1=driver.findElement(By.xpath("//a[text()='"+plugin+"']"));
		act.click(autobotPlugin1).perform();
		
		driver.findElement(By.linkText("Task History")).click();
		WaitStatementLib.iSleep(2);
		driver.findElements(By.xpath("//div[@class='bwfan-extra-details']//a[contains(text(),'"+orderNumber+"')]/../../../..//a[contains(text(),'Testing Order Note Added')]/../..//a[text()='Run Now']")).get(0).click();
		WaitStatementLib.iSleep(4);
		
		
//		((JavascriptExecutor)driver).executeScript("window.open('https://docs.google.com/spreadsheets/d/1C5IJdghLsGze0xx-N-ArrCUKRp0bpinnO_gwt6hGm24/edit#gid=0','_blank');");
//		
//		WebDriverCommonLib.switchToNewWindow(2, driver);
//		WaitStatementLib.iSleep(2);
//		
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.id("identifierId")).sendKeys("xlpluginstesting@gmail.com");
//		driver.findElement(By.xpath("//span[text()='Next']")).click();
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.name("password")).sendKeys("XlTesing@321");
//		driver.findElement(By.xpath("//span[text()='Next']")).click();
//		WaitStatementLib.iSleep(10);
		
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
		
		WaitStatementLib.iSleep(2);
		driver.findElement(By.linkText("Automations")).click();
		WaitStatementLib.iSleep(2);
		
		WebElement autobotAutomationTestingPage=driver.findElement(By.xpath("//a[contains(text(),'Testing Order Note Added')]"));
		act.moveToElement(autobotAutomationTestingPage).perform();
		
		WebElement deletePermanently=driver.findElement(By.xpath("//a[text()='Delete Permanently']"));
		act.click(deletePermanently).perform();
		
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("//button[text()='Yes, proceed']")).click();
		WaitStatementLib.iSleep(3);
		
	}
	
	@Test
	public void OrderNoteMode_Private_2()
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
		WaitStatementLib.iSleep(1);
		driver.findElement(By.linkText("Add New")).click();
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("//a[@data-izimodal-transitionin='comingIn']/i")).click();
		WaitStatementLib.iSleep(2);
		driver.findElement(By.id("title")).clear();
		driver.findElement(By.id("title")).sendKeys("Testing Order Note Added");
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("//a[text()='Update']")).click();
		WaitStatementLib.iSleep(3);
		
		WaitStatementLib.iSleep(3);

		WebElement sourceDrpDwn=driver.findElement(By.xpath("//select[@name='source']"));
		WebDriverCommonLib.selectOptionByValue(sourceDrpDwn, "wc");
		
		WebElement eventDrpDwn=driver.findElement(By.xpath("//select[@name='event']"));
		WebDriverCommonLib.selectOptionByValue(eventDrpDwn, "wc_order_note_added");
		
		WebElement orderNoteModeDrpDwn=driver.findElement(By.id("bwfan-select-box-order-note"));
		WebDriverCommonLib.selectOptionByValue(orderNoteModeDrpDwn, "private");
		
		driver.findElement(By.linkText("Save")).click();
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("//div[@class='item_wrap_html_add']/i")).click();
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("//div[text()='Direct Action']")).click();
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("//div[@class='item_wrap_single item_add_action']/i")).click();
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("//div[@class='action_text']")).click();
		
		ActionsMethods am=new ActionsMethods(driver);
//		am.selectActionInsertRow_GoogleSheets(driver);
		am.selectActionSendEmail_Wordpress(driver);
		WaitStatementLib.iSleep(3);
		driver.findElement(By.xpath("//div[@class='automation_state_toggle bwfan_toggle_btn']")).click();
		WaitStatementLib.iSleep(1);
		driver.findElement(By.xpath("//a[contains(@class,'bwfan_btn_close')]")).click();
		WaitStatementLib.iSleep(2);
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
		WaitStatementLib.iSleep(2);
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
		
		String orderNumber=driver.findElement(By.xpath("//div[@class='woocommerce-order']//li[contains(@class,'overview__order')]/strong")).getText();
		
		WaitStatementLib.iSleep(3);
		WebElement autobot1=driver.findElement(By.xpath("(//a[text()='Autonami Automations'])[2]"));
		act.moveToElement(autobot1).perform();
		WaitStatementLib.iSleep(2);
		WebElement autobotDashboard=driver.findElement(By.xpath("//a[text()='Dashboard']"));
		act.click(autobotDashboard).perform();
		WaitStatementLib.iSleep(2);
		
		WebElement woocommerce=driver.findElement(By.xpath("//div[text()='WooCommerce']"));
		act.moveToElement(woocommerce).perform();		
		WebElement woocommOrders=driver.findElement(By.xpath("//a[contains(text(),'Orders')]"));
		act.click(woocommOrders).perform();
		
		driver.findElement(By.xpath("//a[@class='order-view']/strong[contains(text(),'"+orderNumber+"')]")).click();
		WaitStatementLib.iSleep(2);
		
		driver.findElement(By.id("add_order_note")).sendKeys("Hello Ritvik");
		
		WebElement orderNoteTypeDrpDwn=driver.findElement(By.id("order_note_type"));
		WebDriverCommonLib.selectOptionByValue(orderNoteTypeDrpDwn, "");
		
		driver.findElement(By.xpath("//button[text()='Add']")).click();
		WaitStatementLib.iSleep(2);
		WebElement ele=driver.findElement(By.xpath("//span[text()='Order actions']"));
		WebDriverCommonLib.scrollUp(ele, driver);
		WaitStatementLib.iSleep(2);
		driver.findElement(By.name("save")).click();
		WaitStatementLib.iSleep(2);
		
		WebElement woofunnels1=driver.findElement(By.xpath("//div[text()='WooFunnels']"));	
		act.moveToElement(woofunnels1).perform();		
		WebElement autobotPlugin1=driver.findElement(By.xpath("//a[text()='"+plugin+"']"));
		act.click(autobotPlugin1).perform();
		
		driver.findElement(By.linkText("Task History")).click();
		WaitStatementLib.iSleep(2);
		driver.findElements(By.xpath("//div[@class='bwfan-extra-details']//a[contains(text(),'"+orderNumber+"')]/../../../..//a[contains(text(),'Testing Order Note Added')]/../..//a[text()='Run Now']")).get(0).click();
		WaitStatementLib.iSleep(4);
		
//		((JavascriptExecutor)driver).executeScript("window.open('https://docs.google.com/spreadsheets/d/1C5IJdghLsGze0xx-N-ArrCUKRp0bpinnO_gwt6hGm24/edit#gid=0','_blank');");
//		
//		WebDriverCommonLib.switchToNewWindow(2, driver);
//		WaitStatementLib.iSleep(2);
//		
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.id("identifierId")).sendKeys("xlpluginstesting@gmail.com");
//		driver.findElement(By.xpath("//span[text()='Next']")).click();
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.name("password")).sendKeys("XlTesing@321");
//		driver.findElement(By.xpath("//span[text()='Next']")).click();
//		WaitStatementLib.iSleep(10);
		
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
		
		WaitStatementLib.iSleep(2);
		driver.findElement(By.linkText("Automations")).click();
		WaitStatementLib.iSleep(2);
		
		WebElement autobotAutomationTestingPage=driver.findElement(By.xpath("//a[contains(text(),'Testing Order Note Added')]"));
		act.moveToElement(autobotAutomationTestingPage).perform();
		
		WebElement deletePermanently=driver.findElement(By.xpath("//a[text()='Delete Permanently']"));
		act.click(deletePermanently).perform();
		
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("//button[text()='Yes, proceed']")).click();
		WaitStatementLib.iSleep(3);
		
	}
	
	@Test
	public void OrderNoteMode_Customer_3()
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
		WaitStatementLib.iSleep(1);
		driver.findElement(By.linkText("Add New")).click();
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("//a[@data-izimodal-transitionin='comingIn']/i")).click();
		WaitStatementLib.iSleep(2);
		driver.findElement(By.id("title")).clear();
		driver.findElement(By.id("title")).sendKeys("Testing Order Note Added");
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("//a[text()='Update']")).click();
		WaitStatementLib.iSleep(3);
		
		WaitStatementLib.iSleep(3);

		WebElement sourceDrpDwn=driver.findElement(By.xpath("//select[@name='source']"));
		WebDriverCommonLib.selectOptionByValue(sourceDrpDwn, "wc");
		
		WebElement eventDrpDwn=driver.findElement(By.xpath("//select[@name='event']"));
		WebDriverCommonLib.selectOptionByValue(eventDrpDwn, "wc_order_note_added");
		
		WebElement orderNoteModeDrpDwn=driver.findElement(By.id("bwfan-select-box-order-note"));
		WebDriverCommonLib.selectOptionByValue(orderNoteModeDrpDwn, "public");
		
		driver.findElement(By.linkText("Save")).click();
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("//div[@class='item_wrap_html_add']/i")).click();
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("//div[text()='Direct Action']")).click();
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("//div[@class='item_wrap_single item_add_action']/i")).click();
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("//div[@class='action_text']")).click();
		
		ActionsMethods am=new ActionsMethods(driver);
//		am.selectActionInsertRow_GoogleSheets(driver);
		am.selectActionSendEmail_Wordpress(driver);
		WaitStatementLib.iSleep(3);
		driver.findElement(By.xpath("//div[@class='automation_state_toggle bwfan_toggle_btn']")).click();
		WaitStatementLib.iSleep(1);
		driver.findElement(By.xpath("//a[contains(@class,'bwfan_btn_close')]")).click();
		WaitStatementLib.iSleep(2);
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
		WaitStatementLib.iSleep(2);
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
		
		String orderNumber=driver.findElement(By.xpath("//div[@class='woocommerce-order']//li[contains(@class,'overview__order')]/strong")).getText();
		
		WaitStatementLib.iSleep(3);
		WebElement autobot1=driver.findElement(By.xpath("(//a[text()='Autonami Automations'])[2]"));
		act.moveToElement(autobot1).perform();
		WaitStatementLib.iSleep(2);
		WebElement autobotDashboard=driver.findElement(By.xpath("//a[text()='Dashboard']"));
		act.click(autobotDashboard).perform();
		WaitStatementLib.iSleep(2);
		
		WebElement woocommerce=driver.findElement(By.xpath("//div[text()='WooCommerce']"));
		act.moveToElement(woocommerce).perform();		
		WebElement woocommOrders=driver.findElement(By.xpath("//a[contains(text(),'Orders')]"));
		act.click(woocommOrders).perform();
		
		driver.findElement(By.xpath("//a[@class='order-view']/strong[contains(text(),'"+orderNumber+"')]")).click();
		WaitStatementLib.iSleep(2);
		
		driver.findElement(By.id("add_order_note")).sendKeys("Hello Ritvik");
		
		WebElement orderNoteTypeDrpDwn=driver.findElement(By.id("order_note_type"));
		WebDriverCommonLib.selectOptionByValue(orderNoteTypeDrpDwn, "customer");
		
		driver.findElement(By.xpath("//button[text()='Add']")).click();
		WaitStatementLib.iSleep(2);
		WebElement ele=driver.findElement(By.xpath("//span[text()='Order actions']"));
		WebDriverCommonLib.scrollUp(ele, driver);
		WaitStatementLib.iSleep(2);
		driver.findElement(By.name("save")).click();
		WaitStatementLib.iSleep(2);
		
		WebElement woofunnels1=driver.findElement(By.xpath("//div[text()='WooFunnels']"));	
		act.moveToElement(woofunnels1).perform();		
		WebElement autobotPlugin1=driver.findElement(By.xpath("//a[text()='"+plugin+"']"));
		act.click(autobotPlugin1).perform();
		
		driver.findElement(By.linkText("Task History")).click();
		WaitStatementLib.iSleep(2);
		driver.findElements(By.xpath("//div[@class='bwfan-extra-details']//a[contains(text(),'"+orderNumber+"')]/../../../..//a[contains(text(),'Testing Order Note Added')]/../..//a[text()='Run Now']")).get(0).click();
		WaitStatementLib.iSleep(4);
		
//		((JavascriptExecutor)driver).executeScript("window.open('https://docs.google.com/spreadsheets/d/1C5IJdghLsGze0xx-N-ArrCUKRp0bpinnO_gwt6hGm24/edit#gid=0','_blank');");
//		
//		WebDriverCommonLib.switchToNewWindow(2, driver);
//		WaitStatementLib.iSleep(2);
//		
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.id("identifierId")).sendKeys("xlpluginstesting@gmail.com");
//		driver.findElement(By.xpath("//span[text()='Next']")).click();
//		WaitStatementLib.iSleep(2);
//		driver.findElement(By.name("password")).sendKeys("XlTesing@321");
//		driver.findElement(By.xpath("//span[text()='Next']")).click();
//		WaitStatementLib.iSleep(10);
		
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
		
		driver.findElement(By.linkText("Automations")).click();
		WaitStatementLib.iSleep(2);
		
		WebElement autobotAutomationTestingPage=driver.findElement(By.xpath("//a[contains(text(),'Testing Order Note Added')]"));
		act.moveToElement(autobotAutomationTestingPage).perform();
		
		WebElement deletePermanently=driver.findElement(By.xpath("//a[text()='Delete Permanently']"));
		act.click(deletePermanently).perform();
		
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("//button[text()='Yes, proceed']")).click();
		WaitStatementLib.iSleep(3);
		
	}
}
