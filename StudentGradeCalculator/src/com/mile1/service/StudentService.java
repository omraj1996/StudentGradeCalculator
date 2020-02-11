package com.mile1.service;

import com.mile1.bean.Student;

public class StudentService {
	public int findNumberOfNullMarks(Student data[])
	{
		int numberOfNullMarks=0;
		for(Student student : data) {
			if(student.getMarks()==null) {
				numberOfNullMarks++;
			}
		}
		return numberOfNullMarks; 
	}
	public int findNumberOfNullNames
	(Student data [])
	{
		int numberOfNullNames=0;
		for (Student student : data) {
			if(student.getName()==null) {
				numberOfNullNames++;
			}
		}
		return numberOfNullNames;  
	}
	public int findNumberOfNullObjects
	(Student data [])
	{
		int noOfNullData=0;
		if(data==null) {
			noOfNullData++;
		}
	   return noOfNullData;
	}

}
