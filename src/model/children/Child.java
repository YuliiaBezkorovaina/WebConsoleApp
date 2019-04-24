package model.children;

import com.sun.istack.internal.NotNull;
import model.toys.Toy;

public class Child implements Play{
private Age age;
private String Name;

    public Child(Age age, String name) {
        this.age = age;
        Name = name;
    }

    public Age getAge() {
        return age;
    }

    public void setAge(Age age) {
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "age " + age +
                " Name is " + Name;
    }

    @Override
    public void play(@NotNull Toy toy) {
        toy.play();
    }

}
