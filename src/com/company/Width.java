package com.company;

import static java.lang.System.out;
import java.util.Scanner;

public class Width {



    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        out.println("How big of a number should I count to?");
    int numbers=0;

        int width = Integer.parseInt(keyboard.nextLine());
        int number = Integer.parseInt(keyboard.nextLine());

    for (numbers= 10; numbers > 0; numbers--){
        out.println(numbers);
        numbers--;
    }


    }
}



