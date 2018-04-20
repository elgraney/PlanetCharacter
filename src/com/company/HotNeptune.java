package com.company;

public class HotNeptune extends Planet{

    public HotNeptune(int standardSurfaceTemp, int seed) {
        super(standardSurfaceTemp, seed);
        setDsc("An ice giant heated by its proximity to its home star");
        setAtmosphere("Water, ammonia, ammonia hydrosulphate and other stuff... ");
        setCore("something or other");
        setSize(((int)(rand.nextDouble()*250)/100.0)+2.5);
    }
}