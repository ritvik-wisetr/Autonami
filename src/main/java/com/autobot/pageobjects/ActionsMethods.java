package com.autobot.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import com.autobot.generics.WaitStatementLib;
import com.autobot.generics.WebDriverCommonLib;

public class ActionsMethods 
{
	public ActionsMethods(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void EventCreation(WebDriver driver, String eventValue)
	{
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
		WaitStatementLib.iSleep(1);
		driver.findElement(By.linkText("Add New")).click();
		WaitStatementLib.iSleep(2);
		
		driver.findElement(By.xpath("//a[@data-izimodal-transitionin='comingIn']/i")).click();
		WaitStatementLib.iSleep(2);
		driver.findElement(By.id("title")).clear();
		driver.findElement(By.id("title")).sendKeys("Autobot Automation Testing");
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("//a[text()='Update']")).click();
		WaitStatementLib.iSleep(3);

		WebElement sourceDrpDwn=driver.findElement(By.xpath("//select[@name='source']"));
		WebDriverCommonLib.selectOptionByValue(sourceDrpDwn, "wc");
		
		WebElement eventDrpDwn=driver.findElement(By.xpath("//select[@name='event']"));
		WebDriverCommonLib.selectOptionByValue(eventDrpDwn, eventValue);
		
		driver.findElement(By.id("bwfan-wc-completed")).click();
		driver.findElement(By.id("bwfan-wc-processing")).click();
		driver.findElement(By.linkText("Save")).click();
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("//div[@class='item_wrap_html_add']/i")).click();
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("//div[text()='Direct Action']")).click();
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("//div[@class='item_wrap_single item_add_action']/i")).click();
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("//div[@class='action_text']")).click();
		
	}
	
	
	public void selectActionCreateCoupon(WebDriver driver)
	{
		WebElement actionDrpDwn=driver.findElement(By.xpath("//select[@name='bwfan[0][action_slug]']"));
		WebDriverCommonLib.selectOptionByValue(actionDrpDwn, "wc_create_coupon");
		
		driver.findElement(By.xpath("//span[@id='select2--container']")).click();
		
		driver.findElement(By.xpath("//span[@class='select2-search select2-search--dropdown']/input")).sendKeys("coupon1");
		driver.findElement(By.xpath("//li[text()='coupon1']")).click();
		
		driver.findElement(By.name("bwfan[0][data][coupon_name]")).sendKeys("TipTop");
		
		WebElement expiryDrpDwn=driver.findElement(By.xpath("//select[@name='bwfan[0][data][expiry_type]']"));
		WebDriverCommonLib.selectOptionByValue(expiryDrpDwn, "days");
		
		driver.findElement(By.name("bwfan[0][data][expiry]")).sendKeys("5");
		
		driver.findElement(By.linkText("Save")).click();
		WaitStatementLib.iSleep(3);
		
		String coupon = driver.findElement(By.xpath("//span[@id='select2--container']")).getAttribute("title");
		
		driver.navigate().refresh();
		
		WaitStatementLib.iSleep(5);
		driver.findElement(By.xpath("//div[@class='item_wrap_single item_modify_action']")).click();
		
		String expMsg="Create Coupon";
		String actMsg=driver.findElement(By.xpath("//select[@name='bwfan[0][action_slug]']//option[@selected='']")).getText();
		Assert.assertEquals(actMsg, expMsg);
		Reporter.log(expMsg, true);
		
		String expMsg1=coupon;
		String actMsg1=driver.findElement(By.xpath("//span[@id='select2--container']")).getAttribute("title");
		Assert.assertEquals(actMsg1, expMsg1);
		Reporter.log(expMsg1, true);
		
		String expMsg2="TipTop";
		String actMsg2=driver.findElement(By.name("bwfan[0][data][coupon_name]")).getAttribute("value");
		Assert.assertEquals(actMsg2, expMsg2);
		Reporter.log(expMsg2, true);
		
		String expMsg3="Days";
		String actMsg3=driver.findElement(By.xpath("//select[@name='bwfan[0][data][expiry_type]']/option[@selected='']")).getText();
		Assert.assertEquals(actMsg3, expMsg3);
		Reporter.log(expMsg3, true);
		
		String expMsg4="5";
		String actMsg4=driver.findElement(By.name("bwfan[0][data][expiry]")).getAttribute("value");
		Assert.assertEquals(actMsg4, expMsg4);
		Reporter.log(expMsg4, true);
		
	}
	
	public void selectActionAddOrderNote(WebDriver driver)
	{
		WebElement actionDrpDwn=driver.findElement(By.xpath("//select[@name='bwfan[0][action_slug]']"));
		WebDriverCommonLib.selectOptionByValue(actionDrpDwn, "wc_add_order_note");
		
		driver.findElement(By.xpath("//textarea[@name='bwfan[0][data][body]']")).sendKeys("Order Note Added");
		
		driver.findElement(By.linkText("Save")).click();
		WaitStatementLib.iSleep(3);
		
		driver.navigate().refresh();
		
		WaitStatementLib.iSleep(5);
		driver.findElement(By.xpath("//div[@class='item_wrap_single item_modify_action']")).click();
		
		String expMsg="Add Order Note";
		String actMsg=driver.findElement(By.xpath("//select[@name='bwfan[0][action_slug]']//option[@selected='']")).getText();
		Assert.assertEquals(actMsg, expMsg);
		Reporter.log(expMsg, true);
		
		String expMsg1="Order Note Added";
		String actMsg1=driver.findElement(By.xpath("//textarea[@name='bwfan[0][data][body]']")).getText();
		Assert.assertEquals(actMsg1, expMsg1);
		Reporter.log(expMsg1, true);
	}
	
	public void selectActionChangeOrderStatus(WebDriver driver)
	{
		WebElement actionDrpDwn=driver.findElement(By.xpath("//select[@name='bwfan[0][action_slug]']"));
		WebDriverCommonLib.selectOptionByValue(actionDrpDwn, "wc_change_order_status");
		
		WebElement changeOrderDrpDwn=driver.findElement(By.name("bwfan[0][data][status]"));
		WebDriverCommonLib.selectOptionByValue(changeOrderDrpDwn, "wc-completed");
		
		driver.findElement(By.linkText("Save")).click();
		WaitStatementLib.iSleep(3);
		
		driver.navigate().refresh();
		
		WaitStatementLib.iSleep(5);
		driver.findElement(By.xpath("//div[@class='item_wrap_single item_modify_action']")).click();
		WaitStatementLib.iSleep(5);
		
		String expMsg="Change Order Status";
		String actMsg=driver.findElement(By.xpath("//select[@name='bwfan[0][action_slug]']//option[@selected='']")).getText();
		Assert.assertEquals(actMsg, expMsg);
		Reporter.log(expMsg, true);
		
		String orderStatus=driver.findElement(By.xpath("//select[@name='bwfan[0][data][status]']/option[@selected='']")).getText();
		String expMsg1="Completed";
		String actMsg1=orderStatus;
		Assert.assertEquals(actMsg1, expMsg1);
		Reporter.log(expMsg1, true);
		
	}
	
	public void selectActionRemoveCoupon(WebDriver driver)
	{
		WebElement actionDrpDwn=driver.findElement(By.xpath("//select[@name='bwfan[0][action_slug]']"));
		WebDriverCommonLib.selectOptionByValue(actionDrpDwn, "wc_remove_coupon");
		
		driver.findElement(By.name("bwfan[0][data][coupon_name]")).sendKeys("TipTop");
		
		driver.findElement(By.linkText("Save")).click();
		WaitStatementLib.iSleep(3);
		
		driver.navigate().refresh();
		
		WaitStatementLib.iSleep(5);
		driver.findElement(By.xpath("//div[@class='item_wrap_single item_modify_action']")).click();
		
		String expMsg="Delete Coupon";
		String actMsg=driver.findElement(By.xpath("//select[@name='bwfan[0][action_slug]']//option[@selected='']")).getText();
		Assert.assertEquals(actMsg, expMsg);
		Reporter.log(expMsg, true);
		
		String expMsg1="TipTop";
		String actMsg1=driver.findElement(By.name("bwfan[0][data][coupon_name]")).getAttribute("value");
		Assert.assertEquals(actMsg1, expMsg1);
		Reporter.log(expMsg1, true);
		
		WaitStatementLib.iSleep(5);
	}
	
	public void selectActionSendEmail_Wordpress(WebDriver driver)
	{
		WebElement actionDrpDwn=driver.findElement(By.xpath("//select[@name='bwfan[0][action_slug]']"));
		WebDriverCommonLib.selectOptionByValue(actionDrpDwn, "wp_sendemail");
		
		WebElement changeOrderDrpDwn=driver.findElement(By.name("bwfan[0][data][template]"));
		WebDriverCommonLib.selectOptionByValue(changeOrderDrpDwn, "wc_template");
		
		driver.findElement(By.name("bwfan[0][data][to]")).clear();
		driver.findElement(By.name("bwfan[0][data][to]")).sendKeys("xlpluginstesting@gmail.com");
		
		driver.findElement(By.name("bwfan[0][data][subject]")).clear();
		driver.findElement(By.name("bwfan[0][data][subject]")).sendKeys("New Email");
		
		driver.findElement(By.name("bwfan[0][data][email_heading]")).clear();
		driver.findElement(By.name("bwfan[0][data][email_heading]")).sendKeys("My Store");
		
		driver.findElement(By.name("bwfan[0][data][promotional_email]")).click();
		WaitStatementLib.iSleep(1);
		
		driver.findElement(By.linkText("Save")).click();
		WaitStatementLib.iSleep(3);
		
		driver.navigate().refresh();
		
		WaitStatementLib.iSleep(5);
		driver.findElement(By.xpath("//div[@class='item_wrap_single item_modify_action']")).click();
		WaitStatementLib.iSleep(5);
		
		String expMsg="Send Email";
		String actMsg=driver.findElement(By.xpath("//select[@name='bwfan[0][action_slug]']//option[@selected='']")).getText();
		Assert.assertEquals(actMsg, expMsg);
		Reporter.log(expMsg, true);
		
		String expMsg1="WooCommerce Default Template";
		String actMsg1=driver.findElement(By.xpath("//select[@name='bwfan[0][data][template]']/option[@selected='']")).getText();
		Assert.assertEquals(actMsg1, expMsg1);
		Reporter.log(expMsg1, true);
		
		String expMsg2="xlpluginstesting@gmail.com";
		String actMsg2=driver.findElement(By.name("bwfan[0][data][to]")).getAttribute("value");
		Assert.assertEquals(actMsg2, expMsg2);
		Reporter.log(expMsg2, true);
		
		String expMsg3="New Email";
		String actMsg3=driver.findElement(By.name("bwfan[0][data][subject]")).getAttribute("value");
		Assert.assertEquals(actMsg3, expMsg3);
		Reporter.log(expMsg3, true);
		
		String expMsg4="My Store";
		String actMsg4=driver.findElement(By.name("bwfan[0][data][email_heading]")).getAttribute("value");
		Assert.assertEquals(actMsg4, expMsg4);
		Reporter.log(expMsg4, true);
		
		boolean status=driver.findElement(By.name("bwfan[0][data][promotional_email]")).isSelected();
		System.out.println(status);
		
		driver.findElement(By.id("bwfan_test_email")).sendKeys("xlpluginstesting@gmail.com");
		driver.findElement(By.id("bwfan_test_email_btn")).click();
		WaitStatementLib.iSleep(3);
		driver.findElement(By.xpath("//a[text()='Change']")).click();
		
		WebElement timeDrpDwn=driver.findElement(By.xpath("//select[@name='bwfan[0][time][delay_type]']"));
		WebDriverCommonLib.selectOptionByValue(timeDrpDwn, "after_delay");
		
		driver.findElement(By.id("bwfan_time_number_0")).clear();
		driver.findElement(By.id("bwfan_time_number_0")).sendKeys("2");
		WaitStatementLib.iSleep(3);
		driver.findElement(By.linkText("Save")).click();
		WaitStatementLib.iSleep(3);
		
	}
	
	public void selectActionCustomCallback_WordPressAdvanced(WebDriver driver)
	{
		WebElement actionDrpDwn=driver.findElement(By.xpath("//select[@name='bwfan[0][action_slug]']"));
		WebDriverCommonLib.selectOptionByValue(actionDrpDwn, "wp_custom_callback");
		
		driver.findElement(By.name("bwfan[0][data][callback_name]")).sendKeys("Hello");
		
		driver.findElement(By.linkText("Save")).click();
		WaitStatementLib.iSleep(3);
		
		driver.navigate().refresh();
		
		WaitStatementLib.iSleep(5);
		driver.findElement(By.xpath("//div[@class='item_wrap_single item_modify_action']")).click();
		
		String expMsg="Custom Callback";
		String actMsg=driver.findElement(By.xpath("//select[@name='bwfan[0][action_slug]']//option[@selected='']")).getText();
		Assert.assertEquals(actMsg, expMsg);
		Reporter.log(expMsg, true);
		
		String expMsg1="Hello";
		String actMsg1=driver.findElement(By.name("bwfan[0][data][callback_name]")).getAttribute("value");
		Assert.assertEquals(actMsg1, expMsg1);
		Reporter.log(expMsg1, true);
		
		WaitStatementLib.iSleep(5);
	}
	
	public void selectActionDebug_WordPressAdvanced(WebDriver driver)
	{
		WebElement actionDrpDwn=driver.findElement(By.xpath("//select[@name='bwfan[0][action_slug]']"));
		WebDriverCommonLib.selectOptionByValue(actionDrpDwn, "wp_debug");
		
		driver.findElement(By.xpath("//textarea[@name='bwfan[0][data][body]']")).sendKeys("Debug Done");
		
		driver.findElement(By.linkText("Save")).click();
		WaitStatementLib.iSleep(3);
		
		driver.navigate().refresh();
		
		WaitStatementLib.iSleep(5);
		driver.findElement(By.xpath("//div[@class='item_wrap_single item_modify_action']")).click();
		
		String expMsg="Debug";
		String actMsg=driver.findElement(By.xpath("//select[@name='bwfan[0][action_slug]']//option[@selected='']")).getText();
		Assert.assertEquals(actMsg, expMsg);
		Reporter.log(expMsg, true);
		
		String expMsg1="Debug Done";
		String actMsg1=driver.findElement(By.xpath("//textarea[@name='bwfan[0][data][body]']")).getText();
		Assert.assertEquals(actMsg1, expMsg1);
		Reporter.log(expMsg1, true);
	}
	
	public void selectActionHttpPost_WordPressAdvanced(WebDriver driver)
	{
		WebElement actionDrpDwn=driver.findElement(By.xpath("//select[@name='bwfan[0][action_slug]']"));
		WebDriverCommonLib.selectOptionByValue(actionDrpDwn, "wp_http_post");
		
		driver.findElement(By.name("bwfan[0][data][url]")).sendKeys("hariprasad@gmail.com");
		
		driver.findElement(By.xpath("//div[contains(@class,'bwfan-pl-0')]/input[contains(@name,'[custom_fields]')]")).sendKeys("Key");
		driver.findElement(By.xpath("//div[contains(@class,'bwfan-pr-0')]/input[contains(@name,'[custom_fields]')]")).sendKeys("Value");
		
		driver.findElement(By.xpath("//div[contains(@class,'bwfan-pl-0')]/input[contains(@name,'[headers]')]")).sendKeys("Header");
		driver.findElement(By.xpath("//div[contains(@class,'bwfan-pr-0')]/input[contains(@name,'[headers]')]")).sendKeys("Values");
		
		driver.findElement(By.linkText("Save")).click();
		WaitStatementLib.iSleep(3);
		
		driver.navigate().refresh();
		
		WaitStatementLib.iSleep(5);
		driver.findElement(By.xpath("//div[@class='item_wrap_single item_modify_action']")).click();
		
		String expMsg="HTTP Post";
		String actMsg=driver.findElement(By.xpath("//select[@name='bwfan[0][action_slug]']//option[@selected='']")).getText();
		Assert.assertEquals(actMsg, expMsg);
		Reporter.log(expMsg, true);
		
		String expMsg1="hariprasad@gmail.com";
		String actMsg1=driver.findElement(By.name("bwfan[0][data][url]")).getAttribute("value");
		Assert.assertEquals(actMsg1, expMsg1);
		Reporter.log(expMsg1, true);
		
		String expMsg2="Key";
		String actMsg2=driver.findElement(By.xpath("//div[contains(@class,'bwfan-pl-0')]/input[contains(@name,'[custom_fields]')]")).getAttribute("value");
		Assert.assertEquals(actMsg2, expMsg2);
//		Reporter.log(expMsg2, true);
		
		String expMsg3="Value";
		String actMsg3=driver.findElement(By.xpath("//div[contains(@class,'bwfan-pr-0')]/input[contains(@name,'[custom_fields]')]")).getAttribute("value");
		Assert.assertEquals(actMsg3, expMsg3);
		Reporter.log(expMsg2+"  "+expMsg3, true);
		
		String expMsg4="Header";
		String actMsg4=driver.findElement(By.xpath("//div[contains(@class,'bwfan-pl-0')]/input[contains(@name,'[headers]')]")).getAttribute("value");
		Assert.assertEquals(actMsg4, expMsg4);
//		Reporter.log(expMsg4, true);
		
		String expMsg5="Values";
		String actMsg5=driver.findElement(By.xpath("//div[contains(@class,'bwfan-pr-0')]/input[contains(@name,'[headers]')]")).getAttribute("value");
		Assert.assertEquals(actMsg5, expMsg5);
		Reporter.log(expMsg4+"  "+expMsg5, true);
	}
	
	public void selectActionSendDataToZapier_Zapier(WebDriver driver)
	{
		WebElement actionDrpDwn=driver.findElement(By.xpath("//select[@name='bwfan[0][action_slug]']"));
		WebDriverCommonLib.selectOptionByValue(actionDrpDwn, "za_send_data");
		
		driver.findElement(By.name("bwfan[0][data][url]")).sendKeys("hariprasad@gmail.com");
		
		driver.findElement(By.xpath("//div[contains(@class,'bwfan-pl-0')]/input[contains(@name,'[custom_fields]')]")).sendKeys("Key");
		driver.findElement(By.xpath("//div[contains(@class,'bwfan-pr-0')]/input[contains(@name,'[custom_fields]')]")).sendKeys("Value");
		
		driver.findElement(By.linkText("Save")).click();
		WaitStatementLib.iSleep(3);
		
		driver.navigate().refresh();
		
		WaitStatementLib.iSleep(5);
		driver.findElement(By.xpath("//div[@class='item_wrap_single item_modify_action']")).click();
		
		String expMsg="Send Data To Zapier";
		String actMsg=driver.findElement(By.xpath("//select[@name='bwfan[0][action_slug]']//option[@selected='']")).getText();
		Assert.assertEquals(actMsg, expMsg);
		Reporter.log(expMsg, true);
		
		String expMsg1="hariprasad@gmail.com";
		String actMsg1=driver.findElement(By.name("bwfan[0][data][url]")).getAttribute("value");
		Assert.assertEquals(actMsg1, expMsg1);
		Reporter.log(expMsg1, true);
		
		String expMsg2="Key";
		String actMsg2=driver.findElement(By.xpath("//div[contains(@class,'bwfan-pl-0')]/input[contains(@name,'[custom_fields]')]")).getAttribute("value");
		Assert.assertEquals(actMsg2, expMsg2);
//		Reporter.log(expMsg2, true);
		
		String expMsg3="Value";
		String actMsg3=driver.findElement(By.xpath("//div[contains(@class,'bwfan-pr-0')]/input[contains(@name,'[custom_fields]')]")).getAttribute("value");
		Assert.assertEquals(actMsg3, expMsg3);
		Reporter.log(expMsg2+"  "+expMsg3, true);
	}
	
	public void selectActionAddTags_ActiveCampaign(WebDriver driver)
	{
		WebElement actionDrpDwn=driver.findElement(By.xpath("//select[@name='bwfan[0][action_slug]']"));
		WebDriverCommonLib.selectOptionByValue(actionDrpDwn, "ac_add_tag");
		
		driver.findElement(By.id("new-tag-wfab_tag")).sendKeys("my_custom_event");
		
		driver.findElement(By.xpath("//li[text()='my_custom_event']")).click();
		
		driver.findElement(By.linkText("Save")).click();
		WaitStatementLib.iSleep(3);
		
		driver.navigate().refresh();
		
		WaitStatementLib.iSleep(5);
		driver.findElement(By.xpath("//div[@class='item_wrap_single item_modify_action']")).click();
		
		String expMsg="Add Tags";
		String actMsg=driver.findElement(By.xpath("//select[@name='bwfan[0][action_slug]']//option[@selected='']")).getText();
		Assert.assertEquals(actMsg, expMsg);
		Reporter.log(expMsg, true);
		
		String expMsg1="my_custom_event";
		String actMsg1=driver.findElement(By.xpath("//li[@data-key='3']")).getText();
		Assert.assertEquals(actMsg1, expMsg1);
		Reporter.log(expMsg1, true);
		
	}
	
	public void selectActionAddContactToAutomation_ActiveCampaign(WebDriver driver)
	{
		WebElement actionDrpDwn=driver.findElement(By.xpath("//select[@name='bwfan[0][action_slug]']"));
		WebDriverCommonLib.selectOptionByValue(actionDrpDwn, "ac_add_to_automation");
		
		WebElement selectAutomationDrpDwn=driver.findElement(By.name("bwfan[0][data][automation_id]"));
		WebDriverCommonLib.selectOptionByValue(selectAutomationDrpDwn, "2");
		
		driver.findElement(By.linkText("Save")).click();
		WaitStatementLib.iSleep(3);
		
		driver.navigate().refresh();
		
		WaitStatementLib.iSleep(5);
		driver.findElement(By.xpath("//div[@class='item_wrap_single item_modify_action']")).click();
		
		String expMsg="Add Contact To Automation";
		String actMsg=driver.findElement(By.xpath("//select[@name='bwfan[0][action_slug]']//option[@selected='']")).getText();
		Assert.assertEquals(actMsg, expMsg);
		Reporter.log(expMsg, true);
		
		String expMsg1="Automation add note test";
		String actMsg1=driver.findElement(By.xpath("//span[@id='select2--container']")).getText();
		Assert.assertEquals(actMsg1, expMsg1);
		Reporter.log(expMsg1, true);
		
	}
	
	public void selectActionAddContactToList_ActiveCampaign(WebDriver driver)
	{
		WebElement actionDrpDwn=driver.findElement(By.xpath("//select[@name='bwfan[0][action_slug]']"));
		WebDriverCommonLib.selectOptionByValue(actionDrpDwn, "ac_add_to_list");
		
		WebElement selectAutomationDrpDwn=driver.findElement(By.name("bwfan[0][data][list_id]"));
		WebDriverCommonLib.selectOptionByValue(selectAutomationDrpDwn, "2");
		
		driver.findElement(By.linkText("Save")).click();
		WaitStatementLib.iSleep(3);
		
		driver.navigate().refresh();
		
		WaitStatementLib.iSleep(5);
		driver.findElement(By.xpath("//div[@class='item_wrap_single item_modify_action']")).click();
		
		String expMsg="Add Contact To List";
		String actMsg=driver.findElement(By.xpath("//select[@name='bwfan[0][action_slug]']//option[@selected='']")).getText();
		Assert.assertEquals(actMsg, expMsg);
		Reporter.log(expMsg, true);
		
		String expMsg1="Updated Test List";
		String actMsg1=driver.findElement(By.xpath("//span[@id='select2--container']")).getText();
		Assert.assertEquals(actMsg1, expMsg1);
		Reporter.log(expMsg1, true);
		
	}
	
	public void selectActionCreateDealNote_ActiveCampaign(WebDriver driver)
	{
		WebElement actionDrpDwn=driver.findElement(By.xpath("//select[@name='bwfan[0][action_slug]']"));
		WebDriverCommonLib.selectOptionByValue(actionDrpDwn, "ac_create_deal_note");
		
		driver.findElement(By.xpath("//textarea[@name='bwfan[0][data][deal_note]']")).sendKeys("Deal Note Added");
		
		driver.findElement(By.linkText("Save")).click();
		WaitStatementLib.iSleep(3);
		
		driver.navigate().refresh();
		
		WaitStatementLib.iSleep(5);
		driver.findElement(By.xpath("//div[@class='item_wrap_single item_modify_action']")).click();
		
		String expMsg="Create Deal Note";
		String actMsg=driver.findElement(By.xpath("//select[@name='bwfan[0][action_slug]']//option[@selected='']")).getText();
		Assert.assertEquals(actMsg, expMsg);
		Reporter.log(expMsg, true);
		
		String expMsg1="Deal Note Added";
		String actMsg1=driver.findElement(By.xpath("//textarea[@name='bwfan[0][data][deal_note]']")).getText();
		Assert.assertEquals(actMsg1, expMsg1);
		Reporter.log(expMsg1, true);
		
	}
	
	public void selectActionCreateDeal_ActiveCampaign(WebDriver driver)
	{
		WebElement actionDrpDwn=driver.findElement(By.xpath("//select[@name='bwfan[0][action_slug]']"));
		WebDriverCommonLib.selectOptionByValue(actionDrpDwn, "ac_create_deal");
		
		driver.findElement(By.name("bwfan[0][data][deal_name]")).sendKeys("New Deal");
		
		driver.findElement(By.xpath("//textarea[@name='bwfan[0][data][deal_description]']")).sendKeys("Free Deals");
		
		driver.findElement(By.name("bwfan[0][data][deal_value]")).clear();
		driver.findElement(By.name("bwfan[0][data][deal_value]")).sendKeys("250");
		
		driver.findElement(By.name("bwfan[0][data][deal_currency]")).clear();
		driver.findElement(By.name("bwfan[0][data][deal_currency]")).sendKeys("USD");
		
		WebElement dealStageDrpDwn=driver.findElement(By.name("bwfan[0][data][stage_id]"));
		WebDriverCommonLib.selectOptionByValue(dealStageDrpDwn, "7_19");
		
		WebElement dealOwnerDrpDwn=driver.findElement(By.name("bwfan[0][data][owner_id]"));
		WebDriverCommonLib.selectOptionByValue(dealOwnerDrpDwn, "1");
		
		driver.findElement(By.linkText("Save")).click();
		WaitStatementLib.iSleep(3);
		
		driver.navigate().refresh();
		
		WaitStatementLib.iSleep(5);
		driver.findElement(By.xpath("//div[@class='item_wrap_single item_modify_action']")).click();
		
		String expMsg="Create Deal";
		String actMsg=driver.findElement(By.xpath("//select[@name='bwfan[0][action_slug]']//option[@selected='']")).getText();
		Assert.assertEquals(actMsg, expMsg);
		Reporter.log(expMsg, true);
		
		String expMsg1="New Deal";
		String actMsg1=driver.findElement(By.name("bwfan[0][data][deal_name]")).getAttribute("value");
		Assert.assertEquals(actMsg1, expMsg1);
		Reporter.log(expMsg1, true);
		
		String expMsg2="Free Deals";
		String actMsg2=driver.findElement(By.xpath("//textarea[@name='bwfan[0][data][deal_description]']")).getText();
		Assert.assertEquals(actMsg2, expMsg2);
		Reporter.log(expMsg2, true);
		
		String expMsg3="250";
		String actMsg3=driver.findElement(By.name("bwfan[0][data][deal_value]")).getAttribute("value");
		Assert.assertEquals(actMsg3, expMsg3);
		Reporter.log(expMsg3, true);
		
		String expMsg4="USD";
		String actMsg4=driver.findElement(By.name("bwfan[0][data][deal_currency]")).getAttribute("value");
		Assert.assertEquals(actMsg4, expMsg4);
		Reporter.log(expMsg4, true);
		
		String expMsg5="To Contact";
		String actMsg5=driver.findElement(By.xpath("//select[@name='bwfan[0][data][stage_id]']//option[@selected='']")).getText();
		Assert.assertEquals(actMsg5, expMsg5);
		Reporter.log(expMsg5, true);
		
		String expMsg6="Aman Saxena";
		String actMsg6=driver.findElement(By.xpath("//select[@name='bwfan[0][data][owner_id]']/option[@selected='']")).getText();;
		Assert.assertEquals(actMsg6, expMsg6);
		Reporter.log(expMsg6, true);
	}
	
	public void selectActionCreateOrder_ActiveCampaign(WebDriver driver)
	{
		WebElement actionDrpDwn=driver.findElement(By.xpath("//select[@name='bwfan[0][action_slug]']"));
		WebDriverCommonLib.selectOptionByValue(actionDrpDwn, "ac_create_order");
		
		WebElement connectionDrpDwn=driver.findElement(By.name("bwfan[0][data][connection_id]"));
		WebDriverCommonLib.selectOptionByValue(connectionDrpDwn, "2");
		
		driver.findElement(By.linkText("Save")).click();
		WaitStatementLib.iSleep(3);
		
		driver.navigate().refresh();
		
		WaitStatementLib.iSleep(5);
		driver.findElement(By.xpath("//div[@class='item_wrap_single item_modify_action']")).click();
		
		String expMsg="Create Order";
		String actMsg=driver.findElement(By.xpath("//select[@name='bwfan[0][action_slug]']//option[@selected='']")).getText();
		Assert.assertEquals(actMsg, expMsg);
		Reporter.log(expMsg, true);
		
		String expMsg1="WooCommerce (#2)";
		String actMsg1=driver.findElement(By.xpath("//span[@id='select2--container']")).getAttribute("title");
		Assert.assertEquals(actMsg1, expMsg1);
		Reporter.log(expMsg1, true);
		
	}
	
	public void selectActionEndAutomation_ActiveCampaign(WebDriver driver)
	{
		WebElement actionDrpDwn=driver.findElement(By.xpath("//select[@name='bwfan[0][action_slug]']"));
		WebDriverCommonLib.selectOptionByValue(actionDrpDwn, "ac_rmv_from_automation");
		
		WebElement connectionDrpDwn=driver.findElement(By.name("bwfan[0][data][automation_id]"));
		WebDriverCommonLib.selectOptionByValue(connectionDrpDwn, "2");
		
		driver.findElement(By.linkText("Save")).click();
		WaitStatementLib.iSleep(3);
		
		driver.navigate().refresh();
		
		WaitStatementLib.iSleep(5);
		driver.findElement(By.xpath("//div[@class='item_wrap_single item_modify_action']")).click();
		
		String expMsg="End Automation";
		String actMsg=driver.findElement(By.xpath("//select[@name='bwfan[0][action_slug]']//option[@selected='']")).getText();
		Assert.assertEquals(actMsg, expMsg);
		Reporter.log(expMsg, true);
		
		String expMsg1="Automation add note test";
		String actMsg1=driver.findElement(By.xpath("//span[@id='select2--container']")).getText();
		Assert.assertEquals(actMsg1, expMsg1);
		Reporter.log(expMsg1, true);
		
	}
	
	public void selectActionRemoveContactFromList_ActiveCampaign(WebDriver driver)
	{
		WebElement actionDrpDwn=driver.findElement(By.xpath("//select[@name='bwfan[0][action_slug]']"));
		WebDriverCommonLib.selectOptionByValue(actionDrpDwn, "ac_rmv_from_list");
		
		WebElement selectAutomationDrpDwn=driver.findElement(By.name("bwfan[0][data][list_id]"));
		WebDriverCommonLib.selectOptionByValue(selectAutomationDrpDwn, "2");
		
		driver.findElement(By.linkText("Save")).click();
		WaitStatementLib.iSleep(3);
		
		driver.navigate().refresh();
		
		WaitStatementLib.iSleep(5);
		driver.findElement(By.xpath("//div[@class='item_wrap_single item_modify_action']")).click();
		
		String expMsg="Remove Contact From List";
		String actMsg=driver.findElement(By.xpath("//select[@name='bwfan[0][action_slug]']//option[@selected='']")).getText();
		Assert.assertEquals(actMsg, expMsg);
		Reporter.log(expMsg, true);
		
		String expMsg1="Updated Test List";
		String actMsg1=driver.findElement(By.xpath("//span[@id='select2--container']")).getText();
		Assert.assertEquals(actMsg1, expMsg1);
		Reporter.log(expMsg1, true);
		
	}
	
	public void selectActionRemoveTags_ActiveCampaign(WebDriver driver)
	{
		WebElement actionDrpDwn=driver.findElement(By.xpath("//select[@name='bwfan[0][action_slug]']"));
		WebDriverCommonLib.selectOptionByValue(actionDrpDwn, "ac_rmv_tag");
		
		driver.findElement(By.id("new-tag-bwfan_tag")).sendKeys("my_custom_event");
		
		driver.findElement(By.xpath("//li[text()='my_custom_event']")).click();
		
		driver.findElement(By.linkText("Save")).click();
		WaitStatementLib.iSleep(3);
		
		driver.navigate().refresh();
		
		WaitStatementLib.iSleep(5);
		driver.findElement(By.xpath("//div[@class='item_wrap_single item_modify_action']")).click();
		
		String expMsg="Remove Tags";
		String actMsg=driver.findElement(By.xpath("//select[@name='bwfan[0][action_slug]']//option[@selected='']")).getText();
		Assert.assertEquals(actMsg, expMsg);
		Reporter.log(expMsg, true);
		
		String expMsg1="my_custom_event";
		String actMsg1=driver.findElement(By.xpath("//li[@data-key='3']")).getText();
		Assert.assertEquals(actMsg1, expMsg1);
		Reporter.log(expMsg1, true);
		
	}
	
	public void selectActionUpdateFields_ActiveCampaign(WebDriver driver)
	{
		WebElement actionDrpDwn=driver.findElement(By.xpath("//select[@name='bwfan[0][action_slug]']"));
		WebDriverCommonLib.selectOptionByValue(actionDrpDwn, "ac_update_customfields");
		
		WebElement customFieldsDrpDwn=driver.findElement(By.xpath("//div[contains(@class,'bwfan-p-0')]//select[contains(@name,'[custom_fields]')]"));
		WebDriverCommonLib.selectOptionByValue(customFieldsDrpDwn, "1");
		
		driver.findElement(By.xpath("//div[contains(@class,'bwfan-pr-0')]/input[contains(@name,'[custom_fields]')]")).sendKeys("123");
		
		driver.findElement(By.linkText("Save")).click();
		WaitStatementLib.iSleep(3);
		
		driver.navigate().refresh();
		
		WaitStatementLib.iSleep(5);
		driver.findElement(By.xpath("//div[@class='item_wrap_single item_modify_action']")).click();
		
		String expMsg="Update Fields";
		String actMsg=driver.findElement(By.xpath("//select[@name='bwfan[0][action_slug]']//option[@selected='']")).getText();
		Assert.assertEquals(actMsg, expMsg);
		Reporter.log(expMsg, true);
		
		String expMsg1="woofunnel_id";
		String actMsg1=driver.findElement(By.xpath("//select[contains(@name,'[custom_fields]')]/option[@selected='']")).getText();
		Assert.assertEquals(actMsg1, expMsg1);
//		Reporter.log(expMsg1, true);
		
		String expMsg2="123";
		String actMsg2=driver.findElement(By.xpath("//div[contains(@class,'bwfan-pr-0')]/input[contains(@name,'[custom_fields]')]")).getAttribute("value");
		Assert.assertEquals(actMsg2, expMsg2);
		Reporter.log(expMsg1+"  "+expMsg2, true);
	}
	
	public void selectActionUpdateDeal_ActiveCampaign(WebDriver driver)
	{
		WebElement actionDrpDwn=driver.findElement(By.xpath("//select[@name='bwfan[0][action_slug]']"));
		WebDriverCommonLib.selectOptionByValue(actionDrpDwn, "ac_update_deal");
		
		driver.findElement(By.name("bwfan[0][data][deal_value]")).clear();
		driver.findElement(By.name("bwfan[0][data][deal_value]")).sendKeys("12345");
		
		WebElement dealStageDrpDwn=driver.findElement(By.name("bwfan[0][data][stage_id]"));
		WebDriverCommonLib.selectOptionByValue(dealStageDrpDwn, "7_19");
		
		WebElement dealOwnerDrpDwn=driver.findElement(By.name("bwfan[0][data][owner_id]"));
		WebDriverCommonLib.selectOptionByValue(dealOwnerDrpDwn, "1");
		
		driver.findElement(By.linkText("Save")).click();
		WaitStatementLib.iSleep(3);
		
		driver.navigate().refresh();
		
		WaitStatementLib.iSleep(5);
		driver.findElement(By.xpath("//div[@class='item_wrap_single item_modify_action']")).click();
		
		String expMsg="Update Deal";
		String actMsg=driver.findElement(By.xpath("//select[@name='bwfan[0][action_slug]']//option[@selected='']")).getText();
		Assert.assertEquals(actMsg, expMsg);
		Reporter.log(expMsg, true);
		
		String expMsg1="12345";
		String actMsg1=driver.findElement(By.name("bwfan[0][data][deal_value]")).getAttribute("value");
		Assert.assertEquals(actMsg1, expMsg1);
		Reporter.log(expMsg1, true);
		
		String expMsg5="To Contact";
		String actMsg5=driver.findElement(By.xpath("//select[@name='bwfan[0][data][stage_id]']//option[@selected='']")).getText();
		Assert.assertEquals(actMsg5, expMsg5);
		Reporter.log(expMsg5, true);
		
		String expMsg6="Aman Saxena";
		String actMsg6=driver.findElement(By.xpath("//select[@name='bwfan[0][data][owner_id]']/option[@selected='']")).getText();;
		Assert.assertEquals(actMsg6, expMsg6);
		Reporter.log(expMsg6, true);
	}
	
	public void selectActionUpdateCustomFields_Convertkit(WebDriver driver)
	{
		WebElement actionDrpDwn=driver.findElement(By.xpath("//select[@name='bwfan[0][action_slug]']"));
		WebDriverCommonLib.selectOptionByValue(actionDrpDwn, "ck_add_customfields");
		
		WebElement sequenceDrpDwn=driver.findElement(By.name("bwfan[0][data][sequence_id]"));
		WebDriverCommonLib.selectOptionByValue(sequenceDrpDwn, "446806");
		
		WebElement customFieldsDrpDwn=driver.findElement(By.xpath("//div[contains(@class,'bwfan-pl-0')]//select[contains(@name,'[custom_fields]')]"));
		WebDriverCommonLib.selectOptionByValue(customFieldsDrpDwn, "first_name");
		
		driver.findElement(By.xpath("//div[contains(@class,'bwfan-pr-0')]/input[contains(@name,'[custom_fields]')]")).sendKeys("rits");
		
		driver.findElement(By.linkText("Save")).click();
		WaitStatementLib.iSleep(3);
		
		driver.navigate().refresh();
		
		WaitStatementLib.iSleep(5);
		driver.findElement(By.xpath("//div[@class='item_wrap_single item_modify_action']")).click();
		
		String expMsg="Update Custom Fields";
		String actMsg=driver.findElement(By.xpath("//select[@name='bwfan[0][action_slug]']//option[@selected='']")).getText();
		Assert.assertEquals(actMsg, expMsg);
		Reporter.log(expMsg, true);
		
		String expMsg1="test-ritvik";
		String actMsg1=driver.findElement(By.xpath("//select[@name='bwfan[0][data][sequence_id]']/option[@selected='']")).getText();
		Assert.assertEquals(actMsg1, expMsg1);
		Reporter.log(expMsg1, true);
		
		String expMsg2="First Name";
		String actMsg2=driver.findElement(By.xpath("//select[contains(@name,'[custom_fields]')]/option[@selected='']")).getText();
		Assert.assertEquals(actMsg2, expMsg2);
//		Reporter.log(expMsg2, true);
		
		String expMsg3="rits";
		String actMsg3=driver.findElement(By.xpath("//div[contains(@class,'bwfan-pr-0')]/input[contains(@name,'[custom_fields]')]")).getAttribute("value");
		Assert.assertEquals(actMsg3, expMsg3);
		Reporter.log(expMsg2+"  "+expMsg3, true);
	}
	
	public void selectActionCreateNewPurchase_Convertkit(WebDriver driver)
	{
		WebElement actionDrpDwn=driver.findElement(By.xpath("//select[@name='bwfan[0][action_slug]']"));
		WebDriverCommonLib.selectOptionByValue(actionDrpDwn, "ck_add_order");
		
		driver.findElement(By.linkText("Save")).click();
		WaitStatementLib.iSleep(3);
		
		driver.navigate().refresh();
		
		WaitStatementLib.iSleep(5);
		driver.findElement(By.xpath("//div[@class='item_wrap_single item_modify_action']")).click();
		
		String expMsg="Create A New Purchase";
		String actMsg=driver.findElement(By.xpath("//select[@name='bwfan[0][action_slug]']//option[@selected='']")).getText();
		Assert.assertEquals(actMsg, expMsg);
		Reporter.log(expMsg, true);
		
	}
	
	public void selectActionAddTags_Convertkit(WebDriver driver)
	{
		WebElement actionDrpDwn=driver.findElement(By.xpath("//select[@name='bwfan[0][action_slug]']"));
		WebDriverCommonLib.selectOptionByValue(actionDrpDwn, "ck_add_tags");
		
		driver.findElement(By.id("new-tag-bwfan_tag")).sendKeys("testing");
		
		driver.findElement(By.xpath("//li[text()='testing']")).click();
		
		driver.findElement(By.linkText("Save")).click();
		WaitStatementLib.iSleep(3);
		
		driver.navigate().refresh();
		
		WaitStatementLib.iSleep(5);
		driver.findElement(By.xpath("//div[@class='item_wrap_single item_modify_action']")).click();
		
		String expMsg="Add Tags";
		String actMsg=driver.findElement(By.xpath("//select[@name='bwfan[0][action_slug]']//option[@selected='']")).getText();
		Assert.assertEquals(actMsg, expMsg);
		Reporter.log(expMsg, true);
		
		String expMsg1="testing";
		String actMsg1=driver.findElement(By.xpath("//li[@data-key='1081021']")).getText();
		Assert.assertEquals(actMsg1, expMsg1);
		Reporter.log(expMsg1, true);
	}
	
	public void selectActionAddSubscriberToSequence_Convertkit(WebDriver driver)
	{
		WebElement actionDrpDwn=driver.findElement(By.xpath("//select[@name='bwfan[0][action_slug]']"));
		WebDriverCommonLib.selectOptionByValue(actionDrpDwn, "ck_add_to_sequence");
		
		WebElement sequenceDrpDwn=driver.findElement(By.name("bwfan[0][data][sequence_id]"));
		WebDriverCommonLib.selectOptionByValue(sequenceDrpDwn, "446806");
		
		driver.findElement(By.linkText("Save")).click();
		WaitStatementLib.iSleep(3);
		
		driver.navigate().refresh();
		
		WaitStatementLib.iSleep(5);
		driver.findElement(By.xpath("//div[@class='item_wrap_single item_modify_action']")).click();
		
		String expMsg="Add Subscriber To Sequence";
		String actMsg=driver.findElement(By.xpath("//select[@name='bwfan[0][action_slug]']//option[@selected='']")).getText();
		Assert.assertEquals(actMsg, expMsg);
		Reporter.log(expMsg, true);
		
		String expMsg1="test-ritvik";
		String actMsg1=driver.findElement(By.xpath("//span[@id='select2--container']")).getAttribute("title");
		Assert.assertEquals(actMsg1, expMsg1);
		Reporter.log(expMsg1, true);
		
	}
	
	public void selectActionRemoveSubscriberFromSequence_Convertkit(WebDriver driver)
	{
		WebElement actionDrpDwn=driver.findElement(By.xpath("//select[@name='bwfan[0][action_slug]']"));
		WebDriverCommonLib.selectOptionByValue(actionDrpDwn, "ck_rmv_from_sequence");
		
		WebElement sequenceDrpDwn=driver.findElement(By.name("bwfan[0][data][sequence_id]"));
		WebDriverCommonLib.selectOptionByValue(sequenceDrpDwn, "446806");
		
		driver.findElement(By.linkText("Save")).click();
		WaitStatementLib.iSleep(3);
		
		driver.navigate().refresh();
		
		WaitStatementLib.iSleep(5);
		driver.findElement(By.xpath("//div[@class='item_wrap_single item_modify_action']")).click();
		
		String expMsg="Remove Subscriber from Sequence";
		String actMsg=driver.findElement(By.xpath("//select[@name='bwfan[0][action_slug]']//option[@selected='']")).getText();
		Assert.assertEquals(actMsg, expMsg);
		Reporter.log(expMsg, true);
		
		String expMsg1="test-ritvik";
		String actMsg1=driver.findElement(By.xpath("//span[@id='select2--container']")).getAttribute("title");
		Assert.assertEquals(actMsg1, expMsg1);
		Reporter.log(expMsg1, true);
		
	}
	
	public void selectActionRemoveTags_Convertkit(WebDriver driver)
	{
		WebElement actionDrpDwn=driver.findElement(By.xpath("//select[@name='bwfan[0][action_slug]']"));
		WebDriverCommonLib.selectOptionByValue(actionDrpDwn, "ck_rmv_tags");
		
		driver.findElement(By.id("new-tag-bwfan_tag")).sendKeys("testing");
		
		driver.findElement(By.xpath("//li[text()='testing']")).click();
		
		driver.findElement(By.linkText("Save")).click();
		WaitStatementLib.iSleep(3);
		
		driver.navigate().refresh();
		
		WaitStatementLib.iSleep(5);
		driver.findElement(By.xpath("//div[@class='item_wrap_single item_modify_action']")).click();
		
		String expMsg="Remove Tags";
		String actMsg=driver.findElement(By.xpath("//select[@name='bwfan[0][action_slug]']//option[@selected='']")).getText();
		Assert.assertEquals(actMsg, expMsg);
		Reporter.log(expMsg, true);
		
		String expMsg1="testing";
		String actMsg1=driver.findElement(By.xpath("//li[@data-key='1081021']")).getText();
		Assert.assertEquals(actMsg1, expMsg1);
		Reporter.log(expMsg1, true);
	}
	
	public void selectActionUpdateCustomFieldsOfSubscriber_Drip(WebDriver driver)
	{
		WebElement actionDrpDwn=driver.findElement(By.xpath("//select[@name='bwfan[0][action_slug]']"));
		WebDriverCommonLib.selectOptionByValue(actionDrpDwn, "dr_add_customfields");
		
		WebElement customFieldsDrpDwn=driver.findElement(By.xpath("//div[contains(@class,'bwfan-pl-0')]//select[contains(@name,'[custom_fields]')]"));
		WebDriverCommonLib.selectOptionByValue(customFieldsDrpDwn, "lifetime_value");
		
		driver.findElement(By.xpath("//div[contains(@class,'bwfan-pr-0')]/input[contains(@name,'[custom_fields]')]")).sendKeys("575");
		
		driver.findElement(By.linkText("Save")).click();
		WaitStatementLib.iSleep(3);
		
		driver.navigate().refresh();
		
		WaitStatementLib.iSleep(5);
		driver.findElement(By.xpath("//div[@class='item_wrap_single item_modify_action']")).click();
		
		String expMsg="Update Custom fields of Subscriber";
		String actMsg=driver.findElement(By.xpath("//select[@name='bwfan[0][action_slug]']//option[@selected='']")).getText();
		Assert.assertEquals(actMsg, expMsg);
		Reporter.log(expMsg, true);
		
		String expMsg1="lifetime_value";
		String actMsg1=driver.findElement(By.xpath("//select[contains(@name,'[custom_fields]')]/option[@selected='']")).getText();
		Assert.assertEquals(actMsg1, expMsg1);
//		Reporter.log(expMsg1, true);
		
		String expMsg2="575";
		String actMsg2=driver.findElement(By.xpath("//div[contains(@class,'bwfan-pr-0')]/input[contains(@name,'[custom_fields]')]")).getAttribute("value");
		Assert.assertEquals(actMsg2, expMsg2);
		Reporter.log(expMsg1+"  "+expMsg2, true);
	}
	
	public void selectActionAddNewOrder_Drip(WebDriver driver)
	{
		WebElement actionDrpDwn=driver.findElement(By.xpath("//select[@name='bwfan[0][action_slug]']"));
		WebDriverCommonLib.selectOptionByValue(actionDrpDwn, "dr_add_order");
		
		driver.findElement(By.linkText("Save")).click();
		WaitStatementLib.iSleep(3);
		
		driver.navigate().refresh();
		
		WaitStatementLib.iSleep(5);
		driver.findElement(By.xpath("//div[@class='item_wrap_single item_modify_action']")).click();
		
		String expMsg="Add A New Order";
		String actMsg=driver.findElement(By.xpath("//select[@name='bwfan[0][action_slug]']//option[@selected='']")).getText();
		Assert.assertEquals(actMsg, expMsg);
		Reporter.log(expMsg, true);
		
	}
	
	public void selectActionAddTags_Drip(WebDriver driver)
	{
		WebElement actionDrpDwn=driver.findElement(By.xpath("//select[@name='bwfan[0][action_slug]']"));
		WebDriverCommonLib.selectOptionByValue(actionDrpDwn, "dr_add_tags");
		
		driver.findElement(By.id("new-tag-bwfan_tag")).sendKeys("my_custom_tags");
		
		driver.findElement(By.xpath("//li[text()='my_custom_tags']")).click();
		
		driver.findElement(By.linkText("Save")).click();
		WaitStatementLib.iSleep(3);
		
		driver.navigate().refresh();
		
		WaitStatementLib.iSleep(5);
		driver.findElement(By.xpath("//div[@class='item_wrap_single item_modify_action']")).click();
		
		String expMsg="Add Tags";
		String actMsg=driver.findElement(By.xpath("//select[@name='bwfan[0][action_slug]']//option[@selected='']")).getText();
		Assert.assertEquals(actMsg, expMsg);
		Reporter.log(expMsg, true);
		
		String expMsg1="my_custom_tags";
		String actMsg1=driver.findElement(By.xpath("//li[@data-key='5']")).getText();
		Assert.assertEquals(actMsg1, expMsg1);
		Reporter.log(expMsg1, true);
	}
	
	public void selectActionAddSubscriberToCampaign_Drip(WebDriver driver)
	{
		WebElement actionDrpDwn=driver.findElement(By.xpath("//select[@name='bwfan[0][action_slug]']"));
		WebDriverCommonLib.selectOptionByValue(actionDrpDwn, "dr_add_to_campaign");
		
		WebElement campaignDrpDwn=driver.findElement(By.name("bwfan[0][data][campaign_id]"));
		WebDriverCommonLib.selectOptionByValue(campaignDrpDwn, "478236742");
		
		driver.findElement(By.linkText("Save")).click();
		WaitStatementLib.iSleep(3);
		
		driver.navigate().refresh();
		
		WaitStatementLib.iSleep(5);
		driver.findElement(By.xpath("//div[@class='item_wrap_single item_modify_action']")).click();
		
		String expMsg="Add Subscriber to Campaign";
		String actMsg=driver.findElement(By.xpath("//select[@name='bwfan[0][action_slug]']//option[@selected='']")).getText();
		Assert.assertEquals(actMsg, expMsg);
		Reporter.log(expMsg, true);
		
		String expMsg1="AUtobot Testing";
		String actMsg1=driver.findElement(By.xpath("//span[@id='select2--container']")).getAttribute("title");
		Assert.assertEquals(actMsg1, expMsg1);
		Reporter.log(expMsg1, true);
		
	}
	
	public void selectActionAddSubscriberToWorkflow_Drip(WebDriver driver)
	{
		WebElement actionDrpDwn=driver.findElement(By.xpath("//select[@name='bwfan[0][action_slug]']"));
		WebDriverCommonLib.selectOptionByValue(actionDrpDwn, "dr_add_to_workflow");
		
		WebElement campaignDrpDwn=driver.findElement(By.name("bwfan[0][data][workflow_id]"));
		WebDriverCommonLib.selectOptionByValue(campaignDrpDwn, "335028203");
		
		driver.findElement(By.linkText("Save")).click();
		WaitStatementLib.iSleep(3);
		
		driver.navigate().refresh();
		
		WaitStatementLib.iSleep(5);
		driver.findElement(By.xpath("//div[@class='item_wrap_single item_modify_action']")).click();
		
		String expMsg="Add Subscriber to Workflow";
		String actMsg=driver.findElement(By.xpath("//select[@name='bwfan[0][action_slug]']//option[@selected='']")).getText();
		Assert.assertEquals(actMsg, expMsg);
		Reporter.log(expMsg, true);
		
		String expMsg1="FB Audience";
		String actMsg1=driver.findElement(By.xpath("//span[@id='select2--container']")).getAttribute("title");
		Assert.assertEquals(actMsg1, expMsg1);
		Reporter.log(expMsg1, true);
		
	}
	
	public void selectActionRemoveSubscriberFromCampaign_Drip(WebDriver driver)
	{
		WebElement actionDrpDwn=driver.findElement(By.xpath("//select[@name='bwfan[0][action_slug]']"));
		WebDriverCommonLib.selectOptionByValue(actionDrpDwn, "dr_rmv_from_campaign");
		
		WebElement campaignDrpDwn=driver.findElement(By.name("bwfan[0][data][campaign_id]"));
		WebDriverCommonLib.selectOptionByValue(campaignDrpDwn, "478236742");
		
		driver.findElement(By.linkText("Save")).click();
		WaitStatementLib.iSleep(3);
		
		driver.navigate().refresh();
		
		WaitStatementLib.iSleep(5);
		driver.findElement(By.xpath("//div[@class='item_wrap_single item_modify_action']")).click();
		
		String expMsg="Remove Subscriber from Campaign";
		String actMsg=driver.findElement(By.xpath("//select[@name='bwfan[0][action_slug]']//option[@selected='']")).getText();
		Assert.assertEquals(actMsg, expMsg);
		Reporter.log(expMsg, true);
		
		String expMsg1="AUtobot Testing";
		String actMsg1=driver.findElement(By.xpath("//span[@id='select2--container']")).getAttribute("title");
		Assert.assertEquals(actMsg1, expMsg1);
		Reporter.log(expMsg1, true);
		
	}
	
	public void selectActionRemoveSubscriberFromWorkflow_Drip(WebDriver driver)
	{
		WebElement actionDrpDwn=driver.findElement(By.xpath("//select[@name='bwfan[0][action_slug]']"));
		WebDriverCommonLib.selectOptionByValue(actionDrpDwn, "dr_rmv_from_workflow");
		
		WebElement campaignDrpDwn=driver.findElement(By.name("bwfan[0][data][workflow_id]"));
		WebDriverCommonLib.selectOptionByValue(campaignDrpDwn, "335028203");
		
		driver.findElement(By.linkText("Save")).click();
		WaitStatementLib.iSleep(3);
		
		driver.navigate().refresh();
		
		WaitStatementLib.iSleep(5);
		driver.findElement(By.xpath("//div[@class='item_wrap_single item_modify_action']")).click();

		String expMsg="Remove Subscriber from Workflow";
		String actMsg=driver.findElement(By.xpath("//select[@name='bwfan[0][action_slug]']//option[@selected='']")).getText();
		Assert.assertEquals(actMsg, expMsg);
		Reporter.log(expMsg, true);
		
		String expMsg1="FB Audience";
		String actMsg1=driver.findElement(By.xpath("//span[@id='select2--container']")).getAttribute("title");
		Assert.assertEquals(actMsg1, expMsg1);
		Reporter.log(expMsg1, true);
		
	}
	
	public void selectActionRemoveTags_Drip(WebDriver driver)
	{
		WebElement actionDrpDwn=driver.findElement(By.xpath("//select[@name='bwfan[0][action_slug]']"));
		WebDriverCommonLib.selectOptionByValue(actionDrpDwn, "dr_rmv_tags");
		
		driver.findElement(By.id("new-tag-bwfan_tag")).sendKeys("my_custom_tags");
		
		driver.findElement(By.xpath("//li[text()='my_custom_tags']")).click();
		
		driver.findElement(By.linkText("Save")).click();
		WaitStatementLib.iSleep(3);
		
		driver.navigate().refresh();
		
		WaitStatementLib.iSleep(5);
		driver.findElement(By.xpath("//div[@class='item_wrap_single item_modify_action']")).click();
		
		String expMsg="Remove Tags";
		String actMsg=driver.findElement(By.xpath("//select[@name='bwfan[0][action_slug]']//option[@selected='']")).getText();
		Assert.assertEquals(actMsg, expMsg);
		Reporter.log(expMsg, true);
		
		String expMsg1="my_custom_tags";
		String actMsg1=driver.findElement(By.xpath("//li[@data-key='5']")).getText();
		Assert.assertEquals(actMsg1, expMsg1);
		Reporter.log(expMsg1, true);
	}
	
	public void selectActionSendMsgToUser_Slack(WebDriver driver)
	{
		WebElement actionDrpDwn=driver.findElement(By.xpath("//select[@name='bwfan[0][action_slug]']"));
		WebDriverCommonLib.selectOptionByValue(actionDrpDwn, "sl_message_user");
		
		WebElement userDrpDwn=driver.findElement(By.name("bwfan[0][data][slack_user]"));
		WebDriverCommonLib.selectOptionByValue(userDrpDwn, "UKLSNP0MT");
		
		driver.findElement(By.xpath("//textarea[@name='bwfan[0][data][body]']")).sendKeys("Hello Ritvik");
		
		driver.findElement(By.linkText("Save")).click();
		WaitStatementLib.iSleep(3);
		
		driver.navigate().refresh();
		
		WaitStatementLib.iSleep(5);
		driver.findElement(By.xpath("//div[@class='item_wrap_single item_modify_action']")).click();
		
		String expMsg="Sends a message to a user";
		String actMsg=driver.findElement(By.xpath("//select[@name='bwfan[0][action_slug]']//option[@selected='']")).getText();
		Assert.assertEquals(actMsg, expMsg);
		Reporter.log(expMsg, true);
		
		String expMsg1="Ritvik (@ritvik)";
		String actMsg1=driver.findElement(By.xpath("//span[@id='select2--container']")).getAttribute("title");
		Assert.assertEquals(actMsg1, expMsg1);
		Reporter.log(expMsg1, true);
		
		String expMsg2="Hello Ritvik";
		String actMsg2=driver.findElement(By.xpath("//textarea[@name='bwfan[0][data][body]']")).getText();
		Assert.assertEquals(actMsg2, expMsg2);
		Reporter.log(expMsg2, true);
	}
	
	public void selectActionSendMsgToChannel_Slack(WebDriver driver)
	{
		WebElement actionDrpDwn=driver.findElement(By.xpath("//select[@name='bwfan[0][action_slug]']"));
		WebDriverCommonLib.selectOptionByValue(actionDrpDwn, "sl_message");
		
		WebElement channelDrpDwn=driver.findElement(By.name("bwfan[0][data][slack_channel]"));
		WebDriverCommonLib.selectOptionByValue(channelDrpDwn, "C0429SXKC");
		
		driver.findElement(By.xpath("//textarea[@name='bwfan[0][data][body]']")).sendKeys("Hello Everyone");
		
		driver.findElement(By.linkText("Save")).click();
		WaitStatementLib.iSleep(3);
		
		driver.navigate().refresh();
		
		WaitStatementLib.iSleep(5);
		driver.findElement(By.xpath("//div[@class='item_wrap_single item_modify_action']")).click();
		
		String expMsg="Sends a message to a channel";
		String actMsg=driver.findElement(By.xpath("//select[@name='bwfan[0][action_slug]']//option[@selected='']")).getText();
		Assert.assertEquals(actMsg, expMsg);
		Reporter.log(expMsg, true);
		
		String expMsg1="#wisetrspeaks";
		String actMsg1=driver.findElement(By.xpath("//span[@id='select2--container']")).getAttribute("title");
		Assert.assertEquals(actMsg1, expMsg1);
		Reporter.log(expMsg1, true);
		
		String expMsg2="Hello Everyone";
		String actMsg2=driver.findElement(By.xpath("//textarea[@name='bwfan[0][data][body]']")).getText();
		Assert.assertEquals(actMsg2, expMsg2);
		Reporter.log(expMsg2, true);
	}
	
	public void selectActionInsertRow_GoogleSheets(WebDriver driver)
	{
		WebElement actionDrpDwn=driver.findElement(By.xpath("//select[@name='bwfan[0][action_slug]']"));
		WebDriverCommonLib.selectOptionByValue(actionDrpDwn, "gs_insert_data");
		
		driver.findElement(By.name("bwfan[0][data][spreadsheet_id]")).clear();
		driver.findElement(By.name("bwfan[0][data][spreadsheet_id]")).sendKeys("1C5IJdghLsGze0xx-N-ArrCUKRp0bpinnO_gwt6hGm24");
		
		driver.findElement(By.linkText("Get Sheets")).click();
		
		WebElement worksheetDrpDwn=driver.findElement(By.name("bwfan[0][data][worksheet_title]"));
		WebDriverCommonLib.selectOptionByValue(worksheetDrpDwn, "Sheet1");
		
		WebElement column1DrpDwn=driver.findElement(By.name("bwfan[0][data][worksheet_data][column][0]"));
		WebDriverCommonLib.selectOptionByValue(column1DrpDwn, "A");
		
		driver.findElement(By.name("bwfan[0][data][worksheet_data][value][0]")).sendKeys("{{customer_email}}");
		
		driver.findElement(By.linkText("Add More")).click();
		
		WebElement column2DrpDwn=driver.findElement(By.name("bwfan[0][data][worksheet_data][column][1]"));
		WebDriverCommonLib.selectOptionByValue(column2DrpDwn, "B");
		
		driver.findElement(By.name("bwfan[0][data][worksheet_data][value][1]")).sendKeys("{{current_order_note}}");
		
		driver.findElement(By.linkText("Save")).click();
		WaitStatementLib.iSleep(3);
		
	}
	
	
	
	public void deleteCheckoutPage(WebDriver driver)
	{
		WaitStatementLib.iSleep(3);
		driver.findElement(By.xpath("//a[contains(@class,'bwfan_btn_close')]")).click();
		
		WaitStatementLib.iSleep(3);
		WebElement autobotAutomationTestingPage=driver.findElement(By.xpath("//a[contains(text(),'Autobot Automation Testing')]"));
		Actions act=new Actions(driver);
		act.moveToElement(autobotAutomationTestingPage).perform();
		
		WebElement deletePermanently=driver.findElement(By.xpath("//a[text()='Delete Permanently']"));
		act.click(deletePermanently).perform();
		
		WaitStatementLib.iSleep(2);
		driver.findElement(By.xpath("//button[text()='Yes, proceed']")).click();
		WaitStatementLib.iSleep(3);
		
	}
	
	
}
