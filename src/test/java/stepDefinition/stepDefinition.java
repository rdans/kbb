package stepDefinition;

import org.junit.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page_object.homepage;
import page_object.signin_page;
import resource.base;

public class stepDefinition extends base{

	@Given("^Initialize browser with chrome$")
	public void initialize_browser_with_chrome() throws Throwable {
	    driver = initdriver();
	}

	@Given("^User navigate to \"([^\"]*)\" site$")
	public void user_navigate_to_site(String kbb_link) throws Throwable {
		driver.get(kbb_link);
	}

	@Given("^Click on login link in home page, click sign in button, and user will be at sign in page$")
	public void click_on_login_link_in_home_page_click_sign_in_button_and_user_will_be_at_sign_in_page() throws Throwable {
	    homepage hp = new homepage(driver);
	    hp.getsigninlogo().click();
	    hp.getsigninbutton().click();
	}

	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\" and sign in$")
	public void user_enters_and_and_sign_in(String email, String pass) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		signin_page sp = new signin_page(driver);
		if (sp.getpopupSize().size() > 0) {
			sp.getpopup().click();
		}
		sp.getemail().sendKeys(email);
		sp.getpass().sendKeys(pass);
		sp.getsignin_go().click();
		Thread.sleep(2000);
		
	}

	@Then("^Website will display \"([^\"]*)\" message$")
	public void website_will_display_message(String error_msg) throws Throwable {
		signin_page sp = new signin_page(driver);
		String feedback = sp.geterror().getText();
		//System.out.println(feedback);
		//System.out.println(error_msg);
		Assert.assertTrue(error_msg.equalsIgnoreCase(feedback));
	}

	@Then("^close browser$")
	public void close_browser() throws Throwable {
	    driver.close();

	}
	

}
