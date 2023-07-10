import java.util.Scanner;
import java.util.HashSet;

public class BoyorGirl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        HashSet<Character> uniqueCharacters = new HashSet<>();

        for(int i =0; i < str.length(); i++){
            uniqueCharacters.add(str.charAt(i));
        }

        if(uniqueCharacters.size() % 2 == 0){
            System.out.println("CHAT WITH HER!");
        }else{
            System.out.println("IGNORE HIM!");
        }

        sc.close();
    }
}
