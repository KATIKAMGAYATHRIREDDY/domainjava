package inbuilt.functional.interfaces;

import java.util.ArrayList;
import java.util.function.Predicate;

public class TestPreStu {
	public static ArrayList<StudentClass> marks;
	public static void main(String[] args)
	{
	calculateStu();
	Predicate<StudentClass> p1 =(stu)->(stu.m1+stu.m2+stu.m3)>=75;
	for(StudentClass stu:marks) 
	{
		if(p1.test(stu)) 
		{
			System.out.println("passed");
		}
		else {
			System.out.println("failed");
		}
	}
	
}
	public static void calculateStu()
	{
		marks=new ArrayList<StudentClass>();
		marks.add(new StudentClass(50,50,50));
		marks.add(new StudentClass(25,20,20));
		marks.add(new StudentClass(50,50,20));

	}
}
