package com.company.planets;

import com.company.RockyPlanet;

public class IcePlanet extends RockyPlanet {
    public IcePlanet(int standardSurfaceTemp, int seed) {
        super(standardSurfaceTemp, seed);
        setDsc("A frozen planet of ice and rock");
        setAtmosphere("thin atmosphere of assorted gasses");
        setCore("Dense rock and ice");
        setSurfaceTemp(rand.nextInt(200)+73);
    }
}