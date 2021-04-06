package generics;

import java.util.ArrayList;

public class Firstex {
public static void main(String[] args) {
	String[] stu = new String[3];
	stu[0]="gayathri";
	//stu[1]=10;
	String name= stu[0];//no need to typecast
	ArrayList<String> stli = new ArrayList<String>();
	stli.add("gayathri");
	//stli.add(new Integer(10));
	System.out.println(stli);
	String name1 = (String) stli.get(1);//need to typecast
	System.out.println(name1);
}
}
