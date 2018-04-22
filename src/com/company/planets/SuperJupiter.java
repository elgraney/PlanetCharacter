package com.company.planets;

import com.company.Planet;

public class SuperJupiter extends Planet {

    public SuperJupiter(int standardSurfaceTemp, int seed) {
        super(standardSurfaceTemp, seed);
        setDsc("An abnormally large gas giant");
        setAtmosphere("Hydrogen and helium");
        setCore("not sure");
        setSize(((int)(rand.nextDouble()*500)/100.0)+12);
        setType("Super Jupiter");
    }
}