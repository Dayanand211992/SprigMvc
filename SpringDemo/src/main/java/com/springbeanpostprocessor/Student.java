package com.springbeanpostprocessor;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Student 
{
  String sname;

public String getSname() {
	return sname;
}

public void setSname(String sname) {
	this.sname = sname;
}

@Override
public String toString() {
	return "Student [sname=" + sname + "]";
}

public Student() {
	super();
	// TODO Auto-generated constructor stub
}
  @PostConstruct
public void init()
{
System.out.println("inside intit weclome");	

}
  @PreDestroy
public void destroy()
{
System.out.println("inside destroy");	

}
}
