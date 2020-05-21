package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Worker extends Ant implements CalculateDistance {

    public Worker(String name, int positionX, int positionY) {
        super(name, positionX, positionY);
    }


    @Override
    void move() {
        List<String> randomStep = new ArrayList<String>();
        randomStep.add("north");
        randomStep.add("south");
        randomStep.add("west");
        randomStep.add("east");
        String random = randomStep.get(new Random().nextInt(randomStep.size()));

        switch (random) {
            case "north":
                if (getPositionY() - 1 >=0){
                setPositionY(getPositionY() - 1);
                    System.out.println(this.getName() + " moves north");}
                break;
            case "south":
                if(getPositionY() +1 <= 29){
                setPositionY(getPositionY() + 1);
                    System.out.println(this.getName() + " moves south");}
                break;
            case "west":
                if (getPositionX() - 1 >=0){
                setPositionX(getPositionX() - 1);
                    System.out.println(this.getName() + " moves west");}
                break;
            case "east":
                if (getPositionX() + 1 <= 29){
                setPositionX(getPositionX() + 1);
                    System.out.println(this.getName() + " moves east");}
                break;
            default:
                System.out.println("Can't move");
        }
    }

}
