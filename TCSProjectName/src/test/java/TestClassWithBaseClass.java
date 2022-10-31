import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import BasePackage.A_Base_Class;

public class TestClassWithBaseClass  {

	
	@BeforeClass
	public void OpenBrowser() {
		//initializeBrowser("chrome");
	}

	@Test
	public void TC01() {
		System.out.println("OK");
	}
	
} 
