package com.Faisal;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the first Number");
        int num1 = input.nextInt();
        System.out.println("What is the Second Number");
        int num2 = input.nextInt();

        int Sum = num1+num2;
        System.out.println("The Multiplication of two digit : "+ Sum);


    }

}
