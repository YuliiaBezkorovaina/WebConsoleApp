package model.toys;

public class Toy implements Game{
     private SizeToys sizeToys;
     private boolean state;

    public SizeToys getSizeToys() {
        return sizeToys;
    }

    public void setSizeToys(SizeToys sizeToys) {
        this.sizeToys = sizeToys;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return play();
    }

    @Override
    public String play() {
        return "play" + sizeToys.name();
    }

    @Override
    public boolean isPlaying() {
        return state;
    }

    @Override
    public SizeToys getTypeToy() {
        return sizeToys;
    }
}
