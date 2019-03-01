package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homepage {
	public WebDriver driver;
	By signin_logo = By.id("globalNavIcon");
	By signin_button = By.xpath("//a[@id='mykbbSignInLink']");
	
	public homepage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getsigninlogo() {
		return driver.findElement(signin_logo);
	}
	public WebElement getsigninbutton() {
		return driver.findElement(signin_button);
	}

}
