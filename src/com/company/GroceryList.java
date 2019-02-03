package com.company;

import static java.lang.System.out;
import java.util.Scanner;

public class GroceryList
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);


        out.println("Please list three items on your grocery list.");
        String one;
        out.print("Item 1? ");
        one = keyboard.nextLine();
        String two;
        out.print("Item 2? ");
        two = keyboard.nextLine();
        String three;
        out.print("Item 3? ");
        three = keyboard.nextLine();

        out.println("");


        out.println("Now, please enter the quantity of each item.");

        int first;
        out.print("How many " + one +"? ");
        first = keyboard.nextInt();
        keyboard.skip("\n");

        int second;
        out.print("How many " + two + "? ");
        second = keyboard.nextInt();
        keyboard.skip("\n");

        int third;
        out.print("How many " + three + "? ");
        third = keyboard.nextInt();
        keyboard.skip("\n");

        out.println("");

        out.println("Now, please enter the price of each item.");

        float a;
        out.print("How much does one " + one + " cost? ");
        a = keyboard.nextFloat();
        keyboard.skip("\n");

        float b;
        out.print("How much does one " + two + " cost? ");
        b = keyboard.nextFloat();
        keyboard.skip("\n");

        float c;
        out.print("How much does one " + three + " cost? ");
        c = keyboard.nextFloat();
        keyboard.skip("\n");

        out.println("");

        out.println("Calculating your grocery bill.");

        float price = (a * first) + (b * second) + (c * third);
        out.println("Your total cost is " + price + ".");



    }
}


