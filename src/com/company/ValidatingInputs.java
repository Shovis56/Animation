package com.company;

import java.util.Scanner;

public class ValidatingInputs {

    public static int getintegerBetween(int lower, int upper) {

        Scanner keyboard = new Scanner(System.in);

        int number;
        do {
            number = keyboard.nextInt();
            if (number < 1 || number > 10) {
                System.out.println("Error, invalid number. Try again.");
            }
        } while (number < 1 || number > 10);
        return number;
    }


    public static int getTensInteger(int lower, int upper) {
        Scanner keyboard = new Scanner(System.in);
        int number;
        do {
            number = keyboard.nextInt();
            if (number % 10 != 0 && number < 200 || number > 3000) {
                System.out.println("Error, invalid number. Try again.");
            }
        } while (number % 10 != 0 && number < 200 || number > 3000);
        return number;
    }

        public static void main (String[]args){
            System.out.println("Please enter a number from 1-10");
            int firstNumber = getintegerBetween(1, 10);

            System.out.println("Please enter a number between 300 and 3000 that is a multiple of ten.");
            int secondNumber = getTensInteger(200, 3000);

            System.out.print("You entered " + firstNumber + " and " + secondNumber);
        }
    }



