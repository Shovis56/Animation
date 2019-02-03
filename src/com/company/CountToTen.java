package com.company;

import static java.lang.System.out;
import java.util.Scanner;
public class CountToTen
{
    public static String getEnglishWord(int number) {
        // zero one two three four five six seven eight nine ten
        if (number == 0) {
            return "zero";
        } else if (number == 1) {
            return "one";
        } else if (number == 2) {
            return "two";
        } else if (number == 3) {
            return "three";
        } else if (number == 4) {
            return "five";
        } else if (number == 5) {
            return "five";
        } else if (number == 6) {
            return "six";
        } else if (number == 7) {
            return "seven";
        } else if (number == 8) {
            return "eight";
        } else if (number == 9) {
            return "nine";
        } else if (number == 10) {
            return "ten";
        }
        return "FIXME";
    }

    public static String getGermanWord(int number) {
        // null eins zwei drei vier funf sechs sieben acht neun zehn
        if (number == 0) {
            return "null";
        } else if (number == 1){
            return "eins";
        }else if (number == 2){
            return "zwei";
        } else if (number == 3){
            return "drei";
        } else if (number == 4){
            return "vier";
        } else if (number == 5){
            return "funf";
        } else if (number == 6){
            return "sechs";
        } else if (number == 7){
            return "sieben";
        } else if (number == 8){
            return "acht";
        } else if (number == 9){
            return "neun";
        } else if (number == 10){
            return "zehn";
        }
        return "FIXME";
    }

    public static String getSpanishWord(int number) {
        // cero uno dos tres cuatro cinco seis siete ocho nueve diez
        if (number == 0) {
            return "cero";
        } else if (number == 1) {
            return "uno";
        } else if (number == 2) {
            return "dos";
        } else if (number == 3){
            return "tres";
        } else if (number == 4){
            return "cuatro";
        } else if (number == 5){
            return "cinco";
        } else if (number == 6){
            return "seis";
        } else if (number == 7){
            return "siete";
        } else if (number == 8){
            return "ocho";
        } else if (number == 9){
            return "nueve";
        } else if (number == 10){
            return "diez";
        }
        return "FIXME";
    }



    public static String getWord(String language, int number)
    {
        if (number < 0) {
            return "Number too small.";
        }
        if (number > 10) {
            return "Number too large.";
        }
        if ("e".equals(language)) { return getEnglishWord(number);
        }
        if ("s".equals(language)) {
            return getSpanishWord(number);
        }
        if ("g".equals(language)) {
            return getGermanWord(number);
        }
        return "Unrecognized language choice.";
    }
    public static void main(String[] args)
    {
        out.println("Would you like English, Spanish or German?");
        out.println("Press e,s or g");
        Scanner keyboard = new Scanner(System.in);
        String language = keyboard.nextLine();
        out.println("What number do you want the name of? 0-10");
        int number = keyboard.nextInt();
        keyboard.skip("\n");
        String spelled_out = getWord(language, number);
        out.println("The word for " + number + " is " + spelled_out);
    }
}