/**
 * Given int[] array return number appear twice
 */
package Assignments;

public class AppearTwice {
	void printRepeating(int arr[], int size)
    {
        int i, j;
        System.out.println("The repeated Elements are :");
        for (i = 0; i < size; i++)
        {
            for (j = i + 1; j < size; j++)
            {
                if (arr[i] == arr[j])
                    System.out.print(arr[i] + " ");
            }
        }
    }
 
    public static void main(String[] args)
    {
        AppearTwice repeat = new AppearTwice();
        int arr[] = {54, 92, 64, 50, 92, 93, 64};
        int arr_size = arr.length;
        repeat.printRepeating(arr, arr_size);
    }
}
