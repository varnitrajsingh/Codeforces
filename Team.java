import java.util.*;

public class Team{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 0;
        
        while(n != 0){
            int p,v,t;
            p = scan.nextInt();
            v = scan.nextInt();
            t = scan.nextInt();
            if(p+v+t >= 2){
                count++;
            }
            n--;
        }

        System.out.println(count);

        scan.close();
    }
}