package com;

import java.util.ArrayList;
import java.util.Iterator;

public class Employee {
int id;
String name;
Address address;
ArrayList<String> names;
Employee(){
	System.out.println("Empty constructor");
}

Employee(String name){
	this.name=name;
}
Employee(int id){
	this.id=id;
}
Employee(int id,String name){
	this.name=name;
	this.id=id;
}
public Employee(int id, String name, Address address,ArrayList<String> names) {  
    super();  
    this.id = id;  
    this.name = name;  
    this.address = address;  
    this.names=names;
}  

public void show(){
	 System.out.println(id+" "+name);  
	    System.out.println(address.toString());  
	}  
public void showList(){
	Iterator<String> itr=names.iterator();
	while(itr.hasNext()){
		System.out.println("\n"+itr.next());
	}
}
}
