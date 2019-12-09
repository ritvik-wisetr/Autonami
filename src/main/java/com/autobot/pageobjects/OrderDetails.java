package com.autobot.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import com.autobot.generics.WebDriverCommonLib;

public class OrderDetails 
{
	@FindBy(xpath="//h1[text()='Order received']")
	private WebElement receiving;
	
	@FindBy(xpath="//td[contains(text(),'Belt for your pant')]")
	private WebElement beltProduct;
	
	@FindBy(xpath="//div[@class='woocommerce-order']//li[contains(@class,'overview__order')]/strong")
	private WebElement orderNo;
	
	@FindBy(xpath="//h2[text()='Order details']")
	private WebElement details;
	
	public OrderDetails(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void finalOrders()
	{
		String expMsg="Order received";
		String actMsg=receiving.getText();
		Assert.assertEquals(actMsg, expMsg);
		Reporter.log(expMsg, true);
	}
	
	public void findOrderNo()
	{
		String orderNumber = orderNo.getText();
		System.out.println(orderNumber);
	}
	
	public void moveToOrderDetails(WebDriver driver)
	{
		WebDriverCommonLib.scrollDown(details, driver);

	}

}
