package com.company;

import static java.lang.System.out;
import java.util.Scanner;

public class VerseChorus
{
    public static String firstLine(String number){
       return "This old man, he played " + number + ".";
    }

    public static void printAVerse(String number, String rhyme){
        String line = firstLine(number);
        out.println(line);
        out.println("He played knick-knack on my " + rhyme + ".");
    }

    public static void chorus(){
        out.println("With a knick-knack paddywhack,");
        out.println("Give the dog a bone,");
        out.println("This old man came rolling home.");
    }

    public static void main(String[] args){

        printAVerse("one", "thumb");
        chorus();
        out.println();

        printAVerse( "two", "shoe");
        chorus();
        out.println();

        printAVerse("three", "knee");
        chorus();
        out.println();

        printAVerse("four", "door");
        chorus();
        out.println();

        printAVerse("five", "hive");
        chorus();
        out.println();

        printAVerse("six", "sticks");
        chorus();
        out.println();

    }

}
