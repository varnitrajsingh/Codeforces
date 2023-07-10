import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int mat[][] = new int[5][5];
        int x =0,y=0;
        for(int i =0; i < 5; i++){
            for(int j =0; j < 5; j++){
                mat[i][j] = scan.nextInt();
                if(mat[i][j] == 1){
                    x = i;
                    y = j;
                }
            }
        }

        int result = Math.abs(2-x) + Math.abs(2-y);

        System.out.println(result);

        scan.close();
    }
}
