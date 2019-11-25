package co.com.caffeinate.userinterface;

import net.thucydides.core.annotations.Step;

public class Customer {

	private int distanceFromShop;

	public void setDistanceFromShop(int distanceFromShop) {
		this.distanceFromShop  = distanceFromShop;
		
	}

	
	@Step("Notify caffeinate")
	public void notifyDistanceFromShop(int distanceFromShop2) {
		this.distanceFromShop = distanceFromShop;
	}
	
public void placesOrderFor(String order) {
		
		
	}

}
