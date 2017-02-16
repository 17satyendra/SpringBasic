package com.bridgeit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author bridgeit Satyendra Singh This class uses the EmployeeDao class object
 *         and calls its saveEmployee method by passing the object of Employee
 *         class.
 */
public class InsertTest {

	public static void main(String[] args) {

		ApplicationContext spring = new ClassPathXmlApplicationContext("context.xml");
		EmployeeDao dao = spring.getBean(EmployeeDao.class);
		Employee emp = spring.getBean(Employee.class);

		emp.setName("vijay");
		emp.setSalary(50000);

		dao.saveEmployee(emp);
		System.out.println("Data saved...");
	}

}
