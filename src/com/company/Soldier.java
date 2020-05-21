package com.company;

public class Soldier extends Ant implements Motion{

    public Soldier(String name, int positionX, int positionY) {
        super(name, positionX, positionY);
    }

    @Override
    public int distanceToQueen() {
        return getPositionX()-1 + getPositionY()-1;
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
