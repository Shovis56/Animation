package com.company;

import static java.lang.System.out;
import java.util.Scanner;
public class Entertainment
{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String weatherChoice;
        String mood;

        out.println("What is the weather like today? Answer: Sunny Cloudy or Rainy.");
        weatherChoice = keyboard.nextLine();

        if (weatherChoice.equals("Sunny")) {
            out.println("What kind of mood are you in for activities? Answer: Exercise Party or Quiet.");
            mood = keyboard.nextLine();

            if (mood.equals("Exercise")) {
                out.println("For exercise on a sunny day, try a brisk walk in a nature preserve.");
            } else if (mood.equals("Party")) {
                out.println("For a fun party on a sunny day, look for a street festival.");
            } else if (mood.equals("Quiet")) {
                out.println("A sunny day is a beautiful time to sit under a tree and read a book.");
            } else {
                out.println("Error: Your mood answer wasn't one of the valid options.");
            } }
         else if (weatherChoice.equals("Cloudy")){
            out.println("What kind of mood are you in for activities? Answer: Exercise Party or Quiet.");
            mood = keyboard.nextLine();

            if (mood.equals("Exercise")) {
                out.println("For exercise on a cloudy day, the botanical gardens are a lovely walk.");
            } else if (mood.equals("Party")) {
                out.println("For a fun party on a cloudy day, ride the paddle boats at the park.");
            } else if (mood.equals("Quiet")){
                out.println("On a cloudy day, take a camera or paints to sketch the flowers at the lakeside.");
            } else {
                out.println("Error: Your mood answer wasn't one of the valid options.");
            }
        }
        else if (weatherChoice.equals("Rainy")){
            out.println("What kind of mood are you in for activities? Answer: Exercise Party or Quiet.");
            mood = keyboard.nextLine();

            if (mood.equals("Exercise")) {
                out.println("Giant indoor trampolines are a fun place to exercise on a rainy day.");
            } else if (mood.equals("Party")){
                out.println("See if your friends are playing board games to pass a rainy day.");
            } else if (mood.equals("Quiet")) {
                out.println("A rainy day is a peaceful time to journal and daydream.");
            } else {
                out.println("Error: Your mood answer wasn't one of the valid options.");
            }
        }
        else {
            out.println("Your weather answer wasn't one of the valid options.");
        }
    }
    }