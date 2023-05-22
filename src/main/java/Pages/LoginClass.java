package Pages;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class LoginClass extends Aulas_Base.BaseTest
{
	@FindBy(xpath="(//div[contains(@class,'ant-col')]/img)[1]")
	WebElement Logo;
	@FindBy(xpath="//a[text()='Privacy Policy']")
	WebElement PrivacyPolicy;
	@FindBy(xpath="//a[text()='Terms & Conditions']")
	WebElement TermsAndConditions;
	@FindBy(xpath="//*[@class='ant-input m-t-5 aulas-login__input']")
	WebElement Email;
	@FindBy(xpath="//div[@class='m-t-20']/span/input")
	WebElement Password;
	@FindBy(xpath="(//button[contains(@class,'bold-bold')])[2]")
	WebElement LoginClick;
	@FindBy(xpath="(//button[contains(@class,'ant-btn')]/span)[1]")
	WebElement ForgotPassword;
	@FindBy(xpath="(//ul[@class='ant-menu-item-group-list'])[3]/li[2]")
	WebElement AulasCareLink;
	@FindBy(xpath="(//div[@class='ant-tabs-tab'])[1]")
	WebElement Register;
	@FindBy(xpath="//span[text()='Mobile']")
	WebElement Mobile;
    @FindBy(xpath="(//*[@class='PhoneInputInput'])[1]")
	WebElement EnterMobileNumber;
	@FindBy(xpath="//*[text()='VERIFY']")
	WebElement VERIFY;
	@FindBy(xpath="(//*[@class='ant-input p-10'])[1]")
	WebElement EnterOTP;
	@FindBy(xpath="//*[text()='VERIFY OTP']")
	WebElement VerifyOTP;
	@FindBy(xpath="//div[@class='m-t-20 m-b-5']/div[1]")
	WebElement LogOutButton;  
	@FindBy(xpath="//span[text()='Logout']")
	WebElement LogOut;
	@FindBy(xpath="//*[@class='sc-bdvvtL gMOLcA r-c-c']")
	WebElement LOGOUT;
	
	
 Actions ac=new Actions(driver);

	
	public LoginClass()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean aulasLogo()
	{
		return Logo.isDisplayed();
		
	}
	
	public void Privacypolicy() throws InterruptedException
	{
		Thread.sleep(4000);
		PrivacyPolicy.click();
	}
	
	public void TermsAndConditions() throws InterruptedException
	{
		Thread.sleep(4000);
		TermsAndConditions.click();
	}
	
	public HomePage1 EmailLogin(String email,String password) throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@class='text-xs blue m-l-5 m-r-5 bold-600 cursor-pointer']")).click();
		Thread.sleep(4000);
		Email.sendKeys(email);
		Thread.sleep(4000);
		Password.sendKeys(password);
		Thread.sleep(4000);
		LoginClick.click();
		return new HomePage1();
	}	

	public HomePage1 MobileLogin(String MobileNumber, String DefaultOTP) throws InterruptedException {
		WaitTil(2000);
		EnterMobileNumber.sendKeys(MobileNumber);
		WaitTil(2000);
		VERIFY.click();
		WaitTil(2000);
		EnterOTP.sendKeys(DefaultOTP);
		WaitTil(2000);
		VerifyOTP.click();
		WaitTil(3000);
		return new HomePage1();
	}

	public void LogOut() {
		WaitTil(3000);
		ac.moveToElement(LogOutButton).click().build().perform();
		WaitTil(2000);
		LogOut.click();
		WaitTil(2000);
		LOGOUT.click();

	}

}
