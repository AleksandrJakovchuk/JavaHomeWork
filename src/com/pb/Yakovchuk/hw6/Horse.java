package com.pb.Yakovchuk.hw6;

import java.util.Objects;

public class Horse extends Animal {
    String food;
    String location;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animals = (Animal) o;
        return Objects.equals(food, animals.food) && Objects.equals(location, animals.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(food, location);
    }

    @Override
    public String toString() {
        return "Конь {" +
                "питается" + food + '\'' +
                ", находится" + location +
                '}';
    }
}
