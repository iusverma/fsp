package com.ayush.prac;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.testng.annotations.Test;

public class PersonTest {
	@Test
	public void test_welcomeMessage() {
		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);

		Person person = (Person) factory.getBean("person");
		person.welcomeMessage();
	}
	
	@Test
	public void test_printDetails(){
		ApplicationContext context =   
			    new ClassPathXmlApplicationContext("applicationContext.xml");

		Person person = (Person) context.getBean("person");
		person.printDetails();
	}
	
	@Test
	public void test_printDetailsWithConstructors(){
		ApplicationContext context =   
			    new ClassPathXmlApplicationContext("applicationContext.xml");

		Person person = (Person) context.getBean("pConstructor");
		person.printDetails();
	}
}