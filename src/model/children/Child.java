package model.children;

import model.toys.Toy;

public class Child implements Player {
private Age age;
private String Name;

    public Child(Age age, String name) {
        this.age = age;
        Name = name;
    }
    @Override
    public Age getAge() {
        return age;
    }

    @Override
    public String getName() {
        return Name;
    }

}
