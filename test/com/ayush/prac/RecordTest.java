package com.ayush.prac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

public class RecordTest {
	/**
	 * test dependency injection using 
	 * constructor with object parameters
	 */
	@Test
	public void test_depInj_ConsWidObj() {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("appContext.xml");
		Record record = (Record)context.getBean("record");
		record.printRecord();
	}
}
