package com.scm2110347;

import java.util.Scanner;

public class P2b {
    public static void main(String[] args){
//        Prompt user to enter the number of month required

        int month;
        String monthName;
        Scanner m = new Scanner(System.in);
        System.out.println("Enter month number: ");
        month = m.nextInt();
//        create switch statement
        monthName = switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid month";
        };
        System.out.println("The month is: " +monthName);
    }
}
