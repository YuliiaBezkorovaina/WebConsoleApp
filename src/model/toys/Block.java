package model.toys;

public class Block extends Toy{
    public Block(SizeToys size, boolean play) {
        super(size, play);
    }

    @Override
    public String play() {
        return "BLOCK_PLAY";
    }
}
