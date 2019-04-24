package model.children;

import model.toys.Toy;

public interface Player {
    void play(Toy toy);
    String getName();
    Age getAge();
}
