package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class optionAndCondition {
	public WebDriver driver;
	By option = By.xpath("//label[@for='standardRadio']");
	By color = By.xpath("//span[contains(text(),'Black')]");
	By condition = By.xpath("//div[contains(text(),'Very Good')]");
	
	public optionAndCondition(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getOption() {
		return driver.findElement(option);
	}
	public WebElement getColor() {
		return driver.findElement(color);
	}
	public WebElement getCondition() {
		return driver.findElement(condition);
	}
}
