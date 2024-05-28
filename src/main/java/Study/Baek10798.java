import java.util.Scanner;

public class Baek10798 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String [][] arr = new String[5][15];
        String a;

        for (int i = 0; i < 5; i++) {
            a = s.nextLine();
            for (int j = 0; j < a.length(); j++) {

                arr[i][j] = String.valueOf(a.charAt(j));
            }
        }

        for (int i=0; i<15; i++){
            for (int j = 0; j < 5; j++) {
                if(arr[j][i] != null) {
                    System.out.print(arr[j][i]);
                }
            }
        }
    }
}
