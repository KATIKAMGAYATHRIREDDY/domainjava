/**
 * How to check if a String contains only digits
 */
package Assignments;

public class OnlyDigits {
	public static boolean	isAllDigits(String str) {
		for(int i=0; i<str.length() ;i++) {
			if(Character.isDigit(str.charAt(i))) {
				i++;
			}
			else 
				return false;
		}
		return true;
		
	}
	

	public static void main(String[] args) {
		System.out.println(isAllDigits("9876543210"));
	}
		
}
