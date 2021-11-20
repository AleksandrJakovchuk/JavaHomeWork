package com.pb.Yakovchuk.hw8;

import java.util.regex.Pattern;

public class Auth {
    static String login;
    static String password;

    public static void singUp (String login1, String password1, String confirmPassword1)
    throws WrongLoginException, WrongPasswordException
    {
        if (!Pattern.matches("[a-zA-Z_0-9] {5,20}", login1)){
            throw new WrongLoginException();
        }
        else if (!Pattern.matches("[a-zA-Z_0-9] {5,}", password1)){
         throw new WrongPasswordException();
        }
        else if (!password1.equals(confirmPassword1)) {
            throw new WrongPasswordException();
        }
    }

    public static void singIn (String login2, String password2){
        if (login2.equals(login) && password2.equals(password)) {
            System.out.println("Логин и Пароль введены успешно");
        }

    }
}
