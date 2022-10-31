package A1_Amazone_Test;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Amazone.Amazone_Home_Page;
import Amazone.Amazone_Login;
import BasePackage.A_Base_Class;

public class Amazone_Execution extends A_Base_Class {
     // test Class
    //public static WebDriver driver;
	Amazone_Login sigin;
	Amazone_Home_Page Home;
   
	@BeforeClass 
	public void launchBrowser()  {	
		initializeBrowser("chrome");
		
		sigin = new Amazone_Login (driver);
		Home = new Amazone_Home_Page (driver);
		
		
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\MD 10\\Downloads\\chromedriver_win32 (1)\\chromeDriver.exe");
//		  WebDriver driver = new ChromeDriver();// browser Launch
//	    driver.manage().window().maximize();
//	    driver.get("https://www.amazon.in/");
//	    driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
//	    sigin = new Amazone_Login (driver);
//	    Home = new Amazone_Home_Page (driver);
	}
	   @BeforeMethod
	    public void login() { 
		   sigin.enterText();
		   sigin.enteremailid();
		   sigin.ClickonContinue();
		   sigin.Enterpassword();
		   sigin.Clickonsigin();	   
	    }
	   @Test
		public void TestCase_01()  {
		Home.SearchTextBox();
		Home.ClickonSearchBox();
		Home.clickonsignout();
		}
	   
		@AfterMethod
		public void TakeScreenshot() throws IOException {
			Date d = new Date ();
			String str = d.toString().replace(":", "_").replace(" ", "_");
			File source= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			File desc = new File ("C:\\Users\\MD 10\\Desktop\\ScreenShorts\\"+str+".jpg"); 
		   FileHandler.copy(source, desc);	
		}
		@AfterClass
		public void CloseBrowser() {
		//driver.quit();
		}
}
