import java.util.ArrayList;
import java.util.Scanner;
public class NoOfSmallerElementsToRight {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextInt()){
            arr.add(scan.nextInt());
        }
        int[] arrsr = new int[arr.size()];

        for(int i=0;i<arr.size()-1;i++){
            int count=0;
            System.out.println("hii");
            for(int j=i+1;j<arr.size();j++){
                if(arr.get(i)>arr.get(j)){
                    count++;
                }
            }
            arrsr[i] = count;
        }

        for(int i=0;i<arr.size();i++){
            System.out.print(arrsr[i]+" ");
        }
    }
}
