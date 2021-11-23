package com.pb.Yakovchuk.hw9;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Random;

public class FileNumbers {
    public static void creatNumbersFile() {
        FileOutputStream fs = null;
        PrintStream ps = null;
        String [] array = new String[10];
        int [] mas = new int[10];
        Random randnew = new Random();
        for (int j=0; j<10; j++) {
            array[j]=null;
            for (int i = 0; i < mas.length; i++) {
                mas[i] = randnew.nextInt(101);
                array[j] = array[j] + " " + mas[i];
            }
        }
        try {
            fs = new FileOutputStream("numbers.txt");
            ps = new PrintStream(fs);
            for (int i = 0; i < 10; i++)
                ps.println(array[i]);
        }
        catch (IOException e){
            System.out.println("I/O error: " + e);
        }

    }
    public static void creatOddNumbersFile() {

    }
    public static void main(String[] args) {
        creatNumbersFile();
    }
}
