package com.ayush.prac;

public class Address {
	private String addLine1;
	private String addLine2;
	private String city;
	private String state;
	private String postalCode;
	private String country;
	public String getAddLine1() {
		return addLine1;
	}
	public void setAddLine1(String addLine1) {
		this.addLine1 = addLine1;
	}
	public String getAddLine2() {
		return addLine2;
	}
	public void setAddLine2(String addLine2) {
		this.addLine2 = addLine2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void printAddress(){
		System.out.println("Address is:");
		System.out.println(addLine1);
		System.out.println(addLine2);
		System.out.println(city);
		System.out.println(state);
		System.out.println(country +", " +postalCode);
	}
}
