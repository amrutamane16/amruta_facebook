package FB_Main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook_3 {
	@FindBy(xpath = "(//div[@aria-label='Account controls and settings']//div[@role='button'])[1]")
	private WebElement logout1;
//	@FindBy(xpath = "(//div[@class='xu06os2 x1ok221b']/span)[5]")
//	private WebElement logout2;
	
	@FindBy(xpath = "//div[@aria-label=\"Your profile\"]//div[@role='list']//div[@role='listitem'][5]")
private WebElement logout3;
	public Facebook_3(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickFacebook_3Logoutbtn1() {
		logout1.click();
	}

	public void clickFacebook_3Logout2btn() {
		logout3.click();
	}
}