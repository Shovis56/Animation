package com.company;

public class MultiDimension {

    public static void main(String[] args){
        int grid [] [] = new int[6][4];
        grid[2][3] = 9;
        grid[5][3]= 17;
        grid[4][0]=7;
        for(int row = 0; row < 6; row++)
        {
            for(int column = 0; column < 4; column++){
                System.out.println(row + "," +  column + ";" + grid[row][column]);
            }
        }
    }
}
