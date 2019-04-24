package controller;

import model.GameRoom;
import model.children.Child;
import model.children.Player;
import model.toys.Ball;
import model.toys.Game;
import model.toys.SizeToys;
import model.toys.Toy;
import view.View;

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
        GameRoom gameroom = new GameRoom();

        for (Info info: Info.values()
             ) {
            gameroom.setGame(new Child(info.getAge(), info.getNameChild()), info.getToy());
        }
        System.out.println(View.bundle.getString("ALL_PRINT"));
        gameroom.getGame().forEach((k,v)->System.out.println(
                View.bundle.getString(k.getAge().name())+
                        " "+
                k.getName()+
                " "+
                View.bundle.getString(v.play())+" "+
                View.bundle.getString(v.getSizeToy().name())+" "+
                View.bundle.getString(v.getClass().toString().replace("class ","").toUpperCase())));

        System.out.println(View.bundle.getString("BEFORE_SORT"));
        gameroom.
                getGame().
                values().
                stream().
                forEach(v->System.out.println(
                        View.bundle.getString(v.getClass().toString().replace("class ","").toUpperCase())+
                                " "+
                                View.bundle.getString(v.getSizeToy().name()))
                );

        System.out.println(View.bundle.getString("AFTER_SORT"));
        gameroom.
                getGame().
                values().
                stream().
                sorted().
                forEach(v->System.out.println(
                        View.bundle.getString(v.getClass().toString().replace("class ","").toUpperCase())+
                                " "+
                                View.bundle.getString(v.getSizeToy().name()))
                );
        System.out.println(View.bundle.getString("ALON"));
        gameroom.
                getGame().
                values().
                stream().
                filter(i->i.isPlaying()== false).
                forEach(v-> System.out.println(
                        View.bundle.getString(v.getClass().toString().replace("class ","").toUpperCase())
                        )
                );
    }


}
