package com.sunbeam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Program {
	public static List<Student> list = new ArrayList<Student>();
	public static Scanner sc = new Scanner(System.in);

	public static int menuList() {
		System.out.println("0.EXIT");
		System.out.println("1.Add the student in the collection");
		System.out.println("2.Display all the student using iterator");
		System.out.println("3.search the student on rollno and if found display his details");
		System.out.println("4.sort the students on rollno ");
		System.out.println("5.sort the students on name");
		System.out.println("6.sort the students on marks");
		System.out.println("Enter your choice:");
		return sc.nextInt();

	}

	public static void addStudent() {
		System.out.println("Enter the rollno");
		int rollno = sc.nextInt();
		System.out.println("Enter the name");
		String name = sc.next();
		System.out.println("Enter the marks");
		double marks = sc.nextDouble();
		Student s = new Student(rollno, name, marks);
		list.add(s);
		System.out.println("Student added to list....");

	}

	public static void studentsUsingIterator() {
		ListIterator<Student> trav = list.listIterator();
		while (trav.hasNext()) {
			System.out.println(trav.next());
		}
	}

	public static void acceptRecord(int[] rollno) {
		System.out.println("Enter the rollno");
		rollno[0] = sc.nextInt();
	}

	public static Student findStudent(int rollno) {
		Student key = new Student();
		key.setRollno(rollno);
		int index = list.indexOf(key);
		if (index != -1) {

			// list.indexOf(key);
			return list.get(index);

		}
		return null;
	}

	public static class SortbyIdComparator implements Comparator<Student> {

		@Override
		public int compare(Student o1, Student o2) {
			return o1.getRollno() - o2.getRollno();
		}

	}

	public static class SortbyNameComparator implements Comparator<Student> {

		@Override
		public int compare(Student o1, Student o2) {
			return o1.getName().compareTo(o2.getName());

		}

	}

	public static class SortbyMarksCompartor implements Comparator<Student> {

		@Override
		public int compare(Student o1, Student o2) {
			return Double.compare(o1.getMarks(), o2.getMarks());
		}

	}
    public static void SortbyId()
    {
    	list.sort(new SortbyIdComparator());
		for (Student st : list) {
			System.out.println(st);
		}
    	
    }
    public static void SortbyName()
    {
    	list.sort(new SortbyNameComparator());
		for (Student st : list) {
			System.out.println(st);
		}
    }
    public static void SortbyMarks()
    {
    	list.sort(new SortbyMarksCompartor());
		for (Student st : list) {
			System.out.println(st);
		}
    }
	public static void main(String[] args) {

		int[] rollno = new int[1];
		int choice;
		while ((choice = menuList()) != 0) {
			switch (choice) {
			case 1:
				Program.addStudent();
				break;
			case 2:
				Program.studentsUsingIterator();
				break;
			case 3:
				Program.acceptRecord(rollno);
				Student s = Program.findStudent(rollno[0]);
				System.out.println(s);
				break;
			case 4:
				Program.SortbyId();
				break;
			case 5:
				Program.SortbyName();
				break;
			case 6:
				Program.SortbyMarks();
				break;

			}
		}

	}

}
