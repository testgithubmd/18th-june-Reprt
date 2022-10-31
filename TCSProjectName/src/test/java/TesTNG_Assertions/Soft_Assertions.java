package TesTNG_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assertions {

	       // Soft Assertion class from TesTNG //
      // Non Static Method// Object Required // SoftAssert Class used here 
	
	String expurl  = "www.flipkart.com";
    String acturl  = "www.flipkart.com";
    String acturl2 = "www.amazone";
    
	SoftAssert soft = new SoftAssert (); //  Object of SoftAsert
	
	@Test
	public void TC01 () {
		soft.assertEquals(acturl,expurl);// true because data is same
		System.out.println("Aseertion 1");
		soft.assertNotEquals(acturl2, expurl);// true bcz data need different
		System.out.println("Aseertion 2");
		soft.assertNotEquals(acturl, expurl, "Assert fail due to");// false because data is same // true hoga jab data change hoga
		System.out.println("Aseertion 3");
		soft.assertNotEquals(acturl2,expurl);// true bcz data is different
		System.out.println("Aseertion 4");
		
		// aise to yha p assertion 3 execute nahi hona chaye tha but koe bhi verifed hua hi nahi
		// is lye hame assertAll method ka used karna padhta hai 
		
		soft.assertTrue(true);
		System.out.println("Assertion 5");// pass
		soft.assertFalse(false);
		System.out.println("Assertion 6");// pass
		soft.assertAll(); // last line of our code and its mendatory
		System.out.println("Code is Done");// ye execute nai hoga
		//.assertAll(); method hamesha code k last line me rahe ga auu is k baad koe bhi code execute nai hoga agr kuch likha to
		}
		
	@Test 
	public void TC02 () {
		soft.assertEquals(acturl,expurl);// true because data is same
		System.out.println("Aseertion 7");
		soft.assertNotEquals(acturl2, expurl);// true bcz data need different
		System.out.println("Aseertion 8");
		soft.assertNotEquals(acturl, expurl, "Assert fail due to");// false because data is same // true hoga jab data change hoga
		System.out.println("Aseertion 9");
		soft.assertNotEquals(acturl2,expurl);// true bcz data is different
		System.out.println("Aseertion 10");
		soft.assertAll();
	}
	
}
