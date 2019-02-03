package com.company;

public class ASCII {

    public static void main(String[] args){

    for(int letter=32;letter <= 255; letter++)
        System.out.println(letter + ": " + (char)letter);
    }
}
