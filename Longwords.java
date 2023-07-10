import java.util.*;
public class Longwords{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0){
            String str = sc.next();
            int n = str.length();
            
            if( n <= 10){
                System.out.println(str);
                t--;
                continue;
            }
            String result = new String();
            result = str.charAt(0) + String.valueOf(n-2) + str.charAt(n-1);
            System.out.println(result);
            t--;
        }
        sc.close();
    }
}