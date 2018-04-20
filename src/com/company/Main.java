package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	Random rand = new Random();
	System.out.println(((int)(rand.nextDouble()*100)/100.0)+0.5);
    }
}
