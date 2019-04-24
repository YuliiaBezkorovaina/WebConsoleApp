package model.toys;

public class Car extends Toy {

    public Car(SizeToys sizeToys, boolean play) {
        super(sizeToys, play);
    }

    @Override
    public String play() {
        return "CAR_PLAY";
    }
}
