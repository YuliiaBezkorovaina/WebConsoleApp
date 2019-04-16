package controller;

import model.Game;
import model.Model;
import view.View;

public class Controller {
    Model model;
    View view;

    /**
     *
     * @param model instance of class Model
     *               @see model.Model
     * @param view instance of class View
     * @see view.View
     */
    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }
    public void run(){
        model.addBall();
        model.addBall();
        model.addCar();
        model.addDoll();
        for (Game toy: model.getToys()
             ) {
            toy.play(view);

        }
    }
}
