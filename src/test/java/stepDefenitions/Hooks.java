package stepDefenitions;

import Udemy.Cucumber.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseTest {

	@Before("@MobileTest")
	public void beforMoblie(){
		
		System.out.println("Before Mobile");
	}
	
	@After("@MobileTest")
	public void afterMobile() {
		
		System.out.println("After Mobile");
	}
	
	@After("@GREENKART")
	public void AfterSeleniumTestt() {
		
		driver.close();
	}
	
	
	@Before("@WebTest")
	public void beforWeb(){
		
		System.out.println("Before Web");
	}
	
	@After("@WebTest")
	public void afterWeb() {
		
		System.out.println("After Web");
	}
}
