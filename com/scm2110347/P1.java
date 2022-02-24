package com.scm2110347;

import java.util.Scanner;


public class P1 {
    public static void main(String[] args){
//        declare variables
        float x,y,z,m;
        float sum = 0;
        float avg =0;
//Prompt user to enter 3 numbers
        Scanner n = new Scanner(System.in);
        System.out.println("Enter first number: ");
        x = n.nextFloat();
        System.out.println("Enter second number: ");
        y = n.nextFloat();
        System.out.println("Enter last number: ");
        z = n.nextFloat();
//Calculate sum
         m = x+y;
         sum = Float.sum(m,z);
//Calculate average
        avg =sum/3;
//Output
        System.out.println("The sum is: " + sum);
        System.out.println("The average is: "+ avg);
    }


}
