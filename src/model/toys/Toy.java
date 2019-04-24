package model.toys;

public abstract class Toy implements Game, Comparable{
     private SizeToys sizeToys;
     private boolean play;

    public Toy(SizeToys sizeToys, boolean play) {
        this.sizeToys = sizeToys;
        this.play = play;
    }

    @Override
    public boolean isPlaying() {
        return play;
    }

    @Override
    public SizeToys getSizeToy() {
        return sizeToys;
    }

    @Override
    public int compareTo(Object o) {
        if (this == o) return 0;
        Toy t = (Toy)o;
        if (this.getClass().toString().compareTo(t.getClass().toString())==0) return this.sizeToys.compareTo(t.sizeToys);
        return this.getClass().toString().compareTo(t.getClass().toString());
    }
}
