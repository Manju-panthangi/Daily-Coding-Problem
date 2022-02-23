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

}
