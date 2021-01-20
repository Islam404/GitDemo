package stepDefenitions;


import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Udemy.Cucumber.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import pageObjects.CheckOutPage;
import pageObjects.HomePage;

@RunWith(Cucumber.class)
public class MyStepDefinitions {
	public WebDriver driver;
	HomePage home;
	CheckOutPage CheckOut;
	
	
    @Given("^user is on Greencart landing page$")
    public void user_is_on_greencart_landing_page() throws Throwable {
    	driver =  BaseTest.getDriver();
    }

    @When("^user search for (.+) vegetable$")
    public void user_search_for_something_vegetable(String strArg1) throws Throwable {
    	//tagname[@attribute='value']
    	home = new HomePage(driver);
    	home.searching().sendKeys(strArg1);
    	//driver.findElement(By.xpath("//input[@type='search']")).sendKeys(strArg1);
    	Thread.sleep(1000);
      
    }

    @Then("^\"([^\"]*)\" vegetable  are displayed$")
    public void something_vegetable_are_displayed(String strArg1) throws Throwable {
    	Assert.assertTrue(driver.findElement(By.cssSelector("h4.product-name")).getText().contains(strArg1));

      
    }
    
    
    @And("^User Add Item to the Cart$")
    public void user_add_item_to_the_cart() throws Throwable {
        
    	driver.findElement(By.cssSelector("a.increment")).click();
    	driver.findElement(By.xpath("//button[contains(text(),'ADD TO CART')]")).click();
    	
    }

    
    @And("^User Proceed to check out page for purchase$")
    public void user_proceed_to_check_out_page_for_purchase() throws Throwable {
    	driver.findElement(By.xpath("//a[@class='cart-icon']")).click();
    	driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();

    }
    
    
    @Then("^Verify Selected (.+) are displayed in check out page$")
    public void verify_selected_something_are_displayed_in_check_out_page(String strArg1) throws Throwable {
    	CheckOut = new CheckOutPage(driver);
    	Assert.assertTrue(CheckOut.getProductName().getText().contains(strArg1));
    }

    
    
    
    
    
    
    
    
    
    
    
    
    public static ChromeOptions ChroOptions() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--ignore-ssl-errors=yes");
		options.addArguments("--ignore-certificate-errors");
		options.addArguments("--incognito");
		//options.addArguments("--proxy-server='direct://'");
		//options.addArguments("--proxy-bypass-list=*");
		//options.addArguments("disable-infobars");
		options.setHeadless(false);
		return options;
	} 

}