package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Worker extends Ant implements Motion{

    public Worker(String name, int positionX, int positionY) {
        super(name, positionX, positionY);
    }

    @Override
    public int distanceToQueen() {
        return getPositionX()-1 + getPositionY()-1;
    }

    public void randomMove(){
        List<String> randomStep = new ArrayList<String>();
        randomStep.add("north");
        randomStep.add("south");
        randomStep.add("west");
        randomStep.add("east");
        String random = randomStep.get(new Random().nextInt(randomStep.size()));

        switch (random) {
            case "north":
                if (getPositionY() - 1 >=0){
                setPositionY(getPositionY() - 1);}
                break;
            case "south":
                if(getPositionY() +1 <= 49){
                setPositionY(getPositionY() + 1);}
                break;
            case "west":
                if (getPositionX() - 1 >=0){
                setPositionX(getPositionX() - 1);}
                break;
            case "east":
                if (getPositionX() + 1 <= 49){
                setPositionX(getPositionX() + 1);}
                break;
            default:
                System.out.println("Can't move");
        }
    }

}
