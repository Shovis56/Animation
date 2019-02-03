package com.company;

import static java.lang.System.out;

public class NumberArrays {

    public static void main(String[] args) {

        out.println("Week 1 High Temperatures");
        out.println("65,68,72,83,73,66,85");

        out.println();

        out.println("Week 2 High Temperatures");
        out.println("86,87,85,78,79,78,80");

        out.println();

        int[] highOne = {65, 68, 72, 83, 73, 66, 85};
        int[] highTwo = {86, 87, 85, 78, 79, 78, 80};
        int sumOne = 0;
        int sumTwo = 0;

        for (int index = 0; index < highOne.length; index++) {
            sumOne += highOne[index];
        }
        int average = sumOne / highOne.length;
        out.println("The average daily-high temperature for week 1 is " + average + ".");

        for (int index = 0; index < highTwo.length; index++) {
            sumTwo += highTwo[index];
        }
        int averageTwo = sumTwo / highTwo.length;
        out.println("The average daily-high temperature for week 2 is " + averageTwo + ".");

        out.println();

        out.println("In week 1, Saturday was warmest, at " + highOne[6] + " degrees.");

        out.println();

        out.println("In week 2, Monday was warmest at " + highTwo[1] + " degrees.");
    }
}



