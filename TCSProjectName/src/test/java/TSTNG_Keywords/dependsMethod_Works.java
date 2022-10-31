package TSTNG_Keywords;

import org.testng.annotations.Test;

public class dependsMethod_Works {

	// TIME OUT
//	 @Test(invocationCount = 5)
//		public void Testcase04 () {
//			 System.out.println 	("Testcase04");
//		 }
//		 
//		 @Test(timeOut = 2000)
//			public void Testcase05 () throws InterruptedException {
//			 Thread.sleep(3000);
//			 System.out.println("Testcase05");
//			 }
//	
		 @Test(invocationCount = 5)
			public void Testcase04 () {
				 System.out.println 	("Testcase04");
			 }
			 
			 @Test(priority =-1, timeOut = 2000)
				public void Testcase05 () throws InterruptedException {
				 Thread.sleep(3000);
				 System.out.println("Testcase05");
				 }
		
		 
		 
		 
		 
		 
		 
		 
	
}
