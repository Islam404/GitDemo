package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
public WebDriver driver;

	public HomePage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	By search=By.xpath("//input[@type='search']");
	
	public WebElement searching() {
		
		driver.findElement(search);
		return driver.findElement(search);
		//we need to put this return statment so we can send elemnt through test clases
	}

}
