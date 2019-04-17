package model;

import com.sun.istack.internal.NotNull;
import view.View;

public class Car extends Toy implements Game {

    @Override
    public void play(View view) {
        view.play(this);
    }

    @Override
    public int price() {
        return -1;
    }
}
