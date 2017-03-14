package edu.oregonstate.cs361.battleship;

/**
 * Created by michaelhilton on 1/5/17.
 */
public class Ship {
    private String name;
    private int length;
    private boolean alive;
    private int health;
    private Coordinate start;
    private Coordinate end;

    public Ship(String n, int l, int h,Coordinate s, Coordinate e) {
        name = n;
        length = l;
        start = s;
        end = e;
        alive = true;
        health = h;
    }


    public void setLocation(Coordinate s, Coordinate e) {
        start = s;
        end = e;
    }

    public void makeDed(){
        alive = false;
    }

    public void decHealth(){
        health --;
    }

    public int getHealth(){
        return health;
    }

    public boolean covers(Coordinate test) {
        //horizontal
        if(start.getAcross() == end.getAcross()){
            if(test.getAcross() == start.getAcross()){
                if((test.getDown() >= start.getDown()) &&
                (test.getDown() <= end.getDown()))
                return true;
            } else {
                return false;
            }
        }
        //vertical
        else{
            if(test.getDown() == start.getDown()){
                if((test.getAcross() >= start.getAcross()) &&
                        (test.getAcross() <= end.getAcross()))
                    return true;
            } else {
                return false;
            }

        }
        return false;
    }

    public boolean isAlive() {
        return alive;
    }

    public int getLength() {return length; }

    public String getName() {
        return name;
    }

    public Coordinate getStart() { return start; }
    public Coordinate getEnd() { return end; }


    public boolean scan(Coordinate coor) {
        if(covers(coor)){
            return true;
        }
        if(covers(new Coordinate(coor.getAcross()-1,coor.getDown()))){
            return true;
        }
        if(covers(new Coordinate(coor.getAcross()+1,coor.getDown()))){
            return true;
        }
        if(covers(new Coordinate(coor.getAcross(),coor.getDown()-1))){
            return true;
        }
        if(covers(new Coordinate(coor.getAcross(),coor.getDown()+1))){
            return true;
        }
        return false;
    }
}