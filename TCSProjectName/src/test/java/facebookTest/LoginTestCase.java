package facebookTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import facebook.FaceBookLogin;

public class LoginTestCase {

	public static void main(String[] args) throws InterruptedException {
		// Test class
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\MD 10\\Downloads\\chromedriver_win32 (1)\\chromeDriver.exe");
		WebDriver driver = new ChromeDriver();// browser Launch
	    driver.manage().window().maximize();
		driver.get("https://facebook.com");// URL Lauched
		Thread.sleep(4000);
		
		// now we have to maintain flow of execution
		
		FaceBookLogin login = new FaceBookLogin(driver);
		
		login.enterUserName();
		login.enterPassword();
		login.clickonLoginButton();
		login.clickonCreateNewAcount();	
	}
}
