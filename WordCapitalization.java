import java.util.Scanner;

public class WordCapitalization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String firstLetter = str.substring(0,1);
        firstLetter = firstLetter.toUpperCase();
        System.out.println(firstLetter + str.substring(1,str.length()));
        sc.close();
    }
}
