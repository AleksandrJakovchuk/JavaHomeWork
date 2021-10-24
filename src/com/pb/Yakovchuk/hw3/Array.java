package com.pb.Yakovchuk.hw3;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    int[] mas = new int[10];
    int sum;

    int max;
    System.out.println("ведите 10 элементов массива");
    for (int i=0; i< mas.length; i++)
        mas[i] = in.nextInt();
    max = mas[0];
    for (int i=1; i< mas.length; i++)
        if (max < mas[i]) max = mas[i];
    sum = mas[0];
    for (int i=1; i< mas.length; i++)
        sum = sum + mas[i];
    System.out.println("Максимальное число массива  " + max);
    System.out.println("Сумма элементов массива " + sum);
    }
}
