package org.example;

public class Codd03_09 {
    public static void main(String[] args) {
        int num = 20;
        num++;
        System.out.print(num + " ");
        num--;
        System.out.print(num + " ");
        num += 3;
        System.out.print(num + " ");
        num -= 3;
        System.out.print(num + " ");
        num *= 3;
        System.out.print(num + " ");
        num /= 3;
        System.out.print(num + " ");
        num %= 3;
        System.out.print(num + " ");

        System.out.println(++num + "");
        System.out.println(num++ + "");
        System.out.println(num + "");

        System.out.print(--num + "");

        System.out.print(num-- + "");
    }
}
