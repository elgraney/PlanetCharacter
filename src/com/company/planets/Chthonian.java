package com.company.planets;

import com.company.GasPlanet;

import java.util.Random;

public class Chthonian extends GasPlanet {

    public Chthonian(int standardSurfaceTemp, int seed){
        super(standardSurfaceTemp, seed);
        Random rand = new Random(seed);

        setDsc("Once a large gas giant before the nearby star stripped its outer layers. Now only the core layers remain");
        setAtmosphere("Hydrogen and helium");
        setCore("Dense iron core");
        setHabitability(rand.nextInt(10) / 10.0); //has a potentially Earth sized core beneath the gaseous layer. But still way too hot.
        setSize(((int)(rand.nextDouble()*400)/100.0)+2);
        setType("Chthonian Planet");
    }
}

