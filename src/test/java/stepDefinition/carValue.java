package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import page_object.carWorthPage;
import page_object.categoryStyle;
import page_object.optionAndCondition;
import page_object.popUpHandler;
import page_object.tradeInPage;
import resource.base;

public class carValue extends base{
	public JavascriptExecutor js = (JavascriptExecutor) driver;
	public boolean checkSurveyPage() {
		int show = driver.findElements(By.cssSelector("div[class='fsrDeclineButtonContainer'] a[class='fsrDeclineButtonContainer']")).size();
		if (show>0) {
			return true;
		}
		return false;
	}
	
	@Given("^Click on My Car's Value and user will arrive at Car Worth page$")
	public void click_on_My_Car_s_Value_and_user_will_arrive_at_Car_Worth_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		carWorthPage wp = new carWorthPage(driver);
		wp.getCarValue().click();
		
	}
	
	@When("^User select \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", enter \"([^\"]*)\", \"([^\"]*)\" and press Next$")
	public void user_select_enter_and_press_Next(String year, String make, String model, String miles, String zipcode) throws Throwable {
		carWorthPage wp = new carWorthPage(driver);
		popUpHandler popUp = new popUpHandler(driver);
		if (popUp.checkPopUp()) {
			popUp.getNoPopUp().click();
		}
		if(wp.checkPage().size() > 0) {
	    	wp.checkPageDirect().click();
	    }
		if (popUp.checkPopUp()) {
			popUp.getNoPopUp().click();
		}
		wp.getYear().selectByValue(year);
		wp.getMake().selectByValue(make);
		wp.getModel().selectByValue(model);
		wp.getMile().sendKeys(miles);
		wp.getZip().clear();
		wp.getZip().sendKeys(zipcode);
		wp.getSubmitButton().submit();
	}

	@Then("^Website will navigate to Category and Style page, and user choose category$")
	public void website_will_navigate_to_Category_and_Style_page_and_user_choose_category() throws Throwable {
	    categoryStyle cs = new categoryStyle(driver);
	    popUpHandler popUp = new popUpHandler(driver);
	    js.executeScript("window.scrollBy(0,300);");
	    if (popUp.checkPopUp()) {
			popUp.getNoPopUp().click();
		}
	    cs.getSedan().click();
	    
	}

	@Then("^User also choose the style of vehicle and press Next$")
	public void user_also_choose_the_style_of_vehicle_and_press_Next() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		categoryStyle cs = new categoryStyle(driver);
		popUpHandler popUp = new popUpHandler(driver);
		if (popUp.checkPopUp()) {
			popUp.getNoPopUp().click();
		}
		cs.getStyle().click();
	    Thread.sleep(1000);
	    cs.getNextButton().click();
	}

	@Then("^User will direct to Options and Condition Page, and pick options, color, condition of their vehicle$")
    public void user_will_direct_to_options_and_condition_page_and_pick_options_color_condition_of_their_vehicle() throws Throwable {
	    optionAndCondition oc = new optionAndCondition(driver);
	    js.executeScript("window.scrollBy(0,300);");
	    popUpHandler popUp = new popUpHandler(driver);
		if (popUp.checkPopUp()) {
			popUp.getNoPopUp().click();
		}
	    oc.getOption().click();
	    oc.getColor().click();
	    Thread.sleep(1000);
	    oc.getCondition().click();

	}

	@Then("^User will navigate to Compare your values page and display Trade-in-Value$")
	public void user_will_navigate_to_Compare_your_values_page_and_display_Trade_in_Value() throws Throwable {
	    tradeInPage ti = new tradeInPage(driver);
	    WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ti.getTradeInTab());
		Boolean value_display = ti.getTradeInValue().isDisplayed();
		Assert.assertTrue(value_display);
		
	}
}
