package com.company;

import java.util.Arrays;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Queen queen = new Queen();
        Worker worker = new Worker("W", 20,20);
        Soldier soldier = new Soldier("S", 10, 30);
        Drones drones = new Drones("D", 10, 25);
        Wasp wasp = new Wasp(5,15);

        int k = 0;
        while(k < 20){
            worker.move();
            drones.move();

            if(wasp.appearOnMap()){
                soldier.moveTowardsWasp(wasp);
            }else{
                soldier.move();
            }

            if (drones.getDistanceToQueen() == 3 && queen.matingMood()){
                System.out.println("Drone says HALLELUJAH");
                drones.setRandomPosition();
            }else if(drones.getDistanceToQueen() == 3 && !queen.matingMood()){
                System.out.println("Drone says D’OH");
                drones.setRandomPosition();
            }

            k++;
        }

        String[][] map = new String[30][30];
        for(String[] r : map)
            Arrays.fill(r, "_");

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                if(i== queen.getPositionX() && j == queen.getPositionY()){
                    System.out.println(queen.getName());
                }else if(i== worker.getPositionX() && j == worker.getPositionY()){
                    System.out.println(worker.getName());
                }else if(i == soldier.getPositionX() && j == soldier.getPositionY()){
                    System.out.println(soldier.getName());
                }else if(i== drones.getPositionX() && j == drones.getPositionY()) {
                    System.out.println(drones.getName());
                }else if(i== wasp.getPositionX() && j == wasp.getPositionY()){
                        System.out.println(wasp.getName());
                }else {
                    System.out.print(map[i][j]+" ");
                }
            }
            System.out.println("");
        }

    }
}
