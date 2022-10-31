package TSTNG_Keywords;

import org.testng.annotations.Test;

public class dependsMethods_difcase {

	// Multiple testcases with dependsmethod
	
	@Test(dependsOnMethods =	{"Testcase05","Testcase09"})
	public void Testcase07 () {
		 System.out.println 	("Testcase07");
	 }
	 
	 @Test(priority =-1, timeOut = 2000)
		public void Testcase05 () throws InterruptedException {
		 Thread.sleep(3000);
		 System.out.println("Testcase05");
		 }
	 	
	 @Test(invocationCount = 5)
		public void Testcase09 () {
			 System.out.println 	("Testcase09");
		 }
	
	
	
	
	
}
