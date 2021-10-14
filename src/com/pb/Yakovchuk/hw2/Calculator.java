package com.pb.Yakovchuk.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int operand1;
        int operand2;
        int resolt;
        char sing;

        System.out.println("Введите оператор 1   ");
        operand1 = in.nextInt();

        System.out.println("Введите оператор 2   ");
        operand2 = in.nextInt();

        System.out.println("Арифметическая функция +, -, *, /  ");
        sing = in.next().charAt(0);
        if (operand2 != 0){
        switch (sing) {
            case '*':
                resolt = operand1 * operand2;
                break;
            case '+':
                resolt = operand1 + operand2;
                break;
            case '-':
                resolt = operand1 - operand2;
                break;
            case '/':
                resolt = operand1 / operand2;
                break;
            default:
                System.out.println("Результат не возможно вычислить");
                return;
        }
                }
        else {
            switch (sing) {
                case '*':
                    resolt = 0;
                    break;
                case '+':
                    resolt = operand1 + operand2;
                    break;
                case '-':
                    resolt = operand1 - operand2;
                    break;
                default:
                    System.out.println("Результат не возможно вычислить");
                return;
            }
        }
                System.out.println("Результат" + resolt);
            }
        }



