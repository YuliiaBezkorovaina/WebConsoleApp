package controller;

import model.children.Age;
import model.children.Child;
import model.children.Play;
import model.toys.*;
import model.GameRoom;
import view.View;

import java.util.LinkedList;

public class Controller {
    GameRoom gameRoom;
    View view;

    /**
     *
     * @param gameRoom instance of class GameRoom
     *               @see GameRoom
     * @param view instance of class View
     * @see view.View
     */
    public Controller(GameRoom gameRoom, View view) {
        this.gameRoom = gameRoom;
        this.view = view;
    }
    public void run(){
        /*for(int i = 0; i < 13; i++) {
            Toy newToy = new Toy();
           newToy.setSizeToys(SizeToys.values()[i % 3]);
           newToy.setType(TypeToys.values()[i % 3]);
            gameRoom.addToy(newToy);
        }
        //gameRoom.getToys().forEach(System.out::println);


        LinkedList<Child> children = new LinkedList<>();

        for(int i = 0; i < 13; i++) {
            Child newChild = new Child(Age.values()[i % 3], new Integer(i).toString());
            gameRoom.setChild(newChild);
        }

        gameRoom.getChildrens().forEach(System.out::println);


        for (Game toy: gameRoom.getToys()) {
            view.play(toy.play());
        }

        for (Play child:gameRoom.getChildrens()
             ) {

        }

        gameRoom.getToys().stream().filter(t->t.getSizeToy()==SizeToys.SMALL).forEach(System.out::println);*/
    }
}
