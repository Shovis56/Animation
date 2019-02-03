package com.company;

public class Arrays {

    public static void main(String[] args){

        int[] apples = {1,3,5,7,9,7};
        int[] oranges = {8,6,4,2,0,2};
        int[] sums = new int[6];

        for (int index = 0; index < 6; index ++){

            sums[index] = apples[index] + oranges[index];
            System.out.println(index + " sum is " + sums[index]);
        }
    }
}
