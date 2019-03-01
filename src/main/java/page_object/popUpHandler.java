package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class popUpHandler {
	public WebDriver driver;
	By survey = By.cssSelector("a[class='fsrCloseBtn']");

	public popUpHandler(WebDriver driver) {
		this.driver = driver;
	}
	
	public boolean checkPopUp() {
		int show = driver.findElements(survey).size();
		if (show>0) {
			return true;
		}
		return false;
	}
	public WebElement getNoPopUp() {
		return driver.findElement(survey);
	}

}
