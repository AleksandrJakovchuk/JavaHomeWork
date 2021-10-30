package com.pb.Yakovchuk.hw4;

import java.util.Scanner;

public class CapitalLetter {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        String s;
        String s1;
        System.out.println("Введите строку ");
        s = in.nextLine();
        s1 = Stroka(s);
        System.out.println("Строка з словами с Большой буквы: " + s1);
    }
    static String Stroka(String s1){

        char[] chars = s1.toCharArray();

        chars[0] = Character.toUpperCase(chars[0]);

        for (int i = 1; i < s1.length(); i++){
            if (chars[i] == ' ') {
                chars[i+1] = Character.toUpperCase(chars[i+1]);

            }
        }

        s1= new String(chars);
        return s1;
    }
}
