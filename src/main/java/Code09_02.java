import java.util.Scanner;

public class Code09_02 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int[] numAry = new int[5];
        int hap = 0;

        System.out.println("숫자 : ");
        numAry[0] = s.nextInt();
        System.out.println("숫자 : ");
        numAry[1] = s.nextInt();
        System.out.println("숫자 : ");
        numAry[2] = s.nextInt();
        System.out.println("숫자 : ");
        numAry[3] = s.nextInt();
        System.out.println("숫자 : ");
        numAry[4] = s.nextInt();
        hap = numAry[0] + numAry[1] + numAry[2] + numAry[3] + numAry[4];
        System.out.println("합계 ==>" + hap);

        s.close();

    }
}
