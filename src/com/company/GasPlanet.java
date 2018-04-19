package com.company;

import java.util.Random;

public class GasPlanet extends Planet{

    public GasPlanet(int standardSurfaceTemp, int seed) {
        super(standardSurfaceTemp, seed);
        setSurfaceTemp(Math.max(getSurfaceTemp() - rand.nextInt(100), 20));
    }
}
