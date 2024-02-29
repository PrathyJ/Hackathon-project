package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.usedcars;
import testbase.BaseClass;

public class TC_03_Usedcars {
	@Given("used cars menu")
	public void used_cars_menu() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("the user hovers used cars")
	public void the_user_hovers_used_cars() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		BaseClass.getLogger().info("--------Hovering to used cars---------");
		  usedcars uc=new usedcars(BaseClass.getDriver());
		  uc.usedcarshover();
	}

	@Then("select location as Chennai")
	public void select_location_as_chennai() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("print popular used car models")
	public void print_popular_used_car_models() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

}
