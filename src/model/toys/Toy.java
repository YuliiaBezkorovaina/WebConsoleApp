package model.toys;

public abstract class Toy implements Game{
     private SizeToys sizeToys;
     private boolean play;

    @Override
    public boolean isPlaying() {
        return play;
    }

    public void setPlay(boolean play) {
        this.play = play;
    }

    @Override
    public SizeToys getSizeToy() {
        return sizeToys;
    }

    public SizeToys getSizeToys() {
        return sizeToys;
    }



}
