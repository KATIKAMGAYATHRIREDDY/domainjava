/**
 * How to remove duplicate characters from String
 */
package Assignments;

public class DuplicateStringRemove {
public static void main(String[] args) {
	String s="characters";
	char array[]=s.toCharArray();
	String r="";
	for(char i:array)
	{
		if(r.indexOf(i)==-1)
		{
			r+=i;
		}
	}
	System.out.println("The string after removing duplicates is "+r);
}
}
