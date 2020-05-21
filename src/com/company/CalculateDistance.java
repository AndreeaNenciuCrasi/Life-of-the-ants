package com.company;

public interface CalculateDistance {
   default int distanceToQueen(Ant obj){
        return obj.getPositionX()-1 + obj.getPositionY()-1;
    }
}
