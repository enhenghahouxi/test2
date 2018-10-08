package cn.edu.zucc;

import java.util.ArrayList;


public class export {
	public static void main(String[] args) {
		
		int i;
		ArrayList<Student> Students= new ArrayList<Student>();
		
		for(i=0;i<20;i++) {
			Student student=new Student();
			student.studentnumber=Integer.toString((int)(Math.random()*100000000));
			Students.add(student);
		}
		
		ArrayList<Teacher> Teachers= new ArrayList<Teacher>();
		
		for(i=0;i<20;i++) {
			Teacher teacher=new Teacher();
			teacher.teachernumber=Integer.toString((int)(Math.random()*100000000));
			Teachers.add(teacher);
		}
		
		
		ArrayList<Student> Students1= new ArrayList<Student>();
		Students1=SortUtils.sort(Students);
		
		ArrayList<Teacher> Teachers1= new ArrayList<Teacher>();
		Teachers1=SortUtils.sort1(Teachers);
		
		System.out.print("接下来按照学号降序打印：");
		System.out.println();
		for(i=0;i<20;i++) {
			System.out.print(Students1.get(i).studentnumber);
			System.out.println();
		}
		
		System.out.println();
		System.out.print("接下来按照教师号降序打印：");
		System.out.println();
		for(i=0;i<20;i++) {
			System.out.print(Teachers1.get(i).teachernumber);
			System.out.println();
		}
		
	}

	

	
}
                                                                                               