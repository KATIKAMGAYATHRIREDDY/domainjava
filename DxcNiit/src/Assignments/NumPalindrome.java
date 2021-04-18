/**
 * How to check if given number is Palindrome
 */
package Assignments;

import java.util.*;

public class NumPalindrome {
	public static void main(String[] args) {
		int n,n1,r,p=0;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		n1 = n;
		while(n1>0) {
			r = n1 % 10;
			p = p * 10 + r;
			n1 /= 10;
		}
		if(p == n)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}

}
