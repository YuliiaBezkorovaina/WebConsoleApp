package controller;

import model.children.Age;
import model.children.Child;
import model.children.Play;
import model.toys.*;
import model.GameRoom;
import view.View;

import java.util.Comparator;
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
        gameRoom.addToy(new Toy());


        LinkedList<Child> children = new LinkedList<>();
        children.add(new Child(Age.LITTLE, "Vasia"));
        children.add(new Child(Age.AVERAGE, "Maria"));
        children.add(new Child(Age.AVERAGE, "John"));
        gameRoom.setChildrens(children);

        /*gameRoom.getChildrens().stream()
                .filter(i -> i.getAge()==Age.LITTLE)
                .forEach(child -> child.play(gameRoom.getToys().stream().filter(t->(t.isPlaying()==false && t.getTypeToy()==SizeToys.SMALL))));
*/
        for (Game toy: gameRoom.getToys()) {
            //view.play(toy.play());
        }

        for (Play child:gameRoom.getChildrens()
             ) {

        }

        gameRoom.getToys().stream().filter(t->t.getTypeToy()==SizeToys.SMALL).forEach(System.out::println);
    }
}
