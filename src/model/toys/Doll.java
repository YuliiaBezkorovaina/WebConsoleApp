package model.toys;

public class Doll extends Toy {
    public Doll(SizeToys sizeToys, boolean play) {
        super(sizeToys, play);
    }

    @Override
    public String play() {
        return "DOLL_PLAY";
    }
}
