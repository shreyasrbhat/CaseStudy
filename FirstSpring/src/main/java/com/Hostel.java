package com;

public class Hostel {
 private String hostelName;
 private String city;
Hostel(){
	
}
public Hostel(String hostelName, String city  ) {
	
	this.hostelName = hostelName;
	this.city = city;
}
@Override
public String toString() {
	return "Hostel [hostelName=" + hostelName + ", city=" + city + "]";
}
public String getHostelName() {
	return hostelName;
}
public void setHostelName(String hostelName) {
	this.hostelName = hostelName;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
}
