package com.spring.SpringDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.InputStreamSource;
import org.springframework.core.io.Resource;

public class TestData 
{
  public static void main(String[] args) throws FileNotFoundException 
  {
	ApplicationContext c=new ClassPathXmlApplicationContext("springdemo.xml");
	  //ApplicationContext c=new FileSystemXmlApplicationContext("springdemo.xml");//to need keep file in project location eg.G:\study\java note\MavenPgm\SpringDemo
	Student s= (Student) c.getBean("s_id");
	
	System.out.println(s);
	
	 Address a= s.getAid();
	 System.out.println(a);
	 
	 /*BeanFactory b=new XmlBeanFactory(new ClassPathResource("springdemo.xml"));
	    Student ss= (Student) b.getBean("eid");
	    System.out.println(ss);
	    Address aa=ss.getAid();
	    System.out.println(aa);*/

  /*
   * Setter based injection
   * i-Compoulsary add default constructor
   * ii-If field is not specify in xml file then assign default value
   * iii-If constructor make private then it called automatically by useing reflection mechanism
   * iv-In setter injection first call default constructor and then initilize vbalue
   * output-
   * Default constructor of Student
Default constructor of Address
Student [sid=1, sname=A, aid=Address [pin=41313, city=null]]
Address [pin=41313, city=null]
Default constructor of Student
Default constructor of Address
Student [sid=1, sname=A, aid=Address [pin=41313, city=null]]
Address [pin=41313, city=null]

   * 
   * */
  
  
  /*
	  System.out.println("Welcome in constructor injection ");
  ApplicationContext c=new ClassPathXmlApplicationContext("springdemo1.xml");
	Student s= (Student) c.getBean("s_id");
	
	
	
	 Address a= s.getAid();
	 System.out.println(a);
	 
	 BeanFactory b=new XmlBeanFactory(new ClassPathResource("springdemo1.xml"));
	 
	    //InputStream i=new FileInputStream("springdemo1.xml");
	 //Resource r=new FileSystemResource("springdemo1.xml");
	 for these to keep xml file in pertuclar project location
	 and such eg.G:\study\java note\MavenPgm\SpringDemo 
		// BeanFactory b=new XmlBeanFactory(r);
	 ClassPathResource cp=new ClassPathResource("springdemo1.xml");
	 //place xml file in src/java/main
		 BeanFactory b=new XmlBeanFactory(cp);

		    Student ss= (Student) b.getBean("s_id");

	    System.out.println(ss);
	    Address aa=ss.getAid();
	    System.out.println(aa);
	 
	    Constructor based injection
	.     * i-There is no need default constructor
	     * ii-Reauired paramaterized constructor
	     * iii-All propery specify in xml otherwise get error
	     * iv-fist call parameterized constructor of composite object
	     * output-
	     * 
	     * parameterized constructor of address
param constructor of Student
Address [pin=413101, city=pune]
parameterized constructor of address
param constructor of Student
Student [sid=1, sname=Abc, aid=Address [pin=413101, city=pune]]
Address [pin=413101, city=pune]
	     * 
	     * */
      
}
}