package Amazone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazone_Home_Page {

	// Home Pom Class for amazone
     WebDriver driver;// 
	
	@FindBy (xpath= "//input[@type='text']")// iphone
	private WebElement TextBox;
	@FindBy (xpath= "//input[@type='submit']")// click
	private WebElement Cick;
	@FindBy (xpath= "//a[@id='nav-link-accountList']")// mouseover 
	private WebElement mouseoveeroperation;
	@FindBy (xpath= "//span[text()='Sign Out']")
	private WebElement signout;
	
	public Amazone_Home_Page(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this); // this method is used inside the constructor of pom class
	}
	
	public void SearchTextBox () {
		TextBox.sendKeys("iphone");
	}
	public void ClickonSearchBox () {
		Cick.click();
	}
	public void clickonsignout() {
		Actions act= new Actions (driver);
		act.moveToElement(mouseoveeroperation).perform();
		signout.click();
    }
	
	
}
