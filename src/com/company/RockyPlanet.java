package com.company;

import java.util.Random;

public class RockyPlanet extends Planet{
    private int surfaceTemp;
    private double size;
    private double habitability; //see as ratio to earth habitability

    private String dsc = "A rock planet";
    private String atmosphere = "Thin assorted gases"; //hydrogen, helium or Ice (or something made up)
    private String core= "Molten Metal"; //rocky, heavy metallic (iron mainly) or rare valuable materials
    private double age; //some billion years between 1 and 13 bn eg 5.32 'billion years'


    public RockyPlanet(int standardSurfaceTemp, int seed){
        Random rand = new Random(seed);
        surfaceTemp = standardSurfaceTemp;
        setHabitability();
        chooseSize(rand);
        setAge(rand);
    }
    private void setHabitability(){
        this.habitability = 0.4;
    }
    private void chooseSize(Random rand){
        this.size = (rand.nextDouble()*2+0.2);
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
