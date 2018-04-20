package com.company.planets;

import com.company.RockyPlanet;

public class CarbonaceousPlanet extends RockyPlanet {
    public CarbonaceousPlanet(int standardSurfaceTemp, int seed) {
        super(standardSurfaceTemp, seed);
        setDsc("A planet composed primarily of carbon based molecules");
        setAtmosphere("thin assorted gases");
        setCore("Carbon based solids");
        setSize(((int)(rand.nextDouble()*300)/100)+3);
    }
}