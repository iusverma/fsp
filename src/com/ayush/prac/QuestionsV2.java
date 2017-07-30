package com.ayush.prac;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class QuestionsV2 {

	private int userId;
	
	private String userName;
	
	private Map<Person,Address> userDetails;
	
	public QuestionsV2(){}
	
	public QuestionsV2(int id, String name, Map<Person, Address> details){
		this.userId = id;
		this.userName = name;
		this.userDetails = details;
	}
	
	public void print(){
		System.out.println("User Id: "+userId);
		System.out.println("User Name: "+userName);
		Set<Entry<Person, Address>> set = userDetails.entrySet();
		Iterator<Entry<Person, Address>> iter = set.iterator();
		while(iter.hasNext()){
			System.out.println("----------------------");
			Entry<Person, Address> entry = iter.next();
			System.out.print("Person: ");
			entry.getKey().printDetails();
			System.out.print("Address: ");
			entry.getValue().printAddress();
		}
	}
}
