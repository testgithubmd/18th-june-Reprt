package BasePackage;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A_Base_Class {
        public static WebDriver driver;
        
	public static void initializeBrowser (String browser) {
		
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\MD 10\\Downloads\\chromedriver_win32 (1)\\chromeDriver.exe");
			  driver = new ChromeDriver();// browser Launch	
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\MD 10\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			  driver = new FirefoxDriver();// browser Launch		 
		}
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
     driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	
	}
	
}
	

