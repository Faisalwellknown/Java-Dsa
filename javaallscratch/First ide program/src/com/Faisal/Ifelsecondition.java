package com.Faisal;

import java.util.Scanner;

public class Ifelsecondition {

    public static void main(String[] args) {
        /*
        multi line comment
        Syntax of if statements:
        if(this condition is true boolean expresion T or F){
        //body
        }

         */
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter employee Salary ");
//        int salary = input.nextInt();
//        if (salary >= 10000){
//            salary = salary + 1000;
//            System.out.println(salary);
//        }
//        else {
//            salary =salary +500;
//            System.out.println(salary);
//        }

        int salary=40000;
        if(salary > 10000){
            salary +=2000;

        }else if(salary > 20000){
            //same as salary = salary + 30000;
            salary += 30000;
        }




    }
}
