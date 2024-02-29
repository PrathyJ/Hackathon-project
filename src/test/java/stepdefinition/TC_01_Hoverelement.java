package stepdefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.hover;
import testbase.BaseClass;

public class TC_01_Hoverelement {
	
	WebDriver driver;
	
	@Given("home page of the website")
	public void home_page_of_the_website() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("the user hovers new bikes")
	public void the_user_hovers_new_bikes() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		BaseClass.getLogger().info("--------Hovering to bikes---------");
		hover hv=new hover(BaseClass.getDriver());
		hv.hoverelement();
	}
	
	@Then("upcomingbikes page will be displayed")
	public void upcomingbikes_page_will_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
}
