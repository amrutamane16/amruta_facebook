package FB_Liabraries;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Facebook_6UtilityClass 
{
	public  static String getData(int rowindex,int cellindex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\amrut\\eclipse-workspace\\Facebook_Maven_Project\\Credentials\\AmrutaFB.xlsx");
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet1");
		String data=sh.getRow(rowindex).getCell(cellindex).getStringCellValue();
		return data;
	}
	public static void getScreenShot(WebDriver driver,int TestId) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\amrut\\eclipse-workspace\\Facebook_Maven_Project\\ScreenShot\\TestData1"+TestId+".jpg");
		FileHandler.copy(src, dest);
	}

}
