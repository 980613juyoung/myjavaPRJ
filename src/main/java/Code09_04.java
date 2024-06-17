public class Code09_04 {
    public static void main(String[] args) {
        int a1[] = {100,200,300,400};
        int a2[] = new int[] {100,200,300};
        int a3[];
         a3 = new int[] {100,200};
        int [] a4 = new int[1];
        a4[0] = 100;

        for (int i = 0; i<a1.length; i++){
            System.out.printf("a1[%d] ==> %d\t",i,a1[i]);

        }System.out.println();

        for (int i = 0; i<a2.length; i++){
            System.out.printf("a2[%d] ==> %d\t",i,a2[i]);

        }System.out.println();
        for (int i = 0; i<a3.length; i++){
            System.out.printf("a3[%d] ==> %d\t",i,a3[i]);

        }System.out.println();
        for (int i = 0; i<a4.length; i++){
            System.out.printf("a4[%d] ==> %d\t",i,a4[i]);

        }System.out.println();
    }
}
