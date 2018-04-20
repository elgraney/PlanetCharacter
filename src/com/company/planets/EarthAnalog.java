package com.company.planets;

import com.company.GoldilocksPlanet;

public class EarthAnalog extends GoldilocksPlanet {
    public EarthAnalog(int standardSurfaceTemp, int seed) {
        super(standardSurfaceTemp, seed);
        setHabitability(getHabitability()+((int)(rand.nextDouble()*800)/1000.0));
        setDsc("A terrestrial planet similar to Earth in most aspects, generally ideal for colonisation.");
        setAtmosphere("Earth-like");
        setCore("Molten rock and metal");
        setSurfaceTemp(rand.nextInt(40)+270);
    }
}
