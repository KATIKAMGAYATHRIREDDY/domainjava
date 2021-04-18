/**
 * How to check if two Strings are anagrams of each other
 */
package Assignments;

import java.util.Arrays;

public class Anagrams {
	public static void main(String[] args) {
		String s1 = "gayathri";
		String s2 =  "gayathri";
		
		if(s1.length() == s2.length()) {
			char[] str1 = s1.toCharArray();
			char[] str2 = s2.toCharArray();
			
			Arrays.sort(str1);
			Arrays.sort(str2);
			
			
			if(Arrays.equals(str1, str2) == true) {
				System.out.println("The Two Strings "+s1+" and "+s2+ " are anagrams");
			}
			else {
				System.out.println("The two Strings "+s1+" and "+s2+ " are not anagrams");
			}
			
		}
			
	}
}
