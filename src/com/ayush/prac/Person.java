package com.ayush.prac;

public class Person {

	private String personName;
	private int personAge;

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public void welcomeMessage(){
		System.out.println("Welcome "+personName);
	}

	public int getPersonAge() {
		return personAge;
	}

	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}
	
	public void printDetails(){
		System.out.println("Name: "+personName);
		System.out.println("Age: "+personAge);
	}
	
	public Person(){
	}

	public Person(String name, int age){
		this.personName = name;
		this.personAge = age;
	}
}