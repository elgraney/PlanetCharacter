package com.company;

public class ToxicPlanet extends RockyPlanet{
    public ToxicPlanet(int standardSurfaceTemp, int seed) {
        super(standardSurfaceTemp, seed);
        setHabitability(0.0);
        setDsc("A terrestrial planet covered in toxic gas with harsh weather.");
        setAtmosphere("Toxic");
        setCore("Molten rock and metal");
    }
}
