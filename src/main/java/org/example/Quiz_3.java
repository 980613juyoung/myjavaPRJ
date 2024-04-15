package org.example;

import java.util.Scanner;

public class Quiz_3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int hap = 0;

        if (a < b) {
            for (int i = a; i <= b; i++) {
                if (i % 2 != 0) {
                    hap += 1;
                }


            }
        } else if (a > b) {
            for (int i = a; i >= b; i--) {
                if (i % 2 != 0) {
                    hap += i;
                }
            }
        }
    }
}
