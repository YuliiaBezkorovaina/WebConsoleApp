package model;

import java.util.LinkedList;

public class Model {
LinkedList<Game> toys;
public Model(){this.toys = new LinkedList<Game>();}

public void addBall(){toys.add(new Ball());}
public  void addDoll(){toys.add(new Doll());}
public void addCar(){toys.add(new Car());}

public LinkedList<Game> getToys(){return toys;}
}
