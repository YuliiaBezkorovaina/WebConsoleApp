package model;

import model.toys.Ball;
import model.toys.Car;
import model.toys.Doll;
import model.toys.Game;
import java.util.LinkedList;

public class GameRoom {
    LinkedList<Game> toys;
    public GameRoom(){this.toys = new LinkedList<Game>();}

    public void addBall(){toys.add(new Ball());}
    public  void addDoll(){toys.add(new Doll());}
    public void addCar(){toys.add(new Car());}

    public LinkedList<Game> getToys(){return toys;}
}
