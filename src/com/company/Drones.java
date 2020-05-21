package com.company;

public class Drones extends Ant implements Motion {

    public Drones(String name, int positionX, int positionY) {
        super(name, positionX, positionY);
    }

    @Override
    public int distanceToQueen() {
        return getPositionX() - 1 + getPositionY() - 1;
    }

    public void move(boolean mood) {
        int stepsToQueen = distanceToQueen();
        if (getPositionX() > 0) {
            setPositionX(getPositionX() - 1);
        } else if (getPositionX() == 0 && getPositionY() > 3) {
            setPositionY(getPositionY() - 1);
        } else {
            if (mood && stepsToQueen == 3) {
                System.out.println("HALLELUJAH");
            } else if (!mood && stepsToQueen == 3) {
                System.out.println("D’OH");
            }
        }
    }
}
