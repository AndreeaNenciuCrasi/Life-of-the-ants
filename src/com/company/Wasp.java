package com.company;

public class Wasp {
    private String name = "&";
    private int positionX;
    private int positionY;

    public Wasp(int positionX, int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public String getName() {
        return name;
    }
}
