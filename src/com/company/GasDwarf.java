package com.company;

import java.util.Random;

public class GasDwarf {
    private int surfaceTemp;
    private int size;
    private double habitability; //see as ratio to earth habitability

    private String dsc = "A low mass gas planet";
    private String atmosphere = "Primarily "; //hydrogen, helium or Ice (or something made up)
    private String core; //rocky, heavy metallic (iron mainly) or rare valuable materials
    private int age; //some billion years between 1 and 13 bn


    public GasDwarf(int standardSurfaceTemp, int seed){
        Random rand = new Random();
        surfaceTemp = standardSurfaceTemp - rand.nextInt(100);

        habitability = rand.nextInt(10)/10; //has a potentially Earth sized core beneath the gaseous layer. But still way too hot.


    }
    public int getSurfaceTemp(){
        return surfaceTemp;
    }
    public int getSize(){
        return size;
    }
    public double getHabitability(){
        return habitability;
    }

    public String getDsc() {
        return dsc;
    }
    public String getAtmosphere(){
        return atmosphere;
    }
    public String getCore(){
        return core;
    }
    public int age(){
        return age;
    }
}
