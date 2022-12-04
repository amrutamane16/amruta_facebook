package FB_Main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook_1
{
	@FindBy(xpath="//input[@name='email']")private WebElement userid;
	@FindBy(xpath="//input[@id='pass']")private WebElement password;
	@FindBy(xpath="//button[contains(@id,'u_0_5')]")private WebElement login;
	
	public Facebook_1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setFacebook_1UserID(String uid)
	{
		userid.sendKeys(uid);
	}
	public void setFacebook_1Password(String paswd)
	{
		password.sendKeys(paswd);
	}
	public void clickFacebook_1LogIn()
	{
		login.click();
	}

}
