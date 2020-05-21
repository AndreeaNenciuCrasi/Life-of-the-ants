package com.company;

public class Wasp extends Ant implements Motion{

    public Wasp(int positionX, int positionY) {
        super("&", positionX, positionY);
    }

    @Override
    public int distanceToQueen() {
        return getPositionX()-1 + getPositionY()-1;
    }
}
