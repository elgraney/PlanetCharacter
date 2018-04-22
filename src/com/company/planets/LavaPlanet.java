package com.company.planets;


import com.company.Planet;

public class LavaPlanet extends Planet {

    public LavaPlanet(int standardSurfaceTemp, int seed) {
        super(standardSurfaceTemp, seed);
        setDsc("A volatile and volcanic terrestrial planet");
        setAtmosphere("Dense clouds of ash, but also Earth like gases");
        setCore("Molten rock and metal");
        setSize(((int)(rand.nextDouble()*280)/100.0)+0.2);
        setSurfaceTemp(rand.nextInt(50)+300);
        setHabitability((((int)(rand.nextDouble()*100)/100.0)+0.01)/6);
        setType("Lava Planet");
    }
}