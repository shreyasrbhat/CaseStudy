package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	ApplicationContext ac=new ClassPathXmlApplicationContext("Bean.xml");
   HelloWorld hello= (HelloWorld)ac.getBean("helloWorld");
   hello.getMessage();
   Employee emp=(Employee) ac.getBean("emp1");
   emp.show();
	}

}
