package com.Faisal;

public class Sumof1to10 {



        public static int infiniteLoop(int n) {

            int sum = 0;
            for(int i = 1;i<=n;i++) {
                sum = sum + i;
            }
            return sum;
        }

        public static void main(String args[]) {
            int num = 3;
            int output = infiniteLoop(num);


            System.out.println(output);

        }
    }


