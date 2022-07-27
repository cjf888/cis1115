package hw6.src;

import java.util.Scanner;

public class Month {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a month (1-12): ");
        int month = scan.nextInt();
        System.out.print("Enter a year: ");
        int year = scan.nextInt();
        MonthDays object = new MonthDays(month, year);
        int noOfDays = object.getNumberOfDays();
        System.out.println(+ year + " has " + noOfDays + " days");
    }

    public Month()
    {
        monthNumberInt = 1;
    }

    String[] monthName = { "January", "Februry", "March",
            "April", "May", "June", "July", "August", "September",
            "October", "November", "December" }; //Months.
    int monthNumberInt = 0;

    public Month(int monthNumber)
    {
        if((monthNumber < 1 ) || ( monthNumber > 12)) {
            this.monthNumberInt = 1;
        } else {
            this.monthNumberInt = monthNumber;
        }

    }

    public Month(String monthName)
    {
        monthNumberInt = monthName.indexOf(monthName);
    }

    public int getMonthNumberInt() {
        return monthNumberInt;
    }

    public void setMonthNumberInt(int monthNumberInt) {
        this.monthNumberInt = monthNumberInt;
    }


    public String toString()
    {
        return  "monthName: " + monthName[monthNumberInt];
    }

    public boolean Equals(Month m)//Month needs to go here.
    {
        if(this.monthNumberInt == m.getMonthNumberInt())
            return true;
        else
            return false;
    }



    public boolean GreatThan(Month m1)//Month needs to go here.
    {
        if(monthNumberInt > m1.monthNumberInt)
            return true;
        else
            return false;
    }


    public boolean LesserThan(Month m1)//Month needs to go here.
    {
        if(monthNumberInt < m1.monthNumberInt)
            return true;
        else
            return false;
    }
}

class MonthDays {

    private int month, year;

    // constructor
    public MonthDays(int month, int year) {
        this.month = month;
        this.year = year;
    }

    // function to calculate no of days in the month
    public int getNumberOfDays() {
        int noOfDays;
// for months with 31 number of days
        if (month == 1 || month == 3 || month == 5 || month == 7
                || month == 8 || month == 10 || month == 12) {
            noOfDays = 31;
        } else {
// for month with 30 number of days excluding february
            if (month != 2) {
                noOfDays = 30;
            } // for the month of february
            else {
// if leap year then number of days is 29 else 28
// if year is evenly divisible by 400 then it is leap year
                if ((year % 400 == 0)
                        || // if year is not evenly divisible by 100 but evenly divisible by 4
// then it is a leap year
                        ((year % 100 != 0) && (year % 4 == 0))) {
                    noOfDays = 29;
                } else {
                    noOfDays = 28;
                }
            }
        }
        return noOfDays;
    }

}