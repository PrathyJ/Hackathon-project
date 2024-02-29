package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.googlesignin;
import testbase.BaseClass;

public class TC_04_Signin {
	@Given("the home page of the website")
	public void the_home_page_of_the_website() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("click login\\/signup")
	public void click_login_signup() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		BaseClass.getLogger().info("--------Signing in to the google---------");
		googlesignin si=new googlesignin(BaseClass.getDriver());
		si.login();
	}

	@When("click google")
	public void click_google() {
	    // Write code here that turns the phrase above into concrete actions
		
	}

	@When("enter invalid email id as {string}")
	public void enter_invalid_email_id_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		BaseClass.getLogger().info("--------Giving the email input---------");
		googlesignin si=new googlesignin(BaseClass.getDriver());
		si.emailinput(null);    
	}

	@Then("capture the error message displayed")
	public void capture_the_error_message_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		BaseClass.getLogger().info("--------Capturing the error message---------");
		googlesignin si=new googlesignin(BaseClass.getDriver());
		si.getErrorMessage();
	}

}
