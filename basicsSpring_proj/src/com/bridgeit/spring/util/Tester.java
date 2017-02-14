package com.bridgeit.spring.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgeit.spring.bean.AtmBean;
import com.bridgeit.spring.bean.GunBean;
import com.bridgeit.spring.bean.PlayStationBean;

public class Tester {

	public static void main(String[] args) 
	{
		/*AtmBean atm = new AtmBean();
		atm.withDraw(5000);
		
		String xmlFileName= "context.xml";
		
		ApplicationContext spring = new ClassPathXmlApplicationContext(xmlFileName);
		
		AtmBean atm =spring.getBean(AtmBean.class);
		atm.withDraw(5000);
		*/
		
		/*String xmlFileName="context.xml";
		ApplicationContext spring = new ClassPathXmlApplicationContext(xmlFileName);
		
		GunBean gun = spring.getBean(GunBean.class);
		System.out.println(gun.getType());
		System.out.println(gun.getNo());
		*/
		
		String xmlFileName= "context.xml";
		
		ApplicationContext spring = new ClassPathXmlApplicationContext(xmlFileName);
		
		PlayStationBean bean = spring.getBean(PlayStationBean.class);
		System.out.println(bean.getVersion());
	}
}
