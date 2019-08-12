package com.circulardependencydemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;

public class Employee 
{
   private int eid;
   private String ename;
   private int emark;
   
   private Address add;
public Address getAdd() 
{
	System.out.println("inside getAdd");

	return add;
}
public void setAdd( Address add) 
{
	System.out.println("inside setadd");

	this.add = add;
}
public int getEid() 
{
	System.out.println("inside geteid");

	return eid;
}
public void setEid(int eid) 
{
	System.out.println("inside seteid");

	this.eid = eid;
}
public String getEname() 
{
	System.out.println("inside getename");

	return ename;
}
public void setEname(String ename) 
{
	System.out.println("inside setname");

	this.ename = ename;
}
public int getEmark() 
{
	System.out.println("inside getMark");

	return emark;
}
public void setEmark(int emark) 
{
	System.out.println("inside setmark");

	this.emark = emark;
}

public Employee() {
	super();
	System.out.println("inside default emp");
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", emark=" + emark + ", add=" + add + "]";
}
public Employee(int eid, String ename, int emark,@Lazy Address add) 
{
	super();
	System.out.println("inside param emp");
	this.eid = eid;
	this.ename = ename;
	this.emark = emark;
	this.add = add;
}


   
}
