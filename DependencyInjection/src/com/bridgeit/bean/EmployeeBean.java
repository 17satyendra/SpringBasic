package com.bridgeit.bean;

/**
 * @author bridgeit Satyendra Singh. This class contains three properties, two
 *         constructor and show() method to display the values.
 */
public class EmployeeBean {
	private int id;
	private String name;
	private AddressBean address;

	public EmployeeBean(int id, String name) {
		
		this.id = id;
		this.name = name;
	this.address = address;

		System.out.println(this.getClass().getSimpleName() + " Created");
	}
	public EmployeeBean(int id, String name, AddressBean address) {  
	    super();  
	    this.id = id;  
	    this.name = name;  
	    this.address = address;  
	}  

	public void show() {
		System.out.println(id + " " + name);
		System.out.println(address);
	}

}
