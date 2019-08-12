package com.springbeanpostprocessor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestData 
{
  public static void main(String[] args) 
  {
	  System.out.println("inside main");
	AbstractApplicationContext c=new ClassPathXmlApplicationContext("beanpostprocessor.xml");
	 Student s= (Student) c.getBean("s_id");
	 BenaAware aware= (BenaAware) c.getBean("beanaware");

	 System.out.println(s);
	 aware.show();
	
	 c.close();
}
}
