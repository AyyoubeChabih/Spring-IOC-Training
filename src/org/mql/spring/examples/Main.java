package org.mql.spring.examples;

import org.mql.spring.models.Date;
import org.mql.spring.models.Document;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public Main() {
		exp03();
	}
	
	void exp01() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Date d1 = context.getBean(Date.class); //pour récuperer le bean de cette classe si il est unique
		Document doc1 = context.getBean("Spring", Document.class);
		
		System.out.println(d1);
		System.out.println(doc1);
		context.close();
	}
	
	void exp02() {
		loggingConfig();
		new ClassPathXmlApplicationContext("Swing.xml").close(); // il crée le bean 
	}
	
	void loggingConfig() {
		String path = getClass().getClassLoader().getResource("logging.properties").getFile();
		System.setProperty("java.util.logging.config.file", path);
	}
	
	void exp03() {
		loggingConfig();
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Date d1 = context.getBean(Date.class);
		Date d2 = context.getBean(Date.class);
		
		System.out.println(d1);
		System.out.println(d2);
		context.close();
	}
	
	public static void main(String[] args) {
		new Main();
	}
}
