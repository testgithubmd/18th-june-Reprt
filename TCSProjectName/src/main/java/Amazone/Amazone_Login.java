package Amazone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazone_Login {

	// pom Class for Amazone Login
	WebDriver driver;// 
	
	@FindBy (xpath= "//a[@id='nav-link-accountList']")// mouseover locate and store 
	private WebElement mouseoveer;
	@FindBy (xpath= "//input[@type='email']") // enter email
	private WebElement username;
	@FindBy (xpath= "//input[@id='continue']") // click on conitinue
	private WebElement submit;
	@FindBy (xpath= "//input[@type='password']") // click on conitinue
	private WebElement password;
	@FindBy (xpath= "//input[@id='signInSubmit']") // click on conitinue
	private WebElement sigin;

	public Amazone_Login(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void enterText() {
		Actions act= new Actions (driver);
		act.moveToElement(mouseoveer).click().perform();
    }
	public void enteremailid () {
		username.sendKeys("7021419522");
	}
	public void ClickonContinue () {
		submit.click();
	}
	public void Enterpassword () {
		password.sendKeys("19741745@md10");
	}
	public void Clickonsigin () {
		sigin.click();
	}	
}
