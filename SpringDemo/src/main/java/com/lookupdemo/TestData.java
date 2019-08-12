package com.lookupdemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
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
	AbstractApplicationContext c=new ClassPathXmlApplicationContext("lookupdemo.xml");
	  //ApplicationContext c=new FileSystemXmlApplicationContext("springdemo.xml");//to need keep file in project location eg.G:\study\java note\MavenPgm\SpringDemo
	Student s= (Student) c.getBean("s_id");
	
	System.out.println("befoe changes");
	System.out.println(s);
	
	 Address a= s.lookup();
	 a.setCity("pandharpur");
	 //a.setCity("41101");
	 System.out.println(a);
		System.out.println("After changes");
		Student s1= (Student) c.getBean("s_id");
		 Address aa= s1.lookup();
			//aa.setCity("solapur");
			//System.out.println(s);

		//System.out.println(s1);
			 System.out.println(a);

		System.out.println(aa);

		

	 
      
}
}