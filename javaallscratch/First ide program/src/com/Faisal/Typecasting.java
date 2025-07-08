package com.Faisal;

public class Typecasting {
    public static void main(String[] args) {

        // type Casting = compreshsing the bigger num in to smaller type  Explesitly
        int num = (int)(67.56f);
        System.out.println(num);
        // automatic type promotion in expressions
//        int a = 257;
//        byte b = (byte)(a); //byte can only store 256 value it excide the max range byte capacity to hold  therefore // 257 % 256 =1 remainder
        //therefore java automate it
        //System.out.println(b);

//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = (a*b)/c; //
//        System.out.println(d);

//        int number = 'A';     // automatic type convertion ascie value of capital A = 65  a = 97   java follows unicode
//        System.out.println(number);
//
//        //java follows unicode value
//         //you can print namaste in hindi in java ilke py
//        System.out.println("नमस्ते");
//        System.out.println("السلام عليكم");
//        System.out.println("你好");
//
//
//
//        //  type promotion folloes rules  byte -> int ->long -> flote ->double ...
//        System.out.println(3*6); // int * int give int only
//        System.out.println(3* 5.6453736f); //int * flote gives flote value only bigger rank type


        byte b = 42;
        char c ='a';
        short s = 1024;
        int i =50000;
        float f = 5.67f;
        double d = 0.1234;
                //flote*byte int* char assci value  float + int - double = double
        double result= (f*b) +(i /c) -(d*s);
        System.out.println((f*b) + " "+(i /c)+ " " +(d*s));
        System.out.println(result);

    }
}
