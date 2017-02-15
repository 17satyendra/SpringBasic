package com.bridgeit.auto_wire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @author bridgeit Satyendra Singh. Using the @Qualifier annotation
 *         The @Qualifier annotation can be used to control which bean should be
 *         autowired on a field. For example, if there are two beans defined in
 *         applicationContext.xml of the class Color.java, then the @Qualifier
 *         annotation is used to show Spring which of the two beans will be
 *         autowired in tiger bean. We define anotherColor bean in
 *         applicationContext.xml.
 */
public class Snake {
	private String name;

	@Autowired(required=false)
	@Qualifier("anotherColor")
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
