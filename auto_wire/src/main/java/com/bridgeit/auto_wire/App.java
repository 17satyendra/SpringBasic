package com.bridgeit.auto_wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext spring = new ClassPathXmlApplicationContext("context.xml");
       Cat cat= (Cat) spring.getBean("cat");
       System.out.println(cat.toString());
       
       Dog dog = (Dog) spring.getBean("dog");
       System.out.println(dog.toString());
       
       Elephant ele = (Elephant) spring.getBean("elephant");
       System.out.println(ele.toString());
       
       Frog frog = (Frog) spring.getBean("frog");
       System.out.println(frog.toString());
       
       Tiger tiger = (Tiger) spring.getBean("tiger");
       System.out.println(tiger.toString());
       
       Monkey mon = (Monkey) spring.getBean("monkey");
       System.out.println(mon.toString());
       
       Lion lion = (Lion) spring.getBean("lion");
       System.out.println(lion.toString());
       
       Fox fox = (Fox) spring.getBean("fox");
       System.out.println(fox.toString());
       
    }
}
  