package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.*;

public class StudentReport {
	public String findGrade(Student studentObject)
	{
		int marks[]=studentObject.getMarks();
		String grade="";
			if(marks[0]<35||marks[1]<35||marks[2]<35) {
				grade="F";
			}else {
				int sum=0;
				for(int j=0;j<marks.length;j++) {
					sum+=marks[j];
					if(sum<=150) {
						grade="D";
					}else if(sum>150 && sum<=200) {
						grade="C";
					}else if(sum>200 && sum<=250) {
						grade="B";
					}else if(sum>250 && sum<=300) {
						grade="A";
					}
				}
			}
			return grade;
	}
	public String validate(Student studentObject)throws NullStudentException,NullNameException,NullMarksArrayException
	{
		if(studentObject==null) {
			throw new NullStudentException();
		}else {
			if(studentObject.getName()==null||studentObject.getName()=="") {
				throw new NullNameException();
			}
			if(studentObject.getMarks()==null) {
				throw new NullMarksArrayException();
			}
		}
		String message=findGrade(studentObject);
		return message;
	} 

}
