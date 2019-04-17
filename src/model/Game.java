package model;

import com.sun.istack.internal.NotNull;
import view.View;

public interface Game {
    public int price();
    @NotNull
    void play(View view);
}
