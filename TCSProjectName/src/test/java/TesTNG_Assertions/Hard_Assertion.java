package TesTNG_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Hard_Assertion {
	
            //  Hard Assert //
	// static Method // Assert class used
	
       String expurl  = "www.amazone.com";
       String acturl  = "www.amazone.com";
       String acturl2 = "www.amazone";   
	@Test
	public void TC01() {
		
		Assert.assertEquals(acturl,expurl);// true because data is same
		System.out.println("Aseertion 1");
		Assert.assertNotEquals(acturl2, expurl);// true bcz data is different
		System.out.println("Aseertion 2");
		Assert.assertNotEquals(acturl, expurl);// false because data is same // true hoga jab data change hoga
		System.out.println("Aseertion 3");
		Assert.assertNotEquals(acturl2,expurl);// true bcz data is different
		System.out.println("Aseertion 4");
		
//		Aseertion 3 false hue to us k baad agar assertion true bhi rha to execute nahi hoga
//		hard Assert me sirf yahi TC01 k liye  but yha p TC02 present hai to wo execute hoga
		
		Assert.assertTrue(true);
		System.out.println("Assertion 5");// pass
		Assert.assertFalse(false);
		System.out.println("Assertion 6");// pass
		}
	
	@Test
	public void TC02() {
		Assert.assertEquals(acturl,expurl);// true because data is same
		System.out.println("Aseertion 7");
		Assert.assertNotEquals(acturl2, expurl);// true bcz data is different
		System.out.println("Aseertion 8");
//		Assert.assertNotEquals(acturl, expurl);// false because data is same // true hoga jab data change hoga
//		System.out.println("Aseertion 9");
		Assert.assertNotEquals(acturl2,expurl);// true bcz data is different
		System.out.println("Aseertion 10");

	}
}