package Grouping_Package;

import org.testng.annotations.Test;

public class TestClass1 {

	@Test (groups = "Regression1")
		public void TC01(){
		System.out.println("TestClass1 TC01");
	}
	
	@Test 
	public void TC02(){
	System.out.println("TestClass1 TC02");
}
	
	@Test (groups = "Regression1")
	public void TC03(){
	System.out.println("TestClass1 TC03");
}	
	
//	@org.testng.annotations.BeforeSuite
//	public void BeforeSuite() {
//		System.out.println("BeforeSuite");
//	}
//	
//	@org.testng.annotations.BeforeTest
//	public void BeforeTest() {
//		System.out.println("BeforeTest");
//	}
//	
//	@org.testng.annotations.AfterTest
//	public void AfterTest () {
//		System.out.println("AfterTest");
//	}
//	
//	@org.testng.annotations.AfterSuite
//	public void AfterSuite () {
//		System.out.println("AfterSuite");
//	}
}
