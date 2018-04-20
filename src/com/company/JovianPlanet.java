package com.company;

public class JovianPlanet extends Planet{

    public JovianPlanet(int standardSurfaceTemp, int seed) {
        super(standardSurfaceTemp, seed);
        setDsc("A giant planet made up of various gases");
        setAtmosphere("tough to say: all sorts of things");
        setCore("Don't know");
        setSize((rand.nextDouble()*9)+3);
    }
}