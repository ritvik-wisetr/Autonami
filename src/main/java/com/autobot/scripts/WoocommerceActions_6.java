package com.autobot.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.autobot.generics.BaseLib;
import com.autobot.generics.WaitStatementLib;
import com.autobot.generics.WebDriverCommonLib;
import com.autobot.pageobjects.ActionsMethods;
import com.autobot.pageobjects.AeroCheckoutPage;
import com.autobot.pageobjects.OrderDetails;

public class WoocommerceActions_6 extends BaseLib
{
	@Test
	public void CreateCoupon_1()
	{
		ActionsMethods am=new ActionsMethods(driver);
		am.EventCreation(driver, "wc_new_order");
		am.selectActionCreateCoupon(driver);
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
		Actions act=new Actions(driver);
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
		WebElement woofunnels1=driver.findElement(By.xpath("//div[text()='WooFunnels']"));	
		act.moveToElement(woofunnels1).perform();		
		WebElement autobotPlugin1=driver.findElement(By.xpath("//a[text()='"+plugin+"']"));
		act.click(autobotPlugin1).perform();
		
		driver.findElement(By.linkText("Task History")).click();
		WaitStatementLib.iSleep(2);
		driver.findElements(By.xpath("//div[@class='bwfan-extra-details']//a[contains(text(),'"+orderNumber+"')]/../../../..//a[contains(text(),'Autobot Automation Testing')]/../..//a[text()='Run Now']")).get(0).click();
		WaitStatementLib.iSleep(4);
		
		WebElement woocommerce=driver.findElement(By.xpath("//div[text()='WooCommerce']"));
		act.moveToElement(woocommerce).perform();		
		WebElement woocommOrders=driver.findElement(By.xpath("//a[contains(text(),'Coupons')]"));
		act.click(woocommOrders).perform();
		
		WebElement coupon=driver.findElement(By.xpath("//a[contains(text(),'tiptop')]"));
		act.moveToElement(coupon).perform();
		WaitStatementLib.iSleep(3);
		
		WebElement woofunnels2=driver.findElement(By.xpath("//div[text()='WooFunnels']"));	
		act.moveToElement(woofunnels2).perform();		
		WebElement autobotPlugin2=driver.findElement(By.xpath("//a[text()='"+plugin+"']"));
		act.click(autobotPlugin2).perform();
		
		WaitStatementLib.iSleep(3);
		WebElement autobotAutomationTestingPage=driver.findElement(By.xpath("//a[contains(text(),'Autobot Automation Testing')]"));
		act.moveToElement(autobotAutomationTestingPage).perform();
		
		WebElement deletePermanently=driver.findElement(By.xpath("//a[text()='Delete Permanently']"));
		act.click(deletePermanently).perform();
		
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("//button[text()='Yes, proceed']")).click();
		WaitStatementLib.iSleep(5);
		
	}
	
	@Test(dependsOnMethods="CreateCoupon_1")
	public void DeleteCoupon_2()
	{
		ActionsMethods am=new ActionsMethods(driver);
		am.EventCreation(driver, "wc_new_order");
		am.selectActionRemoveCoupon(driver);
		WaitStatementLib.iSleep(2);
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
		Actions act=new Actions(driver);
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
		WebElement woofunnels1=driver.findElement(By.xpath("//div[text()='WooFunnels']"));	
		act.moveToElement(woofunnels1).perform();		
		WebElement autobotPlugin1=driver.findElement(By.xpath("//a[text()='"+plugin+"']"));
		act.click(autobotPlugin1).perform();
		
		driver.findElement(By.linkText("Task History")).click();
		WaitStatementLib.iSleep(2);
		driver.findElements(By.xpath("//div[@class='bwfan-extra-details']//a[contains(text(),'"+orderNumber+"')]/../../../..//a[contains(text(),'Autobot Automation Testing')]/../..//a[text()='Run Now']")).get(0).click();
		WaitStatementLib.iSleep(6);
		
		driver.findElement(By.linkText("Automations")).click();
		
		WaitStatementLib.iSleep(3);
		WebElement autobotAutomationTestingPage=driver.findElement(By.xpath("//a[contains(text(),'Autobot Automation Testing')]"));
		act.moveToElement(autobotAutomationTestingPage).perform();
		
		WebElement deletePermanently=driver.findElement(By.xpath("//a[text()='Delete Permanently']"));
		act.click(deletePermanently).perform();
		
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("//button[text()='Yes, proceed']")).click();
		WaitStatementLib.iSleep(5);
		
	}
	
	@Test
	public void ChangeOrderStatus_3()
	{
		ActionsMethods am=new ActionsMethods(driver);
		am.EventCreation(driver, "wc_new_order");
		am.selectActionChangeOrderStatus(driver);
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
		Actions act=new Actions(driver);
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
		
		WebElement woofunnels1=driver.findElement(By.xpath("//div[text()='WooFunnels']"));	
		act.moveToElement(woofunnels1).perform();		
		WebElement autobotPlugin1=driver.findElement(By.xpath("//a[text()='"+plugin+"']"));
		act.click(autobotPlugin1).perform();
		
		driver.findElement(By.linkText("Task History")).click();
		WaitStatementLib.iSleep(2);
		driver.findElements(By.xpath("//div[@class='bwfan-extra-details']//a[contains(text(),'"+orderNumber+"')]/../../../..//a[contains(text(),'Autobot Automation Testing')]/../..//a[text()='Run Now']")).get(0).click();
		WaitStatementLib.iSleep(4);
		
		WebElement woocommerce=driver.findElement(By.xpath("//div[text()='WooCommerce']"));
		act.moveToElement(woocommerce).perform();		
		WebElement woocommOrders=driver.findElement(By.xpath("//a[contains(text(),'Orders')]"));
		act.click(woocommOrders).perform();
		
		String orderStatus=driver.findElement(By.xpath("//a[@class='order-view']/strong[contains(text(),'"+orderNumber+"')]/../../following-sibling::td//span[text()='Completed']")).getText();
		System.out.println(orderStatus);
		WaitStatementLib.iSleep(2);
		
		WebElement woofunnels2=driver.findElement(By.xpath("//div[text()='WooFunnels']"));	
		act.moveToElement(woofunnels2).perform();		
		WebElement autobotPlugin2=driver.findElement(By.xpath("//a[text()='"+plugin+"']"));
		act.click(autobotPlugin2).perform();
		
		WaitStatementLib.iSleep(3);
		WebElement autobotAutomationTestingPage=driver.findElement(By.xpath("//a[contains(text(),'Autobot Automation Testing')]"));
		act.moveToElement(autobotAutomationTestingPage).perform();
		
		WebElement deletePermanently=driver.findElement(By.xpath("//a[text()='Delete Permanently']"));
		act.click(deletePermanently).perform();
		
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("//button[text()='Yes, proceed']")).click();
		WaitStatementLib.iSleep(5);
		
	}
	
	@Test
	public void AddOrderNote_4()
	{
		ActionsMethods am=new ActionsMethods(driver);
		am.EventCreation(driver, "wc_new_order");
		am.selectActionAddOrderNote(driver);
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
		Actions act=new Actions(driver);
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
		
		WebElement woofunnels1=driver.findElement(By.xpath("//div[text()='WooFunnels']"));	
		act.moveToElement(woofunnels1).perform();		
		WebElement autobotPlugin1=driver.findElement(By.xpath("//a[text()='"+plugin+"']"));
		act.click(autobotPlugin1).perform();
		
		driver.findElement(By.linkText("Task History")).click();
		WaitStatementLib.iSleep(2);
		driver.findElements(By.xpath("//div[@class='bwfan-extra-details']//a[contains(text(),'"+orderNumber+"')]/../../../..//a[contains(text(),'Autobot Automation Testing')]/../..//a[text()='Run Now']")).get(0).click();
		WaitStatementLib.iSleep(4);
		
		WebElement woocommerce=driver.findElement(By.xpath("//div[text()='WooCommerce']"));
		act.moveToElement(woocommerce).perform();
		
		WebElement woocommOrders=driver.findElement(By.xpath("//a[contains(text(),'Orders')]"));
		act.click(woocommOrders).perform();
		
		driver.findElement(By.xpath("//a[@class='order-view']/strong[contains(text(),'"+orderNumber+"')]")).click();
		
		WaitStatementLib.iSleep(2);
		WebElement ele=driver.findElement(By.xpath("//span[text()='Order actions']"));
		WebDriverCommonLib.scrollDown(ele, driver);
		WaitStatementLib.iSleep(3);
		
		WebElement woofunnels2=driver.findElement(By.xpath("//div[text()='WooFunnels']"));	
		act.moveToElement(woofunnels2).perform();		
		WebElement autobotPlugin2=driver.findElement(By.xpath("//a[text()='"+plugin+"']"));
		act.click(autobotPlugin2).perform();
		
		WaitStatementLib.iSleep(3);
		WebElement autobotAutomationTestingPage=driver.findElement(By.xpath("//a[contains(text(),'Autobot Automation Testing')]"));
		act.moveToElement(autobotAutomationTestingPage).perform();
		
		WebElement deletePermanently=driver.findElement(By.xpath("//a[text()='Delete Permanently']"));
		act.click(deletePermanently).perform();
		
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("//button[text()='Yes, proceed']")).click();
		WaitStatementLib.iSleep(5);
		
	}
	
}
