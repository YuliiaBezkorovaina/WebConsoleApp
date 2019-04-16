package model;

import view.View;

public class Car implements Game {
    private int price;

    @Override
    public void play(View view) {
        view.play(this);
    }

    @Override
    public int price() {
        return price;
    }
}