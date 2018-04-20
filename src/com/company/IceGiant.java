package com.company;

public class IceGiant extends Planet{

    public IceGiant(int standardSurfaceTemp, int seed) {
        super(standardSurfaceTemp, seed);
        setDsc("A large planet primarily made of ices,similar to Neptune or Uranus");
        setAtmosphere("Water, ammonia, ammonia hydrosulphate and other stuff... ");
        setCore("something or other");
        setSize(((int)(rand.nextDouble()*250)/100.0)+2.5);
    }
}