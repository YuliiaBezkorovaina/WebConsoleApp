package model.toys;

public class Ball extends Toy {

    public Ball(SizeToys size, boolean play) {
        super(size, play);
    }

    @Override
    public String play() {
        return "BALL_PLAY";
    }
}
