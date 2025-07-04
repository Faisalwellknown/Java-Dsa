package com.Faisal;

import java.util.Scanner;

public class Forloop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
        Sysntax of looops:

        for (initialisation ; condition ; increment/decrement)
         */

//        for (int num = 1; num<=5 ; num ++){
//            System.out.println(num);
//
//        }

        System.out.println("Enter number");

        int n = input.nextInt();

        for (int num = 1; num <= n; num++) {
            System.out.println(num + "");
//            System.out.println("Hello world");
        }

    }


}
