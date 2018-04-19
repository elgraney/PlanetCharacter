package com.company;

import java.util.Random;

public class Chthonian extends GasPlanet {

    public Chthonian(int standardSurfaceTemp, int seed){
        super(standardSurfaceTemp, seed);
        Random rand = new Random(seed);

        dsc = "Once a large gas giant before the nearby star stripped its outer layers. Now only the core layers remain";
        atmosphere = "Hydrogen and helium";
        core = "Dense iron core";
        habitability = rand.nextInt(10) / 10; //has a potentially Earth sized core beneath the gaseous layer. But still way too hot.
    }
    @Override
    protected void chooseSize(Random rand){
        size = (rand.nextDouble()*4)+2;
    }
}

