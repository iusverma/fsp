package com.ayush.prac;

public class Record {
	private Person person;
	private Address address;
	public Record(){}
	public Record(Person p, Address a){
		this.person = p;
		this.address = a;
	}

	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void printRecord(){
		if(this.person!=null){
			this.person.printDetails();
		}
		if(this.address!=null){
			this.address.printAddress();
		}
	}
}
