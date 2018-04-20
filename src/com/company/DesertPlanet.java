package com.company;

public class DesertPlanet extends GoldilocksPlanet{

    public DesertPlanet(int standardSurfaceTemp, int seed) {
        super(standardSurfaceTemp, seed);
        setHabitability(getHabitability()+((int)(rand.nextDouble()*300)/1000.0));
        setDsc("A terrestrial planet largely covered in desert, rocks and arid landscapes. There is little surface water.");
        setAtmosphere("Earth-like");
        setCore("Molten rock and metal");
    }
}

