package page_object;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signin_page {
	public WebDriver driver;
	By email_field = By.id("loginEmail");
	By password_field = By.id("loginPassword");
	By signinbutton = By.id("myKbbSignin");
	By popup = By.xpath("//a[text()='No, thanks']");
	//By error_text = By.xpath("//div[contains(text(),\"The email or password you've entered is not valid\")]");
	String test1 = "The email or password you've entered is not valid";
	By error_text = By.cssSelector("[class=\"notification-body\"]");
	
	public signin_page(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getemail() {
		return driver.findElement(email_field);
	}
	public WebElement getpass() {
		return driver.findElement(password_field);
	}
	public WebElement getsignin_go() {
		return driver.findElement(signinbutton);
	}
	public WebElement getpopup() {
		return driver.findElement(popup);
	}

	public List<WebElement> getpopupSize() {
		return driver.findElements(popup);
	}
	public WebElement geterror() {
		return driver.findElement(error_text);
	}

}
