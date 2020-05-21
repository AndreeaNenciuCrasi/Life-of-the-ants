package com.company;

public abstract class Ant {
    private String name;
    private int positionX;
    private int positionY;

    public String getName() {
        return name;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionX(int positionX) {
        if (positionX >= 0 && positionX <= 49) {
            this.positionX = positionX;
        }
    }

    public void setPositionY(int positionY) {
        if (positionY >= 0 && positionY <= 49) {
            this.positionY = positionY;
        }
    }

    public Ant(String name, int positionX, int positionY) {
        this.name = name;
        this.positionX = positionX;
        this.positionY = positionY;
    }
}
