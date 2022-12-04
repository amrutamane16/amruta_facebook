package FB_TestClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import FB_Liabraries.Facebook_5BaseClass;
import FB_Liabraries.Facebook_6UtilityClass;
import FB_Main.Facebook_1;
import FB_Main.Facebook_2;
import FB_Main.Facebook_3;

public class Facebook_4TestClass extends Facebook_5BaseClass
{

	
	Facebook_1 f1;
	Facebook_2 f2;
	Facebook_3 f3;
	
	@BeforeClass
	public void openBrowser() throws EncryptedDocumentException, IOException
	{
		
		
		invokebrowser();
		driver.manage().window().maximize();
		f1=new Facebook_1(driver);
	    f2=new Facebook_2(driver);
	    f3=new Facebook_3(driver);
		
		
	}
	@BeforeMethod
	public void getLogin() throws EncryptedDocumentException, IOException
	{
	
		f1.setFacebook_1UserID(Facebook_6UtilityClass.getData(0, 0));
		
		f1.setFacebook_1Password(Facebook_6UtilityClass.getData(0, 1));
		
		f1.clickFacebook_1LogIn();
	}
	@Test
	public void verifyUN() throws InterruptedException, EncryptedDocumentException, IOException
	{
		String Expectedname=Facebook_6UtilityClass.getData(0, 2);
		String actualname=f2.getFacebook_2AccHolderName();
		Reporter.log(actualname,true);
		Reporter.log(Expectedname,true);
		Assert.assertEquals(Expectedname,actualname);
		Thread.sleep(3000);
	}
	@AfterMethod
	public void logout()
	{
		f3.clickFacebook_3Logoutbtn1();
		f3.clickFacebook_3Logout2btn();
	}
	@AfterClass
	public void browserclose()
	{
		driver=null;
		f1=null;
		f2=null;
		f3=null;
	
}
	

}
