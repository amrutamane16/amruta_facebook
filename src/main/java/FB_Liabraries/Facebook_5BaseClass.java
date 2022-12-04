package FB_Liabraries;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Facebook_5BaseClass 
{
	public WebDriver driver;
	 
public void invokebrowser() throws EncryptedDocumentException, IOException
{
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--disable-notifications");
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amrut\\eclipse-workspace\\Facebook_Maven_Project\\Browser\\chromedriver.exe");
		 driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(Facebook_6UtilityClass.getData(0, 3));
}
		
}
