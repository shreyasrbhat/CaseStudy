package com;

public class Book {
String name;
String author;
int noOfPages;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public int getNoOfPages() {
	return noOfPages;
}
public void setNoOfPages(int noOfPages) {
	this.noOfPages = noOfPages;
}
@Override
public String toString() {
	return "Book [name=" + name + ", author=" + author + ", noOfPages="
			+ noOfPages + "]";
}

}
