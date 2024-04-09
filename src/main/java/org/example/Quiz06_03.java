package org.example;

import java.util.Scanner;

public class Quiz06_03 {
    public static void main(String[] args) {
        int a, b;
        Scanner s = new Scanner(System.in);

        a = s.nextInt();
        b = s.nextInt();

        if (a > b) {
            for (int i = a; i > b; i--) {
                if (i % 3 == 0) {
                    System.out.println(i);

                }
            }
        } else {
            for (int i = a; i < b; i++) {
                if (i % 3 == 0) {
                    System.out.println(i);
                }
            }

        }

    }
}
