package com.pb.Yakovchuk.hw4;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s;
        String s1;
        System.out.println("Введите первую строку ");
        s = in.nextLine();
        System.out.println("Введите вторую строку ");
        s1 = in.nextLine();
        if (isAnagram(s,s1)) {
            System.out.println("Введённые строки анагрмамма");
        }
        else System.out.println("Введённые строки не анагрмамма");

    }
    public static boolean isAnagram(String firstline, String secondline) {
        char[] char1 = firstline.replaceAll("[\\s]", "").toCharArray();
        char[] char2 = secondline.replaceAll("[\\s]", "").toCharArray();
        for (int i = 0; i < firstline.length()-1; i++){
            char1[i] = Character.toUpperCase(char1[i]);
            }
        for (int i = 0; i < secondline.length()-1; i++){
            char2[i] = Character.toUpperCase(char2[i]);
        }
        Arrays.sort(char1);
        Arrays.sort(char2);
        //if (firstline.length()!=secondline.length()) {return false;}
        //else {
        //    for (int i = 0; i < firstline.length(); i++) {
        //        if (char1[i] == char2[i]) continue;
        //        else {return false;}
        //        }
        //    }
        return Arrays.equals(char1, char2);
    }

}
