import java.util.*;
public class Dominos{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int result;
        result = (m*n)/2;
        System.out.println(result);
        sc.close();
        
    }
}