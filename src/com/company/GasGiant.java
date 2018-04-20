package com.company;

public class GasGiant extends Planet{

    public GasGiant(int standardSurfaceTemp, int seed) {
        super(standardSurfaceTemp, seed);
        setDsc("A giant planet made up of various gases");
        setAtmosphere("tough to say: all sorts of things");
        setCore("Don't know");
        setSize(((int)(rand.nextDouble()*500)/100.0)+9);
    }
}