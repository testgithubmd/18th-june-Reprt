package Annotations_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import facebook.FaceBookLogin;

public class Anotations_Practice_Login {
   
	FaceBookLogin login;
	
	
	@BeforeClass
	public void launchBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\MD 10\\Downloads\\chromedriver_win32 (1)\\chromeDriver.exe");
		WebDriver driver = new ChromeDriver();// browser Launch
	    driver.manage().window().maximize();
		driver.get("https://facebook.com");// URL Lauche
       this.login = new FaceBookLogin (driver);
       
	}
	
	@BeforeMethod
    public void Login() { 
    	
    	login.enterPassword();
    	login.enterUserName();
    	login.clickonLoginButton();
    }
	
	@Test
	public void TC01()  {
	
	}

	@AfterMethod
	public void LogOut() {
		
	}

	@AfterClass
	public void CloseBrowser() {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
