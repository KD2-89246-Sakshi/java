package com.sunbeam;

import java.util.Objects;

public class Student {
private int rollno;
private String name;
private double marks;
Student()
{
	
}
public Student(int rollno, String name, double marks) {
	super();
	this.rollno = rollno;
	this.name = name;
	this.marks = marks;
}
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
@Override
public int hashCode() {
	return Objects.hash(rollno);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Student other = (Student) obj;
	return rollno == other.rollno;
}
public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}
public double getMarks() {
	return marks;
}
public void setMarks(double marks) {
	this.marks = marks;
}
@Override
public String toString() {
	return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
}



}
