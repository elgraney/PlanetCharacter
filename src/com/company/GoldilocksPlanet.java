package com.company;

public class GoldilocksPlanet extends RockyPlanet{

    public GoldilocksPlanet(int standardSurfaceTemp, int seed) {
        super(standardSurfaceTemp, seed);
        setHabitability(0.6);
        setSize(((int)(rand.nextDouble()*100)/100.0)+0.5);
    }
}
