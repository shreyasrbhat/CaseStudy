package com;

public class Ebook extends Book {
float size;

public float getSize() {
	return size;
}

public void setSize(float size) {
	this.size = size;
}

@Override
public String toString() {
	return "Ebook [size=" + size + ", toString()=" + super.toString() + "]";
}


}
