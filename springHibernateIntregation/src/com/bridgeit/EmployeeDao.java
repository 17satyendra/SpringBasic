package com.bridgeit;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author bridgeit Satyendra Singh It is a java class that uses the
 *         saveEmployee() method with sessionFactory and Transaction to persist
 *         the object of Employee class.
 */
@Component
@Repository
@Transactional
public class EmployeeDao {
	@Autowired
	SessionFactory sessionFactory;

	public EmployeeDao() {
		System.out.println(this.getClass().getSimpleName() + " Created");
	}

	// method to save employee

	public void saveEmployee(Employee employee) {
		System.out.println("Data saving...");

		Session sess = sessionFactory.getCurrentSession();

		try {

			sess.save(employee);
			// sess.beginTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
