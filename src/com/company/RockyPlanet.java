package com.company;

public abstract class RockyPlanet extends Planet {


    public RockyPlanet(int standardSurfaceTemp, int seed) {
        super(standardSurfaceTemp, seed);
        setHabitability(0.1);
    }
}
