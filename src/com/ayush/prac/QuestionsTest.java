package com.ayush.prac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

public class QuestionsTest {
	@Test
	public void test_print() {
		ApplicationContext app = new ClassPathXmlApplicationContext("appContext.xml");
		Questions q = (Questions)app.getBean("questions");
		q.print();
	}
}
