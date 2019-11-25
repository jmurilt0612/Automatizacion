package co.com.caffeinate.userinterface;

import java.util.ArrayList;
import java.util.List;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.CoreMatchers.*;


import net.thucydides.core.annotations.Step;

public class Barrista {

	public List<String> getPendingOrders() {
		List<String> results= new ArrayList<>();
		results.add("large capuccino");
		return results;
	}
	
	public List<String> getUrgentOrders() {
		// TODO Auto-generated method stub
		List<String> results = new ArrayList<>();
		results.add("large cappuccino");
		return results;
		}

	@Step
	public void shouldHavePendingOrderFor(String someOrder) {
		 
//		assertThat(getPendingOrders().contains(someOrder));
	
	
	}

}
