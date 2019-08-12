package com.circulardependencydemo;

import javax.annotation.PostConstruct;

public class Address 
{
      private int pin;
      private String city;
      private Employee ee;
	public Employee getEe() {
		return ee;
	}
	public void setEe(Employee ee) {
		this.ee = ee;
	}
	public int getPin()
	{
		System.out.println("inside getpin");
		return pin;
	}
	public void setPin(int pin)
	{
		System.out.println("inside setpin");

		this.pin = pin;
	}
	public String getCity()
	{
		System.out.println("inside getcity");

		return city;
	}
	public void setCity(String city) 
	{
		System.out.println("inside setcity");

		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Address [pin=" + pin + ", city=" + city + ", ee=" + ee + "]";
	}
	public Address(int pin, String city) {
		super();
		System.out.println("inside param add");

		this.pin = pin;
		this.city = city;
	}
	
	public Address() 
	{
		super();
		System.out.println("Inside default add");
		// TODO Auto-generated constructor stub
	}
      
}
