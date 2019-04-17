package view;

import model.Ball;
import model.Car;
import model.Doll;
import model.Game;

import java.util.Locale;
import java.util.ResourceBundle;

public class View {
    public static ResourceBundle bundle;

    static {
        bundle = ResourceBundle.getBundle("language",
                //new Locale("ua", "UA"));
                //new Locale("en", "USA"));
                new Locale("ru", "RU"));
    }

    public void play(Game game){
        if (game instanceof Car){
        System.out.println(bundle.getString("CAR_PLAY"));}
        if (game instanceof Doll){
            System.out.println(bundle.getString("DOLL_PLAY"));}
        if (game instanceof Ball){
            System.out.println(bundle.getString("BALL_PLAY"));}
    }
}
