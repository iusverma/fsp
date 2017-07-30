package com.ayush.prac;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Questions {

	private int userId;
	
	private String userName;
	
	private Map<String,String> securityQuestions;
	
	public Questions(){}
	
	public Questions(int id, String name, Map<String, String> sQuestions){
		this.userId = id;
		this.userName = name;
		this.securityQuestions = sQuestions;
	}
	
	public void print(){
		System.out.println("User Id: "+userId);
		System.out.println("User Name: "+userName);
		Set<Entry<String, String>> set = securityQuestions.entrySet();
		Iterator<Entry<String, String>> iter = set.iterator();
		while(iter.hasNext()){
			Entry<String, String> entry = iter.next();
			System.out.println("Question: "+entry.getKey());
			System.out.println("Answer: "+entry.getValue());
		}
	}
}
