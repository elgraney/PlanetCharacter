package com.company;

public class OceanPlanet extends GoldilocksPlanet {
    public OceanPlanet(int standardSurfaceTemp, int seed) {
        super(standardSurfaceTemp, seed);
        setHabitability(getHabitability()+((int)(rand.nextDouble()*400)/100.0));
        setDsc("A terrestrial planet largely covered in ocean with scattered islands.");
        setAtmosphere("Earth-like");
        setCore("Molten rock and metal");
    }
}

