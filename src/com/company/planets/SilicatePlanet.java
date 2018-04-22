package com.company.planets;

import com.company.Planet;

public class SilicatePlanet extends Planet {

    public SilicatePlanet(int standardSurfaceTemp, int seed) {
        super(standardSurfaceTemp, seed);
        setDsc("A terrestrial planet primarily made of silicon based rocks");
        setAtmosphere("Thin layer of assorted gas");
        setCore("Rock and metal");
        setSize(((int)(rand.nextDouble()*280)/100.0)+0.2);
        setType("Silicate Planet");
    }
}