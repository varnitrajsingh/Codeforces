import java.util.*;
public class Bitpp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n=0;
        while(t!=0){
            String str = sc.next();
            if(str.equals("++X") || (str.equals("X++"))){
                n++;
            }
            else {
                n--;
            }
            t--;
            
        }
        System.out.println(n);
        sc.close();

    }
}
