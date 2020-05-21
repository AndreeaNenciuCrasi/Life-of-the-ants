package com.company;

import java.util.ArrayList;
import java.util.List;

public class Soldier extends Ant implements CalculateDistance {
    private String direction = "north";
    private List<String> directionList;

    public Soldier(String name, int positionX, int positionY) {

        super(name, positionX, positionY);
        directionList.add("north");
        directionList.add("east");
        directionList.add("south");
        directionList.add("west");
    }

    @Override
    void move() {
        switch(direction){
            case ("north"):
                stepTowardsNorth();
                direction = "east";
                break;
            case ("east"):
                stepTowardsEast();
                direction = "south";
                break;
            case ("south"):
                stepTowardsSouth();
                direction = "west";
                break;
            case ("west"):
                stepTowardsWest();
                direction = "north";
                break;
        }
    }


    public void stepTowardsNorth(){
        setPositionY(getPositionY()-1);
    }

    public void stepTowardsSouth(){
        setPositionY(getPositionY() + 1);
    }

    public void stepTowardsWest(){
        setPositionX(getPositionX() -1);
    }

    public void stepTowardsEast(){
        setPositionX(getPositionX() + 1);
    }

    public void moveTowardsWasp(Wasp wasp){
        if(wasp.getPositionX() < getPositionX()) {
            setPositionX(getPositionX() - 1);
        }else if(wasp.getPositionX() > getPositionX()){
            setPositionX(getPositionX() + 1);
        }else if (wasp.getPositionX() == getPositionX()){
            if(wasp.getPositionY() < getPositionY()){
                setPositionY(getPositionY()-1);
            }else if (wasp.getPositionY() > getPositionY()){
                setPositionY(getPositionY()+1);
            }else if (wasp.getPositionY() == getPositionY()) {
                System.out.println("HAJIME");
                wasp = null;
            }
        }
    }
}
