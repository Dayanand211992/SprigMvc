package com.spring.autowiringtype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestData1 
{
  public static void main(String[] args) 
  {
	 ApplicationContext c=new ClassPathXmlApplicationContext("autowire.xml");
	      Student s= (Student) c.getBean("s_id1");
	      System.out.println(s);
	      System.out.println(s.getSname());
	        Address a= s.getAid();
	        System.out.println(a);
}
}
