package com.company;

public class Queen extends Ant {

    public Queen() {
        super("Q", 0,0);
    }

    public boolean matingMood(){
        return Math.random() < 0.5;
    }
}
