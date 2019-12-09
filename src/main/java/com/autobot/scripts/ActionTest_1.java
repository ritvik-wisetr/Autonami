package com.autobot.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.autobot.generics.BaseLib;
import com.autobot.pageobjects.ActionsMethods;

public class ActionTest_1 extends BaseLib
{
	@Test
	public void Woocommerce_CreateCoupon_1()
	{
		ActionsMethods am=new ActionsMethods(driver);
		am.EventCreation(driver, "wc_new_order");
		am.selectActionCreateCoupon(driver);
		am.deleteCheckoutPage(driver);
	}
	
	@Test
	public void Woocommerce_AddOrderNote_2()
	{
		ActionsMethods am=new ActionsMethods(driver);
		am.EventCreation(driver, "wc_new_order");
		am.selectActionAddOrderNote(driver);
		am.deleteCheckoutPage(driver);
	}
	
	@Test
	public void Woocommerce_ChangeOrderStatus_3()
	{
		ActionsMethods am=new ActionsMethods(driver);
		am.EventCreation(driver, "wc_new_order");
		am.selectActionChangeOrderStatus(driver);
		am.deleteCheckoutPage(driver);
	}
	
	@Test
	public void Woocommerce_RemoveCoupon_4()
	{
		ActionsMethods am=new ActionsMethods(driver);
		am.EventCreation(driver, "wc_new_order");
		am.selectActionRemoveCoupon(driver);
		am.deleteCheckoutPage(driver);
	}
	
	@Test
	public void WordPress_SendEmail_5()
	{
		ActionsMethods am=new ActionsMethods(driver);
		am.EventCreation(driver, "wc_new_order");
		am.selectActionSendEmail_Wordpress(driver);
		am.deleteCheckoutPage(driver);
		WebElement emailLog=driver.findElement(By.xpath("//div[text()='Email Log']"));
		Actions act=new Actions(driver);
		act.moveToElement(emailLog).perform();		
		WebElement viewLogs=driver.findElement(By.xpath("//a[text()='View Logs']"));
		act.click(viewLogs).perform();
		
		WebElement email=driver.findElement(By.xpath("//td[text()='xlpluginstesting@gmail.com']"));
		act.moveToElement(email).perform();
		WebElement viewContent=driver.findElement(By.xpath("//a[text()='View Content']"));
		act.click(viewContent).perform();
		
	}
	
	@Test
	public void WordPressAdvanced_CustomCallback_6()
	{
		ActionsMethods am=new ActionsMethods(driver);
		am.EventCreation(driver, "wc_new_order");
		am.selectActionCustomCallback_WordPressAdvanced(driver);
		am.deleteCheckoutPage(driver);
	}
	
	@Test
	public void WordPressAdvanced_Debug_7()
	{
		ActionsMethods am=new ActionsMethods(driver);
		am.EventCreation(driver, "wc_new_order");
		am.selectActionDebug_WordPressAdvanced(driver);
		am.deleteCheckoutPage(driver);
	}
	
	@Test
	public void WordPressAdvanced_HttpPost_8()
	{
		ActionsMethods am=new ActionsMethods(driver);
		am.EventCreation(driver, "wc_new_order");
		am.selectActionHttpPost_WordPressAdvanced(driver);
		am.deleteCheckoutPage(driver);
	}
	
	@Test
	public void Zapier_SendDataToZapier_9()
	{
		ActionsMethods am=new ActionsMethods(driver);
		am.EventCreation(driver, "wc_new_order");
		am.selectActionSendDataToZapier_Zapier(driver);
		am.deleteCheckoutPage(driver);
	}
	
//	@Test
//	public void ActiveCampaign_AddTags_10()
//	{
//		ActionsMethods am=new ActionsMethods(driver);
//		am.EventCreation(driver, "wc_new_order");
//		am.selectActionAddTags_ActiveCampaign(driver);
//		am.deleteCheckoutPage(driver);
//	}
//	
//	@Test
//	public void ActiveCampaign_AddContactToAutomation_11()
//	{
//		ActionsMethods am=new ActionsMethods(driver);
//		am.EventCreation(driver, "wc_new_order");
//		am.selectActionAddContactToAutomation_ActiveCampaign(driver);
//		am.deleteCheckoutPage(driver);
//	}
//	
//	@Test
//	public void ActiveCampaign_AddContactToList_12()
//	{
//		ActionsMethods am=new ActionsMethods(driver);
//		am.EventCreation(driver, "wc_new_order");
//		am.selectActionAddContactToList_ActiveCampaign(driver);
//		am.deleteCheckoutPage(driver);
//	}
//	
//	@Test
//	public void ActiveCampaign_CreateDealNote_13()
//	{
//		ActionsMethods am=new ActionsMethods(driver);
//		am.EventCreation(driver, "wc_new_order");
//		am.selectActionCreateDealNote_ActiveCampaign(driver);
//		am.deleteCheckoutPage(driver);
//	}
//	
//	@Test
//	public void ActiveCampaign_CreateDeal_14()
//	{
//		ActionsMethods am=new ActionsMethods(driver);
//		am.EventCreation(driver, "wc_new_order");
//		am.selectActionCreateDeal_ActiveCampaign(driver);
//		am.deleteCheckoutPage(driver);
//	}
//	
//	@Test
//	public void ActiveCampaign_CreateOrder_15()
//	{
//		ActionsMethods am=new ActionsMethods(driver);
//		am.EventCreation(driver, "wc_new_order");
//		am.selectActionCreateOrder_ActiveCampaign(driver);
//		am.deleteCheckoutPage(driver);
//	}
//	
//	@Test
//	public void ActiveCampaign_EndAutomation_16()
//	{
//		ActionsMethods am=new ActionsMethods(driver);
//		am.EventCreation(driver, "wc_new_order");
//		am.selectActionEndAutomation_ActiveCampaign(driver);
//		am.deleteCheckoutPage(driver);
//	}
//	
//	@Test
//	public void ActiveCampaign_RemoveContactFromList_17()
//	{
//		ActionsMethods am=new ActionsMethods(driver);
//		am.EventCreation(driver, "wc_new_order");
//		am.selectActionRemoveContactFromList_ActiveCampaign(driver);
//		am.deleteCheckoutPage(driver);
//	}
//	
//	@Test
//	public void ActiveCampaign_RemoveTags_18()
//	{
//		ActionsMethods am=new ActionsMethods(driver);
//		am.EventCreation(driver, "wc_new_order");
//		am.selectActionRemoveTags_ActiveCampaign(driver);
//		am.deleteCheckoutPage(driver);
//	}
//	
//	@Test
//	public void ActiveCampaign_UpdateFields_19()
//	{
//		ActionsMethods am=new ActionsMethods(driver);
//		am.EventCreation(driver, "wc_new_order");
//		am.selectActionUpdateFields_ActiveCampaign(driver);
//		am.deleteCheckoutPage(driver);
//	}
//	
//	@Test
//	public void ActiveCampaign_UpdateDeal_20()
//	{
//		ActionsMethods am=new ActionsMethods(driver);
//		am.EventCreation(driver, "wc_new_order");
//		am.selectActionUpdateDeal_ActiveCampaign(driver);
//		am.deleteCheckoutPage(driver);
//	}
//	
//	@Test
//	public void Convertkit_UpdateCustomFields_21()
//	{
//		ActionsMethods am=new ActionsMethods(driver);
//		am.EventCreation(driver, "wc_new_order");
//		am.selectActionUpdateCustomFields_Convertkit(driver);
//		am.deleteCheckoutPage(driver);
//	}
//	
//	@Test
//	public void Convertkit_CreateNewPurchase_22()
//	{
//		ActionsMethods am=new ActionsMethods(driver);
//		am.EventCreation(driver, "wc_new_order");
//		am.selectActionCreateNewPurchase_Convertkit(driver);
//		am.deleteCheckoutPage(driver);
//	}
//	
//	@Test
//	public void Convertkit_AddTags_23()
//	{
//		ActionsMethods am=new ActionsMethods(driver);
//		am.EventCreation(driver, "wc_new_order");
//		am.selectActionAddTags_Convertkit(driver);
//		am.deleteCheckoutPage(driver);
//	}
//	
//	@Test
//	public void Convertkit_AddSubscriberToSequence_24()
//	{
//		ActionsMethods am=new ActionsMethods(driver);
//		am.EventCreation(driver, "wc_new_order");
//		am.selectActionAddSubscriberToSequence_Convertkit(driver);
//		am.deleteCheckoutPage(driver);
//	}
//	
//	@Test
//	public void Convertkit_RemoveSubscriberFromSequence_25()
//	{
//		ActionsMethods am=new ActionsMethods(driver);
//		am.EventCreation(driver, "wc_new_order");
//		am.selectActionRemoveSubscriberFromSequence_Convertkit(driver);
//		am.deleteCheckoutPage(driver);
//	}
//	
//	@Test
//	public void Convertkit_RemoveTags_26()
//	{
//		ActionsMethods am=new ActionsMethods(driver);
//		am.EventCreation(driver, "wc_new_order");
//		am.selectActionRemoveTags_Convertkit(driver);
//		am.deleteCheckoutPage(driver);
//	}
	
	@Test
	public void Drip_UpdateCustomFieldsOfSubscriber_27()
	{
		ActionsMethods am=new ActionsMethods(driver);
		am.EventCreation(driver, "wc_new_order");
		am.selectActionUpdateCustomFieldsOfSubscriber_Drip(driver);
		am.deleteCheckoutPage(driver);
	}
	
	@Test
	public void Drip_AddNewOrder_28()
	{
		ActionsMethods am=new ActionsMethods(driver);
		am.EventCreation(driver, "wc_new_order");
		am.selectActionAddNewOrder_Drip(driver);
		am.deleteCheckoutPage(driver);
	}
	
	@Test
	public void Drip_AddTags_29()
	{
		ActionsMethods am=new ActionsMethods(driver);
		am.EventCreation(driver, "wc_new_order");
		am.selectActionAddTags_Drip(driver);
		am.deleteCheckoutPage(driver);
	}
	
	@Test
	public void Drip_AddSubscriberToCampaign_30()
	{
		ActionsMethods am=new ActionsMethods(driver);
		am.EventCreation(driver, "wc_new_order");
		am.selectActionAddSubscriberToCampaign_Drip(driver);
		am.deleteCheckoutPage(driver);
	}
	
	@Test
	public void Drip_AddSubscriberToWorkflow_31()
	{
		ActionsMethods am=new ActionsMethods(driver);
		am.EventCreation(driver, "wc_new_order");
		am.selectActionAddSubscriberToWorkflow_Drip(driver);
		am.deleteCheckoutPage(driver);
	}
	
	@Test
	public void Drip_RemoveSubscriberFromCampaign_32()
	{
		ActionsMethods am=new ActionsMethods(driver);
		am.EventCreation(driver, "wc_new_order");
		am.selectActionRemoveSubscriberFromCampaign_Drip(driver);
		am.deleteCheckoutPage(driver);
	}
	
	@Test
	public void Drip_RemoveSubscriberFromWorkflow_33()
	{
		ActionsMethods am=new ActionsMethods(driver);
		am.EventCreation(driver, "wc_new_order");
		am.selectActionRemoveSubscriberFromWorkflow_Drip(driver);
		am.deleteCheckoutPage(driver);
	}
	
	@Test
	public void Drip_RemoveTags_34()
	{
		ActionsMethods am=new ActionsMethods(driver);
		am.EventCreation(driver, "wc_new_order");
		am.selectActionRemoveTags_Drip(driver);
		am.deleteCheckoutPage(driver);
	}
	
	@Test
	public void Slack_SendMsgToUser_35()
	{
		ActionsMethods am=new ActionsMethods(driver);
		am.EventCreation(driver, "wc_new_order");
		am.selectActionSendMsgToUser_Slack(driver);
		am.deleteCheckoutPage(driver);
	}
	
	@Test
	public void Slack_SendMsgToChannel_36()
	{
		ActionsMethods am=new ActionsMethods(driver);
		am.EventCreation(driver, "wc_new_order");
		am.selectActionSendMsgToChannel_Slack(driver);
		am.deleteCheckoutPage(driver);
	}
	
}
