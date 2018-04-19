package com.company;

import java.util.Random;

public class GasDwarf extends GasPlanet {

    public GasDwarf(int standardSurfaceTemp, int seed){
        super(standardSurfaceTemp, seed);
        Random rand = new Random(seed);

        dsc = "An abnormally ";
        atmosphere = "Hydrogen and helium";
        core = "Dense iron core";
        habitability = rand.nextInt(10) / 10; //has a potentially Earth sized core beneath the gaseous layer. But still way too hot.
    }
    @Override
    protected void chooseSize(Random rand){
        size = (rand.nextDouble()*4)+2;
    }
}