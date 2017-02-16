package com.bridgeit;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;
/**
 * @author bridgeit Satyendra Singh
 * It is a simple POJO class. Here it works as the persistent class for hibernate. 
 */
@SuppressWarnings("serial")
@Component
@Entity
@Table
public class Employee implements Serializable
{
	@Id
	@GenericGenerator(name="gen", strategy="increment")
	@GeneratedValue(generator="gen")
	private int id;
	private String name;
	private double salary;
	
	public Employee() {
		System.out.println(this.getClass().getSimpleName()+" Created...");
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
