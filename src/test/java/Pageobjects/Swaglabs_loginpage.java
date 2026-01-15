package Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Swaglabs_loginpage {
	
	WebDriver driver;
		
	public Swaglabs_loginpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(name="user-name")
	WebElement txtusername;
	
	@FindBy(name="password")
	WebElement txtpassword;
	
	@FindBy(id="login-button")
	WebElement loginbtn;
	
	@FindBy(xpath="//div[normalize-space()=\"Sauce Labs Backpack\"]")
	WebElement item;
	
	@FindBy(xpath="//button[normalize-space()=\"Add to cart\"]")
	WebElement btn;
	
	@FindBy(xpath="//a[@class=\"shopping_cart_link\"]")
	WebElement gocartlink;
	
	@FindBy(xpath="//button[normalize-space()=\"Checkout\"]")
	WebElement checkoutbtn;
	
	@FindBy(name="firstName")
	WebElement fname;
	
	@FindBy(name="lastName")
	WebElement lname;
	
	@FindBy(name="postalCode")
	WebElement postal;
	
	@FindBy(name="continue")
	WebElement conbtn;
	
	@FindBy(xpath="//button[normalize-space()=\"Finish\"]")
	WebElement finbtn;
	
	@FindBy(xpath="//h2[normalize-space()=\"Thank you for your order!\"]")
	WebElement msgorder;
	
	
	public void username(String uname) {
		txtusername.sendKeys(uname);
	}
	
	public void password(String upasswd) {
		txtpassword.sendKeys(upasswd);
	}
	
	public void loginbtn() {
		loginbtn.click();
	}
	
	public void Backpackitem() {
		item.click();
	}
	
	public void Addtocart() {
		btn.click();
	}
	
	public void cartlink() {
		gocartlink.click();
	}
	
	public void checkout() {
		checkoutbtn.click();
	}
	
	public void Firstname(String name) {
		fname.sendKeys(name);
	
	}
	
	public void Lastname(String Lname) {
		lname.sendKeys(Lname);
	}
	
	public void postalcode(String postcode) {
		postal.sendKeys(postcode);
	}
	
	public void Continue() {
		conbtn.click();
	}
	
	public void Finish() {
		finbtn.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
