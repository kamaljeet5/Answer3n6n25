package com.problemsolve;

import java.util.Scanner;

public class answer06 {
    public static void main (String args []){
        long hrs = 0l;
        long sec = 0l;
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter hours to convert in seconds = ");
        hrs = scan.nextInt();
        sec = hrs*60*60;
        System.out.println("Seconds = " + sec);
    }
}
