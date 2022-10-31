package Package_Util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	//In the Utility class consist of Selenium Common Functions
	//like Take Screenshot, Parameterization i.e used sometimes if needed
	 
	//Static Method is used // Use Return Type as String instead 
	//of void	
	public static void captureScreenshot (WebDriver driver, String str) throws IOException {
		//This method is use to capture the Screenshot
		//Need to pass two parameters 1.driver 2.test case ID
		
		Date d = new Date (); // Import Date Class From Java.util         
		System.out.println(d);// Thu Sep 15 12:20:54 IST 2022
		String str1 = d.toString().replace(":", "_").replace(" ", "_");
	      File source= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	  		File desc = new File ("C:\\Users\\MD 10\\Desktop\\ScreenShorts\\"+str+".jpg"); 
	  	   FileHandler.copy(source, desc);	
}
	
	//Description : This method is use to get test data from excel sheet
	//Need to pass Two parameters Row Index the Col Index
	public static String fetchDataFromExcell (int RowIndex, int CellIndex) throws EncryptedDocumentException, IOException{ 
		
		FileInputStream file = new FileInputStream ("C:\\Users\\MD 10\\Desktop\\18th June Morning.xlsx");
		return null;
		
		 }
		
		
		


	}
