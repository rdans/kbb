package page_object;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class categoryStyle {
	public WebDriver driver;
	By pickSedan = By.id("sedan");
	By chooseStyle = By.xpath("//div[@class='js-styles-options-wrapper styles-options']//div[2]//div[1]//label[2]");
	By nextButton= By.id("stylesNextButton");


	public categoryStyle(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getSedan() {
		return driver.findElement(pickSedan);
	}
	public WebElement getStyle() {
		return driver.findElement(chooseStyle);
	}
	public WebElement getNextButton() {
		return driver.findElement(nextButton);
	}
	
}
