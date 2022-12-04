package FB_Main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook_2 
{
	@FindBy(xpath="(//a[@tabindex='0']//span)[4]")private WebElement accholdername;
	
	public Facebook_2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public String getFacebook_2AccHolderName()
	{
		String accname=accholdername.getText();
		System.out.println(accname);
		return accname;
	}

}
