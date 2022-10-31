package CrossBrowserTesting;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BasePackage.A_Base_Class;
public class A1_CrossBrowsr_Testing_Class extends A_Base_Class {

	@Parameters("browsers") // yha pe ye name dena hai jo hame no jo test suite me parameter ka name diya hai wo
	@BeforeClass
	public void browserLaunch(String browser) {// chrome is browser ko assign hoga
		
		initializeBrowser(browser); // yha se chrome value base class me jaaye gi
	}
		
	@Test
	public void TC01_Verify_Google_Title() {
		
		String expectedTitle ="Google";
		String actualTitle= driver.getTitle();
		System.out.println("Actual Title is "+actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle);// pass 	
	}
	 
 
}
