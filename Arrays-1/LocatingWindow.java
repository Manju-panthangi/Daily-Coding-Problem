/*
Given an array of integers that are out of order, determine the bounds of the smallest
window that must be sorted in order for the entire array to be sorted. For example,
given [ 3 , 7 , 5 , 6 , 9] , you should return ( 1 , 3 ) .
*/


import java.util.*;

public class LocatingWindow {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n= scan.nextInt();
        int[] arr = new int[n];



        int[] sortedarr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
            sortedarr[i] = arr[i];
        }


        Arrays.sort(sortedarr);

        int s=-1 ,e=-1;

        for(int i=0;i<n;i++){
            if(arr[i]!=sortedarr[i] && s==-1){
                s=i;
            }
            else {
                if(arr[i]!=sortedarr[i]) {
                    e = i;
                }
            }
        }

        System.out.println(s+" "+e);

    }

    // Time: O(n)
    // Space: O(1)

    public static void findWindow(int[] arr, int n){
        int left=-1,right=-1;
        int maxSeen = Integer.MIN_VALUE,minSeen = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            maxSeen = Integer.max(maxSeen,arr[i]);
            if(arr[i]<maxSeen){
                right=i;
            }
        }

        for(int i=n-1;i>0;i--){
            minSeen = Integer.min(minSeen,arr[i]);
            if(arr[i]>minSeen){
                left=i;
            }
        }

        System.out.println(left+" "+right);

    }



}
