package co.com.caffeinate.stepdefinitions;
import co.com.caffeinate.userinterface.Barrista;
import co.com.caffeinate.userinterface.Customer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;


public class CaffeinateMeStepDefinitions {
	
	
	@Steps
	Customer cathy;
	
	@Steps
	Barrista barry;
	String cathysOrder;
	
	@Given("^(.*) is (.*) meters from the coffe shop$")
	public void clientIsMetersFromTheCoffeShop(String name, int distanceFromShop) throws Exception {
		System.out.println("Meters is: " + distanceFromShop);
		cathy.notifyDistanceFromShop(distanceFromShop);
	}

	@When("^Caty orders to (.*)$")
	public void catyOrdersA(String order) throws Exception {
		System.out.println("The order is:" + order);
		cathysOrder = order;
		cathy.placesOrderFor(cathysOrder);
	}

	@Then("^Barry should know that the order$")
	public void barryShouldKnowThatTheOrder() throws Exception {
		
//		barry.shouldHavePendingOrderFor(cathysOrder);

		assertThat(barry.getPendingOrders(), hasItem(cathysOrder));
		
	
	
	}

	@Then("^Barry should know that the coffe is Urgent$")
	public void barryShouldKnowThatTheCoffeIsUrgent() throws Exception {
	 
	}


}
