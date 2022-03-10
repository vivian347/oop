package com.scm2110347;

import java.util.Scanner;

public class practice {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("no of classes held");
        int x = s.nextInt();
        System.out.println("no of classes attended");
        int y =s.nextInt();
        float pf = ((y*100)/x);
        System.out.println(pf);
        if(pf > 76){
            System.out.println("eligible: "+pf);
        }else{
            System.out.println("not eligible: "+ pf);
        }
    }
}
