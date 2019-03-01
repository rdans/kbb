package resource;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	public static WebDriver driver;
	public static JavascriptExecutor js; 
	public WebDriver initdriver() {
		System.setProperty("webdriver.chrome.driver", "/Users/reinaldodaniswara/Desktop/selenium-java-3.141.59/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		return driver;
	}
	
}
