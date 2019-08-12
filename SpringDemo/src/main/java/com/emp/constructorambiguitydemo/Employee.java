package com.emp.constructorambiguitydemo;

public class Employee 
{
   private int eid;
   private String ename;
   private int emark;
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public int getEmark() {
	return emark;
}
public void setEmark(int emark) {
	this.emark = emark;
}
public Employee(int eid, String ename, int emark) {
	super();
	System.out.println("inside 1");
	this.eid = eid;
	this.ename = ename;
	this.emark = emark;
}
public Employee(int eid, int emark, String ename) 
{
	super();
	System.out.println("inside 2");
	this.eid = eid;
	this.ename = ename;
	this.emark = emark;
}
public Employee(String ename, int emark, int eid) 
{
	super();
	System.out.println("inside 3");
	this.eid = eid;
	this.ename = ename;
	this.emark = emark;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", emark=" + emark + "]";
}
   
}
