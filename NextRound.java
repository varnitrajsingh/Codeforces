import java.util.*;

public class NextRound{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n,k;
        n = scan.nextInt();
        k = scan.nextInt();

        if(n >= k){
            int arr[] = new int[n];
            int count = 0;
            for(int i =0; i < n; i++){
                arr[i] = scan.nextInt();
            }

            for(int i =0; i < n; i++){
                if(arr[i] >= arr[k-1] && arr[i] > 0){
                    count++;
                }
            }

            System.out.println(count);

        }

        scan.close();
    }
}