package Annotations_TestNG;

import org.apache.poi.util.SystemOutLogger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations_Results {

	@BeforeClass
	public void launchBrowser() {
		System.out.println("@BeforeClass");
	}
	
	@BeforeMethod
	public void login() {
		System.out.println("@BeforeMethod");
	}
	 @Test 
	public void Testcase01 () {
		 System.out.println("Testcase01");
	 }
	 
	 @Test
		public void Testcase02 () {
		 System.out.println("Testcase02");
		 }
	 @Test
		public void Testcase03 () {
		 System.out.println("Testcase03");
		 }
	
	 @AfterMethod
	 public void logOut () {
		 System.out.println("@AfterMethod");
	 }
	 
	 @AfterClass
	 public void BrowserClosed() {
		 System.out.println("@AfterClass");
	 }
	 
	 
}
