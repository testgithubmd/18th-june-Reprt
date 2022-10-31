package Grouping_Package;

import org.testng.annotations.Test;

public class TestClass2 {

	@Test (groups = "Regression2")
	public void TC04(){
	System.out.println("TestClass2 TC04");
}

  @Test 
       public void TC05(){
      System.out.println("TestClass2 TC05");
}

     @Test (groups = "Regression2")
     public void TC06(){
     System.out.println("TestClass2 TC06");
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
