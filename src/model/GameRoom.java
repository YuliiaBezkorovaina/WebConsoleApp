package model;

import model.children.Child;
import model.toys.Game;
import java.util.LinkedList;

public class GameRoom {
    LinkedList<Game> toys;
    LinkedList<Child> childrens;

    public GameRoom(){
        this.toys = new LinkedList<Game>();
        this.childrens = new LinkedList<Child>();
    }

    public void addToy(Game toy){toys.add(toy);}

    public LinkedList<Game> getToys(){return toys;}

    public LinkedList<Child> getChildrens() {
        return childrens;
    }

    public void setChildrens(LinkedList<Child> childrens) {
        this.childrens = childrens;
    }

    public void setChild(Child child){this.childrens.add(child);}
}
