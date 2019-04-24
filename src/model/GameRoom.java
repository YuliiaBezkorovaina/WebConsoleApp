package model;

import model.children.Player;
import model.toys.Game;

import java.util.LinkedHashMap;

public class GameRoom {
    LinkedHashMap<Player, Game>  game = new LinkedHashMap<>();

    public GameRoom() {
        this.game = new LinkedHashMap<>();
    }

    public void setGame(Player child, Game toy){
       game.put(child, toy);
   }

    public LinkedHashMap<Player, Game> getGame() {
        return game;
    }
}
