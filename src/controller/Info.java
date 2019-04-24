package controller;

import model.children.Age;
import model.toys.*;

public enum Info {

    Game1("Vasia", Age.LITTLE, new Ball(SizeToys.SMALL, false)),
    Game2("Maria", Age.LITTLE, new Car(SizeToys.SMALL, true)),
    Game3("Maks", Age.AVERAGE, new Doll(SizeToys.AVERAGE, true)),
    Game4("Vasia", Age.AVERAGE, new Block(SizeToys.AVERAGE, true)),
    Game5("Olga", Age.UNDERAGE, new Ball(SizeToys.SMALL, false)),
    Game6("Yulia", Age.UNDERAGE, new Car(SizeToys.SMALL, true)),
    Game7("Petya", Age.AVERAGE, new Doll(SizeToys.BIG, true)),
    Game8("Ivan", Age.AVERAGE, new Block(SizeToys.SMALL, true)),
    Game9("Olga", Age.UNDERAGE, new Ball(SizeToys.BIG, true)),
    Game10("Yulia", Age.UNDERAGE, new Car(SizeToys.AVERAGE, false)),
    Game11("Petya", Age.AVERAGE, new Doll(SizeToys.SMALL, true)),
    Game12("Ivan", Age.AVERAGE, new Block(SizeToys.BIG, true))
    ;

    private String nameChild;
    private Age age;
    private Game toy;

    Info(String name, Age age, Game toy) {
        nameChild = name;
        this.age = age;
        this.toy = toy;
    }

    public String getNameChild() {
        return nameChild;
    }

    public Age getAge() {
        return age;
    }

    public Game getToy() {
        return toy;
    }
}
