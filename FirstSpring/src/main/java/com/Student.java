package com;

public class Student {
 
  String name1;
  String id;
  Hostel hostel;
  public Student(String name1, String id,Hostel hostel) {
		
		this.name1 = name1;
		this.id = id;
		this.hostel=hostel;
	}
public String getName() {
	return name1;
}
/*public void setName(String name) {
	this.name1 = name;
}*/
public String getId() {
	return id;
}
/*public void setId(String id) {
	this.id = id;
}*/
public Hostel getHostel() {
	return hostel;
}
public void setHostel(Hostel hostel) {
	this.hostel = hostel;
}
@Override
public String toString() {
	return "Student [name=" + name1 + ", id=" + id + ", hostel=" + hostel
			;
}

  
}
