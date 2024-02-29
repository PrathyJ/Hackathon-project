package stepdefinition;

import java.text.ParseException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.hover;
import pages.upcomingbikes;
import testbase.BaseClass;

public class TC_02_Upcomingbikes {
	@Given("Upcoming bikes page")
	public void upcoming_bikes_page() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("select manufacturer as honda")
	public void select_manufacturer_as_honda() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		hover hv=new hover(BaseClass.getDriver());
		hv.hoverelement();
		BaseClass.getLogger().info("--------Hovering to upcoming bikes---------");
		upcomingbikes ub=new upcomingbikes(BaseClass.getDriver());
		ub.upcomingbike();
	}

	@When("click view more bikes")
	public void click_view_more_bikes() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		BaseClass.getLogger().info("--------View more bikes---------");
		upcomingbikes ub=new upcomingbikes(BaseClass.getDriver());
		ub.viewMoreBikes();
	}

	@Then("honda bikes will be shown")
	public void honda_bikes_will_be_shown() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("upcoming honda bikes below {int} lakhs will be displayed")
	public void upcoming_honda_bikes_below_lakhs_will_be_displayed(Integer int1) throws ParseException {
	    // Write code here that turns the phrase above into concrete actions
		BaseClass.getLogger().info("-------View Honda bikes---------");
		upcomingbikes ub=new upcomingbikes(BaseClass.getDriver());
		ub.hondabikes(); 
	}

}
