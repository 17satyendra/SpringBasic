package com.bridgeit.bean;

/**
 * @author bridgeit Satyendra Singh This class contains three properties id,
 *         name, email, one constructors and toString() method to display the
 *         information.
 */
public class UserBean {
	private int id;
	private String name, email;

	public UserBean(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	@Override
	public String toString() {
		return "UserBean [id=" + id + ", name=" + name + ", email=" + email + "]";
	}

}
