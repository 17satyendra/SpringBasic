package com.bridgeit.bean;

/**
 * @author bridgeit Satyendra Singh This class contains four properties
 *         addressLine1, city, state, country, one constructor and toString()
 *         method to return the values.
 */
public class AddressBean {
	private String addressLine1;
	private String city;
	private String state;
	private String country;

	public AddressBean(String addressLine1, String city, String state, String country) {
		
		this.addressLine1 = addressLine1;
		this.city = city;
		this.state = state;
		this.country = country;

		System.out.println(this.getClass().getSimpleName() + " Created");
	}

	/*
	 * public String toString(){ return city+" "+state+" "+country; }
	 */
	// This toString for Inheritance

	public String toString() {
		return addressLine1 + " " + city + " " + state + " " + country;
	}
}
