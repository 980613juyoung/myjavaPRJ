package org.example;

public class Code04_00 {
    public static void main(String[] args) {

        String str = "  한글  ABCD  efgh  ";
        String uppre = "";
        String lower = "";
        String curStr = "";

        uppre = str.toUpperCase();
        lower = str.toLowerCase();
        curStr = str.trim();

        System.out.println("기존 문자열 ==>["+ str +"]");
        System.out.println("대문자 ==> ["+ uppre +"]");
        System.out.println("소문자 ==> ["+lower +"]");
        System.out.println("공백제거 ==> ["+ curStr +"]");

    }
}
