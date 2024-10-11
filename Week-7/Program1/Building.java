package com.course.structure;
import java.util.Scanner;

public class Building{
	int sqfootages;
	int stories;

	Scanner sc=new Scanner(System.in);

	public Building(){
		sqfootages=-1;
		stories=-1;
	}

	public void assign(){
		System.out.print("Enter the number of square footages: ");
		sqfootages=sc.nextInt();
		System.out.print("Enter the number of stories: ");
		stories=sc.nextInt();
	}

	public void display(){
		System.out.print("Square footages: "+sqfootages+"\tStories: "+stories+"\n");
	}
}
