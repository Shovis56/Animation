package com.company;

import static java.lang.System.out;
import java.util.Scanner;

public class SanddwichShop
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
         int goalForVeggies = 50;
         int goalForBurgers = 250;
        int goalForSubs = 180;
        int goalForSoup = 70;
        int numVeggiesSold;
        int numBurgersSold;
        int numSubsSold;
        int numSoupsSold;

        out.println("Checking Sales goals. \n");
        out.println("The sales goal for veggie sandwiches today is 50. \n");
        out.println("How many veggie sandwiches were sold today? \n");
        numVeggiesSold = keyboard.nextInt();
        if (numVeggiesSold >= goalForVeggies)
        {
            out.println("Meets goal.");
        }
        else
        {
            out.println("Fell short.");
        }
        out.println("The sales goal for burgers is 250. \n");
        out.println("How many burgers were sold today? \n");
        numBurgersSold = keyboard.nextInt();
        if (numBurgersSold >= goalForBurgers)
        {
            out.println("Meets goal.");
        }
        else
        {
            out.println("Fell short.");
        }
        out.println("The sales goal for subs is 180. \n");
        out.println("How many subs were sold today? \n");
        numSubsSold = keyboard.nextInt();
        if (numSubsSold >= goalForSubs)
        {
            out.println("Meets goals.");
        }
        else
        {
            out.println("Fell short.");
        }
        out.println("The sales goal for soups is 70. \n");
        out.println("How many soups were sold today? \n");
        numSoupsSold = keyboard.nextInt();
        if (numSoupsSold >= goalForSoup)
        {
            out.println("Meets goal.");
        }
        else
        {
            out.println("Fell short.");
        }
        if ( numVeggiesSold >= goalForVeggies && numBurgersSold >= goalForBurgers && numSoupsSold >= goalForSoup
                && numSubsSold >= goalForSubs )
        {out.println("Made goal for everything!");}

    }
}