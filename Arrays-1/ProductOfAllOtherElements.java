/*1.1 Get product of all other elements

Given an array of integers, return a new array such that each element at index i of 
the new array is the product of all the numbers in the original array except the one  at i.  
For example, if our input was [ 1, 2, 3, 4, 5], the expected output would be [ 120,  60, 40, 30, 24].
If our input was [3, 2, 1],the expected out put wouldbe [2,  3, 6].  */

// O(n^2)
import java.util.Scanner;
public class ProductOfAllOtherElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        int[] newarr = new int[n];

        for (int i = 0; i < n; i++) {
            int product = 1;
            for (int j = 0; j < n; j++) {
                if (j != i) {
                    product = product * arr[j];
                }
            }
            newarr[i] = product;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(newarr[i] + " ");
        }
    }
}
// O(n)

/*import java.util.Scanner;
public class Solution {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }

        int[] newarr = new int[n];
        int prod=1;

        for(int i=0;i<n;i++){
            prod = arr[i]*prod;
        }
        for(int i=0;i<n;i++){
            newarr[i] = prod/arr[i];
        }

        for(int i=0;i<n;i++){
            System.out.print(newarr[i]+" ");
        }
}
*/
  
