package com.autobot.pageobjects;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import com.autobot.generics.WaitStatementLib;
import com.autobot.generics.WebDriverCommonLib;

public class AeroCheckoutPage 
{
	final String jsCode="arguments[0].scrollIntoView(true)";
	
	@FindBy(xpath="//a[text()='Click here to login']")
	private WebElement login;
	@FindBy(id="username")
	private WebElement un;
	@FindBy(id="password")
	private WebElement password;
	@FindBy(name="login")
	private WebElement loginBtn;
	
	@FindBy(id="billing_email")
	private WebElement email;
	@FindBy(id="account_password")
	private WebElement pwd;
	@FindBy(id="createaccount")
	private WebElement createAcntChkbox;
	@FindBy(id="account_username")
	private WebElement acntUsername;
	@FindBy(id="account_password")
	private WebElement acntPassword;
	@FindBy(id="billing_first_name")
	private WebElement shippingFirstNme;
	@FindBy(id="billing_last_name")
	private WebElement shippingLastName;
	@FindBy(id="shipping_address_1")
	private WebElement address;
	@FindBy(id="shipping_city")
	private WebElement city;
	@FindBy(id="shipping_postcode")
	private WebElement postcode;
	@FindBy(id="shipping_country")
	private WebElement shippingCountryDrpDown;
	@FindBy(id="shipping_state")
	private WebElement shippingStateDrpDown;
	@FindBy(xpath="//span[@id='select2-shipping_state-container']")
	private WebElement state;
	@FindBy(id="billing_phone")
	private WebElement phone;
	@FindBy(xpath="//span[@id='select2-shipping_country-container']")
	private WebElement country;
	
	@FindBy(id="billing_same_as_shipping")
	private WebElement billingChkBox;
	@FindBy(xpath="(//input[@id='billing_first_name'])[2]")
	private WebElement billingFirstName;
	@FindBy(xpath="(//input[@id='billing_last_name'])[2]")
	private WebElement billingLastName;
	@FindBy(id="billing_address_1")
	private WebElement billingAddress;
	@FindBy(id="billing_city")
	private WebElement billingCity;
	@FindBy(id="billing_postcode")
	private WebElement billingPostcode;
	@FindBy(id="billing_country")                                         //(xpath="//span[@id='select2-billing_country-container']")
	private WebElement billingCountryDrpDown;
	@FindBy(id="billing_state")                                         //(xpath="//span[@id='select2-billing_country-container']")
	private WebElement billingStateDrpDown;
	
//	@FindBy(xpath="//input[@class='select2-search__field']")
//	private WebElement countrySearchBox;
//	@FindBy(xpath="//span[@class='select2-results']/ul/li[text()='United States (US)']")//(xpath="//li[contains(@id,'d36h-US')]")
//	private WebElement selectUS;
	
	@FindBy(xpath="//a[text()='Step 1']")
	private WebElement breadcrumbStep1;
	@FindBy(xpath="//a[text()='Step 2']")
	private WebElement breadcrumbStep2;
	@FindBy(xpath="//a[text()='Step 3']")
	private WebElement breadcrumbStep3;
	@FindBy(xpath="(//button[contains(text(),'NEXT STEP')])[1]")
	private WebElement step1NextBtn;
	@FindBy(xpath="//div[@class='btm_btn_sec']/..//button[contains(text(),'� Return')]")
	private WebElement step2BackBtn;
	
	@FindBy(id="shipping_method_0_free_shipping3")
	private WebElement freeShipping;
	@FindBy(xpath="//ul[@id='shipping_method']")
	private WebElement shippingMessage;
	
	@FindBy(xpath="//h2[contains(text(),'Payment Information')]")
	private WebElement xp;
	@FindBy(xpath="//h2[contains(text(),'Your Products')]")
	private WebElement xp1;
	@FindBy(xpath="//div[@class='wfacp_order_summary_container']/..//tr[@class='shipping_total_fee']")
	private WebElement xp2;
	@FindBy(xpath="//div[@class='wfacp_single_coupon_msg']")
	private WebElement xp3;
	@FindBy(xpath="//h2[contains(text(),'Shipping Method')]")
	private WebElement xp4;
	@FindBy(xpath="//h3[contains(text(),'INCLUDED IN YOUR PLAN?')]")
	private WebElement xp5;
	
	@FindBy(xpath="//input[contains(@id,'5d0781b82dea2')]/../..//a[text()='Choose an option']")
	private WebElement optionLink;
	@FindBy(xpath="//input[contains(@id,'5d11b82dac278')]")
	private WebElement simpleSubsProds;
	@FindBy(xpath="//input[contains(@id,'5d1204bb27c44')]/../..//a[text()='Choose an option']")
	private WebElement varSubsProdOptionLink;
	@FindBy(xpath="//input[contains(@id,'5d12164534573')]")
	private WebElement virtualSimpleSubsProds;
	@FindBy(xpath="//input[contains(@id,'5d15fe97ab5e0')]/../..//a[text()='Choose an option']")
	private WebElement firstVariablePoductOptionLink;
	@FindBy(xpath="//input[contains(@id,'5d12164534573')]")
	private WebElement customProduct;
	@FindBy(xpath="//input[contains(@id,'5d3ee36936e65')]")
	private WebElement zeroPriceProduct;
	
	@FindBy(xpath="//div[contains(text(),'Belt for your pant')]")//(xpath="//input[contains(@id,'5d12164534573')]/../..//div//span[@class='wfacp_product_choosen_label']")
	private WebElement beltForPantProduct;
//	@FindBy(xpath="//div[@data-item-key='wfacp_5d12164534573']/h4")
//	private WebElement beltForYourPant;
	
	@FindBy(className="wfacp_showcoupon")
	private WebElement showcoupon;
	@FindBy(id="wfacp_coupon_code_field")
	private WebElement couponTxtBox;
	@FindBy(name="apply_coupon")
	private WebElement applyCouponBtn;
	@FindBy(xpath="//div[@class='woocommerce-message']")
	private WebElement autoCouponMSg;
	
	@FindBy(xpath="//div[@id='order_summary_field']//tr[contains(@class,'tax-rate tax-rate')]/th")//(xpath="//div[@id='order_summary_field']//th[text()='GST']")
	private WebElement taxName;
	
	@FindBy(xpath="(//button[contains(text(),'NEXT STEP')])[2]")
	private WebElement step2NextBtn;
	@FindBy(xpath="//a[text()='� Return']")
	private WebElement step3BackBtn;
	
	@FindBy(id="are-you-indian")
	private WebElement indianChkBox;
	@FindBy(id="feedback")
	private WebElement feedbackField;
	@FindBy(id="email")
	private WebElement alternateEmail;
	@FindBy(id="paragraph_text")
	private WebElement comments;
	@FindBy(id="place")
	private WebElement deliveryPlace;
	@FindBy(id="size")
	private WebElement size;
	@FindBy(id="gender_male")
	private WebElement male;
	@FindBy(id="gender_female")
	private WebElement female;
	@FindBy(xpath="//span[@class='woocommerce-input-wrapper']/input[@id='password']")
	private WebElement oldPassword;
	@FindBy(id="phone_no")
	private WebElement alternatePhoneNo;
	
	@FindBy(xpath="//form[@name='checkout']//input[@id='payment_method_bacs']/following-sibling::label")
	private WebElement bankTransferRadioBtnForNative;
	@FindBy(id="payment_method_cheque")
	private WebElement checkPaymentsRadioBtn;
	@FindBy(id="payment_method_cod")
	private WebElement codRadioBtn;
	@FindBy(xpath="//form[@name='checkout']//input[@id='payment_method_cod']/following-sibling::label")
	private WebElement codRadioBtnForNative;
	@FindBy(id="payment_method_paypal")
	private WebElement payPalRadioBtn;
	@FindBy(id="payment_method_authorize_net_cim_credit_card")
	private WebElement authorizeNetRadioBtn;
	@FindBy(id="payment_method_braintree_credit_card")
	private WebElement braintreeCreditCardRadioBtn;
	
	@FindBy(xpath="//iframe[contains(@name,'xcomponent__ppbutton')]")
	private WebElement braintreePayPalFrame;
	@FindBy(xpath="//div[@aria-label='paypal']")
	private WebElement payWithPayPalBtn;
	@FindBy(id="payment_method_braintree_paypal")
	private WebElement braintreePaypalRadioBtn;
	@FindBy(id="payment_method_stripe")
	private WebElement creditCardRadioBtn;
	@FindBy(xpath="//form[@name='checkout']//input[@id='payment_method_stripe']/following-sibling::label")
	private WebElement creditCardRadioBtnForNative;
	@FindBy(name="cardnumber")
	private WebElement cardNumber;
	@FindBy(name="exp-date")
	private WebElement expiryDate;
	@FindBy(name="cvc")
	private WebElement cvcNumber;
	
	@FindBy(id="terms")
	private WebElement chkBox;
	@FindBy(id="place_order")
	private WebElement order;
	@FindBy(xpath="//div[@class='woocommerce-NoticeGroup woocommerce-NoticeGroup-checkout']/.//li")
	private WebElement errorMsg;
	
	public AeroCheckoutPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void existingUser()
	{
		login.click();
		un.sendKeys("ritvik@tact9.in");
		password.sendKeys("admin");
		loginBtn.click();
	}
	
	public void accountLogin()
	{
		Date date = new Date();
		String strDateFormat = "dd-MM-yyyy-hh-mm-ss";
		DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
		String formattedDate= dateFormat.format(date);
		email.sendKeys(formattedDate+"@tact9.in");
		createAcntChkbox.click();    
		acntUsername.sendKeys(formattedDate+"@tact9.in");
		acntPassword.sendKeys(formattedDate+"@tact9.in");
		shippingFirstNme.sendKeys("ritvik");
		shippingLastName.sendKeys("raj");
		address.sendKeys("janakpuri");
		city.sendKeys("delhi");
		postcode.sendKeys("110058");
		WaitStatementLib.iSleep(1);
		phone.sendKeys("1234567890");
	}
	
	public void shippingInformation()
	{
		Date date = new Date();
		String strDateFormat = "dd-MM-yyyy-hh-mm-ss";
		DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
		String formattedDate= dateFormat.format(date);
		
		email.clear();
		email.sendKeys(formattedDate+"@tact9.in");
		shippingFirstNme.clear();
		shippingFirstNme.sendKeys("ritvik");
		shippingLastName.clear();
		shippingLastName.sendKeys("raj");
		address.clear();
		address.sendKeys("janakpuri");
		city.clear();
		city.sendKeys("delhi");
		postcode.clear();
		postcode.sendKeys("110058");
		WebDriverCommonLib.selectOptionByValue(shippingCountryDrpDown, "IN");
		WaitStatementLib.iSleep(1);
		WebDriverCommonLib.selectOptionByValue(shippingStateDrpDown, "DL");
		
		WaitStatementLib.iSleep(1);
		phone.clear();
		phone.sendKeys("1234567890");
	}
	
	public void virtualProdAcntLogin()
	{
		Date date = new Date();
		String strDateFormat = "dd-MM-yyyy-hh-mm-ss";
		DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
		String formattedDate= dateFormat.format(date);
		email.sendKeys(formattedDate+"@tact9.in");   
		acntUsername.sendKeys(formattedDate+"@tact9.in");
		acntPassword.sendKeys(formattedDate+"@tact9.in");
		shippingFirstNme.sendKeys("ritvik");
		shippingLastName.sendKeys("raj");
		address.sendKeys("janakpuri");
		city.sendKeys("delhi");
		postcode.sendKeys("110058");
		phone.sendKeys("1234567890");
	}
	
	public void billingInformation()
	{
		Date date = new Date();
		String strDateFormat = "dd-MM-yyyy-hh-mm-ss";
		DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
		String formattedDate= dateFormat.format(date);
		
		shippingFirstNme.clear();
		shippingFirstNme.sendKeys("ritvik");
		shippingLastName.clear();
		shippingLastName.sendKeys("raj");
		WebDriverCommonLib.selectOptionByValue(billingCountryDrpDown, "IN");
		billingAddress.clear();
		billingAddress.sendKeys("janakpuri");
		billingCity.clear();
		billingCity.sendKeys("delhi");
		WebDriverCommonLib.selectOptionByValue(billingStateDrpDown, "DL");
		billingPostcode.clear();
		billingPostcode.sendKeys("110058");
		phone.clear();
		phone.sendKeys("1234567890");
		WaitStatementLib.iSleep(2);
		email.clear();
		email.sendKeys(formattedDate+"@tact9.in");	
	}
	
	public void shippingState()
	{
		WebDriverCommonLib.selectOptionByValue(shippingStateDrpDown, "NY");
		WaitStatementLib.iSleep(2);
	}
	
	public void shippingCountry()
	{
		WebDriverCommonLib.selectOptionByValue(shippingCountryDrpDown, "US");
		WaitStatementLib.iSleep(2);
	}
	
	public void billingName()
	{
		billingFirstName.sendKeys("harish");
		billingLastName.sendKeys("bajaj");
	}
	
	public void verifyFirstName(String firstname)
	{
		String expMsg=firstname;
		String actMsg=shippingFirstNme.getAttribute("value");
		Assert.assertEquals(actMsg, expMsg);
		Reporter.log(expMsg, true); 
	}
	
	public void verifylastName(String lastname)
	{
		String expMsg=lastname;
		String actMsg=shippingLastName.getAttribute("value");
		Assert.assertEquals(actMsg, expMsg);
		Reporter.log(expMsg, true); 
	}
	
	public void verifyAddress(String add)
	{
		String expMsg=add;
		String actMsg=address.getAttribute("value");
		Assert.assertEquals(actMsg, expMsg);
		Reporter.log(expMsg, true); 
	}
	
	public void verifyCity(String town)
	{
		String expMsg=town;
		String actMsg=city.getAttribute("value");
		Assert.assertEquals(actMsg, expMsg);
		Reporter.log(expMsg, true); 
	}
	
	public void verifyPostcode(String zipcode)
	{
		String expMsg=zipcode;
		String actMsg=postcode.getAttribute("value");
		Assert.assertEquals(actMsg, expMsg);
		Reporter.log(expMsg, true); 
	}
	
	public void verifyPhoneNo(String number)
	{
		String expMsg=number;
		String actMsg=phone.getAttribute("value");
		Assert.assertEquals(actMsg, expMsg);
		Reporter.log(expMsg, true); 
	}
	
	public void verifyCountryName(String countryName)
	{
		String expMsg=countryName;
		String actMsg=country.getAttribute("title");
		Assert.assertEquals(actMsg, expMsg);
		Reporter.log(expMsg, true); 
	}
	
	public void clickOnStep1NextStep()
	{
		step1NextBtn.click();
	}
	
	public void clickOnStep2BackBtn()
	{
		step2BackBtn.click();
	}
	
	public void clickOnStep3Breadcrumb()
	{
		WaitStatementLib.iSleep(3);
		breadcrumbStep3.click();
	}
	
	public void clickOnStep2NextStep()
	{
		step2NextBtn.click();
	}
	
	public void clickOnStep3BackBtn()
	{
		step3BackBtn.click();
	}
	
	public void selectFreeShipping()
	{
		WaitStatementLib.iSleep(4);
		freeShipping.click();
	}
	
	public void showShippingMethod(WebDriver driver)
	{
		WaitStatementLib.iSleep(1);
		WebDriverCommonLib.elementDisplay("Shipping Method Section", xp4, driver);
		WaitStatementLib.iSleep(1);
	}
	
	public void verifyMsgWhenNoShipping(String shippingMsg)
	{
		String expMsg=shippingMsg;
		String actMsg=shippingMessage.getText();
		Assert.assertEquals(actMsg, expMsg);
		Reporter.log(expMsg, true); 
	}
	
	public void showProduct(WebDriver driver)
	{
		WaitStatementLib.iSleep(1);		
		WebDriverCommonLib.elementDisplay("Your Products Section", xp1, driver);
		WaitStatementLib.iSleep(3);
	}
	
	public void showWhatsIncluded(WebDriver driver)
	{
		WaitStatementLib.iSleep(1);		
		WebDriverCommonLib.elementDisplay("What's Included In Your Plan Section", xp5, driver);
		WaitStatementLib.iSleep(3);
	}
	
	public void virtualProduct(WebDriver driver)
	{
		WaitStatementLib.iSleep(5);
		virtualSimpleSubsProds.click();
		
		WaitStatementLib.iSleep(3);
		WebDriverCommonLib.elementDisplay("Shipping fee", xp2, driver);
		WaitStatementLib.iSleep(3);
		
	}
	
	public void verifyVirtualProductInCart()
	{
		WaitStatementLib.iSleep(3);
		String expMsg=beltForPantProduct.getText();
		System.out.println(expMsg);
//		String actMsg=beltForYourPant.getText();
//		System.out.println(actMsg);
//		Assert.assertEquals(actMsg, expMsg);
		Reporter.log(expMsg, true); 
	}
	
	public void optionsLink()
	{
		optionLink.click();
	}
	
	public void firstVariableProductOptionsLink()
	{
		firstVariablePoductOptionLink.click();
	}
	
	public void variableSubsProdsOptionsLink()
	{
		varSubsProdOptionLink.click();
	}
	
	public void selectSimpleSubscriptionProduct()
	{
		WaitStatementLib.iSleep(3);
		simpleSubsProds.click();
		WaitStatementLib.iSleep(3);
	}
	
	public void selectCustomProduct()
	{
		WaitStatementLib.iSleep(3);
		customProduct.click();
		WaitStatementLib.iSleep(3);
	}
	
	public void selectZeroPriceProduct()
	{
		WaitStatementLib.iSleep(3);
		zeroPriceProduct.click();
		WaitStatementLib.iSleep(3);
	}
	
	public void couponApply(String coupon)
	{
		showcoupon.click();
		couponTxtBox.sendKeys(coupon);
		applyCouponBtn.click();
	}
	
	public void removeCoupon() 
	{
		WaitStatementLib.iSleep(2);
		couponTxtBox.clear();
	}
	
	public void applySingleCoupon(String coupon,int year, int month, int date ) throws ParseException
	{
		showcoupon.click();
		couponTxtBox.sendKeys(coupon);
		WaitStatementLib.iSleep(3);
		applyCouponBtn.click();
		LocalDate todayDate = LocalDate.now();
	    LocalDate expiryDate = LocalDate.of(year, month, date);	    
	    if(todayDate.compareTo(expiryDate) < 0)
	    {
	    	System.out.println("Congrats! Coupon code "+coupon+" applied successfully.");        //Provided Expiry date in backend is after todays date.
	    	
	    }
	    else
	    {
	    	System.out.println("This coupon has expired. Processing without coupon.");           //Provided Expiry date in backend is before or equals todays date.             
	    }
	}
	
	public void applyMultipleCoupon(String coupon, String coupon1, int year, int month, int date ) throws ParseException
	{
		showcoupon.click();
		couponTxtBox.sendKeys(coupon);
		WaitStatementLib.iSleep(3);
		applyCouponBtn.click();
		WaitStatementLib.iSleep(1);
		couponTxtBox.sendKeys(coupon1);
		WaitStatementLib.iSleep(3);
		applyCouponBtn.click();
		LocalDate todayDate = LocalDate.now();
	    LocalDate expiryDate = LocalDate.of(year, month, date);
	    if(todayDate.compareTo(expiryDate) < 0)
	    {
	    	System.out.println("Congrats! Coupon code "+coupon+" applied successfully.");        //Provided Expiry date in backend is after todays date.
	    	System.out.println("Congrats! Coupon code "+coupon1+" applied successfully.");
	    }
	    else
	    {
	    	System.out.println("This coupon has expired. Processing without coupon.");           //Provided Expiry date in backend is before or equals todays date.             
	    }
	}
	
	public void applyIndividualCoupon(String coupon, String coupon1, int year, int month, int date ) throws ParseException
	{
		showcoupon.click();
		couponTxtBox.sendKeys(coupon);
		WaitStatementLib.iSleep(3);
		applyCouponBtn.click();
		WaitStatementLib.iSleep(1);
		couponTxtBox.sendKeys(coupon1);
		WaitStatementLib.iSleep(3);
		applyCouponBtn.click();
		LocalDate todayDate = LocalDate.now();
	    LocalDate expiryDate = LocalDate.of(year, month, date);
	    if(todayDate.compareTo(expiryDate) < 0)
	    {
//	    	System.out.println("Congrats! Coupon code "+coupon+" applied successfully.");        //Provided Expiry date in backend is after todays date.
	    	System.out.println("Congrats! Coupon code "+coupon1+" applied successfully.");
	    }
	    else
	    {
	    	System.out.println("This coupon has expired. Processing without coupon.");           //Provided Expiry date in backend is before or equals todays date.             
	    }
	}
	
	public void displayCouponSelected(WebDriver driver)
	{
		WaitStatementLib.iSleep(10);
		WebDriverCommonLib.elementDisplay("Coupon", xp3, driver);
		System.out.println(xp3.getText());
		WaitStatementLib.iSleep(3);
	}
	
	public void verifyAutoCoupon()
	{
		String expMsg="Coupon code applied successfully.";
		String actMsg=autoCouponMSg.getText();
		Assert.assertEquals(actMsg, expMsg);
		Reporter.log(expMsg, true);
	}
	
	public void verifyTaxName(String tax)
	{
		String expMsg=tax;
		String actMsg=taxName.getText();
		System.out.println(actMsg);
		Assert.assertEquals(actMsg, expMsg);
		Reporter.log(expMsg, true);
	}
	
	public void areYouIndianChkBox()
	{
		boolean value = indianChkBox.isDisplayed();
		System.out.println(value);
	}
	
	public void customFields()
	{
		feedbackField.sendKeys("ewrtyiljkgfxhjg");
		alternateEmail.sendKeys("harishbajaj@tact9.in");
		comments.sendKeys("dfghjkadgfhkujkjgdcnmk");
		Select sel= new Select(deliveryPlace);
		sel.selectByValue("mumbai");
		size.sendKeys("30");
		male.click();
		oldPassword.sendKeys("admin");
		alternatePhoneNo.sendKeys("9876543232");
	}
	
	public void showPaymentSection(WebDriver driver)
	{
		WaitStatementLib.iSleep(5);		
		WebDriverCommonLib.elementDisplay("Payment Information Section", xp, driver);
		WaitStatementLib.iSleep(3);
	}
	
	public void clickOnDirectBankTransferForNative()
	{
		bankTransferRadioBtnForNative.click();
	}
	
	public void clickOnCheckPayments()
	{
		checkPaymentsRadioBtn.click();
	}
	
	public void clickOnCashOnDelivery()
	{
		codRadioBtn.click();
	}
	
	public void clickOnCashOnDeliveryForNative()
	{
		codRadioBtnForNative.click();
	}
	
	public void clickOnAuthorizeNet()
	{
		authorizeNetRadioBtn.click();
	}
	
	public void clickOnBraintreeCreditCard()
	{
		braintreeCreditCardRadioBtn.click();
	}
	
	public void clickOnBraintreePayPal(WebDriver driver)
	{
		braintreePaypalRadioBtn.click();
		driver.switchTo().frame(braintreePayPalFrame);
		WaitStatementLib.iSleep(6);
		payWithPayPalBtn.click();
	}
	
	public void clickOnPayPal()
	{
		payPalRadioBtn.click();
	}
	
	public void clickOnCreditCard(WebDriver driver)
	{
		WaitStatementLib.iSleep(2);
		creditCardRadioBtn.click();
		WaitStatementLib.iSleep(2);
		
		driver.switchTo().frame("__privateStripeFrame8");
		
		WaitStatementLib.iSleep(3);
		cardNumber.sendKeys("4");
		WaitStatementLib.iSleep(0.8);
		cardNumber.sendKeys("0");
		WaitStatementLib.iSleep(0.5);
		cardNumber.sendKeys("0");
		WaitStatementLib.iSleep(0.2);
		cardNumber.sendKeys("0");
		WaitStatementLib.iSleep(1);
		cardNumber.sendKeys("0");
		WaitStatementLib.iSleep(0.5);
		cardNumber.sendKeys("5");
		WaitStatementLib.iSleep(0.3);
		cardNumber.sendKeys("6");
		WaitStatementLib.iSleep(0.9);
		cardNumber.sendKeys("6");
		WaitStatementLib.iSleep(0.6);
		cardNumber.sendKeys("5");
		WaitStatementLib.iSleep(1.1);
		cardNumber.sendKeys("5");
		WaitStatementLib.iSleep(0.3);
		cardNumber.sendKeys("6");
		WaitStatementLib.iSleep(0.8);
		cardNumber.sendKeys("6");
		WaitStatementLib.iSleep(0.6);
		cardNumber.sendKeys("5");
		WaitStatementLib.iSleep(1.1);
		cardNumber.sendKeys("5");
		WaitStatementLib.iSleep(0.7);
		cardNumber.sendKeys("5");
		WaitStatementLib.iSleep(0.2);
		cardNumber.sendKeys("6");
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("__privateStripeFrame9");
		
		WaitStatementLib.iSleep(3);
		expiryDate.sendKeys("0");
		WaitStatementLib.iSleep(0.5);
		expiryDate.sendKeys("4");
		WaitStatementLib.iSleep(0.1);
		expiryDate.sendKeys("2");
		WaitStatementLib.iSleep(0.9);
		expiryDate.sendKeys("4");
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("__privateStripeFrame10");
		
		WaitStatementLib.iSleep(2);
		cvcNumber.sendKeys("4");
		WaitStatementLib.iSleep(0.6);
		cvcNumber.sendKeys("2");
		WaitStatementLib.iSleep(0.1);
		cvcNumber.sendKeys("4");
		
		driver.switchTo().defaultContent();

	}
	
	public void clickOnCreditCardForNative(WebDriver driver)
	{
		WaitStatementLib.iSleep(2);
		creditCardRadioBtnForNative.click();
		WaitStatementLib.iSleep(2);
		
		driver.switchTo().frame("__privateStripeFrame8");
		
		WaitStatementLib.iSleep(3);
		cardNumber.sendKeys("4");
		WaitStatementLib.iSleep(0.8);
		cardNumber.sendKeys("0");
		WaitStatementLib.iSleep(0.5);
		cardNumber.sendKeys("0");
		WaitStatementLib.iSleep(0.2);
		cardNumber.sendKeys("0");
		WaitStatementLib.iSleep(1);
		cardNumber.sendKeys("0");
		WaitStatementLib.iSleep(0.5);
		cardNumber.sendKeys("5");
		WaitStatementLib.iSleep(0.3);
		cardNumber.sendKeys("6");
		WaitStatementLib.iSleep(0.9);
		cardNumber.sendKeys("6");
		WaitStatementLib.iSleep(0.6);
		cardNumber.sendKeys("5");
		WaitStatementLib.iSleep(1.1);
		cardNumber.sendKeys("5");
		WaitStatementLib.iSleep(0.3);
		cardNumber.sendKeys("6");
		WaitStatementLib.iSleep(0.8);
		cardNumber.sendKeys("6");
		WaitStatementLib.iSleep(0.6);
		cardNumber.sendKeys("5");
		WaitStatementLib.iSleep(1.1);
		cardNumber.sendKeys("5");
		WaitStatementLib.iSleep(0.7);
		cardNumber.sendKeys("5");
		WaitStatementLib.iSleep(0.2);
		cardNumber.sendKeys("6");
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("__privateStripeFrame9");
		
		WaitStatementLib.iSleep(3);
		expiryDate.sendKeys("0");
		WaitStatementLib.iSleep(0.5);
		expiryDate.sendKeys("1");
		WaitStatementLib.iSleep(0.1);
		expiryDate.sendKeys("2");
		WaitStatementLib.iSleep(0.9);
		expiryDate.sendKeys("0");
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("__privateStripeFrame10");
		
		WaitStatementLib.iSleep(2);
		cvcNumber.sendKeys("4");
		WaitStatementLib.iSleep(0.6);
		cvcNumber.sendKeys("2");
		WaitStatementLib.iSleep(0.1);
		cvcNumber.sendKeys("4");
		
		driver.switchTo().defaultContent();

	}
	
	public void clickOnDeclinedCreditCard(WebDriver driver)
	{
		WaitStatementLib.iSleep(2);
		creditCardRadioBtnForNative.click();
		WaitStatementLib.iSleep(2);
		
		driver.switchTo().frame("__privateStripeFrame8");
		
		WaitStatementLib.iSleep(3);
		cardNumber.sendKeys("4");
		WaitStatementLib.iSleep(0.8);
		cardNumber.sendKeys("0");
		WaitStatementLib.iSleep(1.5);
		cardNumber.sendKeys("0");
		WaitStatementLib.iSleep(2.2);
		cardNumber.sendKeys("0");
		WaitStatementLib.iSleep(1.1);
		cardNumber.sendKeys("0");
		WaitStatementLib.iSleep(0.5);
		cardNumber.sendKeys("0");
		WaitStatementLib.iSleep(0.2);
		cardNumber.sendKeys("0");
		WaitStatementLib.iSleep(0.9);
		cardNumber.sendKeys("0");
		WaitStatementLib.iSleep(0.6);
		cardNumber.sendKeys("0");
		WaitStatementLib.iSleep(1.1);
		cardNumber.sendKeys("0");
		WaitStatementLib.iSleep(0.4);
		cardNumber.sendKeys("0");
		WaitStatementLib.iSleep(0.8);
		cardNumber.sendKeys("0");
		WaitStatementLib.iSleep(0.1);
		cardNumber.sendKeys("0");
		WaitStatementLib.iSleep(0.5);
		cardNumber.sendKeys("0");
		WaitStatementLib.iSleep(0.6);
		cardNumber.sendKeys("0");
		WaitStatementLib.iSleep(0.2);
		cardNumber.sendKeys("2");
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("__privateStripeFrame9");
		
		WaitStatementLib.iSleep(3);
		expiryDate.sendKeys("0");
		WaitStatementLib.iSleep(0.5);
		expiryDate.sendKeys("4");
		WaitStatementLib.iSleep(0.1);
		expiryDate.sendKeys("2");
		WaitStatementLib.iSleep(0.7);
		expiryDate.sendKeys("4");
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("__privateStripeFrame10");
		
		WaitStatementLib.iSleep(2);
		cvcNumber.sendKeys("4");
		WaitStatementLib.iSleep(0.6);
		cvcNumber.sendKeys("2");
		WaitStatementLib.iSleep(0.2);
		cvcNumber.sendKeys("4");
		
		driver.switchTo().defaultContent();

	}
	
	public void terms()
	{
		WaitStatementLib.iSleep(4);		
		chkBox.click();
	}
	
	public void placeOrder()
	{
		WaitStatementLib.iSleep(6);
		order.click();
	}
	
	public void error(String coupon) 
	{
		String expMsg="Sorry, it seems the coupon " +"\"" +coupon+"\"" +" is not yours - it has now been removed from your order.";
		String actMsg=errorMsg.getText();
		Assert.assertEquals(actMsg, expMsg);
		Reporter.log(expMsg, true);
	}
}
