package com.company;

import java.util.ArrayList;
import java.util.List;

public class Soldier extends Ant implements CalculateDistance {
    private String direction = "north";

    public Soldier(String name, int positionX, int positionY) {
        super(name, positionX, positionY);
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
        System.out.println(this.getName() + " moves north");
    }

    public void stepTowardsSouth(){
        setPositionY(getPositionY() + 1);
        System.out.println(this.getName() + " moves south");
    }

    public void stepTowardsWest(){
        setPositionX(getPositionX() -1);
        System.out.println(this.getName() +" moves west");
    }

    public void stepTowardsEast(){
        setPositionX(getPositionX() + 1);
        System.out.println(this.getName() +" moves east");
    }

    public void moveTowardsWasp(Wasp wasp){
        if(wasp.getPositionX() < getPositionX()) {
            setPositionX(getPositionX() - 1);
            System.out.println(this.getName() + " moving west towards the Wasp");
        }else if(wasp.getPositionX() > getPositionX()){
            setPositionX(getPositionX() + 1);
            System.out.println(this.getName() + " moving east towards the Wasp");
        }else if (wasp.getPositionX() == getPositionX()){
            if(wasp.getPositionY() < getPositionY()){
                setPositionY(getPositionY()-1);
                System.out.println(this.getName() + " moving north towards the Wasp");
            }else if (wasp.getPositionY() > getPositionY()){
                setPositionY(getPositionY()+1);
                System.out.println(this.getName() + " moving south towards the Wasp");
            }else if (wasp.getPositionY() == getPositionY()) {
                System.out.println("HAJIME");
                wasp = null;
            }
        }
    }
}
