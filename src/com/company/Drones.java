package com.company;

public class Drones extends Ant implements CalculateDistance {

    public Drones(String name, int positionX, int positionY) {
        super(name, positionX, positionY);
    }


    @Override
    void move() {
        if (getPositionX() > 0) {
            setPositionX(getPositionX() - 1);
        } else if (getPositionX() == 0 && getPositionY() > 3) {
            setPositionY(getPositionY() - 1);
        }
    }

        public void mating ( boolean mood){
            int stepsToQueen = distanceToQueen(this);
            if (mood && stepsToQueen == 3) {
                System.out.println("HALLELUJAH");
            } else if (!mood && stepsToQueen == 3) {
                System.out.println("D’OH");
            }
        }

}
