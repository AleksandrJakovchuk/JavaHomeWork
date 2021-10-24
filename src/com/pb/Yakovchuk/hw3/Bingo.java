package com.pb.Yakovchuk.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        int x;
        int i;
        int counter = 0;
        String s;
        System.out.println("Игра  Bingo - угадай число");
        Random randnew = new Random();
        i = randnew.nextInt(101);
        Scanner in = new Scanner(System.in);
            while (true) {
                counter++;
                System.out.println("Введите число от 1 до 100. Для прекращения игры введите stop. Попытка " + counter);
                s = in.next();
                if (s.equals("stop"))
                    break;

                x = Integer.parseInt(s);

                if (i == x) {
                   System.out.println("Вы угадали число, поздравляю!");
                   break;
                }
                if (x < i) {
                        System.out.println("Загаданное число быльше введенного, повторите попытку");
                        }
                if (x > i) {
                        System.out.println("Загаданное число меньше введенного, повторите попыткку");

                    }
                }
            System.out.println("Количество попыток " + counter);
            System.out.println("Игра завершена");
            }

    }

