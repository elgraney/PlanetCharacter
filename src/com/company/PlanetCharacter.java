package com.company;

/**
 * Created by Matthew on 11/02/2018.
 */
public class PlanetCharacter {
    private int surfaceTemperature;
    private int type;
    private int seed;

    public Planet makePlanetCharacter(int distance, char sunType, int seed){
        this.seed = seed;

        //1. temp
        surfaceTemperature = (int) calcSurfaceTemp(distance, sunType);
        String[] values = {"not", "chthonian", "gas dwarf", "hot jupiter", "hot neptune", "ice giant", "super jupiter", "jovian planet"};
        int[] chance = {100, 0,0,0,0,0,0,0};
        //gets rocky or gassy boi
        if (distance < 100000) {//0 to 100,000 (mercury)
            chance = new int[]{60, 10, 5, 10, 5, 0, 0, 0};
        } else if (distance >= 100000 && distance < 200000) {//100,000 to 200,000 (Venus, Earth)
            chance = new int[]{75,0, 8, 0, 10, 0, 2, 5};
        } else if (distance >= 200000 && distance < 500000) {//200,000 to 500,000 (mars + Asteroid belt)
            chance = new int[]{75,0, 10, 0, 0, 0, 5, 10};
        } else if (distance >= 500000 && distance < 1000000) {//500,000 to 1,000,000
            chance = new int[]{55,0, 10, 0, 0, 15, 10, 10};
        } else if (distance >= 1000000 && distance < 2500000) {//1,000,000 to 2,500,000 (jupiter, saturn)
            chance = new int[]{30,0, 5, 0, 0, 25, 10, 30};
        } else if (distance >= 2500000 && distance < 5000000) {//2,500,000 to 5,000,000 (Uranus, Neptune)
            chance = new int[]{30,0, 5, 0, 0, 35, 10, 20};
        } else if (distance >= 5000000 && distance < 7500000) {//5,000,000 to 7,500,000 (pluto)
            chance = new int[]{60,0, 10, 0, 0, 5, 20, 5};
        } else {
            chance = new int[]{75,0, 5, 0, 0, 5, 10, 5};//7,500,000 to 10,000,000 onwards
        }
        String returnValue = DRV.discreteRV(values, chance, seed);
        Planet planet = null;
        switch (returnValue){
            case "chthonian":
                planet = new Chthonian(surfaceTemperature,seed);
                break;
            case "gas dwarf":
                planet = new GasDwarf(surfaceTemperature,seed);
                break;
            case "hot jupiter":
                planet = new HotJupiter(surfaceTemperature,seed);
                break;
            case "hot neptune":
                planet = new HotNeptune(surfaceTemperature,seed);
                break;
            case "ice giant":
                planet = new IceGiant(surfaceTemperature,seed);
                break;
            case "super jupiter":
                planet = new SuperJupiter(surfaceTemperature,seed);
                break;
            case "jovian":
                planet = new GasGiant(surfaceTemperature,seed);
                break;
            case "not":
                //do temperature stuff
                if(surfaceTemperature < 260){
                    values = new String[]{"ice", "silicate", "carbonaceous", "toxic", "lava"};
                    chance = new int[]{30,35,15,20,0};
                    returnValue = DRV.discreteRV(values, chance, seed);
                }
                else if(surfaceTemperature >= 260 && 340>=surfaceTemperature){
                    values = new String[]{"desert", "earth analog", "ocean"};
                    chance = new int[]{30,40,30};
                    returnValue = DRV.discreteRV(values, chance, seed);
                }
                else{
                    values = new String[]{"ice", "silicate", "carbonaceous", "toxic", "lava"};
                    chance = new int[]{0,50,30,10,30};
                    returnValue = DRV.discreteRV(values, chance, seed);
                }

                switch (returnValue){
                    case "ice":
                        planet = new IcePlanet(surfaceTemperature,seed);
                        break;
                    case "silicate":
                        planet = new SilicatePlanet(surfaceTemperature,seed);
                        break;
                    case "carbonaceous":
                        planet = new CarbonaceousPlanet(surfaceTemperature,seed);
                        break;
                    case "toxic":
                        planet = new ToxicPlanet(surfaceTemperature,seed);
                        break;
                    case "lava":
                        planet = new LavaPlanet(surfaceTemperature,seed);
                        break;
                    case "desert":
                        planet = new DesertPlanet(surfaceTemperature,seed);
                        break;
                    case "earth analog":
                        planet = new EarthAnalog(surfaceTemperature,seed);
                        break;
                    case "ocean":
                        planet = new OceanPlanet(surfaceTemperature,seed);
                        break;
                }
                break;
        }
        return planet;
    }

    private double calcSurfaceTemp(int distance, char sunType){
        int sunMod = 1;
        switch (sunType){
            case 's':
                sunMod =-150;
                break;
            case 'o':
                sunMod =-120;
                break;
            case 'b':
                sunMod =-100;
                break;
            case 'a':
                sunMod =-90;
                break;
            case 'f':
                sunMod =-78;
                break;
            case 'g':
                sunMod =-72;
                break;
            case 'k':
                sunMod =-65;
                break;
            case 'm':
                sunMod =-60;
                break;
            case 'd':
                sunMod =-20;
                break;
        }
        double temp = sunMod*Math.log((double) distance/ 10000000);
        return temp;
    }
}