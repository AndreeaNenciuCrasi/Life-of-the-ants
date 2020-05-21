package com.company;

import java.util.Random;

public class Drones extends Ant implements CalculateDistance {

    public Drones(String name, int positionX, int positionY) {
        super(name, positionX, positionY);
    }


    @Override
    void move() {
        if (getPositionX() > 0) {
            setPositionX(getPositionX() - 1);
            System.out.println(this.getName() + " moving west towards the queen");
        } else if (getPositionX() == 0 && getPositionY() > 3) {
            setPositionY(getPositionY() - 1);
            System.out.println(this.getName() + " moving north towards the queen");
        }
    }

    public int getDistanceToQueen() {
        return distanceToQueen(this);
    }

    public void setRandomPosition(){
        int randomX = (int)(Math.random() * 30 + 1);
        int randomY = (int)(Math.random() * 30 + 1);
        setPositionY(randomY);
        setPositionX(randomX);
    }

}
