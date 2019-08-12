package com.emp.constructorambiguitydemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testdata 
{
   public static void main(String[] args) 
   {
	   System.out.println("Inside main");
	  ApplicationContext c=new ClassPathXmlApplicationContext("constructorambiguity.xml");
	    Employee e=(Employee) c.getBean("e_id");
	    System.out.println(e);
	    System.out.println(".........The end.....");
}
}
