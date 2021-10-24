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
    System.out.println("Массив");
    for (int i=0; i< mas.length; i++)
        System.out.print(mas[i]+" ");
    int n = mas.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                 if (mas[j] > mas[j+1]) {
                     int temp = mas[j];
                     mas[j] = mas[j+1];
                     mas[j+1] = temp;
                 }
    int s_min = 0;
    int s_plus = 0;
    for (int i=0; i< mas.length; i++) {
        if (mas[i] < 0) s_min = s_min + 1;
        if (mas[i] > 0) s_plus = s_plus + 1;
    }
    System.out.println(" ");
    System.out.println("Отсортированный массив");
    for (int i=0; i< mas.length; i++)
         System.out.print(mas[i]+" ");
    System.out.println(" ");
    System.out.println("Количество элементов массива меньше 0  " + s_min);
    System.out.println("Количество элементов массива больше 0  " + s_plus);
    System.out.println("Максимальное число массива  " + max);
    System.out.println("Сумма элементов массива " + sum);
    }
}
