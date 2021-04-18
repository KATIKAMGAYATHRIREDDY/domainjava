/**
 * Asked find biggest number and smallest number in an array (Java)
 */
package Assignments;

public class LargeSmall {
	 public static void main(String[] args) {
		 int arr[] = new int[]{712,96,6,909,800,934,721,34};
		 int smallest = arr[0];
		 int largest = arr[0];
		 
		 for(int i=1; i< arr.length; i++)
		 {
		 if(arr[i] > largest)
		 largest = arr[i];
		 else if (arr[i] < smallest)
		 smallest = arr[i];
		 
		 }
		 System.out.println("The smallest Number is : " + smallest);
		 System.out.println("The largest Number is : " + largest); 
		 }
}
