package com.ayush.prac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

public class AddressTest {
	@Test
	public void test_printAddress() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Address address = (Address)context.getBean("address");
		address.printAddress();
	}
}