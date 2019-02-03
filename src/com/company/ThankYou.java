package com.company;

import java.util.Scanner;
import static java.lang.System.out;

public class ThankYou {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        //Scanner input = new Scanner(System.in);

        String fullName;
        double donationAmount;

        out.println("Thank You Letters");

        boolean keepGoing = true;
        //while(keepGoing)
        //{


        out.println("What is the donators first and last name or if done type Quit?");
        fullName = keyboard.nextLine();


        out.println("What is the persons donation amount?");
        donationAmount = keyboard.nextDouble();


        //boolean keepGoing = true;
        //while(keepGoing)
        //{
        if (!("Quit").equals(fullName)) {
            out.println("Dear " + fullName + ",");
            out.println("");
            out.println("Thank you for your donation! We rely on donors like you to keep our");
            out.println("organization effective, and you came through for us. Your donation of $" + donationAmount);
            out.println("will help our efforts to make a difference in the world.");
            out.println("");
            out.println("As you may know, we are a registered non-profit organization, so your");
            out.println("donation is tax deductible. You may use this letter as a receipt for tax");
            out.println("purposes.");
            out.println("");
            out.println("Thank you again for your support!");
            out.println("");
            out.println("Sincerely,");
            out.println("Paula Jones");
            out.println("Your.Charity.org");
            out.println("");


            out.println("What is the donators first and last name or if done type Quit?");
            fullName = keyboard.nextLine();
            // keyboard.nextLine();

            out.println("What is the persons donation amount?");
            donationAmount = keyboard.nextDouble();
        }


        else if ("Quit".equals(fullName)) {
            keepGoing = false;
        }


        }



    }

