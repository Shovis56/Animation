package com.company;

import static java.lang.System.out;
import java.util.Scanner;
import java.util.Random;

public class GuessMyNumber {

    public static void main(String[] args) {
        Random number = new Random();
        int computerValue;
        int success = 0;
        int numberOfTries = 0;
        boolean playAgain;

        Scanner keyboard = new Scanner(System.in);

        int guess;

        do {
            computerValue = number.nextInt(100);
                out.println("I'm thinking of a number between 1 and 100. What is it?");
                out.println("Guess:");
                guess = keyboard.nextInt();
                numberOfTries++;

                if(guess > computerValue) {
                    out.println("My number is lower.");
                } else if (guess < computerValue) {
                    out.println("My number is higher.");
                }
            } while (guess == computerValue);
            out.println("Congratulations you won! The number was " + computerValue);

            //out.println("\nPlay again? Yes or No");
            //switch (keyboard.next()) {
              //  case "yes":
                //    playAgain = true;
                  //  break;
                //default:
                  //  break;
            }

            //while (playAgain);
              //  out.println("Goodbye!");
                // String playagainResponse = keyboard.next();
                //if (playagainResponse.equalsIgnoreCase("Yes")) {
                //  out.println("I'm thinking of a number between 1 and 100. What is it?");
                //out.println("Guess?");
                //} else if (playagainResponse.equalsIgnoreCase("No")) {
                //  out.println("Goodbye");
                //isplayagain = false;
                // break;
                //}
                //}
                //if (!isplayagain) {
                //  System.exit(0);
                //}
            }








