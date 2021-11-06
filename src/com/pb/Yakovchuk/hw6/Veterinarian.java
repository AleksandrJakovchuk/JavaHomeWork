package com.pb.Yakovchuk.hw6;

public class Veterinarian {
    Animal animal = new Animal();

    public static void treamAnimal (){
        Animal animal = new Animal();
        System.out.println("На приеме у ветеринара" + animal.food + " " + animal.location);
    }
}
