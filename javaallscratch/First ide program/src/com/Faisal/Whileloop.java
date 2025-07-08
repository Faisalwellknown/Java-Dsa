package com.Faisal;

import java.util.Scanner;

public class Whileloop {

    public static void main(String[] args) {


        // While loops
        /*
        syntax while loop

        while(condition){

        //body
        }
            same as for loop but
         */

        Scanner input = new Scanner(System.in);
        //int n=input.nextInt();
        int num = 1;  //intisalization 1
        while(num <= 5){       //condition 2

            System.out.println(num);     // inside loop print 3
            num = num + 1;     // increment/decrement 4

        }




    }
}
