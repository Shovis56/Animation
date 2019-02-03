package com.company;

import static java.lang.System.out;
import java.util.Scanner;

public class MultiplicationTablesTwo {

    public static void main(String[] args) {
        int a;
        int b;
        Scanner keyboard = new Scanner(System.in);

        out.println("Welcome to Multiplication Tables");
        out.println("How large would you like to see them?");


        int size = keyboard.nextInt();

        while (size <1 || size >20) {
            out.println("\nPlease enter a number between 1-20.");
            size = keyboard.nextInt();}

            for(int counter =0; counter<=size; counter++){
                out.print("\t" + counter);
            }
            out.println();




                for (a =0; a <= size; a++) {
                    out.printf("%4d", a);
                    for (b =0; b <= size; b++) {
                        int c = a*b;
                        out.printf("%4d", c);
                    }
                    out.println();
                }
        }
    }

