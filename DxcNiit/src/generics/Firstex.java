package generics;

import java.util.ArrayList;

public class Firstex {
public static void main(String[] args) {
	String[] stu = new String[3];
	stu[0]="gayathri";
	//stu[1]=10;
	ArrayList stli = new ArrayList();
	stli.add("gayathri");
	stli.add(new Integer(10));
	System.out.println(stli);
	String name = (String) stli.get(1);
	System.out.println(name);
}
}
