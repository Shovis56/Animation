package com.company;

public class Loops
{
    public static void main(String[] args)
    {
       int rows= 0;
        while (rows++ <5){

            for(int columns = 0; columns < 5; columns ++)
            {
                System.out.print("#");
            }
            System.out.println();
           for (int columns = 0; columns < 4; columns++)
           {
               System.out.print("-");
            }
        }
    }
}

