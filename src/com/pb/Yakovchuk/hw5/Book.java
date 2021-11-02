package com.pb.Yakovchuk.hw5;

public class Book {
    String name_book;
    String avtor;
    String year;
    void takeBook(int kol){
        System.out.println("количество " + kol + " книг");
    }
    void takeBook(String name_book){
        System.out.println("книги " + name_book);
    }
    void takeBook(String name_book, String avtor, String year){
        System.out.println("название " + name_book + " " + avtor + " " + year);
    }
    void returnBook(int kol){
        System.out.println("количество " + kol + " книг");
    }
    void returnBook(String name_book){
        System.out.println("книги " + name_book);
    }
    void returnBook(String name_book, String avtor, String year){
        System.out.println("название " + name_book + " " + avtor + " " + year);
    }


}
