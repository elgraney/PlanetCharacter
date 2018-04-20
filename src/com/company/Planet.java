package com.company;
import java.util.Random;

public class Planet {
    private int surfaceTemp;
    private double size;
    private double habitability;
    private String dsc;
    private String atmosphere;
    private String core;
    private double age;
    protected Random rand;

    public Planet(int standardSurfaceTemp, int seed){
        rand = new Random(seed);
        surfaceTemp = standardSurfaceTemp;
    }

    public void setSurfaceTemp(int surfaceTemp) {
        this.surfaceTemp = surfaceTemp;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void setHabitability(double habitability) {
        this.habitability = habitability;
    }

    public void setDsc(String dsc) {
        this.dsc = dsc;
    }

    public void setAtmosphere(String atmosphere) {
        this.atmosphere = atmosphere;
    }

    public void setCore(String core) {
        this.core = core;
    }

    public void setAge(double age) {
        this.age = age;
    }

    //GETTERS

    public int getSurfaceTemp() {
        return surfaceTemp;
    }

    public double getSize() {
        return size;
    }

    public double getHabitability() {
        return habitability;
    }

    public String getDsc() {
        return dsc;
    }

    public String getAtmosphere() {
        return atmosphere;
    }

    public String getCore() {
        return core;
    }

    public double getAge() {
        return age;
    }
}