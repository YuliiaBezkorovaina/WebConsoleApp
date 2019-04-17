package controller;

import model.Game;
import model.GameRoom;
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
        gameRoom.addBall();
        gameRoom.addBall();
        gameRoom.addCar();
        gameRoom.addDoll();
        for (Game toy: gameRoom.getToys()
             ) {
            toy.play(view);

        }
    }
}
