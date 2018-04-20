package com.company;

public class HotJupiter extends Planet{

    public HotJupiter(int standardSurfaceTemp, int seed) {
        super(standardSurfaceTemp, seed);
        setDsc("A gas giant heated by its proximity to its home star");
        setAtmosphere("Hydrogen and helium");
        setCore("Dense iron core");
        setSize((rand.nextDouble()*5)+9);
    }
}