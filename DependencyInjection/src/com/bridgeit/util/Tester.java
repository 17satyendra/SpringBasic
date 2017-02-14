package com.bridgeit.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgeit.bean.EmployeeBean;
import com.bridgeit.bean.QuestionBean;

/**
 * @author bridgeit Satyendra Singh. This class gets the bean from the
 *         applicationContext.xml file and calls the displayInfo() method.
 */
public class Tester {

	public static void main(String[] args) {
	

		ApplicationContext sp = new ClassPathXmlApplicationContext("context.xml");
		//QuestionBean bean = spring.getBean(QuestionBean.class);

		//bean.displayInfo();
		EmployeeBean emp = (EmployeeBean) sp.getBean("e2");
		
		emp.show();
	}

}
