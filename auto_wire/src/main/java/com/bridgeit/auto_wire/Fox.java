package com.bridgeit.auto_wire;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author bridgeit Satyendra singh.
 *By default, the @Autowired annotation will perform the dependency checking to make sure 
 *the property has been wired properly. But if there is no matching bean to wire, Spring 
 *will throw an exception. To avoid this exception we can disable this checking feature by 
 *setting the required attribute of @Autowired to false. In that case, if Spring does not
 *find a matching bean, it will leave the property unset.
 */
public class Fox 
{
	private String name;
	
	@Autowired(required=false)
	private Color color;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Color getColor() {
		return color;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "The " + name + " has " + color.toString();
	}
}
