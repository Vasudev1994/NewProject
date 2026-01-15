package Stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pageobjects.Swaglabs_loginpage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class SwagLabs_loginsteps {
	
	WebDriver driver;
	Swaglabs_loginpage swp;
	
	@Given("user should access swaglabs url")
	public void user_should_access_swaglabs_url() throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		driver = new ChromeDriver(options);
		swp = new Swaglabs_loginpage(driver);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
			    
	}


	@When("user should enter username as {string} and password as {string}")
	public void user_should_enter_username_as_and_password_as(String Username, String Password) throws InterruptedException {
		swp.username(Username);
		swp.password(Password);
		Thread.sleep(2000);
	    
	}

	
	@Then("user should click on login button")
	public void user_should_click_on_login_button() throws InterruptedException {
		swp.loginbtn();
		Thread.sleep(2000);
	    
	}

	
	@And("user should verfiy homepage title as {string}")
	public void user_should_verfiy_homepage_title_as(String title) throws InterruptedException {
		
		if(driver.getPageSource().contains(title)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		Thread.sleep(2000);
		
	    
	}
	
	
	@Then("user should click on Sauce Labs Backpack")
	public void user_should_click_on_sauce_labs_backpack() throws InterruptedException {
		swp.Backpackitem();
		Thread.sleep(2000);
	    
	}
	
	
	@Then("user should click on add to cart")
	public void user_should_click_on_add_to_cart() throws InterruptedException {	    
		swp.Addtocart();
		Thread.sleep(2000);
	}
	

	
	@Then("user should click on addcart icon")
	public void user_should_click_on_addcart_icon() throws InterruptedException {
		swp.cartlink();
		Thread.sleep(2000);
	    
	}
	

	
	@Then("user should click on checkout button")
	public void user_should_click_on_checkout_button() throws InterruptedException {
		swp.checkout();
		Thread.sleep(2000);
	    
	}
	

	
	@Then("user should enter firstname as {string}")
	public void user_should_enter_firstname_as(String Name) throws InterruptedException {
		swp.Firstname(Name);
		Thread.sleep(2000);
	    
	}
	

	
	@Then("user should enter lastname as {string}")
	public void user_should_enter_lastname_as(String LName) throws InterruptedException {
	    swp.Lastname(LName);
	    Thread.sleep(2000);
	}

	
	@Then("user should enter postal code as {string}")
	public void user_should_enter_postal_code_as(String postal) throws InterruptedException {
	    swp.postalcode(postal);
	    Thread.sleep(2000);
	}

	
	@Then("user should click on continue button")
	public void user_should_click_on_continue_button() throws InterruptedException {
	    swp.Continue();
	    Thread.sleep(2000);
	}

	
	@Then("user should click on finish button")
	public void user_should_click_on_finish_button() throws InterruptedException {
		swp.Finish();
		Thread.sleep(2000);
	    
	}

	
	@And("user should verify message as {string}")
	public void user_should_verify_message_as(String Message) throws InterruptedException {
		
		if(driver.getPageSource().contains(Message)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		Thread.sleep(2000);
		driver.quit();
	    
	}

}
