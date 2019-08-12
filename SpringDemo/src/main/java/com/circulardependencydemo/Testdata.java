package com.circulardependencydemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testdata 
{
   public static void main(String[] args) 
   {
	   System.out.println("Inside main");
	 // ApplicationContext c=new ClassPathXmlApplicationContext("circulardependencydemo.xml");
	  ClassPathXmlApplicationContext c = new ClassPathXmlApplicationContext("circulardependencydemo.xml");
	    Employee e=(Employee) c.getBean("e_id1",Employee.class);
	    System.out.println(e);
	    System.out.println(".........The end.....");
	    c.close();
	   
	   
	    
}
}
