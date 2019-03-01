package page_object;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class carWorthPage {
	public WebDriver driver;
	By carValButton = By.id("entryPointOwners");
	By yearDD = By.id("yearDropdown");
	By makeDD = By.id("makeDropdown");
	By modelDD = By.id("modelDropdown");
	By mileageInput = By.id("mileage");
	By zipcodeInput = By.id("zipcode");
	By submitButton = By.id("submitButton");
	
	By popup = By.xpath("//a[text()='No, thanks']");
	By survey = By.xpath("//*[@id=\"survey_nothanks\"]");
	By tradeInButton = By.id("tradeInButton");

	public carWorthPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getCarValue() {
		return driver.findElement(carValButton);
	}
	public Select getYear() {
		Select s_year = new Select(driver.findElement(yearDD));	
		return s_year;
	}
	public Select getMake() {
		Select s_make = new Select(driver.findElement(makeDD));
		return s_make;
	}
	public Select getModel() {
		Select s_model = new Select(driver.findElement(modelDD));
		return s_model;
	}
	public WebElement getMile() {
		return driver.findElement(mileageInput);
	}
	public WebElement getZip() {
		return driver.findElement(zipcodeInput);
	}
	public WebElement getSubmitButton() {
		return driver.findElement(submitButton);
	}
	
	public WebElement getsurvey() {
		return driver.findElement(survey);
	}

	public List<WebElement> getSurveySize() {
		return driver.findElements(survey);
	}

	public WebElement getpopup() {
		return driver.findElement(popup);
	}

	public List<WebElement> getpopupSize() {
		return driver.findElements(popup);
	}
	public List<WebElement> checkPage() {
		return driver.findElements(tradeInButton);
	}
	public WebElement checkPageDirect() {
		return driver.findElement(tradeInButton);
	}
	

}
