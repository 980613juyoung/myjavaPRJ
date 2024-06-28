import java.util.Arrays;
import java.util.Comparator;

public class Code09_08 {
    public static void main(String[] args) {
        int[] numAry = {616, 15151, 4545, 4545474, 11, 844, 566, 566};
        Arrays.sort(numAry);
        for (int data : numAry) {
            System.out.print(data + " ");
        }
        System.out.println();

        Integer[] strAry = {11,22,34,54,87,97,64};
        Arrays.sort(strAry, Comparator.reverseOrder());
        for (int data : strAry) {
            System.out.print(data + " ");
        }
    }
}
