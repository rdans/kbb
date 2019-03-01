package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class tradeInPage {
	public WebDriver driver;
	By tradeinTab = By.xpath("//a[@class='tab js-trade-in-tab selected']");
	By tradeinValue = By.id("tradeInContent");
	
	public tradeInPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public ExpectedCondition<WebElement> getTradeInTab() {
		return ExpectedConditions.visibilityOfElementLocated(tradeinTab);
	}
	public WebElement getTradeInValue() {
		return driver.findElement(tradeinValue);
	}
}
