package com.company;

import java.util.Random;

public class GasDwarf extends GasPlanet {

    public GasDwarf(int standardSurfaceTemp, int seed){
        super(standardSurfaceTemp, seed);


        setDsc("An abnormally small gas planetoid");
        setAtmosphere("Hydrogen and helium");
        setCore("Dense iron core");
        habitability = rand.nextInt(10) / 10; //has a potentially Earth sized core beneath the gaseous layer. But still way too hot.
    }
    @Override
    protected void chooseSize(Random rand){
        size = (rand.nextDouble()*4)+2;
    }
}