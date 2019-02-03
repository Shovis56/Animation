package com.company;

public class LettersToNumbers {

    public static void main(String[] args){

        int nums[]= {89,111,117,39,114,101,32,97,32,115,116,97,114,33};

        for(int index= 0; index < nums.length; index++){
            char letter= (char)nums[index];
            System.out.print(letter);
        }
        System.out.println();

        System.out.println();

        char message[]= {'C','r','o','w',' ','f','l','i','e','s',' ','a','t',' ','d','a','w','n','.'};

        for(char index =0; index < message.length; index++){
            int num= (int)message[index];
            System.out.print(num + ",");
        }
        System.out.println();

    }
}
