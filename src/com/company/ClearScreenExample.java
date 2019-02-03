package com.company;

import java.util.Scanner;

public class ClearScreenExample {

    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("This is my first line.");
        System.out.println("This is my second line.");
        System.out.println("Press enter to move on...");
        keyboard.nextLine();
        System.out.print('\u000c');
        System.out.println("This is my third line.");
        System.out.println("This is my fourth line.");
        System.out.println("Press enter to clear the screen again...");
        keyboard.nextLine();
        System.out.print('\u000c');
    }

}
