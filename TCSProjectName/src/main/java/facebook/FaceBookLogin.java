package facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
  import org.openqa.selenium.support.PageFactory;

public class FaceBookLogin {
               // Pom Class_
	   WebDriver driver;  
	      @FindBy(xpath = "//input[@name='email']") // Locate WebElement 
	      private WebElement userName;// storeed ho rhA 
	
	       @FindBy(xpath = "//input[@type='password']")
		   private   WebElement password;
	
	        @FindBy(xpath = "//button[@type='submit']")
		    private WebElement loginbutton;// ye saare data memebers ban gye
	        
	        @FindBy(xpath = "//a[text()='Create New Account']")
		    private WebElement createNewAcount;

	// abhi data members ko initialize karne k liye constructor used karna hoga 
	        
	        public FaceBookLogin(WebDriver driver){
	        	// driver ki value test class se aaye gi pomp clas me   
	        	this.driver=driver;
	        	PageFactory.initElements(driver, this);// he hamesha constructor k under rahe ga
	        }
	       
	        public void enterUserName() {
	        	userName.sendKeys("malparamohammed@gmail.com");
	        }
            public void enterPassword() {
            	password.sendKeys("19741745@md10");
	        }
         public void clickonLoginButton() {
        	 loginbutton.click();
  }
         public void clickonCreateNewAcount() {
        	 createNewAcount.click();
}
	        
	        
}
