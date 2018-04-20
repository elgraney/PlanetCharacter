package com.company.planets;

import com.company.GasPlanet;

public class GasDwarf extends GasPlanet {

    public GasDwarf(int standardSurfaceTemp, int seed){
        super(standardSurfaceTemp, seed);


        setDsc("An abnormally small gas planetoid");
        setAtmosphere("Hydrogen and helium");
        setCore("Dense iron core");
        setHabitability(rand.nextInt(10) / 100); //has a potentially Earth sized core beneath the gaseous layer. But still way too hot.
        setSize(((int)(rand.nextDouble()*400)/100.0)+2);
    }
}