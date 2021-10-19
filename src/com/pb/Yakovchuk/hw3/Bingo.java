package com.pb.Yakovchuk.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        int x;
        int i;
        System.out.println("Игра  Bingo - угадай число");
        i = Random.nextInt(101);
        Scanner in = new Scanner(System.in);
            while () {
                System.out.println("Введите число от 0 до 100");
                x = in.nextInt();
                if (i = x){
                   System.out.println("Вы угадали число, поздравляю!");
                }
                else {
                    if (x < i) {
                        System.out.println("Загаданное число быльше введенного, повторите попытку");
                    }
                    else{
                        System.out.println("Загаданное число меньше введенного, повторите попыткку");
                    }
                }
            }


    }
}
