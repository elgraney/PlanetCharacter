package com.company;

import java.util.Random;

public class GasPlanet {
    private int surfaceTemp;
    private double size;
    private double habitability; //see as ratio to earth habitability

    private String dsc = "A gas planet";
    private String atmosphere = "Various gases"; //hydrogen, helium or Ice (or something made up)
    private String core= "Heavy metal"; //rocky, heavy metallic (iron mainly) or rare valuable materials
    private double age; //some billion years between 1 and 13 bn eg 5.32 'billion years'


    public GasPlanet(int standardSurfaceTemp, int seed){
        Random rand = new Random(seed);
        surfaceTemp = standardSurfaceTemp - rand.nextInt(100);
        setHabitability();
        chooseSize(rand);
        setAge(rand);
    }
    private void setHabitability(){
        this.habitability = 0;
    }
    private void chooseSize(Random rand){
        this.size = (rand.nextDouble()*9)+3;
    }
    private void setAge(Random rand){
        this.age = (rand.nextDouble()*9)+3;
    }


    public int getSurfaceTemp(){
        return surfaceTemp;
    }
    public double getSize(){
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
    public double age(){
        return age;
    }
}
