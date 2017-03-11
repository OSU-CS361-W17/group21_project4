package edu.oregonstate.cs361.battleship;

/**
 * Created by michaelhilton on 1/8/17.
 */
public class Coordinate {
    private int Across;
    private int Down;

    public Coordinate(int letter, int number) {
        Across = letter;
        Down = number;
    }

    @Override
    public boolean equals(Object object){
        boolean isEqual = false;
        if (object != null && object instanceof Coordinate){
            isEqual = (this.Across == ((Coordinate) object).Across && this.Down == ((Coordinate) object).Down);
        }
        return isEqual;
    }

    public int getDown() {
        return Down;
    }

    public void setDown(int down) {
        Down = down;
    }

    public int getAcross() {
        return Across;
    }

    public void setAcross(int across) {
        Across = across;
    }
}
