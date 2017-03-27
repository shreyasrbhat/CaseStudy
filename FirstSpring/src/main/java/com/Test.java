package com;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
  public static void main(String[] args) {
	FileSystemXmlApplicationContext context=new FileSystemXmlApplicationContext("beans.xml");
	/*HelloWorld hello=context.getBean(HelloWorld.class);
	hello.sayHello();*/
	/*Person p=context.getBean(Person.class);
	System.out.println(p.toString());*/
	/*User user1=context.getBean(User.class);
	System.out.println(user1.car.toString());*/
	/*Student student=context.getBean(Student.class);
	System.out.println(student.toString());*/
	/*Ebook book=(Ebook)context.getBean("ebook");
	System.out.println(book.toString());*/
	Book book2=(Book)context.getBean("book2");
	System.out.println(book2.toString());
	
	context.close();
}
}
