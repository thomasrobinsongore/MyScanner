package com.thomas;

import java.util.Random;

public class DiceCounter {

    public static void main(String[] args) {

        Random rand = new Random();
        int counter[] = new int[7];

        for (int i = 0; i < 1000; i++) {
            ++counter[1 + rand.nextInt(6)];
        }

        System.out.println("Face\tFrequency");

        for (int i = 1; i < counter.length; i++) {
            System.out.println(i + "\t\t" + counter[i]);
        }

    }

}
