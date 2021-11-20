package com.pb.Yakovchuk.hw8;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class OnlineShop {
    public static void main(String[] args){
    String login;
    String password;
    String confimPassword;
    System.out.println("Для регистрации введите логин");
    Scanner in = new Scanner(System.in);
    login = in.nextLine();
    System.out.println("Для регистрации введите пароль");
    password= in.nextLine();
    System.out.println("Повторите введение пароля");
    confimPassword = in.nextLine();

    try {
        Auth.singUp(login, password, confimPassword);
    }
    catch (WrongLoginException e) {
        System.out.println("логин не подходит " + e.getMessage());
    }
    catch (WrongPasswordException e) {
        System.out.println("пароль не подходит " + e.getMessage());
    }

    Auth.login = login;
    Auth.password = password;
    System.out.println("Для входа на сайт введите логин");
    login = in.nextLine();
    System.out.println("Для входа на сайт введите пароль");
    password= in.nextLine();
    Auth.singIn(login, password);
    }



}
