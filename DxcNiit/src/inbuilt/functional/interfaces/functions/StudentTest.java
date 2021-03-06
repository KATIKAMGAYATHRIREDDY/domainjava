package inbuilt.functional.interfaces.functions;

import java.util.ArrayList;
import java.util.function.*;
public class StudentTest {
static ArrayList<JavaStudent> javaStudents;
	
	public static void main(String[] args) {
		populateStudents();
		
		Function<JavaStudent,String> f = (j) -> {
			if(j.marks > 80) return "Distinction";
			else if(j.marks > 60) return "first class";
			return "pass class";
		};
		
		for(JavaStudent s : javaStudents) {
			
			System.out.println(s.name +"\t"+ f.apply(s));
		}
	}

	public static ArrayList<JavaStudent> populateStudents() {
		javaStudents = new ArrayList<JavaStudent>();
		javaStudents.add(new JavaStudent("ram",50));
		javaStudents.add(new JavaStudent("ravi",80));
		javaStudents.add(new JavaStudent("ramu",70));
		javaStudents.add(new JavaStudent("gayathri",90));
		javaStudents.add(new JavaStudent("raju",55));
		return javaStudents;

	}
}
