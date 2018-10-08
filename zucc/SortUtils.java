package cn.edu.zucc;

import java.util.ArrayList;

public class SortUtils {
	
	public static ArrayList<Student> sort(ArrayList<Student> students) {
		
		Student currentMax;
		int currentMaxIndex;
		
		int i;
		int j;
		for(i=0;i<20;i++) {
			currentMax=students.get(i);
			currentMaxIndex=i;
			for (j=i+1;j<20;j++) {
				if(currentMax.studentnumber.compareTo(students.get(j).studentnumber)<0) {
					currentMax=students.get(j);
					currentMaxIndex=j;
				}
			}
			
			if(currentMaxIndex!=i) {
				students.set(currentMaxIndex,students.get(i));
				students.set(i,currentMax);
			}
			
		}
		
		
		return students;
	}
	
	public static ArrayList<Teacher> sort1(ArrayList<Teacher> teachers) {
		
		Teacher currentMax;
		int currentMaxIndex;
		
		int i;
		int j;
		for(i=0;i<20;i++) {
			currentMax=teachers.get(i);
			currentMaxIndex=i;
			for (j=i+1;j<20;j++) {
				if(currentMax.teachernumber.compareTo(teachers.get(j).teachernumber)<0) {
					currentMax=teachers.get(j);
					currentMaxIndex=j;
				}
			}
			
			if(currentMaxIndex!=i) {
				teachers.set(currentMaxIndex,teachers.get(i));
				teachers.set(i,currentMax);
			}
			
		}
		
		
		return teachers;
	}
	
}
