package TSTNG_Keywords;

import org.testng.annotations.Test;

public class PrioritiesTestCase {

	@Test (priority =1)
	public void Testcase01 () {
		 System.out.println("Testcase01");
	 }
	 
	 @Test (priority =2)
		public void Testcase02 () {
		 System.out.println("Testcase02");
		 }
	 
	 @Test(priority =3)
		public void Testcase03 () {
		 System.out.println("Testcase03");
		 }
	// _________________________________________________________________________
	// How to desable the test cases
	 @Test(enabled = false)
		public void Testcase04 () {
		 System.out.println("Testcase04");
		 }
	//__________________________________________________________________________
	
	
}
