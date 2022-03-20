/*Given an array of numbers, :find the maximum sum of any contiguous subarray of
the array. For example, given the array [34, -50, 42, 14, -5, 86], the maximum
sum would be 137, since we would take elements 42, 14, -5, and 86. Given the array
[ -5, -1, -8, -9], the maximum sum would be 0, since we would choose not to
take any elements. */

import  java.util.Scanner;

public class CalculatingMaxSubarray {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int sum=arr[0],max=arr[0];
         for(int i=0;i<n;i++){
             sum = Math.max(sum + arr[i],arr[i]);
             if(sum>max){
                 max = sum;
             }
         }

         System.out.print(max);
    }
}
