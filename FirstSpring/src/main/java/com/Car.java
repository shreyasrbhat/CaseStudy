package com;

public class Car {
  String name;
  int perDaycost;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPerDaycost() {
	return perDaycost;
}
public void setPerDaycost(int perDaycost) {
	this.perDaycost = perDaycost;
}
@Override
public String toString() {
	return "Car [name=" + name + ", perDaycost=" + perDaycost + "]";
}

}
