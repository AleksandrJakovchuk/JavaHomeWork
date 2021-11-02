package com.pb.Yakovchuk.hw5;

public class Library {
    public static void main(String[] args) {

        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();

        Reader reader1 = new Reader();
        Reader reader2 = new Reader();
        Reader reader3 = new Reader();
        reader1.fio = "Petrov O. S.";
        reader2.fio = "Ivanov I. I.";
        reader3.fio = "Sidorov A. V.";
        book1.name_book = "Приключения";
        book2.name_book = "Ужасы";
        book3.name_book = "Вестерн";
        book1.avtor = "Миронок В.И";
        book2.avtor = "Смирнов И.В.";
        book3.avtor = "Сидоров П.М.";
        book1.year = "2010";
        book2.year = "2020";
        book3.year = "2015";

    }
}
