package com.spring.typeofscopenean;

public class Student 
{
   private int sid;
   private String sname;
   private Address aid;
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public Address getAid() {
	return aid;
}
public void setAid(Address aid) {
	this.aid = aid;
}
@Override
public String toString() {
	return "Student [sid=" + sid + ", sname=" + sname + ", aid=" + aid + "]";
}
public Student(int sid, String sname, Address aid) {
	super();
	this.sid = sid;
	this.sname = sname;
	this.aid = aid;
	System.out.println("param constructor of Student");

}
public Student() {
	super();
	System.out.println("Default constructor of Student");

}
   
   
}

class Address
{
  private int pin;
  private String city;
public int getPin() {
	return pin;
}
public void setPin(int pin) {
	this.pin = pin;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "Address [pin=" + pin + ", city=" + city + "]";
}
public Address(int pin, String city) {
	super();
	this.pin = pin;
	this.city = city;
	System.out.println("parameterized constructor of address");
}

public Address() {
	super();
	System.out.println("Default constructor of Address");
	// TODO Auto-generated constructor stub
}
  

}
