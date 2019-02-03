package com.company;

import java.util.Scanner;
import static java.lang.System.out;

public class areWeThereYet

{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);


        boolean keepGoing = true;
        while (keepGoing)
        {
            out.println("Are we there yet? y/n");
            String input = keyboard.next();
            if (("y").equals(input))
            {
                keepGoing = false;
            }
            else if (("n").equals(input))
            {
                keepGoing = true;
            }
            else if (!("y").equals(input) && (!("n").equals(input)))
            {
                keepGoing = true;
                out.println("Huh? I didn't understand that.");
            }
        }
        out.println("Yay!");

    }



}

