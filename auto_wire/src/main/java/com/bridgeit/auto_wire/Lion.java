package com.bridgeit.auto_wire;

import org.springframework.beans.factory.annotation.Autowired;

public class Lion
{
	private String name;
	
	@Autowired
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
