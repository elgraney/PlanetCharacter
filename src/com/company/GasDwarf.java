package com.company;

public class GasDwarf extends GasPlanet {

    public GasDwarf(int standardSurfaceTemp, int seed){
        super(standardSurfaceTemp, seed);


        setDsc("An abnormally small gas planetoid");
        setAtmosphere("Hydrogen and helium");
        setCore("Dense iron core");
        setHabitability(rand.nextInt(10) / 100); //has a potentially Earth sized core beneath the gaseous layer. But still way too hot.
        setSize((rand.nextDouble()*4)+2);
    }
}