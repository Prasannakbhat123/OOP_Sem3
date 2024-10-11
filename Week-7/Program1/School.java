package com.course.structure;
import java.util.Scanner;

public class School extends Building{
	int noOfClass;
	String grade;
	Scanner sc=new Scanner(System.in);
	public School(){
		super();
		noOfClass=-1;
		grade="default";
	}

	public void assign(){
		super.assign();
		System.out.print("Enter number of Classes: ");
		noOfClass=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the grades: ");
		grade=sc.nextLine();
	}

	public void display(){
		super.display();
		System.out.println("Classes: "+noOfClass+"\tGrades: "+grade+"\n");
	}
}
