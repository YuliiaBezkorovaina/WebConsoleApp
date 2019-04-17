package model;

import view.View;

public class Ball extends Toy implements Game {

    @Override
    public void play(View view) {
        view.play(this);
    }

    @Override
    public int price() {
        return -1;
    }
}
