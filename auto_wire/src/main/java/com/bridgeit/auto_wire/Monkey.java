package com.bridgeit.auto_wire;

import org.springframework.beans.factory.annotation.Autowired;

public class Monkey
{
	private String name;
	private Color color;
	
	@Autowired
	public Monkey(Color color) {
		super();
		this.color = color;
	}
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
