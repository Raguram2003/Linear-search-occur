import java.util.*;

class Solution {
    public static int search(int arr[], int arrayLength, int x)
    {
        int count=0;
        for (int i = 0; i < arrayLength; i++) {
            if (arr[i] == x)
                count++;
        }
        return count;
    }

    // Driver code

}

public class LinearSearch {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int sizeOfArray = sc.nextInt();
        int[] arr = new int[sizeOfArray];
        System.out.print("Enter the Elements of the array : ");
        for(int i=0;i<sizeOfArray;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the required_element in the array : ");
        int x = sc.nextInt();
        Solution answer = new Solution();

        // Function call
        int result = answer.search(arr, sizeOfArray, x);
        System.out.print("Element has occurred "+ result+" times");
    }
}
