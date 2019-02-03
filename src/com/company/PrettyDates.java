package com.company;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class PrettyDates
{
    public static String formatNumberAsTwoDigits ( int date)
    {
        if (date == 1)
            return("01");
        else if (date == 2)
            return("02");
        else if (date == 3)
            return("03");
        else if (date == 4)
            return("04");
        else if (date == 5)
            return("05");
        else if (date == 6)
            return("06");
        else if (date == 7)
            return("07");
        else if (date == 8)
            return("08");
        else if (date == 9)
            return("09");
        else
        {
            int dateTwo = date;

            String sDate = Integer.toString(dateTwo);

            return  (sDate);
        }
    }

    //---add methods here to make the program work --

        //formatNumberAsTwoDigits

        // nameFormat
    public static String nameFormat (int year, int month, int day)
    {
        if (month == 1)
            return("January" + day +","+ year);
        else if (month == 2)
            return("February" + day +","+ year);
        else if (month == 3)
            return("March" + day +","+ year);
        else if (month == 4)
            return("April" + day +","+ year);
        else if (month == 5)
            return("May" + day +","+ year);
        else if (month == 6)
            return("June" + day +","+ year);
        else if (month == 7)
            return("July" + day +","+ year);
        else if (month == 8)
            return("August" + day +"," +year);
        else if (month == 9)
            return("September" + day+"," + year);
        else if (month == 10)
            return("October" + day +","+ year);
        else if (month == 11)
            return("November" + day +","+ year);
        else if (month == 12)
            return("December" + day +","+ year);
        else
            {
            return "";
    }


    }
        // slashFormat

    public static String slashFormat (int year, int month, int day)
    {
        int intYear = year;
        String syear = Integer.toString(year);
        return (formatNumberAsTwoDigits(month)+"/"+ formatNumberAsTwoDigits(day)+"/"+ syear);
    }



        // dashFormat
    public static String dashFormat (int year, int month, int day)
    {
        int intYear = year;
        String syear = Integer.toString(year);
        return (syear + "-"+ formatNumberAsTwoDigits(month) + "-"+ formatNumberAsTwoDigits(day));
    }
        // --- end of your work area----
        // don't change this code.

        public static void printDate ( int year, int month, int day)
        {
            System.out.println(nameFormat(year, month, day));
            System.out.println(slashFormat(year, month, day));
            System.out.println(dashFormat(year, month, day));
            System.out.println();
        }

        //don't change this code.
        public static void main (String[]args)
        {
            System.out.println(formatNumberAsTwoDigits(3));
            System.out.println(formatNumberAsTwoDigits(9));
            System.out.println(formatNumberAsTwoDigits(10));
            System.out.println(formatNumberAsTwoDigits(12));

            printDate(2014, 10, 4);
            printDate(2015, 1, 1);
            printDate(2013, 12, 31);
        }

}
