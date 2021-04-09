package lamdaExpressions.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;


public class ListNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(15);
		al.add(5);
		al.add(30);
		al.add(10);
		al.add(25);
		al.add(56);
		System.out.println(al);
		Comparator<Integer> c = (o1,o2)->(o1 < o2)? -1 : (o1 > o2)? 1 : 0;
		Collections.sort(al,c);
		//Collections.sort(al,new MyComparator());
	System.out.println(al);
	}

}
//Comparator -- int compareTo(Object o1, Object o2)
//o1 to come before o2 then return a +ve no.
//o2 to come after o1 then return a -ve no.
//o1=o2 then return 0