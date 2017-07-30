package com.ayush.prac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

public class QuestionsV2Test {
	@Test
	public void test_print() {
		ApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
		QuestionsV2 q = (QuestionsV2)context.getBean("questionsV2");
		q.print();
	}
}
