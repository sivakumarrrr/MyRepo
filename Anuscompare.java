package com.coreTest;

import java.util.Comparator;

public class Anuscompare implements Comparator<Anuscompare> {

	String name;
	int marks;
	double avg;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Anuscompare(String name, int marks, double d) {
		super();
		this.name = name;
		this.marks = marks;
		this.avg = d;
	}
	public Anuscompare() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Anuscompare [name=" + name + ", marks=" + marks + ", avg=" + avg + "]";
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(float avg) {
		this.avg = avg;
	}
	@Override
	public int compare(Anuscompare o1, Anuscompare o2) {
		
	if(o1.marks>o2.marks){
		return 1;
	}else if(o1.marks<o2.marks){
		return -1;
	}else{
		return 0;
		
	}
	
		
	}
}
