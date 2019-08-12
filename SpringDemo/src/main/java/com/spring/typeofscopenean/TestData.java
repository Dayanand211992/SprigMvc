package com.spring.typeofscopenean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestData 
{
   public static void main(String[] args)
   {
	 ApplicationContext c=new ClassPathXmlApplicationContext("beanscope.xml");
	    Student s=(Student) c.getBean("s_id");
	    Student s2=(Student) c.getBean("s_id");
	    System.out.println("Before modification");
	    System.out.println(s);
	    System.out.println(s2);
	      s2.setSname("Rahul");
	      s2.getAid().setCity("solapur");
	      s2.getAid().setPin(43101);
	      
	      System.out.println("After modification");
		    System.out.println(s);
		    System.out.println(s2);
	      
        /*
         * type of scope of bean
         * 1)Singleton-
         * 
         * 
         * 
         * 
         * */

	    
}
}
