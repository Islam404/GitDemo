package Udemy.Cucumber;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {
	public static  WebDriver driver;
	static String DriverPath =System.getProperty("user.dir");
	public static Properties prop;
	
	
	public static WebDriver getDriver() throws IOException
	{
		 prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\imagdy\\eclipse-workspace\\Cucumber\\src\\test\\java\\Udemy\\Cucumber\\global.properties");
		prop.load(fis);
		
		
		
		
		 System.setProperty("webdriver.chrome.driver", DriverPath+"\\Drivers\\chromedriver.exe"); 
		 driver = new ChromeDriver(ChroOptions());
		  driver.get(prop.getProperty("url"));
         return driver;
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
