package lamdaExpressions.collections;

import java.util.Comparator;

public class MyComparator implements Comparator<Integer>{
public int compare(Integer o1, Integer o2)
{
	/*if(o1 < o2)
		return -1;//o2 to come after o1 then return a -ve no.
	else if(o1 > o2)
		return 1;//o1 to come before o2 then return a +ve no.
	else
		return 0;//o1=o2 then return 0
		*/
	return (o1 < o2)? -1 : (o1 < o2)? 1 : 0;
	
	/*(o1,o2)->(o1 < o2)? -1 : (o1 < o2)? 1 : 0;*/
	
}
}
